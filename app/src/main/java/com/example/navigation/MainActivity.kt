package com.example.navigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(),CoroutineScope {
    lateinit var job: Job

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main+job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        job=Job()
        launch {

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }

    fun loadData()=launch {
        val iodata = async(Dispatchers.IO) {
        }

        val  data =iodata.await()

    }

    suspend fun  loaduser(){

        withContext(Dispatchers.IO){

        }

    }


    /*
    override fun onSupportNavigateUp()=
        Navigation.findNavController(this,R.id.navigation_host).navigateUp()

        */
}
