package com.facebook.privacy.consent.bloks.instagram;

import X.AnonymousClass00U;
import X.AnonymousClass01V;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0hH;
import X.AnonymousClass3Q5;
import X.AnonymousClass4A9;
import X.AnonymousClass4WJ;
import X.AnonymousClass749;
import X.AnonymousClass77M;
import X.AnonymousClass7IE;
import X.AnonymousClass85G;
import X.C04220Ms;
import X.C06750aI;
import X.C10300i6;
import X.C104726cH;
import X.C107196gL;
import X.C109326jp;
import X.C11630kW;
import X.C1192073y;
import X.C121107Ed;
import X.C130667qT;
import X.C132117tM;
import X.C139108Mr;
import X.C13950oZ;
import X.C14030oh;
import X.C18180wK;
import X.C30954Gc6;
import X.C31164GhX;
import X.C61043Rr;
import X.C63173fJ;
import X.C63263h8;
import X.C63893iY;
import X.C86204wf;
import X.C98826Hb;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.redex.IDxFCallbackShape18S1200000_2_I2;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.util.IDxACallbackShape104S0100000_2_I2;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4;

public final class InstagramConsentFlowHostActivity extends IgFragmentActivity implements C11630kW {
    public C86204wf A00;
    public AnonymousClass01V A01;
    public C10300i6 A02;
    public String A03;

    public final String getModuleName() {
        return "InstagramConsentFlowActivity";
    }

    public final C10300i6 getSession() {
        C10300i6 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("session");
        throw null;
    }

    public final void onBackPressed() {
        super.onBackPressed();
        String str = this.A03;
        if (str == null) {
            C04220Ms.A0E("flowInstanceId");
            throw null;
        } else {
            AnonymousClass749.A00(str);
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        String str;
        C132117tM r15;
        int A002 = C14030oh.A00(1844425596);
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Intent intent = getIntent();
        C04220Ms.A06(intent);
        this.A02 = r1.A02(AnonymousClass0hH.A00(intent));
        super.onCreate(bundle);
        setRequestedOrientation(1);
        String stringExtra = getIntent().getStringExtra("flow_name");
        if (stringExtra != null) {
            String stringExtra2 = getIntent().getStringExtra("experience_id");
            if (stringExtra2 != null) {
                if (this.A02 == null) {
                    str = "session";
                } else {
                    AnonymousClass01V r0 = AnonymousClass01V.A0p;
                    C04220Ms.A06(r0);
                    this.A01 = r0;
                    String A0N = AnonymousClass00U.A0N(stringExtra2, stringExtra, '$');
                    this.A03 = A0N;
                    str = "flowInstanceId";
                    if (A0N != null) {
                        synchronized (AnonymousClass77M.A00) {
                            AnonymousClass77M.A01.put(A0N, this);
                        }
                        if (bundle == null) {
                            AnonymousClass01V r02 = this.A01;
                            if (r02 == null) {
                                str = "quickPerformanceLogger";
                            } else {
                                r02.markerStart(192756491, "flow_name", stringExtra);
                                String stringExtra3 = getIntent().getStringExtra("app_id");
                                if (stringExtra3 != null) {
                                    String stringExtra4 = getIntent().getStringExtra("source");
                                    Intent intent2 = getIntent();
                                    String A003 = AnonymousClass3Q5.A00(0, 9, 44);
                                    String stringExtra5 = intent2.getStringExtra(A003);
                                    String stringExtra6 = getIntent().getStringExtra("extra_params_json");
                                    C86204wf r152 = new C86204wf(this, C139108Mr.A00);
                                    this.A00 = r152;
                                    C13950oZ.A00(r152);
                                    C10300i6 r153 = this.A02;
                                    if (r153 == null) {
                                        C04220Ms.A0E("session");
                                        throw null;
                                    }
                                    C130667qT A004 = C130667qT.A00((SparseArray) null, this, this, r153);
                                    C98826Hb r16 = C132117tM.A03;
                                    C10300i6 r154 = this.A02;
                                    if (r154 == null) {
                                        C04220Ms.A0E("session");
                                        throw null;
                                    }
                                    synchronized (r16) {
                                        r15 = (C132117tM) r154.A01(C132117tM.class, new KtLambdaShape24S0100000_I2_4(r154, 29));
                                    }
                                    SettableFuture settableFuture = new SettableFuture();
                                    Map A0I = AnonymousClass4WJ.A0I(C18180wK.A0p("flow_name", stringExtra), C18180wK.A0p("experience_id", stringExtra2));
                                    if (stringExtra4 != null) {
                                        A0I.put("source", stringExtra4);
                                    }
                                    if (stringExtra5 != null) {
                                        A0I.put(A003, stringExtra5);
                                    }
                                    if (stringExtra6 != null) {
                                        A0I.put("extra_params_json", stringExtra6);
                                    }
                                    r15.A02.get(C06750aI.A17(stringExtra, stringExtra3, stringExtra4, stringExtra5, stringExtra6).toString());
                                    r15.A00.markerAnnotate(192756491, "is_cache_hit", false);
                                    AnonymousClass4A9 A005 = C63263h8.A00(r15.A01, stringExtra3, A0I);
                                    A005.A00 = new IDxACallbackShape104S0100000_2_I2(settableFuture, 0);
                                    schedule(A005);
                                    C30954Gc6.A03(new IDxFCallbackShape18S1200000_2_I2(this, A004, stringExtra2, 2), settableFuture, AnonymousClass85G.A01);
                                } else {
                                    illegalStateException = C18180wK.A0a("Required value was null.");
                                    i = -2131909656;
                                }
                            }
                        }
                        int color = getColor(R.color.direct_widget_primary_background);
                        C31164GhX.A02(this, color);
                        AnonymousClass7IE.A03(this, color);
                        C14030oh.A07(-78175406, A002);
                        return;
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -1750421292;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 2026159815;
        }
        C14030oh.A07(i, A002);
        throw illegalStateException;
    }

    public final void onDestroy() {
        int A002 = C14030oh.A00(-1563994472);
        AnonymousClass77M r2 = AnonymousClass77M.A00;
        String str = this.A03;
        if (str != null) {
            synchronized (r2) {
                AnonymousClass77M.A01.remove(str);
            }
            if (isFinishing()) {
                String str2 = this.A03;
                if (str2 != null) {
                    ReentrantReadWriteLock.WriteLock writeLock = AnonymousClass749.A02.writeLock();
                    C04220Ms.A06(writeLock);
                    writeLock.lock();
                    try {
                        AnonymousClass749.A00.remove(str2);
                        C104726cH r0 = (C104726cH) AnonymousClass749.A01.remove(str2);
                        if (r0 != null) {
                            C107196gL r02 = r0.A00;
                            C109326jp r22 = r02.A01;
                            if (r22 != null) {
                                C61043Rr.A00(r02.A00, C63893iY.A01, r22);
                            }
                            C121107Ed.A03.unlock();
                        }
                        if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18313190794405960L)) {
                            String str3 = this.A03;
                            if (str3 != null) {
                                AbstractCollection abstractCollection = (AbstractCollection) C1192073y.A00.remove(str3);
                                if (abstractCollection != null) {
                                    Iterator it = abstractCollection.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        C04220Ms.A04(next);
                                        C1192073y.A01.remove(next);
                                    }
                                }
                            }
                        }
                    } finally {
                        writeLock.unlock();
                    }
                }
            }
            super.onDestroy();
            C14030oh.A07(-611057952, A002);
            return;
        }
        C04220Ms.A0E("flowInstanceId");
        throw null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
