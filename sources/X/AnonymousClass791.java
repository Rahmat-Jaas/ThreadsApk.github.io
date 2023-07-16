package X;

import com.facebook.dcp.signals.model.MetadataResponse;
import com.facebook.dcp.signals.model.SignalMetadata;
import com.facebook.dcp.signals.model.SignalsMetadata;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2;
import kotlin.jvm.internal.KtLambdaShape2S1200100_I2;

/* renamed from: X.791  reason: invalid class name */
public final class AnonymousClass791 {
    public static final String A09 = AnonymousClass791.class.getCanonicalName();
    public AnonymousClass74n A00;
    public final C146988nC A01;
    public final C121547Gq A02;
    public final C110306lS A03;
    public final C104516bu A04;
    public final AnonymousClass7DX A05;
    public final AnonymousClass7DX A06;
    public final C03700Kj A07;
    public final C104566bz A08;

    public AnonymousClass791(C03700Kj r2, C146988nC r3, C121547Gq r4, C110306lS r5, C104516bu r6, AnonymousClass7DX r7, AnonymousClass7DX r8, C104566bz r9) {
        C18230wP.A1R(r4, 5, r2);
        this.A04 = r6;
        this.A01 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = r4;
        this.A07 = r2;
        this.A03 = r5;
        this.A08 = r9;
    }

    public final void A01(long j, String str, List list) {
        boolean A1Y = AnonymousClass0wJ.A1Y(str, list);
        AnonymousClass68S r3 = AnonymousClass68S.SIGNAL_STORE_STORE;
        Unit unit = Unit.A00;
        C121547Gq r1 = this.A02;
        C98666Gl.A00(r3, r1, unit, "no_use_case", new KtLambdaShape2S1200100_I2(this, list, str, A1Y ? 1 : 0, j));
    }

    public final AnonymousClass74n A00() {
        AnonymousClass74n r4 = this.A00;
        if (r4 == null) {
            C110306lS r7 = this.A03;
            C07810cE r2 = r7.A03.A00;
            if (r2 != null && r2.ATr(36319231297590257L)) {
                ((C125677do) r7.A02.A00).A00.removeAll();
            }
            MetadataResponse metadataResponse = (MetadataResponse) C98666Gl.A00(AnonymousClass68S.SIGNAL_STORE_METADATA_FETCH, r7.A01, new MetadataResponse(new SignalsMetadata((String) null, 3)), "no_use_case", new KtLambdaShape22S0100000_I2_2(r7, 43));
            C04220Ms.A0B(metadataResponse, 0);
            r4 = new AnonymousClass74n((HashMap) null, (DefaultConstructorMarker) null, 1);
            for (SignalMetadata signalMetadata : metadataResponse.A00.A01) {
                r4.A00.put(signalMetadata.A0B, signalMetadata);
            }
            this.A00 = r4;
        }
        return r4;
    }
}
