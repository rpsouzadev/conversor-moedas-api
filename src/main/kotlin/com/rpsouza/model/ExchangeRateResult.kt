package com.rpsouza.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExchangeRateResult(
    val from: String,
    val to: String,
    @SerialName("exchange_rate")
    val exchangeRate:Double
)

val conversionRates: Map<String, Map<String, Double>> = mapOf(
    "BRL" to mapOf(
        "USD" to 0.20,
        "EUR" to 0.18,
        "JPY" to 29.80,
        "GBP" to 0.16,
        "AUD" to 0.31,
        "CAD" to 0.27,
        "CHF" to 0.18,
        "CNY" to 1.46,
        "INR" to 16.50
    ),
    "USD" to mapOf(
        "BRL" to 5.00,
        "EUR" to 0.91,
        "JPY" to 149.00,
        "GBP" to 0.81,
        "AUD" to 1.57,
        "CAD" to 1.36,
        "CHF" to 0.91,
        "CNY" to 7.34,
        "INR" to 83.00
    ),
    "EUR" to mapOf(
        "BRL" to 5.50,
        "USD" to 1.10,
        "JPY" to 163.00,
        "GBP" to 0.89,
        "AUD" to 1.72,
        "CAD" to 1.50,
        "CHF" to 1.00,
        "CNY" to 8.10,
        "INR" to 91.00
    ),
    "JPY" to mapOf(
        "BRL" to 0.034,
        "USD" to 0.0067,
        "EUR" to 0.0061,
        "GBP" to 0.0054,
        "AUD" to 0.0105,
        "CAD" to 0.0091,
        "CHF" to 0.0061,
        "CNY" to 0.049,
        "INR" to 0.56
    ),
    "GBP" to mapOf(
        "BRL" to 6.30,
        "USD" to 1.23,
        "EUR" to 1.13,
        "JPY" to 184.00,
        "AUD" to 1.94,
        "CAD" to 1.68,
        "CHF" to 1.14,
        "CNY" to 9.00,
        "INR" to 102.00
    ),
    "AUD" to mapOf(
        "BRL" to 3.20,
        "USD" to 0.64,
        "EUR" to 0.58,
        "JPY" to 95.00,
        "GBP" to 0.52,
        "CAD" to 0.86,
        "CHF" to 0.58,
        "CNY" to 4.63,
        "INR" to 52.00
    ),
    "CAD" to mapOf(
        "BRL" to 3.70,
        "USD" to 0.74,
        "EUR" to 0.67,
        "JPY" to 109.00,
        "GBP" to 0.60,
        "AUD" to 1.16,
        "CHF" to 0.67,
        "CNY" to 5.40,
        "INR" to 60.00
    ),
    "CHF" to mapOf(
        "BRL" to 5.50,
        "USD" to 1.10,
        "EUR" to 1.00,
        "JPY" to 163.00,
        "GBP" to 0.88,
        "AUD" to 1.72,
        "CAD" to 1.49,
        "CNY" to 8.10,
        "INR" to 91.00
    ),
    "CNY" to mapOf(
        "BRL" to 0.69,
        "USD" to 0.14,
        "EUR" to 0.12,
        "JPY" to 20.00,
        "GBP" to 0.11,
        "AUD" to 0.22,
        "CAD" to 0.19,
        "CHF" to 0.12,
        "INR" to 11.20
    ),
    "INR" to mapOf(
        "BRL" to 0.060,
        "USD" to 0.012,
        "EUR" to 0.011,
        "JPY" to 1.20,
        "GBP" to 0.0098,
        "AUD" to 0.019,
        "CAD" to 0.017,
        "CHF" to 0.011,
        "CNY" to 0.089
    )
)