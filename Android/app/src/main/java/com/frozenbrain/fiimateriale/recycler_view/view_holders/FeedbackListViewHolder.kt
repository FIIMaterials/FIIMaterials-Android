package com.frozenbrain.fiimateriale.recycler_view.view_holders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.frozenbrain.fiimateriale.R
import com.frozenbrain.fiimateriale.data.Feedback
import com.google.firebase.Timestamp
import java.text.SimpleDateFormat
import java.util.*

class FeedbackListViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val feedbackName: TextView = view.findViewById(R.id.feedbackName)
    private val feedbackSubject: TextView = view.findViewById(R.id.feedbackSubject)
    private val feedbackMessage: TextView = view.findViewById(R.id.feedbackMessage)
    private val feedbackDate: TextView = view.findViewById(R.id.feedbackDate)
    private val feedbackSolved: TextView = view.findViewById(R.id.feedbackSolved)

    fun bind(item: Feedback) {
        feedbackName.text = item.name
        feedbackSubject.text = item.subject
        feedbackMessage.text = item.message

        feedbackDate.text = timestampToDate(item.timestamp)
        feedbackSolved.text = if (item.solved) "Implemented" else "Not Implemented"
    }

    private fun timestampToDate(timestamp: Timestamp): String {
        val formatter = SimpleDateFormat("dd MMM yyyy", Locale.US)
        return formatter.format(timestamp.toDate())
    }

}