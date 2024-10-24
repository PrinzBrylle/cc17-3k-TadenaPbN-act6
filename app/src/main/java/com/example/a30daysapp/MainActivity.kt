package com.example.a30daysapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysapp.adapter.RecyclerAdapter
import com.example.a30daysapp.adapter.RecyclerModel

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private val recyclerModel: MutableList<RecyclerModel> = ArrayList()
    private lateinit var recyclerAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_name)

        populateRecyclerModel()

        recyclerAdapter = RecyclerAdapter(this, recyclerModel)
        recyclerView.apply {
            adapter = recyclerAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun populateRecyclerModel() {
        recyclerModel.add(RecyclerModel("Day 1", "Gratitude Journal", R.drawable.d1, "Write down three things you're grateful for. Reflect on the small joys in life."))
        recyclerModel.add(RecyclerModel("Day 2", "Morning Meditation", R.drawable.d2, "Spend 10-15 minutes meditating. Focus on your breath and practice mindfulness."))
        recyclerModel.add(RecyclerModel("Day 3", "Declutter Your Space", R.drawable.d3, "Clean and organize your environment. A tidy space equals a tidy mind."))
        recyclerModel.add(RecyclerModel("Day 4", "Affirmations", R.drawable.d4, "Write and repeat positive affirmations, such as “I am worthy,” “I am enough,” “I deserve happiness.”"))
        recyclerModel.add(RecyclerModel("Day 5", "Mindful Eating", R.drawable.d5, "Prepare a healthy meal. Focus on each bite, savor the flavors, and eat slowly."));
        recyclerModel.add(RecyclerModel("Day 6", "Digital Detox", R.drawable.d6, "Limit screen time for the day. Use that extra time to engage in something creative."))
        recyclerModel.add(RecyclerModel("Day 7", "Nature Walk", R.drawable.d7, "Spend time in nature, whether it’s a park, beach, or garden. Be present and absorb the beauty around you."))
        recyclerModel.add(RecyclerModel("Day 8", "Stretching Routine", R.drawable.d8, "Start your day with a gentle stretching routine to loosen up and feel refreshed."))
        recyclerModel.add(RecyclerModel("Day 9", "Hydration Focus", R.drawable.d9, "Drink 8 glasses of water today. Notice how staying hydrated improves your energy and focus."))
        recyclerModel.add(RecyclerModel("Day 10", "Movement You Enjoy", R.drawable.d10, "Do a physical activity you love, whether it’s dancing, yoga, or a workout."));

        recyclerModel.add(RecyclerModel("Day 11", "Sleep Hygiene", R.drawable.d11, "Go to bed 30 minutes earlier tonight. Create a calming bedtime routine."))
        recyclerModel.add(RecyclerModel("Day 12", "Spa Day at Home", R.drawable.d12, "Pamper yourself with a bath, face mask, and relaxing music. Treat your skin with extra care."))
        recyclerModel.add(RecyclerModel("Day 13", "Conscious Breathing", R.drawable.d13, "Practice deep breathing exercises throughout the day to reduce stress."))
        recyclerModel.add(RecyclerModel("Day 14", "Cooking a New Recipe", R.drawable.d14, "Try cooking something new and healthy. Focus on nourishing your body."))
        recyclerModel.add(RecyclerModel("Day 15", "Journaling Session", R.drawable.d15, "Write about your feelings today. Explore your thoughts without judgment."));
        recyclerModel.add(RecyclerModel("Day 16", "Forgiveness Practice", R.drawable.d16, "Reflect on any lingering grudges and practice forgiveness—both for others and yourself."))
        recyclerModel.add(RecyclerModel("Day 17", "Unplug from Negativity", R.drawable.d17, "Limit your exposure to negative news, social media, or people who drain your energy."))
        recyclerModel.add(RecyclerModel("Day 18", "Vision Board", R.drawable.d18, "Create a vision board or list of goals. Focus on what you want to attract into your life."))
        recyclerModel.add(RecyclerModel("Day 19", "Read or Listen to Something Inspiring", R.drawable.d19, "Choose a book, podcast, or article that uplifts you and promotes self-growth."))
        recyclerModel.add(RecyclerModel("Day 20", "Creative Expression", R.drawable.d20, "Express yourself creatively through painting, writing, dancing, or any other art form."));

        recyclerModel.add(RecyclerModel("Day 21", "Compliment Yourself", R.drawable.d21, "Write down five things you love about yourself, both physically and emotionally."))
        recyclerModel.add(RecyclerModel("Day 22", "Connect with a Friend", R.drawable.d22, "Reach out to a friend or loved one you haven’t spoken to in a while. Share your appreciation for them."))
        recyclerModel.add(RecyclerModel("Day 23", "Act of Kindness", R.drawable.d23, "Do something kind for someone else, whether it’s a compliment, donation, or helping hand."))
        recyclerModel.add(RecyclerModel("Day 24", "Explore a New Hobby", R.drawable.d24, "Try something you’ve always been curious about—painting, photography, or cooking."))
        recyclerModel.add(RecyclerModel("Day 25", "Digital Boundaries", R.drawable.d25, "Set limits on your social media time today. Be conscious of how much time you spend online."));
        recyclerModel.add(RecyclerModel("Day 26", "Gratitude for Others", R.drawable.d26, "Reflect on the people in your life. Send a message of appreciation to someone who has impacted you."))
        recyclerModel.add(RecyclerModel("Day 27", "Yoga or Mindful Movement", R.drawable.d27, "Practice a yoga session or engage in mindful movement like tai chi or Pilates."))
        recyclerModel.add(RecyclerModel("Day 28", "Journaling on Growth", R.drawable.d28, "Reflect on how you’ve grown this past month. What have you learned about yourself?"))
        recyclerModel.add(RecyclerModel("Day 29", "Self-Care Day", R.drawable.d29, "Take a day off from all obligations, and do something just for you. Whether it’s a movie marathon, a nap, or a creative hobby."))
        recyclerModel.add(RecyclerModel("Day 30", "Set Future Intentions", R.drawable.d30, "Think about the next steps in your self-love journey. Set intentions for how you will continue caring for yourself moving forward."));



    }
}
