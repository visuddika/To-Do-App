package com.example.TodoAppSLEEP.model.graph

import com.example.TodoAppSLEEP.view.adapters.ItemList
import java.util.Date

data class Graph(
    val data: MutableMap<Date, Int>
) : ItemList