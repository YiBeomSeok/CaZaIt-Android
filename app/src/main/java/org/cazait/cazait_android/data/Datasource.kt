package org.cazait.cazait_android.data

import org.cazait.cazait_android.data.model.CafeState

class Datasource {
    fun loadAffirmations(): ArrayList<CafeState> {
        return arrayListOf(
            CafeState("1", "카페 범쿤", "100", "서울시 광진구 능동 239 - 26", "보통"),
            CafeState("2", "눈물", "200", "서울시 광진구 xxxx - xxxxxx", "혼잡"),
            CafeState("3", "눙물", "300", "서울시 광진구 xxxx - xxxxxx", "보통"),
            CafeState("4", "국물", "400", "서울시 광진구 xxxx - xxxxxx", "여유"),
            CafeState("5", "물논", "1200", "서울시 광진구 xxxx - xxxxxx", "보통"),
            CafeState("6", "물론", "400", "서울시 광진구 xxxx - xxxxxx", "보통"),
            CafeState("7","투썸플레이스 삼호가든사거리점","500", "서울 서초구 서초중앙로 238 가든리체프라자 2층 252호", "혼잡"),
            CafeState("8", "골목", "600", "서울시 광진구 xxxx - xxxxxx", "보통"),
            CafeState("9", "눔룬", "700", "서울시 광진구 xxxx - xxxxxx", "보통"),
            CafeState("10", "엔제리너스카페24시", "800", "서울시 광진구 xxxx - xxxxxx", "보통"),
            CafeState("11", "제주몰빵", "900", "서울시 광진구 xxxx - xxxxxx", "보통"),
            CafeState("12", "카페 딕셔너리", "1000", "서울시 xxxx - xxxxxx", "보통"),
            CafeState("13", "카페베네", "1100", "서울시 광진구 xxxx - xxxxxx", "보통")

        )
    }
}