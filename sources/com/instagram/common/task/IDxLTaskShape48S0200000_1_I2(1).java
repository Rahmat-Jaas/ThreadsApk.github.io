package com.instagram.common.task;

import X.AnonymousClass006;
import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass1R4;
import X.AnonymousClass1ZW;
import X.AnonymousClass1h3;
import X.AnonymousClass269;
import X.AnonymousClass2AX;
import X.AnonymousClass31X;
import X.AnonymousClass3AS;
import X.AnonymousClass3E9;
import X.AnonymousClass3KG;
import X.AnonymousClass3Q8;
import X.AnonymousClass3TE;
import X.AnonymousClass3TI;
import X.AnonymousClass3UG;
import X.AnonymousClass3Zq;
import X.AnonymousClass4UY;
import X.C09830gl;
import X.C10300i6;
import X.C10450iM;
import X.C11630kW;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C18987Aon;
import X.C24381ia;
import X.C31155GhB;
import X.C32165H8c;
import X.C36477JWz;
import X.C57833Cq;
import X.C60173Nz;
import X.C62293Yd;
import X.C63633hx;
import X.C63813iO;
import X.C682743d;
import X.C83914sC;
import X.FR1;
import X.GY6;
import X.H1T;
import X.MMp;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.instagram.bugreporter.BugReporterDrawingView;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class IDxLTaskShape48S0200000_1_I2 extends FR1 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLTaskShape48S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final void A02(Exception exc) {
        switch (this.A02) {
            case 0:
                AnonymousClass0LU.A03(AnonymousClass1ZW.class, "Failed to save annotated screenshot.", exc);
                C18250wR.A1C(this.A01);
                C63813iO.A04(2131822729);
                return;
            case 2:
                A04();
                return;
            case 3:
                C63813iO.A0A((Context) this.A00, 2131825600, 1);
                return;
            case 4:
                ((AnonymousClass3TE) this.A00).A01 = false;
                C10450iM.A07("Failed to fetch isManagedAppCache value", exc);
                return;
            case 5:
                AnonymousClass31X.A00((Context) this.A00, (UserSession) this.A01, (List) null);
                return;
            default:
                super.A02(exc);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        boolean z;
        switch (this.A02) {
            case 0:
                C18250wR.A1C(this.A01);
                ((Fragment) this.A00).mFragmentManager.A0d();
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    AnonymousClass3TI r5 = (AnonymousClass3TI) this.A00;
                    Context context = r5.A00;
                    UserSession userSession = (UserSession) this.A01;
                    H1T A0N = AnonymousClass0wJ.A0N(userSession);
                    A0N.A0J("accounts/init_confidence_flow/");
                    AnonymousClass269.A0A(A0N, "client_start_message", str);
                    C18180wK.A0t(context, A0N, AnonymousClass3Q8.A00(0, 9, 104), C18220wO.A0g(context, A0N, "user_id", userSession.getUserId()));
                    C18240wQ.A1A(A0N, AnonymousClass1R4.class, AnonymousClass3KG.class);
                    C32165H8c A0Q = C18190wL.A0Q(A0N);
                    A0Q.A00 = new AnonymousClass1h3(r5, userSession);
                    C31155GhB.A03(A0Q);
                    return;
                }
                return;
            case 2:
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    A04();
                    return;
                }
                UserSession userSession2 = (UserSession) this.A01;
                Object A012 = userSession2.A01(AnonymousClass3AS.class, AnonymousClass4UY.A00);
                AnonymousClass3AS r3 = (AnonymousClass3AS) A012;
                synchronized (A012) {
                    z = r3.A02;
                }
                if (!z) {
                    AnonymousClass3Zq.A01((Context) this.A00, new C24381ia(userSession2, true), userSession2, "add_email_nux", list);
                    Integer num = AnonymousClass006.A00;
                    synchronized (A012) {
                        r3.A01 = num;
                    }
                    return;
                }
                return;
            case 3:
                Context context2 = (Context) this.A00;
                C09830gl.A01(context2, (String) obj, (String) null);
                C63813iO.A0A(context2, 2131825599, 1);
                return;
            case 4:
                AnonymousClass3TE r2 = (AnonymousClass3TE) this.A00;
                boolean z2 = r2.A01;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (z2 != booleanValue) {
                    r2.A01 = booleanValue;
                    return;
                }
                return;
            default:
                AnonymousClass31X.A00((Context) this.A00, (UserSession) this.A01, (List) obj);
                return;
        }
    }

    public final void A04() {
        boolean z;
        UserSession userSession = (UserSession) this.A01;
        Object A012 = userSession.A01(AnonymousClass3AS.class, AnonymousClass4UY.A00);
        AnonymousClass3AS r4 = (AnonymousClass3AS) A012;
        synchronized (A012) {
            z = r4.A02;
        }
        if (!z) {
            AnonymousClass3Zq.A01((Context) this.A00, new C24381ia(userSession, false), userSession, "add_email_nux", (List) null);
        }
        Integer num = AnonymousClass006.A01;
        synchronized (A012) {
            r4.A01 = num;
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        IllegalStateException th;
        long j;
        Bitmap copy;
        switch (this.A02) {
            case 0:
                AnonymousClass1ZW r5 = (AnonymousClass1ZW) this.A00;
                BugReporterDrawingView bugReporterDrawingView = r5.A00;
                Bitmap bitmap = bugReporterDrawingView.A03;
                if (bitmap == null && bugReporterDrawingView.A02 == null) {
                    throw C18180wK.A0a("The drawing view has a size of zero, so creating a final bitmap does not make sense.");
                }
                if (bitmap == null) {
                    Bitmap bitmap2 = bugReporterDrawingView.A02;
                    bitmap2.getClass();
                    copy = bitmap2.copy(bitmap2.getConfig(), true);
                } else {
                    copy = bitmap.copy(bitmap.getConfig(), true);
                    Canvas canvas = new Canvas(copy);
                    bugReporterDrawingView.A05.getClass();
                    Matrix matrix = new Matrix();
                    Rect rect = bugReporterDrawingView.A05;
                    matrix.postTranslate((float) (-rect.left), (float) (-rect.top));
                    matrix.postScale(((float) copy.getWidth()) / ((float) bugReporterDrawingView.A05.width()), ((float) copy.getHeight()) / ((float) bugReporterDrawingView.A05.height()));
                    canvas.setMatrix(matrix);
                    canvas.drawPath(bugReporterDrawingView.A08, bugReporterDrawingView.A07);
                }
                if (GY6.A01(copy, new File(r5.A01)) != null) {
                    return null;
                }
                throw new IOException("Could not save the annotated image.");
            case 1:
                try {
                    AnonymousClass3E9 A002 = AnonymousClass3UG.A00(((AnonymousClass3TI) this.A00).A02);
                    if (A002 != null) {
                        return AnonymousClass3TI.A07.A02(A002.A00());
                    }
                    return null;
                } catch (AnonymousClass2AX | RemoteException | IllegalStateException | SecurityException e) {
                    C10450iM.A06("ConfidenceFrameworkHelper", "confidence_framework_client_start_query_failed", e);
                    return null;
                }
            case 2:
                Context context = (Context) this.A00;
                C10300i6 r3 = (C10300i6) this.A01;
                C682743d r2 = new C682743d(this);
                AnonymousClass0wJ.A1N(context, r3);
                return C63633hx.A01(context, r2, r3, (C83914sC) null, "nux_add_email");
            case 3:
                StringWriter A0d = C18230wP.A0d();
                MMp A04 = C18987Aon.A00.A04(A0d);
                C60173Nz.A00(A04, (C57833Cq) this.A01);
                A04.close();
                return A0d.toString();
            case 4:
                try {
                    C62293Yd r6 = (C62293Yd) this.A01;
                    if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                        C36477JWz jWz = r6.A03;
                        boolean z = true;
                        if (!jWz.A01().A05 || !jWz.A02(1)) {
                            z = false;
                        }
                        boolean z2 = false;
                        if (z) {
                            synchronized (r6) {
                                try {
                                    int componentEnabledSetting = r6.A02.getComponentEnabledSetting(r6.A00);
                                    if (componentEnabledSetting != 0) {
                                        SharedPreferences sharedPreferences = r6.A01;
                                        long A05 = C18180wK.A05(sharedPreferences, "/is_managed_app_cache/is_managed_app_last_check");
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (A05 > currentTimeMillis) {
                                            AnonymousClass0wJ.A12(sharedPreferences.edit(), "/is_managed_app_cache/is_managed_app_last_check", currentTimeMillis);
                                        } else {
                                            if (jWz.A02(9)) {
                                                j = C62293Yd.A07;
                                            } else {
                                                j = C62293Yd.A06;
                                            }
                                            if (currentTimeMillis > A05 + j) {
                                            }
                                        }
                                        if (componentEnabledSetting == 1) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = r6.A02();
                                } catch (Throwable th2) {
                                    while (true) {
                                        th = th2;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z2);
                    }
                    th = C18180wK.A0a("Cannot block UI thread when waiting for service call.");
                    throw th;
                } catch (Exception unused) {
                    throw new IOException();
                }
            default:
                Context context2 = (Context) this.A00;
                C10300i6 r1 = (C10300i6) this.A01;
                AnonymousClass0wJ.A1N(context2, r1);
                return C63633hx.A01(context2, (C11630kW) null, r1, (C83914sC) null, (String) null);
        }
    }

    public final int getRunnableId() {
        switch (this.A02) {
            case 0:
                return 255;
            case 1:
                return 316234685;
            case 2:
                return 251;
            case 3:
                return 1656887534;
            case 4:
                return 535;
            default:
                return 260;
        }
    }
}
