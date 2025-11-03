package io.heapy.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import io.heapy.sample.common2.*;

public class MainModule implements Module {

    @Override
    public void configure(Binder binder) {
    }

    @Provides
    @Singleton
    Service provideService(Service1 service) {
        return new DefaultService(service);
    }

    @Provides
    @Singleton
    Service1 provideService1(Service2 service) {
        return new DefaultService1(service);
    }

    @Provides
    @Singleton
    Service2 provideService2(Service3 service) {
        return new DefaultService2(service);
    }

    @Provides
    @Singleton
    Service3 provideService3(Service4 service) {
        return new DefaultService3(service);
    }

    @Provides
    @Singleton
    Service4 provideService4(Service5 service) {
        return new DefaultService4(service);
    }

    @Provides
    @Singleton
    Service5 provideService5(Service6 service) {
        return new DefaultService5(service);
    }

    @Provides
    @Singleton
    Service6 provideService6(Service7 service) {
        return new DefaultService6(service);
    }

    @Provides
    @Singleton
    Service7 provideService7(Service8 service) {
        return new DefaultService7(service);
    }

    @Provides
    @Singleton
    Service8 provideService8(Service9 service) {
        return new DefaultService8(service);
    }

    @Provides
    @Singleton
    Service9 provideService9(Service10 service) {
        return new DefaultService9(service);
    }

    @Provides
    @Singleton
    Service10 provideService10(Service11 service) {
        return new DefaultService10(service);
    }

    @Provides
    @Singleton
    Service11 provideService11(Service12 service) {
        return new DefaultService11(service);
    }

    @Provides
    @Singleton
    Service12 provideService12(Service13 service) {
        return new DefaultService12(service);
    }

    @Provides
    @Singleton
    Service13 provideService13(Service14 service) {
        return new DefaultService13(service);
    }

    @Provides
    @Singleton
    Service14 provideService14(Service15 service) {
        return new DefaultService14(service);
    }

    @Provides
    @Singleton
    Service15 provideService15(Service16 service) {
        return new DefaultService15(service);
    }

    @Provides
    @Singleton
    Service16 provideService16(Service17 service) {
        return new DefaultService16(service);
    }

    @Provides
    @Singleton
    Service17 provideService17(Service18 service) {
        return new DefaultService17(service);
    }

    @Provides
    @Singleton
    Service18 provideService18(Service19 service) {
        return new DefaultService18(service);
    }

    @Provides
    @Singleton
    Service19 provideService19(Service20 service) {
        return new DefaultService19(service);
    }

    @Provides
    @Singleton
    Service20 provideService20(Service21 service) {
        return new DefaultService20(service);
    }

    @Provides
    @Singleton
    Service21 provideService21(Service22 service) {
        return new DefaultService21(service);
    }

    @Provides
    @Singleton
    Service22 provideService22(Service23 service) {
        return new DefaultService22(service);
    }

    @Provides
    @Singleton
    Service23 provideService23(Service24 service) {
        return new DefaultService23(service);
    }

    @Provides
    @Singleton
    Service24 provideService24(Service25 service) {
        return new DefaultService24(service);
    }

    @Provides
    @Singleton
    Service25 provideService25(Service26 service) {
        return new DefaultService25(service);
    }

    @Provides
    @Singleton
    Service26 provideService26(Service27 service) {
        return new DefaultService26(service);
    }

    @Provides
    @Singleton
    Service27 provideService27(Service28 service) {
        return new DefaultService27(service);
    }

    @Provides
    @Singleton
    Service28 provideService28(Service29 service) {
        return new DefaultService28(service);
    }

    @Provides
    @Singleton
    Service29 provideService29(Service30 service) {
        return new DefaultService29(service);
    }

    @Provides
    @Singleton
    Service30 provideService30(Service31 service) {
        return new DefaultService30(service);
    }

    @Provides
    @Singleton
    Service31 provideService31(Service32 service) {
        return new DefaultService31(service);
    }

    @Provides
    @Singleton
    Service32 provideService32(Service33 service) {
        return new DefaultService32(service);
    }

    @Provides
    @Singleton
    Service33 provideService33(Service34 service) {
        return new DefaultService33(service);
    }

    @Provides
    @Singleton
    Service34 provideService34(Service35 service) {
        return new DefaultService34(service);
    }

    @Provides
    @Singleton
    Service35 provideService35(Service36 service) {
        return new DefaultService35(service);
    }

    @Provides
    @Singleton
    Service36 provideService36(Service37 service) {
        return new DefaultService36(service);
    }

    @Provides
    @Singleton
    Service37 provideService37(Service38 service) {
        return new DefaultService37(service);
    }

    @Provides
    @Singleton
    Service38 provideService38(Service39 service) {
        return new DefaultService38(service);
    }

    @Provides
    @Singleton
    Service39 provideService39(Service40 service) {
        return new DefaultService39(service);
    }

    @Provides
    @Singleton
    Service40 provideService40(Service41 service) {
        return new DefaultService40(service);
    }

    @Provides
    @Singleton
    Service41 provideService41(Service42 service) {
        return new DefaultService41(service);
    }

    @Provides
    @Singleton
    Service42 provideService42(Service43 service) {
        return new DefaultService42(service);
    }

    @Provides
    @Singleton
    Service43 provideService43(Service44 service) {
        return new DefaultService43(service);
    }

    @Provides
    @Singleton
    Service44 provideService44(Service45 service) {
        return new DefaultService44(service);
    }

    @Provides
    @Singleton
    Service45 provideService45(Service46 service) {
        return new DefaultService45(service);
    }

    @Provides
    @Singleton
    Service46 provideService46(Service47 service) {
        return new DefaultService46(service);
    }

    @Provides
    @Singleton
    Service47 provideService47(Service48 service) {
        return new DefaultService47(service);
    }

    @Provides
    @Singleton
    Service48 provideService48(Service49 service) {
        return new DefaultService48(service);
    }

    @Provides
    @Singleton
    Service49 provideService49(Service50 service) {
        return new DefaultService49(service);
    }

    @Provides
    @Singleton
    Service50 provideService50(Service51 service) {
        return new DefaultService50(service);
    }

    @Provides
    @Singleton
    Service51 provideService51(Service52 service) {
        return new DefaultService51(service);
    }

    @Provides
    @Singleton
    Service52 provideService52(Service53 service) {
        return new DefaultService52(service);
    }

    @Provides
    @Singleton
    Service53 provideService53(Service54 service) {
        return new DefaultService53(service);
    }

    @Provides
    @Singleton
    Service54 provideService54(Service55 service) {
        return new DefaultService54(service);
    }

    @Provides
    @Singleton
    Service55 provideService55(Service56 service) {
        return new DefaultService55(service);
    }

    @Provides
    @Singleton
    Service56 provideService56(Service57 service) {
        return new DefaultService56(service);
    }

    @Provides
    @Singleton
    Service57 provideService57(Service58 service) {
        return new DefaultService57(service);
    }

    @Provides
    @Singleton
    Service58 provideService58(Service59 service) {
        return new DefaultService58(service);
    }

    @Provides
    @Singleton
    Service59 provideService59(Service60 service) {
        return new DefaultService59(service);
    }

    @Provides
    @Singleton
    Service60 provideService60(Service61 service) {
        return new DefaultService60(service);
    }

    @Provides
    @Singleton
    Service61 provideService61(Service62 service) {
        return new DefaultService61(service);
    }

    @Provides
    @Singleton
    Service62 provideService62(Service63 service) {
        return new DefaultService62(service);
    }

    @Provides
    @Singleton
    Service63 provideService63(Service64 service) {
        return new DefaultService63(service);
    }

    @Provides
    @Singleton
    Service64 provideService64(Service65 service) {
        return new DefaultService64(service);
    }

    @Provides
    @Singleton
    Service65 provideService65(Service66 service) {
        return new DefaultService65(service);
    }

    @Provides
    @Singleton
    Service66 provideService66(Service67 service) {
        return new DefaultService66(service);
    }

    @Provides
    @Singleton
    Service67 provideService67(Service68 service) {
        return new DefaultService67(service);
    }

    @Provides
    @Singleton
    Service68 provideService68(Service69 service) {
        return new DefaultService68(service);
    }

    @Provides
    @Singleton
    Service69 provideService69(Service70 service) {
        return new DefaultService69(service);
    }

    @Provides
    @Singleton
    Service70 provideService70(Service71 service) {
        return new DefaultService70(service);
    }

    @Provides
    @Singleton
    Service71 provideService71(Service72 service) {
        return new DefaultService71(service);
    }

    @Provides
    @Singleton
    Service72 provideService72(Service73 service) {
        return new DefaultService72(service);
    }

    @Provides
    @Singleton
    Service73 provideService73(Service74 service) {
        return new DefaultService73(service);
    }

    @Provides
    @Singleton
    Service74 provideService74(Service75 service) {
        return new DefaultService74(service);
    }

    @Provides
    @Singleton
    Service75 provideService75(Service76 service) {
        return new DefaultService75(service);
    }

    @Provides
    @Singleton
    Service76 provideService76(Service77 service) {
        return new DefaultService76(service);
    }

    @Provides
    @Singleton
    Service77 provideService77(Service78 service) {
        return new DefaultService77(service);
    }

    @Provides
    @Singleton
    Service78 provideService78(Service79 service) {
        return new DefaultService78(service);
    }

    @Provides
    @Singleton
    Service79 provideService79(Service80 service) {
        return new DefaultService79(service);
    }

    @Provides
    @Singleton
    Service80 provideService80(Service81 service) {
        return new DefaultService80(service);
    }

    @Provides
    @Singleton
    Service81 provideService81(Service82 service) {
        return new DefaultService81(service);
    }

    @Provides
    @Singleton
    Service82 provideService82(Service83 service) {
        return new DefaultService82(service);
    }

    @Provides
    @Singleton
    Service83 provideService83(Service84 service) {
        return new DefaultService83(service);
    }

    @Provides
    @Singleton
    Service84 provideService84(Service85 service) {
        return new DefaultService84(service);
    }

    @Provides
    @Singleton
    Service85 provideService85(Service86 service) {
        return new DefaultService85(service);
    }

    @Provides
    @Singleton
    Service86 provideService86(Service87 service) {
        return new DefaultService86(service);
    }

    @Provides
    @Singleton
    Service87 provideService87(Service88 service) {
        return new DefaultService87(service);
    }

    @Provides
    @Singleton
    Service88 provideService88(Service89 service) {
        return new DefaultService88(service);
    }

    @Provides
    @Singleton
    Service89 provideService89(Service90 service) {
        return new DefaultService89(service);
    }

    @Provides
    @Singleton
    Service90 provideService90(Service91 service) {
        return new DefaultService90(service);
    }

    @Provides
    @Singleton
    Service91 provideService91(Service92 service) {
        return new DefaultService91(service);
    }

    @Provides
    @Singleton
    Service92 provideService92(Service93 service) {
        return new DefaultService92(service);
    }

    @Provides
    @Singleton
    Service93 provideService93(Service94 service) {
        return new DefaultService93(service);
    }

    @Provides
    @Singleton
    Service94 provideService94(Service95 service) {
        return new DefaultService94(service);
    }

    @Provides
    @Singleton
    Service95 provideService95(Service96 service) {
        return new DefaultService95(service);
    }

    @Provides
    @Singleton
    Service96 provideService96(Service97 service) {
        return new DefaultService96(service);
    }

    @Provides
    @Singleton
    Service97 provideService97(Service98 service) {
        return new DefaultService97(service);
    }

    @Provides
    @Singleton
    Service98 provideService98(Service99 service) {
        return new DefaultService98(service);
    }

    @Provides
    @Singleton
    Service99 provideService99(Service100 service) {
        return new DefaultService99(service);
    }

    @Provides
    @Singleton
    Service100 provideService100(Service101 service) {
        return new DefaultService100(service);
    }

    @Provides
    @Singleton
    Service101 provideService101() {
        return new DefaultService101();
    }
}
