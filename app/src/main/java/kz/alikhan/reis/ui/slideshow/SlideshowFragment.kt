package kz.alikhan.reis.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kz.alikhan.reis.R

class SlideshowFragment : Fragment() {

    private lateinit var slideshowViewModel: SlideshowViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        slideshowViewModel =
            ViewModelProviders.of(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_busses, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        val textView2: TextView = root.findViewById(R.id.text_slideshow2)
        val textView3: TextView = root.findViewById(R.id.text_slideshow3)
        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
            textView.text = "Асыката - Алматы"
            textView2.text = "Асыката - Алматы"
            textView3.text = "Асыката - Алматы"
        })

        var image = root.findViewById(R.id.busImageView) as ImageView
        image.clipToOutline = true

        return root
    }

    private fun delete(view: View) {
        Toast.makeText(activity, "Deleted", Toast.LENGTH_LONG).show()
    }

}