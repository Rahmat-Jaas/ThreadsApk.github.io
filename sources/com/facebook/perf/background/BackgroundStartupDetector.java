package com.facebook.perf.background;

import X.AnonymousClass006;
import X.AnonymousClass0LU;
import X.AnonymousClass0M2;
import X.AnonymousClass0ME;
import X.AnonymousClass0U2;
import X.C002401c;
import X.C06040Xk;
import X.C07180b3;
import X.C07220b8;
import X.C07330bL;
import X.C13810oL;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class BackgroundStartupDetector extends Handler implements Application.ActivityLifecycleCallbacks {
    public static C07330bL A07;
    public static AnonymousClass0U2 A08;
    public static ArrayList A09 = new ArrayList();
    public static final CopyOnWriteArraySet A0A = new CopyOnWriteArraySet();
    public static volatile int A0B;
    public static volatile int A0C;
    public static volatile BackgroundStartupDetector A0D;
    public static volatile Boolean A0E;
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static void A00(int i) {
        ArrayList arrayList;
        Integer num;
        C13810oL.A01("BackgroundStartupDetector.setColdStartMode", 745484799);
        try {
            synchronized (BackgroundStartupDetector.class) {
                try {
                    A0C = i;
                    arrayList = A09;
                    A09 = new ArrayList();
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                it.next();
                th = new NullPointerException("onColdStartMode");
                throw th;
            }
            C07330bL r0 = A07;
            if (r0 != null) {
                r0.A00();
            }
            CopyOnWriteArraySet copyOnWriteArraySet = A0A;
            Iterator it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                AnonymousClass0ME r2 = (AnonymousClass0ME) it2.next();
                synchronized (r2) {
                    try {
                        C07180b3 r02 = r2.A00;
                        if (r02 != null) {
                            C07220b8 r5 = r02.A00;
                            synchronized (r5.A0L) {
                                AnonymousClass0ME r6 = r5.A09;
                                if (r6 == null) {
                                    AnonymousClass0LU.A0C("lacrima", "AppStartModeBridge not initialized");
                                } else {
                                    int i2 = A0C;
                                    if (i2 == 0) {
                                        num = AnonymousClass006.A01;
                                    } else if (i2 == 1) {
                                        num = AnonymousClass006.A0N;
                                    } else if (i2 == 2) {
                                        num = AnonymousClass006.A0C;
                                    } else if (i2 != 3) {
                                        num = AnonymousClass006.A0Y;
                                    } else {
                                        num = AnonymousClass006.A0j;
                                    }
                                    r5.A02 = num;
                                    if (num != AnonymousClass006.A01) {
                                        if (num == AnonymousClass006.A0j || num == AnonymousClass006.A0N) {
                                            synchronized (r6) {
                                                if (r6.A00 != null) {
                                                    copyOnWriteArraySet.remove(r6);
                                                }
                                                r6.A00 = null;
                                            }
                                        }
                                        char A002 = AnonymousClass0M2.A00(r5.A02);
                                        C06040Xk r03 = r5.A00;
                                        if (r03 == null) {
                                            AnonymousClass0LU.A0C("lacrima", "AppStateLogFile not initialized.");
                                        } else {
                                            r03.A04(A002);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } finally {
            C13810oL.A00(-430574996);
        }
    }

    public static void A01(boolean z) {
        Boolean bool = A0E;
        Boolean valueOf = Boolean.valueOf(z);
        if (!C002401c.A00(bool, valueOf)) {
            A0E = valueOf;
            AnonymousClass0U2 r2 = A08;
            if (r2 != null) {
                r2.C3I(Boolean.TRUE.equals(A0E));
            }
            C07330bL r1 = A07;
            if (r1 != null) {
                r1.A01(A0E);
            }
        }
    }

    public final void handleMessage(Message message) {
        BackgroundStartupDetector backgroundStartupDetector;
        int i;
        switch (message.what) {
            case 49181:
                if (!this.A05) {
                    this.A05 = true;
                    this.A00 = 0;
                }
                if (this.A04) {
                    if (this.A01 <= 0) {
                        this.A04 = false;
                        this.A06 = true;
                        backgroundStartupDetector = A0D;
                        i = 49181;
                        break;
                    } else {
                        int i2 = 3;
                        if (this.A06) {
                            i2 = 4;
                        }
                        A00(i2);
                        return;
                    }
                } else {
                    int i3 = 1;
                    if (this.A06) {
                        i3 = 2;
                    }
                    A00(i3);
                    A01(true);
                    return;
                }
            case 49182:
                if (!this.A03) {
                    this.A03 = true;
                    backgroundStartupDetector = A0D;
                    i = 49182;
                    break;
                } else if (this.A02 == 0 && this.A01 == 0) {
                    A01(true);
                    A0B++;
                    return;
                } else {
                    return;
                }
                break;
            default:
                return;
        }
        sendMessageDelayed(Message.obtain(backgroundStartupDetector, i), 200);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.A04) {
            this.A04 = true;
            if (!this.A05) {
                A00(4);
            }
        }
        if (this.A02 == 0) {
            A01(false);
            this.A03 = false;
            removeMessages(49182);
            sendEmptyMessage(49182);
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.A01--;
    }

    public final void onActivityResumed(Activity activity) {
        this.A01++;
    }

    public final void onActivityStarted(Activity activity) {
        this.A02++;
        this.A00++;
        A01(false);
        removeMessages(49182);
    }

    public final void onActivityStopped(Activity activity) {
        int i = this.A02 - 1;
        int i2 = this.A01;
        this.A02 = i;
        if (i == 0 && i2 == 0) {
            A0B++;
            A01(true);
        }
    }

    public BackgroundStartupDetector(Looper looper) {
        super(looper);
    }
}
