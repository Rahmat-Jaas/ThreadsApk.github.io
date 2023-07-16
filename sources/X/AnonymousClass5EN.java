package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.HashMap;

/* renamed from: X.5EN  reason: invalid class name */
public final class AnonymousClass5EN extends C111716oC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ Bundle A05;
    public final /* synthetic */ AnonymousClass7Ep A06;
    public final /* synthetic */ ZonePolicy A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ HashMap A0A;
    public final /* synthetic */ HashMap A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ Context A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EN(Context context, Bundle bundle, AnonymousClass7Ep r5, ZonePolicy zonePolicy, String str, String str2, HashMap hashMap, HashMap hashMap2, int i, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        super(r5);
        this.A06 = r5;
        this.A08 = str;
        this.A03 = j;
        this.A04 = j2;
        this.A01 = j3;
        this.A02 = j4;
        this.A00 = i;
        this.A0E = z;
        this.A0D = z2;
        this.A0A = hashMap;
        this.A0C = z3;
        this.A09 = str2;
        this.A0B = hashMap2;
        this.A05 = bundle;
        this.A07 = zonePolicy;
        this.A0F = context;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        String str = this.A08;
        long j = this.A03;
        long j2 = this.A04;
        long j3 = this.A01;
        long j4 = this.A02;
        int i = this.A00;
        boolean z = this.A0E;
        boolean z2 = this.A0D;
        int i2 = i;
        boolean z3 = z;
        boolean z4 = z2;
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        String str2 = str;
        long j8 = j;
        browserLiteCallback.Bcx(str2, j8, j7, j6, j5, -1, i2, false, z3, z4, this.A0A, this.A0C, this.A09, this.A0B, this.A05, this.A07);
    }
}
