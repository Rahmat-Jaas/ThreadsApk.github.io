package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5001000_I2;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.83F  reason: invalid class name */
public final class AnonymousClass83F implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ KtCSuperShape0S5001000_I2 A01;
    public final /* synthetic */ QuickPerformanceLogger A02;
    public final /* synthetic */ C110596lx A03;
    public final /* synthetic */ ImmutableMap A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;

    public AnonymousClass83F(KtCSuperShape0S5001000_I2 ktCSuperShape0S5001000_I2, QuickPerformanceLogger quickPerformanceLogger, C110596lx r3, ImmutableMap immutableMap, Integer num, String str, long j) {
        this.A02 = quickPerformanceLogger;
        this.A01 = ktCSuperShape0S5001000_I2;
        this.A00 = j;
        this.A03 = r3;
        this.A05 = num;
        this.A06 = str;
        this.A04 = immutableMap;
    }

    public final void run() {
        String str;
        String str2;
        int i;
        QuickPerformanceLogger quickPerformanceLogger = this.A02;
        KtCSuperShape0S5001000_I2 ktCSuperShape0S5001000_I2 = this.A01;
        int hashCode = ktCSuperShape0S5001000_I2.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        HashMap A0y = AnonymousClass0wJ.A0y();
        AnonymousClass7E4.A00(ktCSuperShape0S5001000_I2, A0y);
        AnonymousClass7E4.A01(this.A03, A0y);
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 0:
            case 1:
                str = "network";
                break;
            case 6:
            case 7:
                str = "rendering";
                break;
            default:
                str = "data";
                break;
        }
        A0y.put(C28174Ezk.A00(543), str);
        switch (intValue) {
            case 1:
                str2 = "ASSETS_FETCH_FAIL";
                break;
            case 2:
                str2 = "IMAGE_DIM_MISMATCH";
                break;
            case 6:
            case 7:
                str2 = "PREPARE_RENDER_FAIL";
                break;
            default:
                str2 = "DOCUMENT_FETCH_FAIL";
                break;
        }
        A0y.put("error_name", str2);
        switch (intValue) {
            case 0:
                i = 200;
                break;
            case 1:
                i = 210;
                break;
            case 2:
                i = 300;
                break;
            case 3:
                i = 310;
                break;
            case 4:
                i = 311;
                break;
            case 5:
                i = 312;
                break;
            case 6:
                i = 400;
                break;
            default:
                i = HttpStatus.SC_UNAUTHORIZED;
                break;
        }
        A0y.put(TraceFieldType.ErrorCode, String.valueOf(i));
        A0y.put("error_message", this.A06);
        ImmutableMap immutableMap = this.A04;
        C04220Ms.A0C(immutableMap, C18170wI.A00(100));
        A0y.put("error_data", C18190wL.A0n(new JSONObject(immutableMap)));
        AnonymousClass7JC.A02(quickPerformanceLogger, A0y, timeUnit, 51527556, hashCode, j);
        ImmutableMap immutableMap2 = RegularImmutableMap.A02;
        C04220Ms.A06(immutableMap2);
        AnonymousClass7JC.A03(quickPerformanceLogger, immutableMap2, timeUnit, 51527556, hashCode, j, 2);
    }
}
