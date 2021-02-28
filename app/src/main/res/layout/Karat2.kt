package layout

import com.example.myapplication.R

object DataSource {
    private val list = listOf(
            Jewelries(
                    id = 2,
                    name = "Necklaces",
                    image = R.drawable.necklace,
                    shortDescription = "14k gold necklace set with pearl and flat oval pendants",
                    description = "This necklace set is made of 14k gold filled materials, freshwater pearl, and cubic zirconia, your necklace will be water-resistant, tarnish-resistant, and hypoallergenic.",
                    price = 6999
            ), Jewelries(
            id = 1,
            name = "Bracelets",
            image = R.drawable.bracelet,
            shortDescription = "14k bracelet set with beaded pearls and round metal accent",
            description = "This dainty bracelet set is made with 1mm Swarovski creamy white pearls attached to a sturdy 14k yellow gold filled chain. Closes with a spring clasp.",
            price = 5999
    ), Jewelries(
            id = 3,
            name = "Earrings",
            image = R.drawable.earrings,
            shortDescription = "14k gold pearl drop earrings",
            description = "This minimalist gold pearl drop earring set is made of 14k gold chain that meets a fresh water pearl.",
            price = 4999
    )
    )

    fun fetchData() = list

    fun getItem(id: Int) = list.find {
        it.id == Int
    }

}