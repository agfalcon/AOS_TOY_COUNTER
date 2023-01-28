package kgb.toyproject.counter

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _counter = MutableLiveData<Int>()
    val counter: LiveData<Int>
        get() = _counter

    init{
        _counter.value = 0
    }

    fun plus(){
        _counter.value = _counter.value?.plus(1)
        Log.d("counter","${_counter.value}")
    }
    fun reset(){
        _counter.value = 0
        Log.d("counter","${_counter.value}")
    }
}