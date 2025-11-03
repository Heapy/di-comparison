package io.heapy.komok

import io.heapy.komok.tech.di.delegate.MutableBean
import io.heapy.komok.tech.di.delegate.bean
import io.heapy.sample.common2.*

fun main() {
    println(MainModule().s.value.name())
}

class MainModule {
    val s: MutableBean<Service> by bean {
        DefaultService(s1.value)
    }

    val s1: MutableBean<Service1> by bean {
        DefaultService1(s2.value)
    }
    val s2: MutableBean<Service2> by bean {
        DefaultService2(s3.value)
    }
    val s3: MutableBean<Service3> by bean {
        DefaultService3(s4.value)
    }
    val s4: MutableBean<Service4> by bean {
        DefaultService4(s5.value)
    }
    val s5: MutableBean<Service5> by bean {
        DefaultService5(s6.value)
    }
    val s6: MutableBean<Service6> by bean {
        DefaultService6(s7.value)
    }
    val s7: MutableBean<Service7> by bean {
        DefaultService7(s8.value)
    }
    val s8: MutableBean<Service8> by bean {
        DefaultService8(s9.value)
    }
    val s9: MutableBean<Service9> by bean {
        DefaultService9(s10.value)
    }
    val s10: MutableBean<Service10> by bean {
        DefaultService10(s11.value)
    }
    val s11: MutableBean<Service11> by bean {
        DefaultService11(s12.value)
    }
    val s12: MutableBean<Service12> by bean {
        DefaultService12(s13.value)
    }
    val s13: MutableBean<Service13> by bean {
        DefaultService13(s14.value)
    }
    val s14: MutableBean<Service14> by bean {
        DefaultService14(s15.value)
    }
    val s15: MutableBean<Service15> by bean {
        DefaultService15(s16.value)
    }
    val s16: MutableBean<Service16> by bean {
        DefaultService16(s17.value)
    }
    val s17: MutableBean<Service17> by bean {
        DefaultService17(s18.value)
    }
    val s18: MutableBean<Service18> by bean {
        DefaultService18(s19.value)
    }
    val s19: MutableBean<Service19> by bean {
        DefaultService19(s20.value)
    }
    val s20: MutableBean<Service20> by bean {
        DefaultService20(s21.value)
    }
    val s21: MutableBean<Service21> by bean {
        DefaultService21(s22.value)
    }
    val s22: MutableBean<Service22> by bean {
        DefaultService22(s23.value)
    }
    val s23: MutableBean<Service23> by bean {
        DefaultService23(s24.value)
    }
    val s24: MutableBean<Service24> by bean {
        DefaultService24(s25.value)
    }
    val s25: MutableBean<Service25> by bean {
        DefaultService25(s26.value)
    }
    val s26: MutableBean<Service26> by bean {
        DefaultService26(s27.value)
    }
    val s27: MutableBean<Service27> by bean {
        DefaultService27(s28.value)
    }
    val s28: MutableBean<Service28> by bean {
        DefaultService28(s29.value)
    }
    val s29: MutableBean<Service29> by bean {
        DefaultService29(s30.value)
    }
    val s30: MutableBean<Service30> by bean {
        DefaultService30(s31.value)
    }
    val s31: MutableBean<Service31> by bean {
        DefaultService31(s32.value)
    }
    val s32: MutableBean<Service32> by bean {
        DefaultService32(s33.value)
    }
    val s33: MutableBean<Service33> by bean {
        DefaultService33(s34.value)
    }
    val s34: MutableBean<Service34> by bean {
        DefaultService34(s35.value)
    }
    val s35: MutableBean<Service35> by bean {
        DefaultService35(s36.value)
    }
    val s36: MutableBean<Service36> by bean {
        DefaultService36(s37.value)
    }
    val s37: MutableBean<Service37> by bean {
        DefaultService37(s38.value)
    }
    val s38: MutableBean<Service38> by bean {
        DefaultService38(s39.value)
    }
    val s39: MutableBean<Service39> by bean {
        DefaultService39(s40.value)
    }
    val s40: MutableBean<Service40> by bean {
        DefaultService40(s41.value)
    }
    val s41: MutableBean<Service41> by bean {
        DefaultService41(s42.value)
    }
    val s42: MutableBean<Service42> by bean {
        DefaultService42(s43.value)
    }
    val s43: MutableBean<Service43> by bean {
        DefaultService43(s44.value)
    }
    val s44: MutableBean<Service44> by bean {
        DefaultService44(s45.value)
    }
    val s45: MutableBean<Service45> by bean {
        DefaultService45(s46.value)
    }
    val s46: MutableBean<Service46> by bean {
        DefaultService46(s47.value)
    }
    val s47: MutableBean<Service47> by bean {
        DefaultService47(s48.value)
    }
    val s48: MutableBean<Service48> by bean {
        DefaultService48(s49.value)
    }
    val s49: MutableBean<Service49> by bean {
        DefaultService49(s50.value)
    }
    val s50: MutableBean<Service50> by bean {
        DefaultService50(s51.value)
    }
    val s51: MutableBean<Service51> by bean {
        DefaultService51(s52.value)
    }
    val s52: MutableBean<Service52> by bean {
        DefaultService52(s53.value)
    }
    val s53: MutableBean<Service53> by bean {
        DefaultService53(s54.value)
    }
    val s54: MutableBean<Service54> by bean {
        DefaultService54(s55.value)
    }
    val s55: MutableBean<Service55> by bean {
        DefaultService55(s56.value)
    }
    val s56: MutableBean<Service56> by bean {
        DefaultService56(s57.value)
    }
    val s57: MutableBean<Service57> by bean {
        DefaultService57(s58.value)
    }
    val s58: MutableBean<Service58> by bean {
        DefaultService58(s59.value)
    }
    val s59: MutableBean<Service59> by bean {
        DefaultService59(s60.value)
    }
    val s60: MutableBean<Service60> by bean {
        DefaultService60(s61.value)
    }
    val s61: MutableBean<Service61> by bean {
        DefaultService61(s62.value)
    }
    val s62: MutableBean<Service62> by bean {
        DefaultService62(s63.value)
    }
    val s63: MutableBean<Service63> by bean {
        DefaultService63(s64.value)
    }
    val s64: MutableBean<Service64> by bean {
        DefaultService64(s65.value)
    }
    val s65: MutableBean<Service65> by bean {
        DefaultService65(s66.value)
    }
    val s66: MutableBean<Service66> by bean {
        DefaultService66(s67.value)
    }
    val s67: MutableBean<Service67> by bean {
        DefaultService67(s68.value)
    }
    val s68: MutableBean<Service68> by bean {
        DefaultService68(s69.value)
    }
    val s69: MutableBean<Service69> by bean {
        DefaultService69(s70.value)
    }
    val s70: MutableBean<Service70> by bean {
        DefaultService70(s71.value)
    }
    val s71: MutableBean<Service71> by bean {
        DefaultService71(s72.value)
    }
    val s72: MutableBean<Service72> by bean {
        DefaultService72(s73.value)
    }
    val s73: MutableBean<Service73> by bean {
        DefaultService73(s74.value)
    }
    val s74: MutableBean<Service74> by bean {
        DefaultService74(s75.value)
    }
    val s75: MutableBean<Service75> by bean {
        DefaultService75(s76.value)
    }
    val s76: MutableBean<Service76> by bean {
        DefaultService76(s77.value)
    }
    val s77: MutableBean<Service77> by bean {
        DefaultService77(s78.value)
    }
    val s78: MutableBean<Service78> by bean {
        DefaultService78(s79.value)
    }
    val s79: MutableBean<Service79> by bean {
        DefaultService79(s80.value)
    }
    val s80: MutableBean<Service80> by bean {
        DefaultService80(s81.value)
    }
    val s81: MutableBean<Service81> by bean {
        DefaultService81(s82.value)
    }
    val s82: MutableBean<Service82> by bean {
        DefaultService82(s83.value)
    }
    val s83: MutableBean<Service83> by bean {
        DefaultService83(s84.value)
    }
    val s84: MutableBean<Service84> by bean {
        DefaultService84(s85.value)
    }
    val s85: MutableBean<Service85> by bean {
        DefaultService85(s86.value)
    }
    val s86: MutableBean<Service86> by bean {
        DefaultService86(s87.value)
    }
    val s87: MutableBean<Service87> by bean {
        DefaultService87(s88.value)
    }
    val s88: MutableBean<Service88> by bean {
        DefaultService88(s89.value)
    }
    val s89: MutableBean<Service89> by bean {
        DefaultService89(s90.value)
    }
    val s90: MutableBean<Service90> by bean {
        DefaultService90(s91.value)
    }
    val s91: MutableBean<Service91> by bean {
        DefaultService91(s92.value)
    }
    val s92: MutableBean<Service92> by bean {
        DefaultService92(s93.value)
    }
    val s93: MutableBean<Service93> by bean {
        DefaultService93(s94.value)
    }
    val s94: MutableBean<Service94> by bean {
        DefaultService94(s95.value)
    }
    val s95: MutableBean<Service95> by bean {
        DefaultService95(s96.value)
    }
    val s96: MutableBean<Service96> by bean {
        DefaultService96(s97.value)
    }
    val s97: MutableBean<Service97> by bean {
        DefaultService97(s98.value)
    }
    val s98: MutableBean<Service98> by bean {
        DefaultService98(s99.value)
    }
    val s99: MutableBean<Service99> by bean {
        DefaultService99(s100.value)
    }
    val s100: MutableBean<Service100> by bean {
        DefaultService100(s101.value)
    }
    val s101: MutableBean<Service101> by bean {
        DefaultService101()
    }
}
