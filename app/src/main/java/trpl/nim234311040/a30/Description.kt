package trpl.nim234311040.a30

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Description(
    @DrawableRes val imageResourceId: Int,
    @StringRes val title: Int,
    val day: Int,
    @StringRes val description: Int
)



val tips = listOf(
    Description(R.drawable.picdesc1, R.string.picdesc1, 1, R.string.description_1),
    Description(R.drawable.picdesc2, R.string.picdesc2, 2, R.string.description_2),
    Description(R.drawable.picdesc3, R.string.picdesc3, 3, R.string.description_3),
    Description(R.drawable.picdesc4, R.string.picdesc4, 4, R.string.description_4),
    Description(R.drawable.picdesc5, R.string.picdesc5, 5, R.string.description_5),
    Description(R.drawable.picdesc6, R.string.picdesc6, 6, R.string.description_6),
    Description(R.drawable.picdesc7, R.string.picdesc7, 7, R.string.description_7),
    Description(R.drawable.picdesc8, R.string.picdesc8, 8, R.string.description_8),
    Description(R.drawable.picdesc9, R.string.picdesc9, 9, R.string.description_9),
    Description(R.drawable.picdesc10, R.string.picdesc10, 10, R.string.description_10),
    Description(R.drawable.picdesc11, R.string.picdesc11, 11, R.string.description_11),
    Description(R.drawable.picdesc12, R.string.picdesc12, 12, R.string.description_12),



    )