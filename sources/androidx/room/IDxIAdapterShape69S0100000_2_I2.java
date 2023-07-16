package androidx.room;

import X.AnonymousClass7JN;
import X.C110666m4;
import X.C28051Exi;
import X.C41259M6w;
import X.C89885Hk;
import X.CHX;

public class IDxIAdapterShape69S0100000_2_I2 extends CHX {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxIAdapterShape69S0100000_2_I2(C41259M6w m6w, Object obj, int i) {
        super(m6w);
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ void bind(C28051Exi exi, Object obj) {
        if (this.A01 != 0) {
            C110666m4 r5 = (C110666m4) obj;
            exi.AAi(1, r5.A04);
            exi.AAi(2, r5.A01);
            exi.AAi(3, r5.A02);
            exi.AAa(4, r5.A00);
            exi.AAi(5, r5.A03);
            exi.AAa(6, r5.A05 ? 1 : 0);
            return;
        }
        C89885Hk r52 = (C89885Hk) obj;
        AnonymousClass7JN.A00(exi, r52, (long) r52.A02);
    }

    public final String createQuery() {
        if (this.A01 != 0) {
            return "INSERT OR REPLACE INTO `mini_gallery_categories` (`miniGallerySurface`,`categoryId`,`displayName`,`syncedAt`,`id`,`isDefaultCategory`) VALUES (?,?,?,?,?,?)";
        }
        return "INSERT OR REPLACE INTO `examples` (`id`,`example_id`,`use_case`,`use_case_version`,`model_version`,`label`,`features`,`timestamp`,`label_timestamp`,`context`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
    }
}
