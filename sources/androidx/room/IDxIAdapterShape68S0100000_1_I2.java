package androidx.room;

import X.AnonymousClass176;
import X.C209916z;
import X.C28051Exi;
import X.C41259M6w;
import X.CHX;

public class IDxIAdapterShape68S0100000_1_I2 extends CHX {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxIAdapterShape68S0100000_1_I2(C41259M6w m6w, Object obj, int i) {
        super(m6w);
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ void bind(C28051Exi exi, Object obj) {
        if (this.A01 != 0) {
            AnonymousClass176 r5 = (AnonymousClass176) obj;
            exi.AAa(1, r5.A01);
            exi.AAa(2, (long) r5.A00);
            return;
        }
        C209916z r52 = (C209916z) obj;
        exi.AAa(1, (long) r52.A00);
        exi.AAi(2, r52.A08);
        exi.AAa(3, r52.A03);
        Integer num = r52.A05;
        if (num == null) {
            exi.AAb(4);
        } else {
            exi.AAa(4, (long) num.intValue());
        }
        String str = r52.A07;
        if (str == null) {
            exi.AAb(5);
        } else {
            exi.AAi(5, str);
        }
        exi.AAa(6, (long) r52.A01);
        Long l = r52.A06;
        if (l == null) {
            exi.AAb(7);
        } else {
            exi.AAa(7, l.longValue());
        }
        Float f = r52.A04;
        if (f == null) {
            exi.AAb(8);
        } else {
            exi.AAY(8, (double) f.floatValue());
        }
        String str2 = r52.A09;
        if (str2 == null) {
            exi.AAb(9);
        } else {
            exi.AAi(9, str2);
        }
        exi.AAa(10, r52.A02);
    }

    public final String createQuery() {
        if (this.A01 != 0) {
            return "INSERT OR IGNORE INTO `content_filter_dictionary_client_availability` (`dictionary_id`,`client_id`) VALUES (?,?)";
        }
        return "INSERT OR REPLACE INTO `signals` (`id`,`signal_id`,`timestamp`,`signal_component_id`,`context`,`type`,`long_value`,`float_value`,`text_value`,`expiration_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
    }
}
