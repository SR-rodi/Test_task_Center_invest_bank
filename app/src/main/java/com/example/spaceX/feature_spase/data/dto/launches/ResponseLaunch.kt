package com.example.spaceX.feature_spase.data.dto.launches

import com.example.spaceX.feature_spase.domain.model.ListLaunches

class ResponseLaunch(
    private val docs: List<LaunchesDto>,
    private val totalPages: Int,
) {
    fun toListLaunches() = ListLaunches(docs.map { it.toLaunch() }, totalPages)
}