package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.AnonymousClass2C6;
import X.AnonymousClass7pN;
import X.C04220Ms;
import X.C109766ka;
import X.C113856sH;
import X.C1197576u;
import X.C18180wK;
import X.C28174Ezk;
import X.C86134wK;
import X.C86144wL;
import X.I17;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import java.util.concurrent.atomic.AtomicBoolean;

public class IDxLCallbacksShape579S0100000_2_I2 implements Application.ActivityLifecycleCallbacks {
    public Object A00;
    public final int A01;

    public IDxLCallbacksShape579S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onActivityDestroyed(Activity activity) {
        if (2 - this.A01 == 0) {
            C113856sH r1 = (C113856sH) this.A00;
            if (activity == r1.A00.get()) {
                r1.A00();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (X.C1197576u) r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityPaused(android.app.Activity r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            if (r0 != 0) goto L_0x0019
            java.lang.Object r2 = r3.A00
            X.76u r2 = (X.C1197576u) r2
            android.view.View r1 = r2.A01
            if (r1 == 0) goto L_0x0019
            android.view.WindowManager r0 = r2.A02
            if (r0 == 0) goto L_0x0013
            r0.removeView(r1)
        L_0x0013:
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A06
            r0 = 0
            r1.set(r0)
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxLCallbacksShape579S0100000_2_I2.onActivityPaused(android.app.Activity):void");
    }

    public final void onActivityResumed(Activity activity) {
        Context context;
        Object obj;
        switch (this.A01) {
            case 0:
                C1197576u r5 = (C1197576u) this.A00;
                AtomicBoolean atomicBoolean = r5.A06;
                if (!atomicBoolean.get() && (context = r5.A00) != null) {
                    Object systemService = context.getSystemService("window");
                    C04220Ms.A0C(systemService, C28174Ezk.A00(14));
                    r5.A02 = (WindowManager) systemService;
                    Context context2 = r5.A00;
                    if (context2 != null) {
                        obj = context2.getSystemService("layout_inflater");
                    } else {
                        obj = null;
                    }
                    C04220Ms.A0C(obj, AnonymousClass000.A00(HttpStatus.SC_REQUEST_TIMEOUT));
                    r5.A01 = ((LayoutInflater) obj).inflate(R.layout.shared_video_logger_watch_time_debug_view, (ViewGroup) null);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2038, 24, -3);
                    WindowManager windowManager = r5.A02;
                    if (windowManager != null) {
                        windowManager.addView(r5.A01, layoutParams);
                    }
                    View view = r5.A01;
                    if (view != null) {
                        View findViewById = view.findViewById(R.id.watch_time_table_view);
                        C04220Ms.A0C(findViewById, I17.A00(59));
                        ((ViewGroup) findViewById).removeAllViews();
                        new C109766ka();
                        View view2 = r5.A01;
                        if (view2 == null) {
                            throw C18180wK.A0a("mRootView is null.");
                        } else if (r5.A00 != null) {
                            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.watch_time_table_view);
                            TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -2);
                            layoutParams2.setMargins(10, 0, 0, 0);
                            TableRow tableRow = new TableRow(r5.A00);
                            TextView textView = new TextView(r5.A00);
                            textView.setLayoutParams(new TableRow.LayoutParams(-2, -2));
                            textView.setPadding(20, 5, 0, 5);
                            textView.setText("TOT_TIME");
                            textView.setTextColor(-256);
                            TextView textView2 = new TextView(r5.A00);
                            textView2.setLayoutParams(new TableRow.LayoutParams(-2, -1));
                            textView2.setPadding(20, 5, 0, 5);
                            textView2.setText("EVENT");
                            textView2.setTextColor(-65536);
                            TextView textView3 = new TextView(r5.A00);
                            textView3.setLayoutParams(new TableRow.LayoutParams(-1, -1));
                            textView3.setPadding(20, 5, 0, 5);
                            textView3.setText("EL_TIME");
                            textView3.setTextColor(-16776961);
                            TextView textView4 = new TextView(r5.A00);
                            textView4.setLayoutParams(new TableRow.LayoutParams(-1, -1));
                            textView4.setPadding(20, 5, 0, 5);
                            int A002 = AnonymousClass2C6.A00("VID") - 6;
                            int i = 0;
                            if (0 < A002) {
                                i = A002;
                            }
                            textView4.setText(C86134wK.A0q("VID", i));
                            textView4.setTextColor(-16711936);
                            tableRow.addView(textView);
                            tableRow.addView(textView2);
                            tableRow.addView(textView3);
                            tableRow.addView(textView4);
                            tableRow.setLayoutParams(layoutParams2);
                            if (viewGroup != null) {
                                viewGroup.addView(tableRow, 0);
                            }
                            r5.A04 = AnonymousClass0wJ.A0y();
                            r5.A03 = AnonymousClass0wJ.A0y();
                            atomicBoolean.set(true);
                            return;
                        } else {
                            throw C18180wK.A0a("mContext is null.");
                        }
                    } else {
                        throw C18180wK.A0a("mRootView is null.");
                    }
                } else {
                    return;
                }
            case 1:
                Activity activity2 = activity;
                C04220Ms.A0B(activity2, 0);
                ((AnonymousClass7pN) this.A00).A00 = C86144wL.A0w(activity2);
                return;
            default:
                return;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
