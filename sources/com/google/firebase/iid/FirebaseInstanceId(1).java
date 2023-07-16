package com.google.firebase.iid;

import X.AnonymousClass0wJ;
import X.AnonymousClass6CU;
import X.AnonymousClass75a;
import X.AnonymousClass762;
import X.AnonymousClass76F;
import X.AnonymousClass7EE;
import X.AnonymousClass7HG;
import X.AnonymousClass7HU;
import X.AnonymousClass7K1;
import X.AnonymousClass7oF;
import X.AnonymousClass85P;
import X.AnonymousClass85S;
import X.C105166cz;
import X.C107526gt;
import X.C112846qI;
import X.C113606rn;
import X.C117056y3;
import X.C120937De;
import X.C121787Id;
import X.C129617mC;
import X.C129637mE;
import X.C1364482t;
import X.C18180wK;
import X.C18250wR;
import X.C86104wH;
import X.C86114wI;
import X.C86154wM;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstanceId {
    public static AnonymousClass7EE A08;
    public static ScheduledExecutorService A09;
    public static final long A0A = TimeUnit.HOURS.toSeconds(8);
    public C120937De A00;
    public boolean A01 = false;
    public final C121787Id A02;
    public final C112846qI A03;
    public final AnonymousClass7HG A04;
    public final C107526gt A05;
    public final AnonymousClass762 A06;
    public final Executor A07;

    public static final synchronized void A03(FirebaseInstanceId firebaseInstanceId) {
        synchronized (firebaseInstanceId) {
            if (!firebaseInstanceId.A01) {
                firebaseInstanceId.A07(0);
            }
        }
    }

    public final synchronized void A06() {
        A08.A02();
        if (this.A03.A00()) {
            A03(this);
        }
    }

    public final synchronized void A07(long j) {
        A04(new C1364482t(this, this.A06, Math.min(Math.max(30, j << 1), A0A)), j);
        this.A01 = true;
    }

    public FirebaseInstanceId(C121787Id r23, AnonymousClass7oF r24, AnonymousClass75a r25) {
        boolean A1W;
        C121787Id r4 = r23;
        C121787Id.A01(r4);
        Context context = r4.A00;
        AnonymousClass7HG r3 = new AnonymousClass7HG(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = AnonymousClass85S.A00;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
        if (AnonymousClass7HG.A01(r4) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (A08 == null) {
                    C121787Id.A01(r4);
                    A08 = new AnonymousClass7EE(context);
                }
            }
            this.A02 = r4;
            this.A04 = r3;
            C120937De r1 = this.A00;
            if (r1 == null) {
                C121787Id.A01(r4);
                r1 = (C120937De) r4.A02.A03(C120937De.class);
                r1 = (r1 == null || r1.A01.A03() == 0) ? new C120937De(r4, r3, r25, threadPoolExecutor) : r1;
                this.A00 = r1;
            }
            this.A00 = r1;
            this.A07 = threadPoolExecutor2;
            this.A06 = new AnonymousClass762(A08);
            C112846qI r12 = new C112846qI(r24, this);
            this.A03 = r12;
            this.A05 = new C107526gt(threadPoolExecutor);
            if (r12.A00()) {
                if (!A08(A00(AnonymousClass7HG.A01(this.A02), "*"))) {
                    AnonymousClass762 r13 = this.A06;
                    synchronized (r13) {
                        A1W = AnonymousClass0wJ.A1W(AnonymousClass762.A00(r13));
                    }
                    if (!A1W) {
                        return;
                    }
                }
                A03(this);
                return;
            }
            return;
        }
        throw C18180wK.A0a("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static AnonymousClass76F A00(String str, String str2) {
        AnonymousClass76F r4;
        AnonymousClass76F r2;
        AnonymousClass7EE r3 = A08;
        synchronized (r3) {
            r4 = null;
            String string = r3.A01.getString(AnonymousClass7EE.A01(str, str2), (String) null);
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject A0j = C18250wR.A0j(string);
                        r2 = new AnonymousClass76F(A0j.getString("token"), A0j.getString("appVersion"), A0j.getLong("timestamp"));
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 23);
                        A0s.append("Failed to parse token: ");
                        Log.w("FirebaseInstanceId", C18180wK.A0i(valueOf, A0s));
                    }
                } else {
                    r2 = new AnonymousClass76F(string, (String) null, 0);
                }
                r4 = r2;
            }
        }
        return r4;
    }

    public static final Object A01(AnonymousClass7HU r3, FirebaseInstanceId firebaseInstanceId) {
        try {
            return C117056y3.A01(r3, TimeUnit.MILLISECONDS, 30000);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    firebaseInstanceId.A06();
                }
            } else if (!(cause instanceof RuntimeException)) {
                throw new IOException(e);
            }
            throw cause;
        } catch (InterruptedException | TimeoutException unused) {
            throw C86154wM.A0V("SERVICE_NOT_AVAILABLE");
        }
    }

    public static String A02() {
        C113606rn r0;
        AnonymousClass7EE r3 = A08;
        synchronized (r3) {
            Map map = r3.A03;
            r0 = (C113606rn) map.get("");
            if (r0 == null) {
                try {
                    AnonymousClass7K1 r7 = r3.A02;
                    Context context = r3.A00;
                    AnonymousClass6CU e = null;
                    try {
                        File A042 = AnonymousClass7K1.A04(context);
                        if (A042.exists()) {
                            try {
                                r0 = AnonymousClass7K1.A02(A042);
                            } catch (AnonymousClass6CU | IOException e2) {
                                C86114wI.A1N("FirebaseInstanceId", e2);
                                r0 = AnonymousClass7K1.A02(A042);
                            }
                            AnonymousClass7K1.A06(context, r0);
                            map.put("", r0);
                        }
                    } catch (IOException e3) {
                        String valueOf = String.valueOf(e3);
                        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 45);
                        A0s.append("IID file exists, but failed to read from it: ");
                        Log.w("FirebaseInstanceId", C18180wK.A0i(valueOf, A0s));
                        throw new AnonymousClass6CU(e3);
                    } catch (AnonymousClass6CU e4) {
                        e = e4;
                    }
                    try {
                        r0 = AnonymousClass7K1.A01(context.getSharedPreferences("com.google.android.gms.appid", 0));
                        if (r0 != null) {
                            AnonymousClass7K1.A00(context, r0, false);
                        } else {
                            if (e == null) {
                                r0 = r7.A07(context);
                            }
                            throw e;
                        }
                        map.put("", r0);
                    } catch (AnonymousClass6CU e5) {
                        e = e5;
                    }
                } catch (AnonymousClass6CU unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    getInstance(C121787Id.A00()).A06();
                    r0 = r3.A02.A07(r3.A00);
                }
            }
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(r0.A01.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused2) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static void A04(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            ScheduledExecutorService scheduledExecutorService = A09;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = new ScheduledThreadPoolExecutor(1, new AnonymousClass85P("FirebaseInstanceId"));
                A09 = scheduledExecutorService;
            }
            scheduledExecutorService.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static FirebaseInstanceId getInstance(C121787Id r2) {
        C121787Id.A01(r2);
        return (FirebaseInstanceId) r2.A02.A03(FirebaseInstanceId.class);
    }

    public final boolean A08(AnonymousClass76F r8) {
        if (r8 != null) {
            String A052 = this.A04.A05();
            if (System.currentTimeMillis() > r8.A00 + AnonymousClass76F.A03 || !A052.equals(r8.A02)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final String A05(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            AnonymousClass7HU r5 = new AnonymousClass7HU();
            r5.A0B((Object) null);
            Executor executor = this.A07;
            C129617mC r3 = new C129617mC(this, str, str2);
            AnonymousClass7HU r2 = new AnonymousClass7HU();
            r5.A03.A00(new C129637mE(r3, r2, executor));
            AnonymousClass7HU.A02(r5);
            return ((C105166cz) A01(r2, this)).A00;
        }
        throw C86154wM.A0V("MAIN_THREAD");
    }
}
