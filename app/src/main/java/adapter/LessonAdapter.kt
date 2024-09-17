import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sprint3_doracorde.R

class LessonAdapter(private val lessonList: List<Lesson>) : RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_lesson, parent, false)
        return LessonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val lesson = lessonList[position]
        holder.tvLessonTitle.text = lesson.title
        holder.tvLessonDescription.text = lesson.description
    }

    override fun getItemCount() = lessonList.size

    class LessonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvLessonTitle: TextView = itemView.findViewById(R.id.tv_lesson_title)
        val tvLessonDescription: TextView = itemView.findViewById(R.id.tv_lesson_description)
    }
}
