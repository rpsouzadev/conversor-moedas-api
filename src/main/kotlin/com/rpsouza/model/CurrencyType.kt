package com.rpsouza.model

import kotlinx.serialization.Serializable

@Serializable
data class CurrencyType(
    val name: String,
    val acronym: String,
    val symbol: String,
    val countryFlagImage: String,
)

@Serializable
data class CurrencyTypesResult(
    val values: List<CurrencyType>
)

val currencyList = listOf(
    CurrencyType(
        name = "Real Brasileiro",
        acronym = "BRL",
        symbol = "R$",
        countryFlagImage = "https://flagcdn.com/br.svg"
    ),
    CurrencyType(
        name = "Dólar Americano",
        acronym = "USD",
        symbol = "$",
        countryFlagImage = "https://flagcdn.com/us.svg"
    ),
    CurrencyType(
        name = "Euro",
        acronym = "EUR",
        symbol = "€",
        countryFlagImage = "https://flagcdn.com/eu.svg"
    ),
    CurrencyType(
        name = "Iene Japonês",
        acronym = "JPY",
        symbol = "¥",
        countryFlagImage = "https://flagcdn.com/jp.svg"
    ),
    CurrencyType(
        name = "Libra Esterlina",
        acronym = "GBP",
        symbol = "£",
        countryFlagImage = "https://flagcdn.com/gb.svg"
    ),
    CurrencyType(
        name = "Dólar Australiano",
        acronym = "AUD",
        symbol = "A$",
        countryFlagImage = "https://flagcdn.com/au.svg"
    ),
    CurrencyType(
        name = "Dólar Canadense",
        acronym = "CAD",
        symbol = "C$",
        countryFlagImage = "https://flagcdn.com/ca.svg"
    ),
    CurrencyType(
        name = "Franco Suíço",
        acronym = "CHF",
        symbol = "CHF",
        countryFlagImage = "https://flagcdn.com/ch.svg"
    ),
    CurrencyType(
        name = "Yuan Chinês",
        acronym = "CNY",
        symbol = "¥",
        countryFlagImage = "https://flagcdn.com/cn.svg"
    ),
    CurrencyType(
        name = "Rúpia Indiana",
        acronym = "INR",
        symbol = "₹",
        countryFlagImage = "https://flagcdn.com/in.svg"
    )
)