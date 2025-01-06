package com.rpsouza.extensions

import com.rpsouza.model.conversionRates

fun String.orUnknown(): String =
    if (this in conversionRates.keys) this else "Desconhecido"