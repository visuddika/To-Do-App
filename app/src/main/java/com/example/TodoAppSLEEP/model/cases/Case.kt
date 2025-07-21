package com.example.TodoAppSLEEP.model.cases

import com.example.TodoAppSLEEP.view.adapters.ItemList


data class Case (
    val id: Long,
    var comment: String,
    var date: Long,
    val habitId: Long
) : ItemList