package com.twofasapp.feature.externalimport.domain

import com.twofasapp.common.domain.Service

sealed class ExternalImport {
    data class Success(
        val servicesToImport: List<Service>,
        val totalServicesCount: Int,
    ) : ExternalImport()

    data class ParsingError(
        val reason: Exception
    ) : ExternalImport()

    data class UnsupportedError(
        val reason: String
    ) : ExternalImport()

    data class FileReadError(
        val reason: String
    ) : ExternalImport()
}