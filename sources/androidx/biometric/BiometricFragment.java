package androidx.biometric;

import X.AnonymousClass01J;
import X.AnonymousClass099;
import X.AnonymousClass0wJ;
import X.AnonymousClass4yT;
import X.AnonymousClass4yU;
import X.AnonymousClass52R;
import X.AnonymousClass586;
import X.AnonymousClass6DQ;
import X.AnonymousClass6FZ;
import X.AnonymousClass7DT;
import X.AnonymousClass7FF;
import X.AnonymousClass7FG;
import X.AnonymousClass7IU;
import X.AnonymousClass7LT;
import X.AnonymousClass80M;
import X.AnonymousClass825;
import X.AnonymousClass850;
import X.AnonymousClass851;
import X.C106686fR;
import X.C108486iR;
import X.C108496iS;
import X.C109576kE;
import X.C113806sA;
import X.C115626ve;
import X.C1192374c;
import X.C121587Gx;
import X.C121597Gy;
import X.C122617Te;
import X.C12560m7;
import X.C134987yh;
import X.C134997yi;
import X.C135007yj;
import X.C135017yk;
import X.C14030oh;
import X.C18180wK;
import X.C86104wH;
import X.C880856r;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class BiometricFragment extends Fragment {
    public Handler A00 = AnonymousClass0wJ.A0F();
    public AnonymousClass586 A01;

    public final void A07(int i) {
        String string;
        if (i == 3 || !this.A01.A0M) {
            if (A04(this)) {
                this.A01.A00 = i;
                if (i == 1) {
                    Context context = getContext();
                    if (context == null) {
                        string = "";
                    } else {
                        string = context.getString(2131827513);
                    }
                    A03(this, string, 10);
                }
            }
            AnonymousClass586 r0 = this.A01;
            C108496iS r4 = r0.A07;
            if (r4 == null) {
                r4 = new C108496iS();
                r0.A07 = r4;
            }
            CancellationSignal cancellationSignal = r4.A00;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                r4.A00 = null;
            }
            C113806sA r02 = r4.A01;
            if (r02 != null) {
                try {
                    r02.A00();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                r4.A01 = null;
            }
        }
    }

    private void A00() {
        this.A01.A0N = false;
        if (isAdded()) {
            C12560m7 parentFragmentManager = getParentFragmentManager();
            AnonymousClass099 r1 = (AnonymousClass099) parentFragmentManager.A0O("androidx.biometric.FingerprintDialogFragment");
            if (r1 == null) {
                return;
            }
            if (r1.isAdded()) {
                r1.A07();
                return;
            }
            AnonymousClass01J r0 = new AnonymousClass01J(parentFragmentManager);
            r0.A04(r1);
            r0.A01();
        }
    }

    public static void A02(BiometricFragment biometricFragment, C106686fR r3) {
        AnonymousClass586 r1 = biometricFragment.A01;
        if (!r1.A0I) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            r1.A0I = false;
            Executor executor = r1.A0H;
            if (executor == null) {
                executor = new AnonymousClass851();
            }
            executor.execute(new AnonymousClass80M(biometricFragment, r3));
        }
        biometricFragment.A06();
    }

    public static void A03(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        AnonymousClass586 r2 = biometricFragment.A01;
        if (r2.A0J) {
            return;
        }
        if (!r2.A0I) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        r2.A0I = false;
        Executor executor = r2.A0H;
        if (executor == null) {
            executor = new AnonymousClass851();
        }
        executor.execute(new AnonymousClass825(biometricFragment, charSequence, i));
    }

    public final void A05() {
        String str;
        int i;
        Object obj;
        if (this.A01.A0N) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        AnonymousClass586 r1 = this.A01;
        int i2 = 1;
        r1.A0N = true;
        r1.A0I = true;
        boolean A04 = A04(this);
        Context requireContext = requireContext();
        if (A04) {
            Context applicationContext = requireContext.getApplicationContext();
            FingerprintManager A002 = AnonymousClass6FZ.A00(applicationContext);
            if (A002 == null || !A002.isHardwareDetected()) {
                i2 = 12;
            } else {
                FingerprintManager A003 = AnonymousClass6FZ.A00(applicationContext);
                if (A003 == null || !A003.hasEnrolledFingerprints()) {
                    i2 = 11;
                } else if (isAdded()) {
                    this.A01.A0L = true;
                    if (!AnonymousClass7FG.A02(applicationContext, Build.MODEL)) {
                        this.A00.postDelayed(new C134987yh(this), 500);
                        new FingerprintDialogFragment().A0A(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
                    }
                    AnonymousClass586 r12 = this.A01;
                    r12.A00 = 0;
                    AnonymousClass7DT A03 = AnonymousClass7FF.A03(r12.A05);
                    AnonymousClass586 r3 = this.A01;
                    C108496iS r13 = r3.A07;
                    if (r13 == null) {
                        r13 = new C108496iS();
                        r3.A07 = r13;
                    }
                    C113806sA r7 = r13.A01;
                    if (r7 == null) {
                        r7 = new C113806sA();
                        r13.A01 = r7;
                    }
                    C108486iR r2 = r3.A03;
                    if (r2 == null) {
                        r2 = new C108486iR(new AnonymousClass52R(r3));
                        r3.A03 = r2;
                    }
                    C1192374c r32 = r2.A01;
                    if (r32 == null) {
                        r32 = new C1192374c(r2);
                        r2.A01 = r32;
                    }
                    try {
                        FingerprintManager A004 = AnonymousClass6FZ.A00(applicationContext);
                        if (A004 != null) {
                            synchronized (r7) {
                                if (r7.A00 == null) {
                                    CancellationSignal cancellationSignal = new CancellationSignal();
                                    r7.A00 = cancellationSignal;
                                    if (r7.A02) {
                                        cancellationSignal.cancel();
                                    }
                                }
                                obj = r7.A00;
                            }
                            CancellationSignal cancellationSignal2 = (CancellationSignal) obj;
                            FingerprintManager.CryptoObject cryptoObject = null;
                            if (A03 != null) {
                                Cipher cipher = A03.A01;
                                if (cipher != null) {
                                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                                } else {
                                    Signature signature = A03.A00;
                                    if (signature != null) {
                                        cryptoObject = new FingerprintManager.CryptoObject(signature);
                                    } else {
                                        Mac mac = A03.A02;
                                        if (mac != null) {
                                            cryptoObject = new FingerprintManager.CryptoObject(mac);
                                        }
                                    }
                                }
                            }
                            A004.authenticate(cryptoObject, cancellationSignal2, 0, new AnonymousClass4yU(r32), (Handler) null);
                            return;
                        }
                        return;
                    } catch (NullPointerException e) {
                        Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e);
                        if (applicationContext != null) {
                            i = 2131827509;
                        }
                    }
                } else {
                    return;
                }
            }
            if (applicationContext != null) {
                if (11 != i2) {
                    i = 2131827510;
                } else {
                    i = 2131827512;
                }
                str = applicationContext.getString(i);
                A03(this, str, i2);
                A06();
            }
        } else {
            BiometricPrompt.Builder builder = new BiometricPrompt.Builder(requireContext.getApplicationContext());
            C109576kE r14 = this.A01.A06;
            if (r14 != null) {
                CharSequence charSequence = r14.A03;
                CharSequence charSequence2 = r14.A01;
                if (charSequence != null) {
                    builder.setTitle(charSequence);
                }
                if (charSequence2 != null) {
                    builder.setDescription(charSequence2);
                }
            }
            AnonymousClass586 r22 = this.A01;
            CharSequence charSequence3 = r22.A0G;
            if (charSequence3 == null) {
                C109576kE r15 = r22.A06;
                if (r15 != null) {
                    charSequence3 = r15.A02;
                    if (charSequence3 == null) {
                        charSequence3 = "";
                    }
                } else {
                    charSequence3 = null;
                }
            }
            if (!TextUtils.isEmpty(charSequence3)) {
                Executor executor = this.A01.A0H;
                if (executor == null) {
                    executor = new AnonymousClass851();
                }
                AnonymousClass586 r33 = this.A01;
                DialogInterface.OnClickListener onClickListener = r33.A02;
                if (onClickListener == null) {
                    onClickListener = new AnonymousClass7LT(r33);
                    r33.A02 = onClickListener;
                }
                builder.setNegativeButton(charSequence3, executor, onClickListener);
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                C115626ve.A00(builder);
            }
            int A012 = this.A01.A01();
            if (i3 >= 30) {
                AnonymousClass6DQ.A00(builder, A012);
            } else if (i3 >= 29) {
                C115626ve.A01(builder, C18180wK.A1V(A012 & 32768));
            }
            BiometricPrompt build = builder.build();
            Context context = getContext();
            BiometricPrompt.CryptoObject A005 = AnonymousClass7FF.A00(this.A01.A05);
            AnonymousClass586 r23 = this.A01;
            C108496iS r16 = r23.A07;
            if (r16 == null) {
                r16 = new C108496iS();
                r23.A07 = r16;
            }
            CancellationSignal cancellationSignal3 = r16.A00;
            if (cancellationSignal3 == null) {
                cancellationSignal3 = new CancellationSignal();
                r16.A00 = cancellationSignal3;
            }
            AnonymousClass850 r5 = new AnonymousClass850();
            AnonymousClass586 r24 = this.A01;
            C108486iR r34 = r24.A03;
            if (r34 == null) {
                r34 = new C108486iR(new AnonymousClass52R(r24));
                r24.A03 = r34;
            }
            BiometricPrompt.AuthenticationCallback authenticationCallback = r34.A00;
            if (authenticationCallback == null) {
                authenticationCallback = new AnonymousClass4yT(r34.A02);
                r34.A00 = authenticationCallback;
            }
            if (A005 == null) {
                try {
                    build.authenticate(cancellationSignal3, r5, authenticationCallback);
                    return;
                } catch (NullPointerException e2) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e2);
                    if (context != null) {
                        str = context.getString(2131824835);
                    }
                }
            } else {
                build.authenticate(A005, cancellationSignal3, r5, authenticationCallback);
                return;
            }
        }
        str = "";
        A03(this, str, i2);
        A06();
    }

    public final void A06() {
        this.A01.A0N = false;
        A00();
        if (!this.A01.A0J && isAdded()) {
            AnonymousClass01J r0 = new AnonymousClass01J(getParentFragmentManager());
            r0.A04(this);
            r0.A01();
        }
        Context context = getContext();
        if (context != null && AnonymousClass7FG.A00(context, Build.MODEL)) {
            AnonymousClass586 r1 = this.A01;
            r1.A0K = true;
            this.A00.postDelayed(new C135007yj(r1), 600);
        }
    }

    public final boolean A0A() {
        if (Build.VERSION.SDK_INT > 28 || (this.A01.A01() & 32768) == 0) {
            return false;
        }
        return true;
    }

    public static void A01(BiometricFragment biometricFragment) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        int i2;
        FragmentActivity activity = biometricFragment.getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) activity.getSystemService(KeyguardManager.class);
        if (keyguardManager == null) {
            i = 12;
            i2 = 2131827951;
        } else {
            C109576kE r0 = biometricFragment.A01.A06;
            if (r0 != null) {
                charSequence = r0.A03;
                charSequence2 = r0.A01;
            } else {
                charSequence = null;
                charSequence2 = null;
            }
            Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
            if (createConfirmDeviceCredentialIntent == null) {
                i = 14;
                i2 = 2131827950;
            } else {
                biometricFragment.A01.A0J = true;
                if (A04(biometricFragment)) {
                    biometricFragment.A00();
                }
                createConfirmDeviceCredentialIntent.setFlags(134742016);
                biometricFragment.startActivityForResult(createConfirmDeviceCredentialIntent, 1);
                return;
            }
        }
        A03(biometricFragment, biometricFragment.getString(i2), i);
        biometricFragment.A06();
    }

    public static boolean A04(BiometricFragment biometricFragment) {
        FragmentActivity activity = biometricFragment.getActivity();
        if (activity != null && biometricFragment.A01.A05 != null && AnonymousClass7FG.A03(activity, Build.MANUFACTURER, Build.MODEL)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Context context = biometricFragment.getContext();
        if (context == null || context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (r1 != 3) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d8, code lost:
        if (X.AnonymousClass7FG.A02(r1, android.os.Build.MODEL) == false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(int r5, java.lang.CharSequence r6) {
        /*
            r4 = this;
            switch(r5) {
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0003;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r5 = 8
        L_0x0005:
            android.content.Context r2 = r4.getContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x0038
            r0 = 7
            if (r5 == r0) goto L_0x0016
            r0 = 9
            if (r5 != r0) goto L_0x0038
        L_0x0016:
            if (r2 == 0) goto L_0x0038
            java.lang.Class<android.app.KeyguardManager> r0 = android.app.KeyguardManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isDeviceSecure()
            if (r0 == 0) goto L_0x0038
            X.586 r0 = r4.A01
            int r1 = r0.A01()
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0038
            A01(r4)
            return
        L_0x0038:
            boolean r0 = A04(r4)
            if (r0 == 0) goto L_0x008f
            if (r6 != 0) goto L_0x0048
            android.content.Context r2 = r4.getContext()
            if (r2 != 0) goto L_0x005b
            java.lang.String r6 = ""
        L_0x0048:
            r1 = 5
            X.586 r0 = r4.A01
            if (r5 != r1) goto L_0x009f
            int r1 = r0.A00
            if (r1 == 0) goto L_0x0054
            r0 = 3
            if (r1 != r0) goto L_0x0057
        L_0x0054:
            A03(r4, r6, r5)
        L_0x0057:
            r4.A06()
            return
        L_0x005b:
            r0 = 1
            if (r5 == r0) goto L_0x008b
            r0 = 7
            if (r5 == r0) goto L_0x0087
            switch(r5) {
                case 9: goto L_0x0087;
                case 10: goto L_0x007b;
                case 11: goto L_0x007f;
                case 12: goto L_0x0083;
                default: goto L_0x0064;
            }
        L_0x0064:
            r0 = 425(0x1a9, float:5.96E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            java.lang.String r1 = X.AnonymousClass00U.A0J(r0, r5)
            java.lang.String r0 = "BiometricUtils"
            android.util.Log.e(r0, r1)
            r0 = 2131824835(0x7f1110c3, float:1.928251E38)
        L_0x0076:
            java.lang.String r6 = r2.getString(r0)
            goto L_0x0048
        L_0x007b:
            r0 = 2131827513(0x7f111b39, float:1.928794E38)
            goto L_0x0076
        L_0x007f:
            r0 = 2131827512(0x7f111b38, float:1.9287939E38)
            goto L_0x0076
        L_0x0083:
            r0 = 2131827510(0x7f111b36, float:1.9287935E38)
            goto L_0x0076
        L_0x0087:
            r0 = 2131827511(0x7f111b37, float:1.9287937E38)
            goto L_0x0076
        L_0x008b:
            r0 = 2131827509(0x7f111b35, float:1.9287933E38)
            goto L_0x0076
        L_0x008f:
            if (r6 != 0) goto L_0x0054
            r0 = 2131824835(0x7f1110c3, float:1.928251E38)
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r0 = " "
            java.lang.String r6 = X.AnonymousClass00U.A0R(r1, r0, r5)
            goto L_0x0054
        L_0x009f:
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x00af
            A03(r4, r6, r5)
            r4.A06()
        L_0x00a9:
            X.586 r1 = r4.A01
            r0 = 1
            r1.A0L = r0
            return
        L_0x00af:
            r2 = r6
            if (r6 != 0) goto L_0x00b9
            r0 = 2131824835(0x7f1110c3, float:1.928251E38)
            java.lang.String r2 = r4.getString(r0)
        L_0x00b9:
            X.586 r1 = r4.A01
            r0 = 2
            r1.A02(r0)
            X.586 r0 = r4.A01
            r0.A03(r2)
            android.os.Handler r3 = r4.A00
            X.826 r2 = new X.826
            r2.<init>(r4, r6, r5)
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x00da
            java.lang.String r0 = android.os.Build.MODEL
            boolean r1 = X.AnonymousClass7FG.A02(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x00dc
        L_0x00da:
            r0 = 2000(0x7d0, float:2.803E-42)
        L_0x00dc:
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A08(int, java.lang.CharSequence):void");
    }

    public final void A09(C121597Gy r6, C109576kE r7) {
        String str;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        AnonymousClass586 r3 = this.A01;
        r3.A06 = r7;
        int i = r7.A00;
        if (i == 0) {
            i = 255;
            if (r6 != null) {
                i = 15;
            }
        }
        if (Build.VERSION.SDK_INT < 30 && i == 15 && r6 == null) {
            r6 = AnonymousClass7FF.A01();
        }
        r3.A05 = r6;
        boolean A0A = A0A();
        AnonymousClass586 r1 = this.A01;
        if (A0A) {
            str = getString(2131824239);
        } else {
            str = null;
        }
        r1.A0G = str;
        if (A0A() && new C121587Gx(new C122617Te(activity)).A03(255) != 0) {
            this.A01.A0I = true;
            A01(this);
        } else if (this.A01.A0K) {
            this.A00.postDelayed(new C134997yi(this), 600);
        } else {
            A05();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.A01.A0J = false;
            if (i2 == -1) {
                A02(this, new C106686fR((C121597Gy) null, 1));
                return;
            }
            A03(this, getString(2131827952), 10);
            A06();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-847091015);
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass586 r0 = (AnonymousClass586) new AnonymousClass7IU(activity).A01(AnonymousClass586.class);
            this.A01 = r0;
            C880856r r1 = r0.A0A;
            if (r1 == null) {
                r1 = C880856r.A03();
                r0.A0A = r1;
            }
            C86104wH.A1F(this, r1, 0);
            AnonymousClass586 r02 = this.A01;
            C880856r r12 = r02.A08;
            if (r12 == null) {
                r12 = C880856r.A03();
                r02.A08 = r12;
            }
            C86104wH.A1F(this, r12, 1);
            AnonymousClass586 r03 = this.A01;
            C880856r r13 = r03.A09;
            if (r13 == null) {
                r13 = C880856r.A03();
                r03.A09 = r13;
            }
            C86104wH.A1F(this, r13, 2);
            AnonymousClass586 r04 = this.A01;
            C880856r r14 = r04.A0D;
            if (r14 == null) {
                r14 = C880856r.A03();
                r04.A0D = r14;
            }
            C86104wH.A1F(this, r14, 3);
            AnonymousClass586 r05 = this.A01;
            C880856r r15 = r05.A0F;
            if (r15 == null) {
                r15 = C880856r.A03();
                r05.A0F = r15;
            }
            C86104wH.A1F(this, r15, 4);
            AnonymousClass586 r06 = this.A01;
            C880856r r16 = r06.A0E;
            if (r16 == null) {
                r16 = C880856r.A03();
                r06.A0E = r16;
            }
            C86104wH.A1F(this, r16, 5);
        }
        C14030oh.A09(-1337394849, A02);
    }

    public final void onStart() {
        int A02 = C14030oh.A02(-18546844);
        super.onStart();
        if (Build.VERSION.SDK_INT == 29) {
            AnonymousClass586 r4 = this.A01;
            if ((r4.A01() & 32768) != 0) {
                r4.A0M = true;
                this.A00.postDelayed(new C135017yk(r4), 250);
            }
        }
        C14030oh.A09(-892217803, A02);
    }

    public final void onStop() {
        FragmentActivity activity;
        int A02 = C14030oh.A02(-575955297);
        super.onStop();
        if (Build.VERSION.SDK_INT < 29 && !this.A01.A0J && ((activity = getActivity()) == null || !activity.isChangingConfigurations())) {
            A07(0);
        }
        C14030oh.A09(-868057281, A02);
    }
}
