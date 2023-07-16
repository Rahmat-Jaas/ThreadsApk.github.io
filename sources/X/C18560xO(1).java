package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ch.boye.httpclientandroidlib.HttpStatus;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import com.instagram.barcelona.R;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;
import com.instagram.service.session.UserSession;
import com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener;

/* renamed from: X.0xO  reason: invalid class name and case insensitive filesystem */
public final class C18560xO extends Handler {
    public final BrowserLiteCallbackService A00;

    public final void handleMessage(Message message) {
        String str;
        AnonymousClass3VQ r1;
        AnonymousClass22G r0;
        String str2;
        AnonymousClass4CN r12;
        C37489Juf juf;
        try {
            BrowserLiteCallbackService browserLiteCallbackService = this.A00;
            C04220Ms.A0B(browserLiteCallbackService, 0);
            UserSession A01 = AnonymousClass0RG.A00().A01();
            int i = message.what;
            if (i != 0) {
                String A002 = I17.A00(750);
                boolean z = true;
                if (i == 1) {
                    C10650ih.A0B(browserLiteCallbackService, Intent.createChooser(C18250wR.A05("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", (String) message.obj).setType(HTTP.PLAIN_TEXT_TYPE), browserLiteCallbackService.getString(R.string.f0nameremoved)).addFlags(276824064));
                } else if (i != 2) {
                    if (i == 3) {
                        Object obj = message.obj;
                        if (obj == null || !AnonymousClass0wJ.A1X(obj)) {
                            z = false;
                        }
                        if (!z) {
                            C63643hy.A02();
                            C691847d.A04 = true;
                            Handler handler = C691847d.A07;
                            Runnable runnable = C691847d.A0A;
                            handler.removeCallbacks(runnable);
                            handler.postDelayed(runnable, 5000);
                        }
                        AnonymousClass3UZ r02 = AnonymousClass3UZ.A02;
                        if (r02 != null) {
                            r1 = IgTimeInAppActivityListener.A00(r02.A00, A01).A03;
                            r0 = AnonymousClass22G.BACKGROUND;
                            r1.A00(r0);
                            return;
                        }
                        return;
                    } else if (i == 4) {
                        int i2 = message.arg1;
                        String str3 = null;
                        if (i2 == 2) {
                            str3 = "back";
                        } else if (i2 == 1) {
                            str3 = "up";
                        }
                        boolean z2 = message.getData().getBoolean(A002, true);
                        Object obj2 = message.obj;
                        obj2.getClass();
                        String str4 = (String) obj2;
                        C04220Ms.A0B(str4, 2);
                        KK7 A003 = KK7.A00(A01);
                        A003.A0B = z2;
                        A003.A0D(new AnonymousClass4CN(str4, (String) null), str3, 0);
                        return;
                    } else {
                        throw C18180wK.A0a(AnonymousClass00U.A0J("Illegal action specified: ", i));
                    }
                }
                Bundle data = message.getData();
                String string = data.getString("moduleName");
                if (string == null) {
                    C10450iM.A03("IAB Logging", "Error getting null module name");
                    return;
                }
                if (data.getString("url") != null) {
                    str2 = data.getString("url");
                } else {
                    str2 = "";
                }
                boolean z3 = data.getBoolean(A002, true);
                C04220Ms.A0B(str2, 2);
                KK7 A004 = KK7.A00(A01);
                if (z3) {
                    r12 = new AnonymousClass4CN(string, str2);
                } else {
                    r12 = new AnonymousClass4CN(string, (String) null);
                }
                A004.A0B = z3;
                A004.A0E("separate_process", r12);
                if (z3 && (juf = C37220Jmj.A00(A01).A01) != null) {
                    juf.A00(string, str2);
                }
                C691847d.A01();
                AnonymousClass3UZ r03 = AnonymousClass3UZ.A02;
                if (r03 != null) {
                    r1 = IgTimeInAppActivityListener.A00(r03.A00, A01).A03;
                    r0 = AnonymousClass22G.FOREGROUND;
                    r1.A00(r0);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            obj3.getClass();
            C09830gl.A01(browserLiteCallbackService, (String) obj3, (String) null);
            C63813iO.A00(browserLiteCallbackService, R.string.f0nameremoved);
        } catch (Throwable th) {
            if (th.getMessage() != null) {
                str = th.getMessage();
            } else {
                str = "Error on loadUserSession: empty message";
            }
            C10450iM.A03(I17.A00(HttpStatus.SC_LENGTH_REQUIRED), str);
        }
    }

    public C18560xO(BrowserLiteCallbackService browserLiteCallbackService) {
        super(Looper.getMainLooper());
        this.A00 = browserLiteCallbackService;
    }
}
