package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.service.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70;
import kotlin.jvm.internal.KtLambdaShape91S0100000_I2_71;

/* renamed from: X.7EN  reason: invalid class name */
public final class AnonymousClass7EN {
    public WeakReference A00;
    public final UserSession A01;
    public final C04530Oa A02 = AnonymousClass0OY.A02(new KtLambdaShape90S0100000_I2_70(this, 47));
    public final C04530Oa A03 = AnonymousClass0OY.A02(new KtLambdaShape90S0100000_I2_70(this, 48));
    public final C04530Oa A04 = AnonymousClass0OY.A02(new KtLambdaShape90S0100000_I2_70(this, 49));
    public final C04530Oa A05 = A00(this, 0);
    public final C04530Oa A06 = A00(this, 1);
    public final C04530Oa A07 = A00(this, 2);
    public final C04530Oa A08 = A00(this, 3);
    public final C04530Oa A09 = A00(this, 4);
    public final C04530Oa A0A = A00(this, 5);
    public final C04530Oa A0B = A00(this, 6);
    public final C04530Oa A0C = A00(this, 7);

    public final void A02(Context context, AnonymousClass01V r27, AnonymousClass8jO r28, AnonymousClass5HJ r29, AnonymousClass945 r30, D1C d1c, String str, String str2, String str3) {
        Context context2 = context;
        String str4 = str;
        AnonymousClass0wJ.A1M(context2, 0, str4);
        AnonymousClass01V r8 = r27;
        C04220Ms.A0B(r8, 5);
        r8.markerAnnotate(424097382, "warm_up_enabled", AnonymousClass0wJ.A1X(this.A0C.getValue()));
        r8.markerAnnotate(424097382, "immediate_source_enabled", AnonymousClass0wJ.A1X(this.A08.getValue()));
        r8.markerAnnotate(424097382, "server_source_enabled", AnonymousClass0wJ.A1X(this.A09.getValue()));
        r8.markerAnnotate(424097382, "system_source_enabled", AnonymousClass0wJ.A1X(this.A0A.getValue()));
        r8.markerAnnotate(424097382, "prefetch_source_enabled", AnonymousClass0wJ.A1X(this.A07.getValue()));
        AnonymousClass8jO r10 = r28;
        AnonymousClass5HJ r11 = r29;
        AnonymousClass945 r12 = r30;
        D1C d1c2 = d1c;
        String str5 = str2;
        String str6 = str3;
        if (AnonymousClass0wJ.A1X(this.A05.getValue())) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AnonymousClass0gE.A00().A00;
                C85994w6 listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) scheduledThreadPoolExecutor);
                C04220Ms.A06(listeningDecorator);
                C30954Gc6.A03(new C130047nz(r8, this, r10, r12, d1c2, str5, str6), C34494IYg.A00(listeningDecorator.CwQ(new C1368084m(context2, r8, this, r11, str4)), scheduledThreadPoolExecutor, TimeUnit.MILLISECONDS, C18190wL.A08(this.A06.getValue())), C97356Ba.A01);
            } catch (TimeoutException e) {
                StringBuilder A0s = C18190wL.A0s("timeout: ");
                A0s.append(e);
                r8.markerAnnotate(424097382, TraceFieldType.FailureReason, C18180wK.A0i(".message", A0s));
                C63643hy.A04(new AnonymousClass83H(this, r10, r12, d1c2, (Double) null, str5, str6, true));
            } catch (Exception e2) {
                String message = e2.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                r8.markerAnnotate(424097382, TraceFieldType.FailureReason, message);
                C63643hy.A04(new AnonymousClass83H(this, r10, r12, d1c2, (Double) null, str5, str6, true));
            }
        } else {
            AnonymousClass0gN.A00().AKp(new AnonymousClass61R(context2, r8, this, r10, r11, r12, d1c2, str4, str5, str6));
        }
    }

    public static C04530Oa A00(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape91S0100000_I2_71(obj, i));
    }

    public AnonymousClass7EN(UserSession userSession) {
        this.A01 = userSession;
    }

    public static /* synthetic */ void A01(AnonymousClass7EN r10, String str, long j) {
        StringBuilder A0s;
        long j2 = j;
        String str2 = str;
        if (j >= 0) {
            ((C147058nK) ((C696649n) r10.A03.getValue()).A01.getValue()).DBI(str2, j2, 604800000);
            return;
        }
        if (j < 0) {
            A0s = C18190wL.A0s("Collect signal with invalid value: ");
            A0s.append(j);
            A0s.append(", signal key: ");
            A0s.append(str);
            A0s.append(' ');
        } else {
            A0s = C18190wL.A0s("Collect signal with invalid ttl: ");
            A0s.append(604800000);
            A0s.append(", signal key: ");
            A0s.append(str);
        }
        AnonymousClass7ES.A00((Exception) null, A0s.toString());
    }
}
