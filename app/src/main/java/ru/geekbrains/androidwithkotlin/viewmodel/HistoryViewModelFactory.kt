package ru.geekbrains.androidwithkotlin.viewmodel

import ru.geekbrains.androidwithkotlin.model.data.Weather

class HistoryViewModelFactory(private val resourceProvider: Weather): {
    HistoryViewModel.Weather {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T =
            HistoryViewModel(Weather) as T
}