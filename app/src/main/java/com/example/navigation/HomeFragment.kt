package com.example.navigation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.helper.ItemTouchHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigation.Model.User
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    var  userList =ArrayList<User>()
    lateinit var adapter:Adapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userList.clear()
        userList.add(User("PC_Shopping","[電蝦]天佑花蓮"))
        userList.add(User("PlayStation","[PS4]陪山田前輩狩獵一整天"))
        userList.add(User("MobileComm","[通訊]MWC2018暖身中"))
        userList.add(User("AndroidDev","[AndroidDev]開發者們，歡迎光臨"))
        userList.add(User("Soft_Job","能不能給我一行的code時間"))
        userList.add(User("6","boy"))
        userList.add(User("7","boy"))
        userList.add(User("8","boy"))

        adapter=Adapter(userList)
        recyclerView.layoutManager=LinearLayoutManager(this@HomeFragment.context)
        recyclerView.adapter =adapter


        var callback =SwipeController(adapter)
        var it = ItemTouchHelper(callback)
        it.attachToRecyclerView(recyclerView)

        actionBtn2.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.toEnd)
        }





        /*
if (isNetwork()) {

   isNetworkTxt.text="OK"

} else {
   AlertDialog.Builder(this).setTitle("No Internet Connection")
       .setMessage("Please check your internet connection and try again")
       .setPositiveButton(android.R.string.ok) { _, _ -> }
       .setIcon(android.R.drawable.ic_dialog_alert).show()
}
}*/
    }


/*  fun isNetwork():Boolean {

val connectivity = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

return  if (connectivity is ConnectivityManager){
   val networkInfo :NetworkInfo ?=connectivity.activeNetworkInfo
   networkInfo?.isConnected?:false

}else false



}*/


}
