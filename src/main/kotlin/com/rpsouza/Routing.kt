package com.rpsouza

import com.rpsouza.extensions.orUnknown
import com.rpsouza.model.CurrencyTypesResult
import com.rpsouza.model.ExchangeRateResult
import com.rpsouza.model.conversionRates
import com.rpsouza.model.currencyList
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/currency_types") {
            call.respond(
                CurrencyTypesResult(values = currencyList)
            )
        }

        get("/exchange_rate/{from}/{to}") {
            val from = call.parameters["from"]?.uppercase() ?: return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Não foi possível obter o acrônimo da moeda atual."
            )

            val to = call.parameters["to"]?.uppercase() ?: return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Não foi possível obter o acrônimo da moeda alvo."
            )

            call.respond(
                ExchangeRateResult(
                    from = from.orUnknown(),
                    to = to.orUnknown(),
                    exchangeRate = conversionRates[from]?.get(to) ?: 0.0
                )
            )
        }
    }
}
