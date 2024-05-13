package com.infinitelearning.infiniteapp.data

import com.infinitelearning.infiniteapp.R
import com.infinitelearning.infiniteapp.model.Pahlawan
import com.infinitelearning.infiniteapp.model.About
import com.infinitelearning.infiniteapp.model.NextKabinet
import com.infinitelearning.infiniteapp.model.Kabinet

object DummyData {
    val mobileKabinet = listOf(
        Kabinet(
            id = 1,
            name = "Jokowidodo",
            nickname = "presiden",
            role = "Presiden",
            photo = R.drawable.pres
        ),
        Kabinet(
            id = 2,
            name = "Kh.Ma'ruf amin",
            nickname = "wapres",
            role = "wapres",
            photo = R.drawable.wapres
        ),
        Kabinet(
            id = 3,
            name = "Luhut B.P",
            nickname = "Jenderal",
            role = "Menteri",
            photo = R.drawable.luhut
        ),
        Kabinet(
            id = 4,
            name = "Mahfud MD",
            nickname = "Pak Mahfud",
            role = "Menteri",
            photo = R.drawable.menkopolhukam
        ),
        Kabinet(
            id = 5,
            name = "Tito Karnavian",
            nickname = "Jenderal",
            role = "Menteri",
            photo = R.drawable.mendagri
        ),
        Kabinet(
            id = 6,
            name = "Muhadjir Efendi",
            nickname = "Pak Muhadjir",
            role = "Menteri",
            photo = R.drawable.menko
        ),
        Kabinet(
            id = 7,
            name = "Pratikno",
            nickname = "Pak Tikno",
            role = "Menteri",
            photo = R.drawable.menteri
        ),
        Kabinet(
            id = 8,
            name = "Prabowo Subianto",
            nickname = "Sang Jenderal",
            role = "Menteri",
            photo = R.drawable.menteripertahanan
        ),
        Kabinet(
            id = 9,
            name = "Airlangga",
            nickname = "Pak Airlangga",
            role = "Menteri",
            photo = R.drawable.airlangga
        ),
        Kabinet(
            id = 10,
            name = "Retno",
            nickname = "Bu Retno",
            role = "Menteri",
            photo = R.drawable.ibu_menteri
        )

    )

    val mobileNextKabinet = listOf(
        NextKabinet(
            id = 1,
            name = "Nama Presiden",
            photo = R.drawable.no_profile,
            batch = "Kabinet Gemoy",
            role = "Presiden",
        ),
        NextKabinet(
            id = 2,
            name = "Nama WakilPresiden",
            photo = R.drawable.no_profile,
            batch = "Kabinet Gemoy",
            role = "Wapres",
        ),
        NextKabinet(
            id = 3,
            name = "Nama Presiden",
            photo = R.drawable.no_profile,
            batch = "Kabinet Gemoy",
            role = "Menteri",
        ),
        NextKabinet(
            id = 4,
            name = "Nama Presiden",
            photo = R.drawable.no_profile,
            batch = "Kabinet Gemoy",
            role = "Menteri",
        ),
        NextKabinet(
            id = 5,
            name = "Nama Presiden",
            photo = R.drawable.no_profile,
            batch = "Kabinet Gemoy",
            role = "Menteri",
        ),
        NextKabinet(
            id = 6,
            name = "Nama Presiden",
            photo = R.drawable.no_profile,
            batch = "Kabinet Gemoy",
            role = "Menteri",
        ),
        NextKabinet(
            id = 7,
            name = "Nama Presiden",
            photo = R.drawable.no_profile,
            batch = "Kabinet Gemoy",
            role = "Menteri",
        ),
        NextKabinet(
            id = 8,
            name = "Nama Presiden",
            photo = R.drawable.no_profile,
            batch = "Kabinet Gemoy",
            role = "Menteri",
        ),
        NextKabinet(
            id = 9,
            name = "Nama Presiden",
            photo = R.drawable.no_profile,
            batch = "Kabinet Gemoy",
            role = "Menteri",
        ),
        NextKabinet(
            id = 10,
            name = "Nama Presiden",
            photo = R.drawable.no_profile,
            batch = "Kabinet Gemoy",
            role = "Menteri",
        )
    )

    val mobileCours = listOf(
        Pahlawan(
            id = 1,
            name = "Bung Tomo",
            level = "Pahlawan",
            photo = R.drawable.bung_tomo
        ),
        Pahlawan(
            id = 2,
            name = "Pangeran Diponegoro",
            level = "Pahlawan",
            photo = R.drawable.diponegoro
        ),
        Pahlawan(
            id = 3,
            name = "Ki Hajar Dewantara",
            level = "Pahlawan",
            photo = R.drawable.kihajardewantara
        ),
        Pahlawan(
            id = 4,
            name = "Mohammad Hatta",
            level = "Wakil Presiden ke-1",
            photo = R.drawable.moh_hatta
        ),
        Pahlawan(
            id = 5,
            name = "Soekarno",
            level = "Presiden ke-1",
            photo = R.drawable.soekarno
        ),
        Pahlawan(
            id = 6,
            name = "Soedirman",
            level = "Panglima TNI ke-1",
            photo = R.drawable.sudirman
        ),
        Pahlawan(
            id = 7,
            name = "Sutan Syahrir",
            level = "Pahlawan",
            photo = R.drawable.sutan_syahrir
        ),
        Pahlawan(
            id = 8,
            name = "Tan Malaka",
            level = "Pahlawan",
            photo = R.drawable.tanmalaka
        ),
        Pahlawan(
            id = 9,
            name = "Cut Nyak Dien",
            level = "Pahlawan",
            photo = R.drawable.cutnyakdien
        ),
        Pahlawan(
            id = 10,
            name = "R.A. Kartini",
            level = "Pahlawan",
            photo = R.drawable.kartini
        ),
    )

    val infiniteAbout = listOf(
        About(
            id = 1,
            name = "Muhammad Farhan",
            asal = "Universitas Bina Sarana Informatika",
            prodi = "RPL",
            kontak = "arbanifarhan@gmail.com",
            photo = R.drawable.pribadi
        )
    )
}