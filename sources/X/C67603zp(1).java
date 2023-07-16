package X;

import android.content.res.AssetManager;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.MobileConfigEmergencyPushChangeListener;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.MobileConfigUsingPureJavaDependencies;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.debug.quickexperiment.MobileConfigBisection;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.3zp  reason: invalid class name and case insensitive filesystem */
public final class C67603zp implements MobileConfigCxxChangeListener, MobileConfigEmergencyPushChangeListener, AnonymousClass0Jj {
    public AnonymousClass0TK A00;
    public C04560Oe A01;
    public AnonymousClass3IC A02 = null;
    public final int A03;
    public final C84594tV A04;
    public final AnonymousClass19e A05;
    public final AnonymousClass35E A06;
    public final File A07;
    public final AtomicBoolean A08 = new AtomicBoolean(true);
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final AssetManager A0A;
    public final C211719i A0B;
    public final C211719i A0C;
    public final C211719i A0D;
    public final C692147i A0E;
    public final AnonymousClass3DF A0F;
    public final Object A0G = new Object();
    public final Object A0H = new Object();
    public final Random A0I = new Random();
    public final Set A0J = C18200wM.A0u();
    public final Set A0K;
    public final AtomicBoolean A0L = new AtomicBoolean(false);
    public final AtomicBoolean A0M = new AtomicBoolean(false);
    public final boolean A0N;
    public volatile AtomicReferenceArray A0O;
    public volatile C04560Oe A0P;
    public volatile C07810cE A0Q;
    public volatile C32212At A0R;
    public volatile C04560Oe A0S;

    public final synchronized AnonymousClass3Iv A06() {
        return this.A05;
    }

    public final synchronized void A0D(AnonymousClass3Iv r9) {
        Set<Pair> unmodifiableSet;
        Set<AnonymousClass39R> unmodifiableSet2;
        AnonymousClass19e r4 = this.A05;
        synchronized (r4) {
            AnonymousClass3Iv r7 = r4.A01;
            try {
                r4.A01 = r9;
                r4.A00 = this;
                if (!(r7 instanceof AnonymousClass19d) || !(r4.A01 instanceof MobileConfigManagerHolderImpl)) {
                    r9.isValid();
                } else {
                    AnonymousClass19d r72 = (AnonymousClass19d) r7;
                    Set set = r72.A08;
                    synchronized (set) {
                        try {
                            unmodifiableSet = Collections.unmodifiableSet(new HashSet(set));
                        } catch (Throwable th) {
                            while (true) {
                                th = th;
                                break;
                            }
                        }
                    }
                    C67603zp A002 = AnonymousClass2CI.A00(this);
                    if (!(unmodifiableSet == null || A002 == null)) {
                        C85764vj r6 = (C85764vj) A002.A08(0);
                        for (Pair pair : unmodifiableSet) {
                            r6.Bc8((AnonymousClass0TF) pair.second, ((Long) pair.first).longValue());
                        }
                    }
                    Set set2 = r72.A07;
                    synchronized (set2) {
                        try {
                            unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(set2));
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    for (AnonymousClass39R r0 : unmodifiableSet2) {
                        r9.logExposure(r0.A01, r0.A00, r0.A02);
                    }
                    r9.isValid();
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
        if (r9 instanceof MobileConfigManagerHolderImpl) {
            MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = (MobileConfigManagerHolderImpl) r9;
            mobileConfigManagerHolderImpl.mOverridesTableCallback = new C67633zs(this);
            mobileConfigManagerHolderImpl.registerConfigChangeListener(this);
            C05370Th.A00(this.A03);
            mobileConfigManagerHolderImpl.setEpHandler(this);
        }
        this.A00 = r4.getOrCreateOverridesTable();
        String dataDirPath = r4.getDataDirPath();
        if (dataDirPath == null || dataDirPath.isEmpty()) {
            dataDirPath = this.A07.getPath();
        }
        C67653zu.A0A = new File(new File(dataDirPath, MobileConfigBisection.BISECT_DIR), "mc_overrides.json").exists();
        return;
    }

    public final synchronized void A5n(AnonymousClass0TG r2) {
        AnonymousClass0TX.A00((ExecutorService) null).A00(r2, this);
    }

    public final boolean ATs(long j, boolean z) {
        if (!A04(j) || !A05(j, 1)) {
            return false;
        }
        return A00(j).ATs(j, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double Adu(X.AnonymousClass0TJ r10, double r11, long r13) {
        /*
            r9 = this;
            r5 = r11
            r4 = r10
            java.util.Set r2 = r9.A02()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0013
            X.0TJ r4 = X.AnonymousClass0TJ.A00(r10)
            r0 = 1
            r4.A02 = r0
        L_0x0013:
            r7 = r13
            boolean r0 = r9.A04(r13)
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0027
            X.0TN r1 = X.AnonymousClass0TN.DEFAULT__MISMATCH_UNIT_TYPE
        L_0x0020:
            X.0TO r0 = new X.0TO
            r0.<init>(r1)
            r4.A00 = r0
        L_0x0027:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0066
            X.19e r0 = r9.A05
            r0.syncFetchReason()
            java.util.Iterator r1 = r2.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            r1.next()
            java.lang.String r0 = "getSamplingRate"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0046:
            r0 = 4
            boolean r0 = r9.A05(r13, r0)
            if (r0 != 0) goto L_0x0054
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0027
            X.0TN r1 = X.AnonymousClass0TN.DEFAULT__MISMATCH_PARAM_TYPE
            goto L_0x0020
        L_0x0054:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0061
            X.0cE r3 = r9.A07()
        L_0x005c:
            double r5 = r3.Adu(r4, r5, r7)
            goto L_0x0027
        L_0x0061:
            X.0cE r3 = r9.A00(r13)
            goto L_0x005c
        L_0x0066:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67603zp.Adu(X.0TJ, double, long):double");
    }

    public final double Adv(AnonymousClass0TJ r8, long j) {
        return Adu(r8, this.A04.Adq(j), j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long At9(X.AnonymousClass0TJ r10, long r11, long r13) {
        /*
            r9 = this;
            r7 = r13
            r4 = r10
            java.util.Set r2 = r9.A02()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0013
            X.0TJ r4 = X.AnonymousClass0TJ.A00(r10)
            r0 = 1
            r4.A02 = r0
        L_0x0013:
            r5 = r11
            boolean r0 = r9.A04(r11)
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0027
            X.0TN r1 = X.AnonymousClass0TN.DEFAULT__MISMATCH_UNIT_TYPE
        L_0x0020:
            X.0TO r0 = new X.0TO
            r0.<init>(r1)
            r4.A00 = r0
        L_0x0027:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0066
            X.19e r0 = r9.A05
            r0.syncFetchReason()
            java.util.Iterator r1 = r2.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            r1.next()
            java.lang.String r0 = "getSamplingRate"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0046:
            r0 = 2
            boolean r0 = r9.A05(r11, r0)
            if (r0 != 0) goto L_0x0054
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0027
            X.0TN r1 = X.AnonymousClass0TN.DEFAULT__MISMATCH_PARAM_TYPE
            goto L_0x0020
        L_0x0054:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0061
            X.0cE r3 = r9.A07()
        L_0x005c:
            long r7 = r3.At9(r4, r5, r7)
            goto L_0x0027
        L_0x0061:
            X.0cE r3 = r9.A00(r11)
            goto L_0x005c
        L_0x0066:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67603zp.At9(X.0TJ, long, long):long");
    }

    public final long AtA(AnonymousClass0TJ r8, long j) {
        return At9(r8, j, this.A04.At4(j));
    }

    private C07810cE A00(long j) {
        return A08((int) ((j >>> 32) & 65535));
    }

    private boolean A03() {
        if (this.A03 == 2) {
            String str = "";
            String str2 = str;
            String str3 = this.A06.A00;
            if (str3 != null) {
                str = str3;
            }
            if (!str2.equals(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean A04(long j) {
        int i = this.A03;
        int i2 = (int) ((j >>> 54) & 63);
        if (i == i2) {
            return true;
        }
        AnonymousClass0LU.A0C("MobileConfigFactoryImpl", AnonymousClass00U.A0d(C05370Th.A00(i), " factory used for ", C05370Th.A00(i2), " param"));
        return false;
    }

    public final C07810cE A08(int i) {
        List A012;
        String A013;
        String str;
        AtomicReferenceArray atomicReferenceArray = this.A0O;
        if (i < 0 || i >= atomicReferenceArray.length()) {
            AnonymousClass0LU.A0O("MobileConfigFactoryImpl", "Attempt to read invalid config index(%d) from config caches, unitType: %s", Integer.valueOf(i), C05370Th.A00(this.A03));
            return this.A0C;
        }
        C07810cE r3 = (C07810cE) atomicReferenceArray.get(i);
        if (r3 != null) {
            return r3;
        }
        if (A03()) {
            return this.A0B;
        }
        C07810cE A072 = A07();
        if (!atomicReferenceArray.compareAndSet(i, r3, A072)) {
            A072 = (C07810cE) atomicReferenceArray.get(i);
        }
        C07810cE r32 = A072;
        C04560Oe r2 = this.A0S;
        if (A072 == null || r2 == null || !this.A0N) {
            return r32;
        }
        AnonymousClass19e r0 = this.A05;
        String str2 = "";
        String str3 = str2;
        r0.syncFetchReason();
        MobileConfigManagerHolderImpl A002 = AnonymousClass19e.A00(r0);
        if (A002 != null) {
            str2 = A002.getFamilyDeviceId();
        }
        AnonymousClass3IC A092 = A09();
        if (A092 == null || (A012 = A092.A01(i)) == null || A012.isEmpty() || (A013 = C62993bH.A01(r32, A012)) == null || TextUtils.isEmpty(A013)) {
            return r32;
        }
        if (this.A03 != 1) {
            String str4 = str3;
            String str5 = this.A06.A00;
            if (str5 != null) {
                str4 = str5;
            }
            if (TextUtils.isEmpty(str4)) {
                return r32;
            }
        }
        AnonymousClass3YJ r4 = (AnonymousClass3YJ) r2.get();
        if (r4.A02 == null) {
            return r32;
        }
        C13780oI.A01("MobileConfigApi2GeneralLoggerImpl_log", -1323297294);
        try {
            TreeMap treeMap = new TreeMap();
            treeMap.put("useAddedParamsMapResource", str3);
            treeMap.put("universe", r4.A01);
            if (!TextUtils.isEmpty(str2)) {
                treeMap.put("familyDeviceId", str2);
            }
            try {
                AnonymousClass0KD A022 = C62993bH.A00.A02();
                Iterator A0z = AnonymousClass0wJ.A0z(treeMap);
                while (A0z.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z);
                    AnonymousClass0KD.A00(A022, A0o.getValue().toString(), C18200wM.A0p(A0o));
                }
                if (r32 instanceof C85764vj) {
                    C85764vj r9 = (C85764vj) r32;
                    long B7Z = r9.B7Z();
                    if (B7Z > 0) {
                        AnonymousClass0KD.A00(A022, String.valueOf(B7Z), "ts");
                    }
                    List BJO = r9.BJO();
                    if (!BJO.isEmpty()) {
                        AnonymousClass0KD.A00(A022, TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, BJO), "unitIds");
                    }
                }
                str = C62993bH.A00(A022);
            } catch (IOException unused) {
                str = "{}";
            }
            ((ExecutorService) r4.A02.get()).execute(new AnonymousClass4S8(r4, A013, str));
            return r32;
        } finally {
            C13780oI.A00(-716565882);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3IC A09() {
        /*
            r27 = this;
            r4 = r27
            X.3IC r0 = r4.A02
            if (r0 != 0) goto L_0x016e
            X.0Oe r0 = r4.A01
            java.lang.Object r0 = r0.get()
            X.3IC r0 = (X.AnonymousClass3IC) r0
            r4.A02 = r0
            if (r0 == 0) goto L_0x016e
            java.io.File r0 = r4.A07
            java.lang.String r0 = r0.getPath()
            X.3IC r6 = r4.A02
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.io.File r1 = X.AnonymousClass2CJ.A00(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00ae
            java.lang.String r1 = r1.toString()     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            java.lang.StringBuilder r2 = X.C18200wM.A0r()     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r0.<init>(r1)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r1.<init>(r0)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
        L_0x003a:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0049
            r2.append(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ all -> 0x00a1 }
            goto L_0x003a
        L_0x0049:
            r1.close()     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r9.<init>(r0)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r12 = 0
            r8 = 0
        L_0x0057:
            int r0 = r9.length()     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            if (r8 >= r0) goto L_0x00ae
            java.lang.String r2 = r9.getString(r8)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            if (r2 == 0) goto L_0x009e
            r1 = -1
            java.lang.String r0 = ":"
            java.lang.String[] r10 = r2.split(r0, r1)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r0 = r10[r12]     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            int r11 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r0 = 1
            r1 = r10[r0]     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            java.util.HashMap r7 = X.AnonymousClass0wJ.A0y()     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r0 = -2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r7.put(r0, r1)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r5 = 2
        L_0x0080:
            int r0 = r10.length     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            if (r5 >= r0) goto L_0x0097
            r0 = r10[r5]     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            int r0 = r5 + 1
            r1 = r10[r0]     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r7.put(r0, r1)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            int r5 = r5 + 2
            goto L_0x0080
        L_0x0097:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
            r3.put(r0, r7)     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
        L_0x009e:
            int r8 = r8 + 1
            goto L_0x0057
        L_0x00a1:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            throw r0     // Catch:{ IOException | NumberFormatException | JSONException -> 0x00a6 }
        L_0x00a6:
            r2 = move-exception
            java.lang.String r1 = "MobileConfigIdNameMappingLoader"
            java.lang.String r0 = "loadIdNameMappingFile failed"
            X.AnonymousClass0LU.A0F(r1, r0, r2)
        L_0x00ae:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x016e
            if (r6 == 0) goto L_0x016e
            java.util.List r1 = r6.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x016e
            java.util.ArrayList r5 = X.C18200wM.A0t(r1)
            java.util.Iterator r13 = r1.iterator()
        L_0x00c8:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0167
            java.lang.Object r7 = r13.next()
            X.3GH r7 = (X.AnonymousClass3GH) r7
            java.lang.String r15 = r7.A00
            boolean r0 = X.AnonymousClass0Td.A00(r15)
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = r7.A01
            boolean r0 = X.AnonymousClass0Td.A01(r0)
            if (r0 != 0) goto L_0x0162
        L_0x00e4:
            int r6 = r7.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r3.get(r0)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0162
            boolean r0 = X.AnonymousClass0Td.A00(r15)
            java.lang.String r16 = ""
            if (r0 != 0) goto L_0x0109
            r0 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x015f
            java.lang.String r15 = X.C18220wO.A0r(r1, r2)
        L_0x0109:
            java.lang.String r1 = r7.A01
            boolean r0 = X.AnonymousClass0Td.A01(r1)
            if (r0 == 0) goto L_0x014e
            r16 = r1
        L_0x0113:
            if (r15 == 0) goto L_0x0117
            if (r16 != 0) goto L_0x011e
        L_0x0117:
            java.lang.String r1 = "MobileConfigIdNameMappingLoader"
            java.lang.String r0 = "failed to parse and get namedParamsMapList, name is null"
            X.AnonymousClass0LU.A0B(r1, r0)
        L_0x011e:
            int r12 = r7.A04
            int r11 = r7.A02
            int r10 = r7.A05
            int r9 = r7.A07
            int r8 = r7.A06
            int r2 = r7.A08
            boolean r1 = r7.A0A
            boolean r0 = r7.A0B
            boolean r7 = r7.A09
            X.3GH r14 = new X.3GH
            r23 = r6
            r24 = r1
            r25 = r0
            r26 = r7
            r21 = r8
            r22 = r2
            r20 = r9
            r19 = r10
            r18 = r11
            r17 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5.add(r14)
            goto L_0x00c8
        L_0x014e:
            int r0 = r7.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0113
            java.lang.String r16 = X.C18210wN.A0g(r1, r2)
            goto L_0x0113
        L_0x015f:
            r15 = r16
            goto L_0x0109
        L_0x0162:
            r5.add(r7)
            goto L_0x00c8
        L_0x0167:
            X.3IC r0 = new X.3IC
            r0.<init>(r5)
            r4.A02 = r0
        L_0x016e:
            X.3IC r0 = r4.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67603zp.A09():X.3IC");
    }

    public final void A0A() {
        AtomicBoolean atomicBoolean = this.A0L;
        if (!atomicBoolean.get()) {
            String str = "";
            String str2 = str;
            String str3 = this.A06.A00;
            if (str3 != null) {
                str = str3;
            }
            synchronized (this.A0G) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    AnonymousClass3DF r7 = this.A0F;
                    int i = this.A03;
                    if (i != 2 || (!str.isEmpty() && !str.equals("0"))) {
                        C13780oI.A03("MobileConfigFactoryImpl.initCppManager %s", C05370Th.A00(i), -1185965697);
                        try {
                            File file = this.A07;
                            C10300i6 r4 = r7.A05;
                            MobileConfigUsingPureJavaDependencies mobileConfigUsingPureJavaDependencies = new MobileConfigUsingPureJavaDependencies((AndroidAsyncExecutorFactory) null, new C67623zr(r4, r7.A08), r4 instanceof UserSession, new C67613zq(r4));
                            String A022 = C10380iF.A02(r7.A01);
                            String str4 = r7.A06;
                            int i2 = r7.A00;
                            int i3 = i2;
                            String str5 = str;
                            String str6 = str4;
                            MobileConfigManagerHolderImpl createManager = mobileConfigUsingPureJavaDependencies.createManager(file, A022, str6, str5, i3, str2, r7.A02, false, r7.A04, r7.A07, r7.A03, new AnonymousClass35F(r7), AnonymousClass0gE.A00().A00);
                            AnonymousClass0gE.A00().A00.schedule(new C73164Re(createManager, r7), 0, TimeUnit.MILLISECONDS);
                            if (createManager != null) {
                                int[] A0G2 = A0G();
                                synchronized (this) {
                                    this.A09.set(true);
                                    A0D(createManager);
                                    A0C();
                                }
                                for (int A082 : A0G2) {
                                    A08(A082);
                                }
                            }
                            C13780oI.A00(-1266389828);
                        } catch (Throwable th) {
                            C13780oI.A00(621182700);
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final void A0B() {
        File file = this.A07;
        synchronized (this.A0H) {
            if (AnonymousClass2CJ.A00(file.getPath()).exists()) {
                this.A02 = null;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:85|86|(1:88)(1:89)|90|(1:92)|93|(1:95)|96|(2:98|99)|100|101|(7:104|(2:123|124)(3:108|109|(1:122)(3:115|(1:121)(1:119)|120))|127|(14:132|133|134|135|136|137|138|(1:140)(2:142|(1:144)(2:145|(1:150)(10:149|151|152|(2:153|(5:157|(4:174|(1:176)|177|(3:179|298|290))(1:(2:162|(2:167|(2:169|180)(1:296))(2:294|295))(2:170|(3:173|297|290)))|181|299|290)(1:292))|182|187|(2:189|190)|(2:192|193)|211|(11:213|221|223|225|227|(0)|257|258|(0)(0)|274|284))))|141|187|(0)|(0)|211|(0))|210|211|(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x035c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        X.AnonymousClass0LU.A0F("MobileConfigJavaManager", "Failed to populate translation table", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0195 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:198:0x0342 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:204:0x0349 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a9 A[SYNTHETIC, Splitter:B:108:0x01a9] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0233 A[Catch:{ BufferUnderflowException -> 0x0329, all -> 0x033c }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0240 A[Catch:{ BufferUnderflowException -> 0x0329, all -> 0x033c }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0333 A[SYNTHETIC, Splitter:B:189:0x0333] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0338 A[SYNTHETIC, Splitter:B:192:0x0338] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0357 A[Catch:{ IOException -> 0x035c }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x036b A[Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0392 A[Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0457 A[Catch:{ all -> 0x0486 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0104 A[Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0127 A[SYNTHETIC, Splitter:B:85:0x0127] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(boolean r34) {
        /*
            r33 = this;
            r11 = r33
            if (r34 != 0) goto L_0x000d
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0M
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            X.35E r0 = r11.A06
            java.lang.String r4 = ""
            r2 = r4
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0017
            r4 = r0
        L_0x0017:
            int r0 = r11.A03
            r32 = r0
            r1 = 2
            r28 = 4
            if (r0 != r1) goto L_0x005b
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "0"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005b
        L_0x002e:
            java.util.concurrent.atomic.AtomicBoolean r2 = r11.A08
            boolean r0 = r2.get()
            if (r0 == 0) goto L_0x000c
            monitor-enter(r11)
            r1 = 1
            r0 = 0
            boolean r0 = r2.compareAndSet(r1, r0)     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0056
            X.19e r1 = r11.A05     // Catch:{ all -> 0x0058 }
            monitor-enter(r1)     // Catch:{ all -> 0x0058 }
            X.3Iv r2 = r1.A01     // Catch:{ all -> 0x0045 }
            goto L_0x0048
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0048:
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            boolean r0 = r2 instanceof X.C211519c     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0056
            X.19c r2 = (X.C211519c) r2     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "Logout"
            java.util.concurrent.atomic.AtomicReference r0 = r2.A00     // Catch:{ all -> 0x0058 }
            r0.set(r1)     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r11)     // Catch:{ all -> 0x0058 }
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x005b:
            monitor-enter(r11)
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0M     // Catch:{ all -> 0x0493 }
            r13 = 0
            r12 = 1
            boolean r0 = r0.compareAndSet(r13, r12)     // Catch:{ all -> 0x0493 }
            if (r0 == 0) goto L_0x0491
            java.io.File r5 = r11.A07     // Catch:{ all -> 0x0493 }
            java.lang.String r6 = "MobileConfigFactoryImpl.initLightweightManage %s"
            java.lang.String r3 = X.C05370Th.A00(r32)     // Catch:{ all -> 0x0493 }
            r0 = -773988717(0xffffffffd1ddde93, float:-1.19115244E11)
            X.C13780oI.A03(r6, r3, r0)     // Catch:{ all -> 0x0493 }
            r31 = 0
            r27 = r31
            android.content.res.AssetManager r3 = r11.A0A     // Catch:{ all -> 0x0486 }
            r17 = 3
            r29 = 0
            X.4tV r10 = r11.A04     // Catch:{ all -> 0x0484 }
            X.0Oe r7 = r11.A01     // Catch:{ all -> 0x0484 }
            X.19d r30 = new X.19d     // Catch:{ all -> 0x0484 }
            r6 = r32
            r0 = r30
            r0.<init>(r10, r5, r4, r6)     // Catch:{ all -> 0x0484 }
            r0.A00 = r7     // Catch:{ all -> 0x0484 }
            X.3V0 r0 = r30.getLatestHandle()     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x00fb
            java.nio.ByteBuffer r8 = r0.getJavaByteBuffer()     // Catch:{ all -> 0x0484 }
            if (r8 == 0) goto L_0x00fb
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            r8.order(r7)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            int r0 = r8.position()     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            int r6 = r8.getInt(r0)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            int r0 = r8.position()     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            int r6 = r6 + r0
            r14 = 28
            int r0 = r8.getInt(r6)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            int r9 = r6 - r0
            short r0 = r8.getShort(r9)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            if (r14 >= r0) goto L_0x00ee
            int r0 = r9 + 28
            short r0 = r8.getShort(r0)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            if (r0 == 0) goto L_0x00ee
            int r0 = r0 + r6
            int r9 = r8.getInt(r0)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            r0 = 123456(0x1e240, float:1.72999E-40)
            if (r9 != r0) goto L_0x00ee
            int r0 = r8.getInt(r6)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            int r14 = r6 - r0
            short r9 = r8.getShort(r14)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            r0 = r28
            if (r0 >= r9) goto L_0x00ec
            int r0 = r14 + 4
            short r0 = r8.getShort(r0)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            if (r0 == 0) goto L_0x00ec
            java.nio.ByteBuffer r0 = A01(r8, r7, r0, r6)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
        L_0x00e5:
            java.lang.String r6 = X.AnonymousClass2CG.A00(r0)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            if (r6 == 0) goto L_0x0125
            goto L_0x00fe
        L_0x00ec:
            r0 = 0
            goto L_0x00e5
        L_0x00ee:
            java.lang.Integer r27 = X.AnonymousClass006.A0j     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x00f9, IllegalArgumentException -> 0x00f1 }
            goto L_0x00fd
        L_0x00f1:
            r7 = move-exception
            java.lang.String r6 = "MobileConfigJavaManager"
            java.lang.String r0 = "getConfigTableSchemaHash: IllegalArgumentException"
            X.AnonymousClass0LU.A0J(r6, r0, r7)     // Catch:{ all -> 0x0484 }
        L_0x00f9:
            r6 = r2
            goto L_0x00fe
        L_0x00fb:
            java.lang.Integer r27 = X.AnonymousClass006.A01     // Catch:{ all -> 0x0484 }
        L_0x00fd:
            r6 = r2
        L_0x00fe:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0484 }
            if (r0 != 0) goto L_0x0125
            r0 = 58
            int r7 = r6.indexOf(r0)     // Catch:{ all -> 0x0484 }
            r0 = -1
            if (r7 == r0) goto L_0x0111
            java.lang.String r6 = r6.substring(r13, r7)     // Catch:{ all -> 0x0484 }
        L_0x0111:
            r0 = r30
            int r7 = r0.A03     // Catch:{ all -> 0x0484 }
            X.4tV r0 = r0.A04     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = r0.B8w(r7)     // Catch:{ all -> 0x0484 }
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0484 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x036d
            java.lang.Integer r27 = X.AnonymousClass006.A0Y     // Catch:{ all -> 0x0484 }
        L_0x0125:
            if (r3 == 0) goto L_0x0364
            int[] r16 = new int[]{r13, r13, r13, r13}     // Catch:{ IOException -> 0x035c }
            r0 = r30
            int r6 = r0.A03     // Catch:{ IOException -> 0x035c }
            X.4tV r7 = r0.A04     // Catch:{ IOException -> 0x035c }
            int r0 = r7.ATt(r6)     // Catch:{ IOException -> 0x035c }
            r16[r13] = r0     // Catch:{ IOException -> 0x035c }
            int r0 = r7.At6(r6)     // Catch:{ IOException -> 0x035c }
            r16[r12] = r0     // Catch:{ IOException -> 0x035c }
            int r0 = r7.BER(r6)     // Catch:{ IOException -> 0x035c }
            r16[r1] = r0     // Catch:{ IOException -> 0x035c }
            int r0 = r7.Adr(r6)     // Catch:{ IOException -> 0x035c }
            r16[r17] = r0     // Catch:{ IOException -> 0x035c }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x035c }
            java.lang.String r0 = "/mobileconfig/"
            java.lang.String r9 = X.AnonymousClass00U.A0L(r5, r0)     // Catch:{ IOException -> 0x035c }
            boolean r0 = r2.isEmpty()     // Catch:{ IOException -> 0x035c }
            if (r0 == 0) goto L_0x015b
            r5 = r2
            goto L_0x0161
        L_0x015b:
            java.lang.String r0 = "_"
            java.lang.String r5 = X.AnonymousClass00U.A0L(r0, r2)     // Catch:{ IOException -> 0x035c }
        L_0x0161:
            java.lang.String r0 = ".data"
            java.lang.String r8 = "/"
            java.lang.String r5 = X.AnonymousClass00U.A0V(r5, r0, r8)     // Catch:{ IOException -> 0x035c }
            r0 = r32
            if (r0 != r12) goto L_0x016f
            java.lang.String r4 = "sessionless"
        L_0x016f:
            java.lang.String r0 = X.AnonymousClass00U.A0L(r4, r5)     // Catch:{ IOException -> 0x035c }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r9, r0)     // Catch:{ IOException -> 0x035c }
            java.lang.String r4 = "params_map_v4_u0.txt"
            java.lang.String r5 = X.AnonymousClass00U.A0V(r0, r8, r4)     // Catch:{ IOException -> 0x035c }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x035c }
            r0.<init>(r5)     // Catch:{ IOException -> 0x035c }
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x035c }
            if (r0 != 0) goto L_0x0189
            r5 = 0
        L_0x0189:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x035c }
            r26 = 0
            if (r0 != 0) goto L_0x0195
            java.io.InputStream r26 = r3.open(r4)     // Catch:{ IOException -> 0x0195 }
        L_0x0195:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x035c }
            if (r0 != 0) goto L_0x0364
            if (r26 == 0) goto L_0x0364
            X.3V0 r0 = r30.getLatestHandle()     // Catch:{ IOException -> 0x035c }
            if (r0 == 0) goto L_0x01ff
            java.nio.ByteBuffer r9 = r0.getJavaByteBuffer()     // Catch:{ IOException -> 0x035c }
            if (r9 == 0) goto L_0x01ff
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            r9.order(r8)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            int r0 = r9.position()     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            int r4 = r9.getInt(r0)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            int r0 = r9.position()     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            int r4 = r4 + r0
            r14 = 28
            int r0 = r9.getInt(r4)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            int r3 = r4 - r0
            short r0 = r9.getShort(r3)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            if (r14 >= r0) goto L_0x01fc
            int r0 = r3 + 28
            short r0 = r9.getShort(r0)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            if (r0 == 0) goto L_0x01fc
            int r0 = r0 + r4
            int r3 = r9.getInt(r0)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            r0 = 123456(0x1e240, float:1.72999E-40)
            if (r3 != r0) goto L_0x01fc
            int r0 = r9.getInt(r4)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            int r14 = r4 - r0
            short r3 = r9.getShort(r14)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            r0 = r28
            if (r0 >= r3) goto L_0x01fa
            int r0 = r14 + 4
            short r0 = r9.getShort(r0)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            if (r0 == 0) goto L_0x01fa
            java.nio.ByteBuffer r0 = A01(r9, r8, r0, r4)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
        L_0x01f5:
            java.lang.String r2 = X.AnonymousClass2CG.A00(r0)     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            goto L_0x020a
        L_0x01fa:
            r0 = 0
            goto L_0x01f5
        L_0x01fc:
            java.lang.Integer r27 = X.AnonymousClass006.A0j     // Catch:{ IndexOutOfBoundsException | OutOfMemoryError | BufferUnderflowException -> 0x020a, IllegalArgumentException -> 0x0202 }
            goto L_0x020a
        L_0x01ff:
            java.lang.Integer r27 = X.AnonymousClass006.A01     // Catch:{ IOException -> 0x035c }
            goto L_0x020a
        L_0x0202:
            r4 = move-exception
            java.lang.String r3 = "MobileConfigJavaManager"
            java.lang.String r0 = "getConfigTableSchemaHash: IllegalArgumentException"
            X.AnonymousClass0LU.A0J(r3, r0, r4)     // Catch:{ IOException -> 0x035c }
        L_0x020a:
            java.lang.String r4 = r7.B8w(r6)     // Catch:{ IOException -> 0x035c }
            java.lang.String r9 = "MobileConfigFileParser"
            if (r2 == 0) goto L_0x0350
            boolean r0 = r2.isEmpty()     // Catch:{ IOException -> 0x035c }
            if (r0 != 0) goto L_0x0350
            java.lang.String r3 = "r"
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x034a }
            r0.<init>(r5, r3)     // Catch:{ IOException -> 0x034a }
            java.nio.channels.FileChannel r25 = r0.getChannel()     // Catch:{ IOException -> 0x034a }
            java.nio.channels.ReadableByteChannel r15 = java.nio.channels.Channels.newChannel(r26)     // Catch:{ all -> 0x0343 }
            X.36y r3 = X.AnonymousClass3W3.A00(r25)     // Catch:{ all -> 0x033c }
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x033c }
            boolean r0 = X.AnonymousClass2CH.A00(r0, r2)     // Catch:{ all -> 0x033c }
            if (r0 != 0) goto L_0x0240
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x033c }
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r2}     // Catch:{ all -> 0x033c }
            java.lang.String r0 = "Populating translation table failed: old hash: %s, config table hash %s"
        L_0x023b:
            X.AnonymousClass0LU.A0P(r9, r0, r1)     // Catch:{ all -> 0x033c }
            goto L_0x032f
        L_0x0240:
            X.36y r2 = X.AnonymousClass3W3.A00(r15)     // Catch:{ all -> 0x033c }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x033c }
            boolean r0 = X.AnonymousClass2CH.A00(r0, r4)     // Catch:{ all -> 0x033c }
            if (r0 != 0) goto L_0x0255
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x033c }
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r4}     // Catch:{ all -> 0x033c }
            java.lang.String r0 = "Populating translation table failed: new hash: %s, new codegen hash: %s"
            goto L_0x023b
        L_0x0255:
            int r4 = r3.A00     // Catch:{ all -> 0x033c }
            if (r4 <= 0) goto L_0x0272
            int r0 = r2.A00     // Catch:{ all -> 0x033c }
            if (r0 <= 0) goto L_0x0272
            r0 = r16[r13]     // Catch:{ all -> 0x033c }
            long[] r5 = new long[r0]     // Catch:{ all -> 0x033c }
            r0 = r16[r12]     // Catch:{ all -> 0x033c }
            long[] r3 = new long[r0]     // Catch:{ all -> 0x033c }
            r0 = r16[r1]     // Catch:{ all -> 0x033c }
            long[] r1 = new long[r0]     // Catch:{ all -> 0x033c }
            r0 = r16[r17]     // Catch:{ all -> 0x033c }
            long[] r0 = new long[r0]     // Catch:{ all -> 0x033c }
            long[][] r14 = new long[][]{r5, r3, r1, r0}     // Catch:{ all -> 0x033c }
            goto L_0x027f
        L_0x0272:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x033c }
            int r0 = r2.A00     // Catch:{ all -> 0x033c }
            java.lang.Object[] r1 = X.C18210wN.A1Y(r1, r0)     // Catch:{ all -> 0x033c }
            java.lang.String r0 = "Populating translation table failed with unexpected param count, old: %d, new: %d"
            goto L_0x023b
        L_0x027f:
            int r1 = r4 << 1
            r0 = r25
            int[] r8 = X.AnonymousClass3W3.A02(r0, r1)     // Catch:{ BufferUnderflowException -> 0x0329 }
            int r0 = r2.A00     // Catch:{ BufferUnderflowException -> 0x0329 }
            int r0 = r0 << 1
            int[] r7 = X.AnonymousClass3W3.A02(r15, r0)     // Catch:{ BufferUnderflowException -> 0x0329 }
            r6 = 0
            r5 = 0
        L_0x0291:
            int r0 = r8.length     // Catch:{ BufferUnderflowException -> 0x0329 }
            if (r6 >= r0) goto L_0x0331
            int r0 = r7.length     // Catch:{ BufferUnderflowException -> 0x0329 }
            if (r5 >= r0) goto L_0x0331
            r1 = r8[r6]     // Catch:{ BufferUnderflowException -> 0x0329 }
            int r0 = r6 + 1
            r3 = r8[r0]     // Catch:{ BufferUnderflowException -> 0x0329 }
            r24 = r7[r5]     // Catch:{ BufferUnderflowException -> 0x0329 }
            int r0 = r5 + 1
            r2 = r7[r0]     // Catch:{ BufferUnderflowException -> 0x0329 }
            r0 = r1 & 1
            if (r0 != r12) goto L_0x0309
            r0 = r24 & 1
            if (r0 != r12) goto L_0x0309
            if (r3 != r2) goto L_0x02fe
            r0 = r1 & 14336(0x3800, float:2.0089E-41)
            int r4 = r0 >> 11
            r23 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r23
            int r22 = r1 >> 16
            long r2 = (long) r13     // Catch:{ BufferUnderflowException -> 0x0329 }
            r0 = 54
            long r2 = r2 << r0
            r20 = 0
            long r0 = (long) r4     // Catch:{ BufferUnderflowException -> 0x0329 }
            r16 = 48
            long r0 = r0 << r16
            r16 = 61
            long r18 = r20 << r16
            r16 = 62
            long r16 = r20 << r16
            long r16 = r16 | r18
            long r16 = r16 | r20
            long r2 = r2 | r16
            long r2 = r2 | r0
            long r0 = (long) r12     // Catch:{ BufferUnderflowException -> 0x0329 }
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r16
            r16 = 16
            long r0 = r0 << r16
            long r2 = r2 | r0
            r0 = r22
            long r0 = (long) r0     // Catch:{ BufferUnderflowException -> 0x0329 }
            long r2 = r2 | r0
            r0 = r24 & r23
            int r1 = r0 >> 16
            if (r4 <= 0) goto L_0x031b
            r0 = r28
            if (r4 > r0) goto L_0x031b
            if (r1 < 0) goto L_0x031b
            int r0 = r4 + -1
            r16 = r14[r0]     // Catch:{ BufferUnderflowException -> 0x0329 }
            r0 = r16
            int r0 = r0.length     // Catch:{ BufferUnderflowException -> 0x0329 }
            if (r1 >= r0) goto L_0x031b
            r24 = r24 & r23
            int r0 = r24 >> 16
            r16[r0] = r2     // Catch:{ BufferUnderflowException -> 0x0329 }
            goto L_0x0315
        L_0x02fe:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = r3 + r0
            int r2 = r2 + r0
            if (r3 == r2) goto L_0x0317
            if (r3 >= r2) goto L_0x0317
            int r6 = r6 + 2
            goto L_0x0291
        L_0x0309:
            r0 = r1 & 1
            if (r0 == r12) goto L_0x030f
            int r6 = r6 + 2
        L_0x030f:
            r0 = r24 & 1
            if (r0 != r12) goto L_0x0317
            goto L_0x0291
        L_0x0315:
            int r6 = r6 + 2
        L_0x0317:
            int r5 = r5 + 2
            goto L_0x0291
        L_0x031b:
            java.lang.String r2 = "populateTranslationTableNewToNew: Type/slot ids out of bound type_id: %d slot_id: %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ BufferUnderflowException -> 0x0329 }
            java.lang.Object[] r0 = X.C18210wN.A1Y(r0, r1)     // Catch:{ BufferUnderflowException -> 0x0329 }
            X.AnonymousClass0LU.A0P(r9, r2, r0)     // Catch:{ BufferUnderflowException -> 0x0329 }
            goto L_0x032f
        L_0x0329:
            r1 = move-exception
            java.lang.String r0 = "buildTranslationTableFromParamsMapV4Pairs: BufferUnderflowException"
            X.AnonymousClass0LU.A0J(r9, r0, r1)     // Catch:{ all -> 0x033c }
        L_0x032f:
            r14 = r31
        L_0x0331:
            if (r15 == 0) goto L_0x0336
            r15.close()     // Catch:{ all -> 0x0343 }
        L_0x0336:
            if (r25 == 0) goto L_0x0352
            r25.close()     // Catch:{ IOException -> 0x034a }
            goto L_0x0352
        L_0x033c:
            r0 = move-exception
            if (r15 == 0) goto L_0x0342
            r15.close()     // Catch:{ all -> 0x0342 }
        L_0x0342:
            throw r0     // Catch:{ all -> 0x0343 }
        L_0x0343:
            r0 = move-exception
            if (r25 == 0) goto L_0x0349
            r25.close()     // Catch:{ all -> 0x0349 }
        L_0x0349:
            throw r0     // Catch:{ IOException -> 0x034a }
        L_0x034a:
            r1 = move-exception
            java.lang.String r0 = "Failed to populate translation table due to exception"
            X.AnonymousClass0LU.A0E(r9, r0, r1)     // Catch:{ IOException -> 0x035c }
        L_0x0350:
            r14 = r31
        L_0x0352:
            r26.close()     // Catch:{ IOException -> 0x035c }
            if (r14 == 0) goto L_0x0364
            r0 = r30
            r0.A01 = r14     // Catch:{ IOException -> 0x035c }
            goto L_0x036d
        L_0x035c:
            r2 = move-exception
            java.lang.String r1 = "MobileConfigJavaManager"
            java.lang.String r0 = "Failed to populate translation table"
            X.AnonymousClass0LU.A0F(r1, r0, r2)     // Catch:{ all -> 0x0484 }
        L_0x0364:
            r30.getOrCreateOverridesTable()     // Catch:{ all -> 0x0484 }
            boolean r0 = X.C67653zu.A0A     // Catch:{ all -> 0x0484 }
            if (r0 != 0) goto L_0x036d
            goto L_0x043f
        L_0x036d:
            r0 = r30
            long[][] r1 = r0.A01     // Catch:{ all -> 0x0484 }
            if (r1 == 0) goto L_0x0441
            X.3V0 r0 = r30.getLatestHandle()     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0441
            java.nio.ByteBuffer r17 = r0.getJavaByteBuffer()     // Catch:{ all -> 0x0484 }
            if (r17 == 0) goto L_0x0441
            X.0TK r0 = r11.A00     // Catch:{ all -> 0x0484 }
            X.19j r6 = new X.19j     // Catch:{ all -> 0x0484 }
            r13 = r6
            r14 = r30
            r15 = r0
            r16 = r10
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0484 }
            boolean r0 = r10 instanceof X.AnonymousClass400     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0441
            long r0 = X.AnonymousClass328.A00     // Catch:{ all -> 0x0484 }
            java.lang.String r2 = "bool1"
            boolean r0 = X.AnonymousClass3ZV.A00(r6, r10, r2, r0)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r0 = X.AnonymousClass328.A01     // Catch:{ all -> 0x0484 }
            java.lang.String r2 = "bool2"
            boolean r0 = X.AnonymousClass3ZV.A00(r6, r10, r2, r0)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r0 = X.AnonymousClass328.A02     // Catch:{ all -> 0x0484 }
            java.lang.String r2 = "bool3"
            boolean r0 = X.AnonymousClass3ZV.A00(r6, r10, r2, r0)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r0 = X.AnonymousClass328.A03     // Catch:{ all -> 0x0484 }
            java.lang.String r2 = "bool4"
            boolean r0 = X.AnonymousClass3ZV.A00(r6, r10, r2, r0)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r0 = X.AnonymousClass328.A07     // Catch:{ all -> 0x0484 }
            java.lang.String r2 = "int1"
            boolean r0 = X.AnonymousClass3ZV.A02(r6, r10, r2, r0)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r0 = X.AnonymousClass328.A08     // Catch:{ all -> 0x0484 }
            java.lang.String r2 = "int2"
            boolean r0 = X.AnonymousClass3ZV.A02(r6, r10, r2, r0)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r0 = X.AnonymousClass328.A09     // Catch:{ all -> 0x0484 }
            java.lang.String r2 = "int3"
            boolean r0 = X.AnonymousClass3ZV.A02(r6, r10, r2, r0)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r0 = X.AnonymousClass328.A04     // Catch:{ all -> 0x0484 }
            java.lang.String r2 = "double1"
            boolean r0 = X.AnonymousClass3ZV.A01(r6, r10, r2, r0)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r0 = X.AnonymousClass328.A05     // Catch:{ all -> 0x0484 }
            java.lang.String r2 = "double2"
            boolean r0 = X.AnonymousClass3ZV.A01(r6, r10, r2, r0)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r0 = X.AnonymousClass328.A06     // Catch:{ all -> 0x0484 }
            java.lang.String r2 = "double3"
            boolean r0 = X.AnonymousClass3ZV.A01(r6, r10, r2, r0)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r0 = X.AnonymousClass328.A0A     // Catch:{ all -> 0x0484 }
            java.lang.String r4 = "string1"
            java.lang.String r3 = r10.BEO(r0)     // Catch:{ all -> 0x0484 }
            X.0TJ r2 = X.C18200wM.A0Q()     // Catch:{ all -> 0x0484 }
            r2.A02 = r12     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = r6.BET(r2, r0)     // Catch:{ all -> 0x0484 }
            boolean r0 = X.AnonymousClass3ZV.A03(r2, r3, r0, r4)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r2 = X.AnonymousClass328.A0B     // Catch:{ all -> 0x0484 }
            java.lang.String r5 = "string2"
            java.lang.String r4 = r10.BEO(r2)     // Catch:{ all -> 0x0484 }
            X.0TJ r1 = X.C18200wM.A0Q()     // Catch:{ all -> 0x0484 }
            r1.A02 = r12     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = r6.BET(r1, r2)     // Catch:{ all -> 0x0484 }
            boolean r0 = X.AnonymousClass3ZV.A03(r1, r4, r0, r5)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            long r2 = X.AnonymousClass328.A0C     // Catch:{ all -> 0x0484 }
            java.lang.String r5 = "string3"
            java.lang.String r4 = r10.BEO(r2)     // Catch:{ all -> 0x0484 }
            X.0TJ r1 = X.C18200wM.A0Q()     // Catch:{ all -> 0x0484 }
            r1.A02 = r12     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = r6.BET(r1, r2)     // Catch:{ all -> 0x0484 }
            boolean r0 = X.AnonymousClass3ZV.A03(r1, r4, r0, r5)     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0443
            goto L_0x0441
        L_0x043f:
            r30 = r31
        L_0x0441:
            r29 = r30
        L_0x0443:
            r3 = 5
            X.C05370Th.A00(r32)     // Catch:{ all -> 0x0484 }
            if (r29 == 0) goto L_0x0457
            r0 = r29
            r11.A0D(r0)     // Catch:{ all -> 0x0486 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A09     // Catch:{ all -> 0x0486 }
            r0.set(r12)     // Catch:{ all -> 0x0486 }
            r11.A0C()     // Catch:{ all -> 0x0486 }
            goto L_0x0478
        L_0x0457:
            X.3Iv r2 = r11.A06()     // Catch:{ all -> 0x0486 }
            boolean r0 = r2 instanceof X.C211519c     // Catch:{ all -> 0x0486 }
            if (r0 == 0) goto L_0x0478
            X.19c r2 = (X.C211519c) r2     // Catch:{ all -> 0x0486 }
            if (r27 == 0) goto L_0x0478
            int r1 = r27.intValue()     // Catch:{ all -> 0x0486 }
            if (r1 == r12) goto L_0x046a
            goto L_0x0472
        L_0x046a:
            java.lang.String r1 = "FreshInstall"
            java.util.concurrent.atomic.AtomicReference r0 = r2.A00     // Catch:{ all -> 0x0486 }
            r0.set(r1)     // Catch:{ all -> 0x0486 }
            goto L_0x0478
        L_0x0472:
            r0 = r28
            if (r1 == r0) goto L_0x047c
            if (r1 == r3) goto L_0x047c
        L_0x0478:
            r0 = -477885585(0xffffffffe3840b6f, float:-4.871588E21)
            goto L_0x048e
        L_0x047c:
            java.lang.String r1 = "AppUpgrade"
            java.util.concurrent.atomic.AtomicReference r0 = r2.A00     // Catch:{ all -> 0x0486 }
            r0.set(r1)     // Catch:{ all -> 0x0486 }
            goto L_0x0478
        L_0x0484:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0486 }
        L_0x0486:
            r1 = move-exception
            r0 = 482624188(0x1cc442bc, float:1.2987442E-21)
            X.C13780oI.A00(r0)     // Catch:{ all -> 0x0493 }
            throw r1     // Catch:{ all -> 0x0493 }
        L_0x048e:
            X.C13780oI.A00(r0)     // Catch:{ all -> 0x0493 }
        L_0x0491:
            monitor-exit(r11)     // Catch:{ all -> 0x0493 }
            return
        L_0x0493:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0493 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67603zp.A0E(boolean):void");
    }

    public final int[] A0G() {
        int[] iArr;
        AtomicReferenceArray atomicReferenceArray = this.A0O;
        ArrayList<Object> A0v = AnonymousClass0wJ.A0v();
        for (int i = 0; i < atomicReferenceArray.length(); i++) {
            if (atomicReferenceArray.get(i) != null) {
                C18200wM.A1U(A0v, i);
            }
        }
        if (A0v instanceof RandomAccess) {
            int size = A0v.size();
            iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = AnonymousClass0wJ.A04(A0v.get(i2));
            }
        } else {
            iArr = new int[A0v.size()];
            int i3 = 0;
            for (Object A042 : A0v) {
                iArr[i3] = AnonymousClass0wJ.A04(A042);
                i3++;
            }
        }
        return iArr;
    }

    public final boolean ATr(long j) {
        return ATv(AnonymousClass0TJ.A05, j);
    }

    public final boolean ATv(AnonymousClass0TJ r2, long j) {
        return ATw(r2, j, this.A04.ATq(j));
    }

    public final double Adp(long j) {
        return Adv(AnonymousClass0TJ.A05, j);
    }

    public final long At2(long j) {
        return AtA(AnonymousClass0TJ.A05, j);
    }

    public final String BEN(long j) {
        return BET(AnonymousClass0TJ.A05, j);
    }

    public final String BET(AnonymousClass0TJ r2, long j) {
        return BEU(r2, this.A04.BEO(j), j);
    }

    public final void onConfigChanged(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            this.A0Q = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x029c, code lost:
        if (java.lang.Math.random() > 0.01d) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (java.lang.Integer.parseInt(r12) == 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010f, code lost:
        r5 = A08(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0402  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onEpConfigChanged(java.lang.String[] r48, java.lang.String[] r49) {
        /*
            r47 = this;
            r35 = 0
            r6 = r48
            if (r48 == 0) goto L_0x041c
            int r2 = r6.length
            if (r2 == 0) goto L_0x041c
            r4 = r49
            if (r49 == 0) goto L_0x041c
            int r3 = r4.length
            if (r3 == 0) goto L_0x041c
            r24 = 0
            android.util.SparseArray r9 = new android.util.SparseArray
            r9.<init>()
            r1 = 0
        L_0x0018:
            java.lang.String r12 = ","
            r8 = 1
            r7 = -1
            java.lang.String r5 = "\\d+"
            if (r1 >= r2) goto L_0x0097
            r0 = r48[r1]
            java.lang.String[] r11 = r0.split(r12)
            int r10 = r11.length
            r0 = 6
            if (r10 != r0) goto L_0x0092
            r10 = r11[r35]
            boolean r0 = r10.matches(r5)
            if (r0 == 0) goto L_0x0092
            int r10 = java.lang.Integer.parseInt(r10)
            if (r10 == r7) goto L_0x0092
            r12 = r11[r8]
            boolean r0 = r12.matches(r5)
            if (r0 == 0) goto L_0x0092
            int r13 = java.lang.Integer.parseInt(r12)
            if (r13 <= 0) goto L_0x0092
            r0 = 2
            r12 = r11[r0]
            boolean r0 = r12.matches(r5)
            if (r0 == 0) goto L_0x0092
            int r0 = java.lang.Integer.parseInt(r12)
            if (r0 == r7) goto L_0x0092
            r7 = 3
            r12 = r11[r7]
            boolean r7 = r12.matches(r5)
            if (r7 == 0) goto L_0x0066
            int r7 = java.lang.Integer.parseInt(r12)
            r16 = 1
            if (r7 != 0) goto L_0x0068
        L_0x0066:
            r16 = 0
        L_0x0068:
            r7 = 4
            r12 = r11[r7]
            if (r16 == 0) goto L_0x0095
            boolean r7 = r12.matches(r5)
            if (r7 == 0) goto L_0x0095
            int r15 = java.lang.Integer.parseInt(r12)
        L_0x0077:
            r7 = 5
            r7 = r11[r7]
            boolean r5 = r7.matches(r5)
            if (r5 == 0) goto L_0x0086
            int r5 = java.lang.Integer.parseInt(r7)
            if (r5 != 0) goto L_0x0087
        L_0x0086:
            r8 = 0
        L_0x0087:
            X.3Cg r12 = new X.3Cg
            r14 = r0
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r9.put(r10, r12)
        L_0x0092:
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0095:
            r15 = -1
            goto L_0x0077
        L_0x0097:
            r10 = 0
        L_0x0098:
            if (r10 >= r3) goto L_0x00e7
            r0 = r49[r10]
            java.lang.String[] r11 = r0.split(r12)
            r1 = r11[r35]
            boolean r0 = r1.matches(r5)
            if (r0 == 0) goto L_0x00e0
            int r6 = java.lang.Integer.parseInt(r1)
            if (r6 == r7) goto L_0x00e0
            java.util.HashSet r2 = X.C18200wM.A0u()
            r1 = 1
        L_0x00b3:
            int r0 = r11.length
            if (r1 >= r0) goto L_0x00d2
            r0 = r11[r1]
            boolean r13 = r0.matches(r5)
            r15 = -1
            if (r13 == 0) goto L_0x00cf
            long r13 = java.lang.Long.parseLong(r0)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00cf
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r2.add(r0)
        L_0x00cf:
            int r1 = r1 + 1
            goto L_0x00b3
        L_0x00d2:
            int r0 = r9.indexOfKey(r6)
            if (r0 < 0) goto L_0x00e3
            java.lang.Object r0 = r9.get(r6)
            X.3Cg r0 = (X.C57733Cg) r0
            r0.A00 = r2
        L_0x00e0:
            int r10 = r10 + 1
            goto L_0x0098
        L_0x00e3:
            r9.remove(r6)
            goto L_0x00e0
        L_0x00e7:
            r13 = r47
            X.47i r11 = r13.A0E
            java.util.HashSet r23 = X.C18200wM.A0u()
            java.util.HashSet r22 = X.C18200wM.A0u()
            java.util.ArrayList r21 = X.AnonymousClass0wJ.A0v()
            r10 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
            r20 = 0
        L_0x00fd:
            int r0 = r9.size()
            if (r10 >= r0) goto L_0x0223
            int r6 = r9.keyAt(r10)
            java.lang.Object r14 = r9.get(r6)
            X.3Cg r14 = (X.C57733Cg) r14
            if (r14 == 0) goto L_0x015d
            X.0cE r5 = r13.A08(r6)
            java.util.Map r1 = r5.AfP()
            if (r1 == 0) goto L_0x015d
            int r0 = r14.A03
            r31 = r0
            X.0cE r4 = r13.A07()
            int r0 = r14.A01
            r28 = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r28)
            boolean r0 = r1.containsKey(r3)
            if (r0 == 0) goto L_0x021f
            java.lang.Object r0 = r1.get(r3)
            int r19 = X.AnonymousClass0wJ.A04(r0)
        L_0x0137:
            r1 = r19
            r0 = r31
            if (r1 < r0) goto L_0x0160
            boolean r3 = r14.A05
            int r2 = r14.A02
            boolean r0 = r14.A04
            X.3DM r1 = new X.3DM
            r25 = r1
            r26 = r5
            r27 = r4
            r29 = r2
            r30 = r19
            r32 = r6
            r33 = r3
            r34 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0 = r21
            r0.add(r1)
        L_0x015d:
            int r10 = r10 + 1
            goto L_0x00fd
        L_0x0160:
            java.util.Set r0 = r14.A00
            java.util.Iterator r18 = r0.iterator()
            r17 = 1
        L_0x0168:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r0 = r18.next()
            long r1 = X.C18190wL.A08(r0)
            if (r17 == 0) goto L_0x01c3
            int r0 = X.C18190wL.A01(r1)
            if (r0 == r8) goto L_0x01b6
            r15 = 2
            if (r0 == r15) goto L_0x01a9
            r15 = 3
            if (r0 == r15) goto L_0x0198
            r15 = 4
            if (r0 != r15) goto L_0x0168
            X.0TJ r0 = X.AnonymousClass0TJ.A06
            double r15 = r5.Adv(r0, r1)
            double r0 = r4.Adv(r0, r1)
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
        L_0x0193:
            if (r2 == 0) goto L_0x0168
        L_0x0195:
            r17 = 0
            goto L_0x0168
        L_0x0198:
            X.0TJ r0 = X.AnonymousClass0TJ.A06
            java.lang.String r15 = r5.BET(r0, r1)
            java.lang.String r0 = r4.BET(r0, r1)
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x0168
            goto L_0x0195
        L_0x01a9:
            X.0TJ r0 = X.AnonymousClass0TJ.A06
            long r15 = r5.AtA(r0, r1)
            long r0 = r4.AtA(r0, r1)
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            goto L_0x0193
        L_0x01b6:
            X.0TJ r0 = X.AnonymousClass0TJ.A06
            boolean r15 = r5.ATv(r0, r1)
            boolean r0 = r4.ATv(r0, r1)
            if (r15 == r0) goto L_0x0168
            goto L_0x0195
        L_0x01c3:
            boolean r15 = r14.A05
            int r1 = r14.A02
            boolean r2 = r14.A04
            r46 = r17 ^ 1
            X.3DM r0 = new X.3DM
            r36 = r0
            r37 = r5
            r38 = r4
            r39 = r28
            r40 = r1
            r41 = r19
            r42 = r31
            r43 = r6
            r44 = r15
            r45 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r4 = r21
            r4.add(r0)
            if (r17 != 0) goto L_0x015d
            if (r15 == 0) goto L_0x01f9
            r0 = r23
            r0.add(r3)
            if (r1 >= r7) goto L_0x01f5
            r7 = r1
        L_0x01f5:
            r20 = 1
            goto L_0x015d
        L_0x01f9:
            if (r2 == 0) goto L_0x015d
            if (r6 < 0) goto L_0x0213
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.A0O
            int r0 = r0.length()
            if (r6 >= r0) goto L_0x0213
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r13.A0O
            r0 = r24
            r1.set(r6, r0)
        L_0x020c:
            r0 = r22
            r0.add(r3)
            goto L_0x015d
        L_0x0213:
            java.lang.Object[] r2 = X.C18210wN.A1X(r6)
            java.lang.String r1 = "MobileConfigFactoryImpl"
            java.lang.String r0 = "Cannot refresh config index(%d) from config caches"
            X.AnonymousClass0LU.A0O(r1, r0, r2)
            goto L_0x020c
        L_0x021f:
            r19 = 0
            goto L_0x0137
        L_0x0223:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r0) goto L_0x0229
            r7 = 0
        L_0x0229:
            java.lang.StringBuilder r4 = X.C18200wM.A0r()
            java.util.Iterator r2 = r23.iterator()
            r3 = 0
            r1 = 0
        L_0x0233:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0256
            java.lang.Object r0 = r2.next()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.append(r0)
            int r0 = r23.size()
            int r0 = r0 + -1
            if (r1 >= r0) goto L_0x0253
            r4.append(r12)
        L_0x0253:
            int r1 = r1 + 1
            goto L_0x0233
        L_0x0256:
            java.lang.String r5 = r4.toString()
            java.lang.StringBuilder r2 = X.C18200wM.A0r()
            java.util.Iterator r1 = r22.iterator()
        L_0x0262:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0285
            java.lang.Object r0 = r1.next()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.append(r0)
            int r0 = r22.size()
            int r0 = r0 + -1
            if (r3 >= r0) goto L_0x0282
            r2.append(r12)
        L_0x0282:
            int r3 = r3 + 1
            goto L_0x0262
        L_0x0285:
            java.lang.String r9 = r2.toString()
            X.38S r3 = r11.A00
            if (r3 == 0) goto L_0x0382
            r4 = 1
            if (r20 != 0) goto L_0x029e
            double r12 = java.lang.Math.random()
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L_0x029f
        L_0x029e:
            r2 = 0
        L_0x029f:
            java.lang.String r1 = ""
            if (r9 == 0) goto L_0x037f
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto L_0x037f
        L_0x02a9:
            if (r20 != 0) goto L_0x02b0
            if (r2 != 0) goto L_0x02b0
            if (r4 != 0) goto L_0x02b0
        L_0x02af:
            return r20
        L_0x02b0:
            X.0nS r2 = r3.A01
            java.lang.String r0 = "mobile_config_emergency_push_check_complete"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r0)
            r0 = 2412(0x96c, float:3.38E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x0400
            X.3zp r0 = r3.A00
            X.3IC r6 = r0.A09()
            if (r6 == 0) goto L_0x038c
            double r12 = java.lang.Math.random()
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x038c
            X.0LI r0 = X.C62993bH.A00     // Catch:{ IOException -> 0x038a }
            X.0KD r10 = r0.A02()     // Catch:{ IOException -> 0x038a }
            java.lang.String r1 = "configs"
            X.0LI r0 = r10.A01     // Catch:{ IOException -> 0x038a }
            X.0KD r4 = r0.A02()     // Catch:{ IOException -> 0x038a }
            r10.A0D(r4, r1)     // Catch:{ IOException -> 0x038a }
            java.util.Iterator r13 = r21.iterator()     // Catch:{ IOException -> 0x038a }
        L_0x02ee:
            boolean r0 = r13.hasNext()     // Catch:{ IOException -> 0x038a }
            if (r0 == 0) goto L_0x037a
            java.lang.Object r12 = r13.next()     // Catch:{ IOException -> 0x038a }
            X.3DM r12 = (X.AnonymousClass3DM) r12     // Catch:{ IOException -> 0x038a }
            int r0 = r12.A03     // Catch:{ IOException -> 0x038a }
            java.util.List r1 = r6.A01(r0)     // Catch:{ IOException -> 0x038a }
            X.0cE r0 = r12.A08     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = X.C62993bH.A01(r0, r1)     // Catch:{ IOException -> 0x038a }
            r12.A01 = r0     // Catch:{ IOException -> 0x038a }
            X.0cE r0 = r12.A07     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = X.C62993bH.A01(r0, r1)     // Catch:{ IOException -> 0x038a }
            r12.A00 = r0     // Catch:{ IOException -> 0x038a }
            int r0 = r12.A04     // Catch:{ IOException -> 0x038a }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x038a }
            X.0LI r0 = r4.A01     // Catch:{ IOException -> 0x038a }
            X.0KD r3 = r0.A02()     // Catch:{ IOException -> 0x038a }
            r4.A0D(r3, r1)     // Catch:{ IOException -> 0x038a }
            boolean r0 = r12.A0B     // Catch:{ IOException -> 0x038a }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = "restart"
            X.AnonymousClass0KD.A00(r3, r1, r0)     // Catch:{ IOException -> 0x038a }
            int r0 = r12.A05     // Catch:{ IOException -> 0x038a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = "delay_restart"
            X.AnonymousClass0KD.A00(r3, r1, r0)     // Catch:{ IOException -> 0x038a }
            boolean r0 = r12.A09     // Catch:{ IOException -> 0x038a }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = "force_refresh"
            X.AnonymousClass0KD.A00(r3, r1, r0)     // Catch:{ IOException -> 0x038a }
            int r0 = r12.A02     // Catch:{ IOException -> 0x038a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = "cached_version"
            X.AnonymousClass0KD.A00(r3, r1, r0)     // Catch:{ IOException -> 0x038a }
            int r0 = r12.A06     // Catch:{ IOException -> 0x038a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = "latest_version"
            X.AnonymousClass0KD.A00(r3, r1, r0)     // Catch:{ IOException -> 0x038a }
            boolean r0 = r12.A0A     // Catch:{ IOException -> 0x038a }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = "param_values_changed"
            X.AnonymousClass0KD.A00(r3, r1, r0)     // Catch:{ IOException -> 0x038a }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r35)     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = "exists_in_cache"
            X.AnonymousClass0KD.A00(r3, r1, r0)     // Catch:{ IOException -> 0x038a }
            java.lang.String r1 = r12.A01     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = "latest_values"
            X.AnonymousClass0KD.A00(r3, r1, r0)     // Catch:{ IOException -> 0x038a }
            java.lang.String r1 = r12.A00     // Catch:{ IOException -> 0x038a }
            java.lang.String r0 = "cached_values"
            X.AnonymousClass0KD.A00(r3, r1, r0)     // Catch:{ IOException -> 0x038a }
            goto L_0x02ee
        L_0x037a:
            java.lang.String r1 = X.C62993bH.A00(r10)     // Catch:{ IOException -> 0x038a }
            goto L_0x038c
        L_0x037f:
            r4 = 0
            goto L_0x02a9
        L_0x0382:
            java.lang.Class<X.47i> r1 = X.C692147i.class
            java.lang.String r0 = "No logger set for emergency push"
            X.AnonymousClass0LU.A01(r1, r0)
            goto L_0x0400
        L_0x038a:
            java.lang.String r1 = "Unknown"
        L_0x038c:
            X.0Z2 r0 = X.AnonymousClass0MI.A04
            if (r0 != 0) goto L_0x0412
            r3 = 0
        L_0x0392:
            java.lang.String r0 = "configs_causing_restart"
            r2.A0T(r0, r5)
            java.lang.String r5 = "Yes"
            java.lang.String r6 = "No"
            r10 = r6
            if (r20 == 0) goto L_0x039f
            r10 = r5
        L_0x039f:
            java.lang.String r0 = "restart_needed"
            r2.A0T(r0, r10)
            java.lang.String r0 = "shadowing"
            r2.A0T(r0, r6)
            java.lang.String r0 = "debug_string"
            r2.A0T(r0, r1)
            java.lang.String r1 = "Java"
            java.lang.String r0 = "handler_language"
            r2.A0T(r0, r1)
            boolean r0 = X.AnonymousClass0MI.A08()
            r1 = r5
            if (r0 == 0) goto L_0x03bd
            r1 = r6
        L_0x03bd:
            java.lang.String r0 = "is_background"
            r2.A0T(r0, r1)
            double r0 = (double) r3
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r3
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_since_foreground"
            r2.A0R(r0, r1)
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_since_launch"
            r2.A0R(r0, r1)
            java.lang.String r0 = "configs_force_refreshed"
            r2.A0T(r0, r9)
            java.lang.String r0 = "relogin_enabled"
            r2.A0T(r0, r6)
            java.lang.Long r1 = X.C18230wP.A0f(r7)
            java.lang.String r0 = "restart_delay"
            r2.A0S(r0, r1)
            java.lang.String r0 = "restart_delay_including_shadow"
            r2.A0S(r0, r1)
            if (r20 != 0) goto L_0x03f8
            r5 = r6
        L_0x03f8:
            java.lang.String r0 = "restart_needed_including_shadow"
            r2.A0T(r0, r5)
            r2.Bb4()
        L_0x0400:
            if (r20 == 0) goto L_0x02af
            r11.A02 = r8
            X.0g9 r3 = X.AnonymousClass0g9.A00()
            X.0gG r2 = r11.A01
            long r0 = X.C18220wO.A09(r7)
            r3.A01(r2, r0)
            return r20
        L_0x0412:
            X.0Z2 r0 = X.AnonymousClass0MI.A04
            X.0M4 r0 = r0.A01
            long r3 = r0.A00()
            goto L_0x0392
        L_0x041c:
            return r35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67603zp.onEpConfigChanged(java.lang.String[], java.lang.String[]):boolean");
    }

    public C67603zp(AssetManager assetManager, C84594tV r6, AnonymousClass19e r7, C692147i r8, AnonymousClass35E r9, AnonymousClass3DF r10, File file, Set set, C04560Oe r13, C04560Oe r14, int i, boolean z) {
        this.A05 = r7;
        this.A0E = r8;
        this.A03 = i;
        this.A07 = file;
        this.A0A = assetManager;
        this.A0K = set;
        this.A0S = r13;
        this.A0N = z;
        this.A01 = r14;
        this.A06 = r9;
        this.A0F = r10;
        this.A04 = r6;
        AnonymousClass0TK orCreateOverridesTable = r7.getOrCreateOverridesTable();
        this.A00 = orCreateOverridesTable;
        this.A0B = new C211719i(orCreateOverridesTable, AnonymousClass0TN.DEFAULT__ACCESSED_AFTER_MC_DISPOSE, r6);
        this.A0C = new C211719i(orCreateOverridesTable, AnonymousClass0TN.DEFAULT__INVALID_CONFIG_PARAM_NAME, r6);
        this.A0D = new C211719i(orCreateOverridesTable, AnonymousClass0TN.DEFAULT__SERVICE_NOT_FOUND, r6);
        this.A0Q = null;
        this.A0O = new AtomicReferenceArray(10000);
    }

    public static ByteBuffer A01(ByteBuffer byteBuffer, ByteOrder byteOrder, int i, int i2) {
        ByteBuffer order = byteBuffer.duplicate().order(byteOrder);
        int i3 = i + i2;
        int i4 = byteBuffer.getInt(i3) + i3 + 4;
        order.position(i4);
        order.limit(i4 + byteBuffer.getInt(i3 + byteBuffer.getInt(i3)));
        return order;
    }

    private Set A02() {
        Set emptySet = Collections.emptySet();
        Iterator it = this.A0K.iterator();
        if (!it.hasNext()) {
            return emptySet;
        }
        it.next();
        throw C18210wN.A0W("getSamplingRate");
    }

    private boolean A05(long j, int i) {
        StringBuilder A0s;
        int i2;
        if (i == C18190wL.A01(j)) {
            return true;
        }
        if (C18180wK.A1W((((j >>> 62) & 1) > 1 ? 1 : (((j >>> 62) & 1) == 1 ? 0 : -1)))) {
            A0s = C18200wM.A0r();
            A0s.append(((int) ((j >>> 16) & 4294967295L)) >> 12);
            A0s.append(":");
            i2 = C05360Tg.A00(j);
        } else {
            A0s = C18190wL.A0s("L");
            A0s.append((int) ((j >>> 32) & 65535));
            A0s.append(":");
            i2 = (int) ((j >>> 16) & 65535);
        }
        A0s.append(i2);
        AnonymousClass0LU.A0C("MobileConfigFactoryImpl", AnonymousClass00U.A0L("Invalid param type used for: ", A0s.toString()));
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        X.C05370Th.A00(r7.A03);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C07810cE A07() {
        /*
            r7 = this;
            boolean r0 = r7.A03()
            if (r0 == 0) goto L_0x0009
            X.19i r0 = r7.A0B
            return r0
        L_0x0009:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A09
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            r7.A0E(r0)
        L_0x0015:
            X.0cE r1 = r7.A0Q
            if (r1 != 0) goto L_0x0069
            monitor-enter(r7)
            X.0cE r0 = r7.A0Q     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0020
            monitor-exit(r7)     // Catch:{ all -> 0x0061 }
            return r0
        L_0x0020:
            X.19e r6 = r7.A05     // Catch:{ all -> 0x0061 }
            r4 = 0
            X.3V0 r0 = r6.getLatestHandle()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x002e
            java.nio.ByteBuffer r5 = r0.getJavaByteBuffer()     // Catch:{ all -> 0x0061 }
            goto L_0x002f
        L_0x002e:
            r5 = r4
        L_0x002f:
            if (r5 != 0) goto L_0x0036
            int r0 = r7.A03     // Catch:{ all -> 0x0061 }
            X.C05370Th.A00(r0)     // Catch:{ all -> 0x0061 }
        L_0x0036:
            X.3Iv r0 = r7.A06()     // Catch:{ all -> 0x0061 }
            X.19d r0 = X.AnonymousClass19e.A01(r0)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0042
            long[][] r4 = r0.A01     // Catch:{ all -> 0x0061 }
        L_0x0042:
            X.19k r3 = new X.19k     // Catch:{ all -> 0x0061 }
            X.0TK r2 = r7.A00     // Catch:{ all -> 0x0061 }
            X.4tV r0 = r7.A04     // Catch:{ all -> 0x0061 }
            r1 = r3
            r3.<init>(r6, r2, r0, r5)     // Catch:{ all -> 0x0061 }
            if (r4 == 0) goto L_0x0058
            X.32M r0 = new X.32M     // Catch:{ all -> 0x0061 }
            r0.<init>(r4)     // Catch:{ all -> 0x0061 }
            X.3zy r1 = new X.3zy     // Catch:{ all -> 0x0061 }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x0061 }
        L_0x0058:
            r7.A0Q = r1     // Catch:{ all -> 0x0061 }
            java.util.Set r0 = r7.A0J     // Catch:{ all -> 0x0061 }
            r0.add(r1)     // Catch:{ all -> 0x0061 }
            monitor-exit(r7)     // Catch:{ all -> 0x0061 }
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x0064:
            int r0 = r7.A03
            X.C05370Th.A00(r0)
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67603zp.A07():X.0cE");
    }

    public final void A0C() {
        boolean A032 = A03();
        synchronized (this) {
            this.A00 = this.A05.getOrCreateOverridesTable();
            this.A0J.clear();
            this.A0O = new AtomicReferenceArray(10000);
            this.A0Q = null;
            if (A032) {
                AnonymousClass0TY A002 = AnonymousClass0TX.A00((ExecutorService) null);
                synchronized (A002) {
                    A002.A00.clear();
                }
                this.A09.set(false);
                this.A0M.set(false);
                this.A08.set(true);
                this.A0L.set(false);
                this.A0S = null;
            }
        }
    }

    public final boolean A0F() {
        String syncFetchReason;
        String str;
        AnonymousClass19d A012 = AnonymousClass19e.A01(A06());
        if (A012 != null) {
            syncFetchReason = A012.syncFetchReason();
            str = "MobileConfigJavaManager: Using translation table.";
        } else {
            MobileConfigManagerHolderImpl A002 = AnonymousClass19e.A00(A06());
            if (A002 == null) {
                return false;
            }
            syncFetchReason = A002.syncFetchReason();
            str = "AppUpgrade";
        }
        return syncFetchReason.equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean ATw(X.AnonymousClass0TJ r4, long r5, boolean r7) {
        /*
            r3 = this;
            java.util.Set r2 = r3.A02()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0011
            X.0TJ r4 = X.AnonymousClass0TJ.A00(r4)
            r0 = 1
            r4.A02 = r0
        L_0x0011:
            boolean r1 = r3.A04(r5)
            r0 = 1
            if (r1 != 0) goto L_0x0044
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0025
            X.0TN r1 = X.AnonymousClass0TN.DEFAULT__MISMATCH_UNIT_TYPE
        L_0x001e:
            X.0TO r0 = new X.0TO
            r0.<init>(r1)
            r4.A00 = r0
        L_0x0025:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0063
            X.19e r0 = r3.A05
            r0.syncFetchReason()
            java.util.Iterator r1 = r2.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0063
            r1.next()
            java.lang.String r0 = "getSamplingRate"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0044:
            boolean r0 = r3.A05(r5, r0)
            if (r0 != 0) goto L_0x0051
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0025
            X.0TN r1 = X.AnonymousClass0TN.DEFAULT__MISMATCH_PARAM_TYPE
            goto L_0x001e
        L_0x0051:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x005e
            X.0cE r0 = r3.A07()
        L_0x0059:
            boolean r7 = r0.ATw(r4, r5, r7)
            goto L_0x0025
        L_0x005e:
            X.0cE r0 = r3.A00(r5)
            goto L_0x0059
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67603zp.ATw(X.0TJ, long, boolean):boolean");
    }

    public final Map AfP() {
        return A07().AfP();
    }

    public final long At3(long j, long j2) {
        return (!A04(j) || !A05(j, 2)) ? SandboxRepository.CACHE_TTL : A00(j).At3(j, SandboxRepository.CACHE_TTL);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String BEU(X.AnonymousClass0TJ r4, java.lang.String r5, long r6) {
        /*
            r3 = this;
            java.util.Set r2 = r3.A02()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0011
            X.0TJ r4 = X.AnonymousClass0TJ.A00(r4)
            r0 = 1
            r4.A02 = r0
        L_0x0011:
            boolean r0 = r3.A04(r6)
            if (r0 != 0) goto L_0x0043
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0024
            X.0TN r1 = X.AnonymousClass0TN.DEFAULT__MISMATCH_UNIT_TYPE
        L_0x001d:
            X.0TO r0 = new X.0TO
            r0.<init>(r1)
            r4.A00 = r0
        L_0x0024:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0063
            X.19e r0 = r3.A05
            r0.syncFetchReason()
            java.util.Iterator r1 = r2.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0063
            r1.next()
            java.lang.String r0 = "getSamplingRate"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0043:
            r0 = 3
            boolean r0 = r3.A05(r6, r0)
            if (r0 != 0) goto L_0x0051
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0024
            X.0TN r1 = X.AnonymousClass0TN.DEFAULT__MISMATCH_PARAM_TYPE
            goto L_0x001d
        L_0x0051:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x005e
            X.0cE r0 = r3.A07()
        L_0x0059:
            java.lang.String r5 = r0.BEU(r4, r5, r6)
            goto L_0x0024
        L_0x005e:
            X.0cE r0 = r3.A00(r6)
            goto L_0x0059
        L_0x0063:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67603zp.BEU(X.0TJ, java.lang.String, long):java.lang.String");
    }

    public final void Bc7(long j) {
        if (A04(j)) {
            A00(j).Bc7(j);
        }
    }
}
