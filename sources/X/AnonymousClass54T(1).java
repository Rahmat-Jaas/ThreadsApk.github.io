package X;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.54T  reason: invalid class name */
public abstract class AnonymousClass54T extends AnonymousClass54K implements AnonymousClass0YY, C146508mM, C147578pZ, C143018fy {
    public static final C123457Wz A0J = new C123457Wz();
    public static final C111066mj A0K = new C111066mj();
    public static final C146108le A0L = new AnonymousClass7YI();
    public static final C146108le A0M = new AnonymousClass7YJ();
    public static final AnonymousClass0YY A0N = C138718Le.A00;
    public static final AnonymousClass0YY A0O = C138728Lf.A00;
    public static final float[] A0P = AnonymousClass7Hf.A04();
    public float A00;
    public long A01 = C121127Eg.A01;
    public C113796s9 A02;
    public C146098ld A03;
    public C111066mj A04;
    public AnonymousClass54S A05;
    public AnonymousClass54T A06;
    public AnonymousClass54T A07;
    public C146648mb A08;
    public C147168nV A09;
    public AnonymousClass0YY A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public float A0E = 0.8f;
    public AnonymousClass69J A0F;
    public Map A0G;
    public final AnonymousClass7Y3 A0H;
    public final AnonymousClass0ZU A0I = C86154wM.A13(this, 25);

    public static final void A04(C146678mg r6, AnonymousClass54T r7) {
        C147748pq r4 = null;
        AnonymousClass54T r5 = r7;
        AnonymousClass7YG r2 = r7.A0L().A04;
        C146678mg r3 = r6;
        if (r2 != null) {
            AnonymousClass7YG A022 = A02(r7, false);
            while (true) {
                if (A022 != null && (A022.A00 & 4) != 0) {
                    if ((A022.A01 & 4) == 0) {
                        if (A022 == r2) {
                            break;
                        }
                        A022 = A022.A02;
                    } else {
                        if (A022 instanceof C147748pq) {
                            r4 = A022;
                        }
                        C147748pq r42 = r4;
                        if (r42 != null) {
                            ((AndroidComposeView) AnonymousClass6F0.A00(r7.A0H)).A0W.A00(r3, r42, r5, AnonymousClass7FV.A02(r7.A02));
                            return;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        r7.A0S(r6);
    }

    public static final void A05(C147778pt r9, AnonymousClass84G r10, C146108le r11, AnonymousClass54T r12, float f, long j, boolean z, boolean z2) {
        AnonymousClass84G r1 = r10;
        C146108le r2 = r11;
        AnonymousClass54T r3 = r12;
        long j2 = j;
        boolean z3 = z;
        boolean z4 = z2;
        if (r9 == null) {
            r12.A0V(r1, r2, j, z3, z4);
            return;
        }
        r11.BQh(r9);
        A05((C147778pt) AnonymousClass6F1.A00(r9, r11.AKQ()), r1, r2, r3, f, j2, z3, z4);
    }

    public void A0E(AnonymousClass0YY r4, float f, long j) {
        A07(this, r4, false);
        if (this.A01 != j) {
            this.A01 = j;
            AnonymousClass7Y3 r1 = this.A0H;
            r1.A0Y.A08.A0F();
            C146648mb r0 = this.A08;
            if (r0 != null) {
                r0.Bgc(j);
            } else {
                AnonymousClass54T r02 = this.A07;
                if (r02 != null) {
                    r02.A0O();
                }
            }
            AnonymousClass54K.A00(this);
            C147098nO r03 = r1.A0A;
            if (r03 != null) {
                r03.C4J(r1);
            }
        }
        this.A00 = f;
    }

    public final AnonymousClass54T A0M(AnonymousClass54T r7) {
        C04220Ms.A0B(r7, 0);
        AnonymousClass7Y3 r5 = r7.A0H;
        AnonymousClass7Y3 r4 = r5;
        AnonymousClass7Y3 r3 = this.A0H;
        AnonymousClass7Y3 r2 = r3;
        if (r5 == r3) {
            AnonymousClass7YG A0L2 = r7.A0L();
            AnonymousClass7YG r1 = A0L().A03;
            if (!r1.A08) {
                throw C18180wK.A0a("Check failed.");
            }
            while (true) {
                r1 = r1.A04;
                if (r1 != null) {
                    if ((r1.A01 & 2) != 0 && r1 == A0L2) {
                        break;
                    }
                } else {
                    return this;
                }
            }
        } else {
            while (r4.A01 > r3.A01) {
                r4 = r4.A09();
                C04220Ms.A0A(r4);
            }
            while (r2.A01 > r4.A01) {
                r2 = r2.A09();
                C04220Ms.A0A(r2);
            }
            while (r4 != r2) {
                r4 = r4.A09();
                r2 = r2.A09();
                if (r4 != null) {
                    if (r2 == null) {
                    }
                }
                throw C18190wL.A0a("layouts are not part of the same hierarchy");
            }
            if (r2 == r3) {
                return this;
            }
            if (r4 != r5) {
                return r4.A0a.A06;
            }
        }
        return r7;
    }

    public final void A0R(C113796s9 r11, boolean z, boolean z2) {
        C146648mb r5 = this.A08;
        if (r5 != null) {
            if (this.A0B) {
                if (z2) {
                    long D7K = this.A09.D7K(this.A0H.A0B.Avw());
                    float A022 = AnonymousClass7JK.A02(D7K) / 2.0f;
                    float A002 = AnonymousClass7JK.A00(D7K) / 2.0f;
                    long j = this.A02;
                    r11.A00(-A022, -A002, ((float) C86104wH.A07(j)) + A022, ((float) C86104wH.A08(j)) + A002);
                } else if (z) {
                    long j2 = this.A02;
                    r11.A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) C86104wH.A07(j2), (float) C86104wH.A08(j2));
                }
                if (r11.A01 >= r11.A02 || r11.A03 >= r11.A00) {
                    return;
                }
            }
            r5.BeY(r11, false);
        }
        long j3 = this.A01;
        float A072 = (float) C86104wH.A07(j3);
        r11.A01 += A072;
        r11.A02 += A072;
        float A082 = (float) C86104wH.A08(j3);
        r11.A03 += A082;
        r11.A00 += A082;
    }

    public final void A0U(C146098ld r7) {
        C04220Ms.A0B(r7, 0);
        C146098ld r2 = this.A03;
        if (r7 != r2) {
            this.A03 = r7;
            if (r2 == null || r7.getWidth() != r2.getWidth() || r7.getHeight() != r2.getHeight()) {
                int width = r7.getWidth();
                int height = r7.getHeight();
                C146648mb r22 = this.A08;
                if (r22 != null) {
                    r22.Ceg(AnonymousClass7FV.A00(width, height));
                } else {
                    AnonymousClass54T r0 = this.A07;
                    if (r0 != null) {
                        r0.A0O();
                    }
                }
                AnonymousClass7Y3 r1 = this.A0H;
                C147098nO r02 = r1.A0A;
                if (r02 != null) {
                    r02.C4J(r1);
                }
                A0C(AnonymousClass7FV.A00(width, height));
                A0J.A09 = AnonymousClass7FV.A02(this.A02);
                AnonymousClass7YG r23 = A0L().A04;
                if (r23 != null) {
                    AnonymousClass7YG A022 = A02(this, false);
                    while (A022 != null && (A022.A00 & 4) != 0) {
                        if ((A022.A01 & 4) != 0 && (A022 instanceof C147748pq)) {
                            ((C147748pq) A022).C5z();
                        }
                        if (A022 == r23) {
                            break;
                        }
                        A022 = A022.A02;
                    }
                }
            }
            Map map = this.A0G;
            if ((map != null && !map.isEmpty()) || C86164wN.A1R(r7.AQ9())) {
                Map AQ9 = r7.AQ9();
                if (!C04220Ms.A0I(AQ9, this.A0G)) {
                    this.A0H.A0Y.A08.AQ8().A01();
                    Map map2 = this.A0G;
                    if (map2 == null) {
                        map2 = C18220wO.A0y();
                        this.A0G = map2;
                    }
                    map2.clear();
                    map2.putAll(AQ9);
                }
            }
        }
    }

    public final AnonymousClass7F6 Bax(C146508mM r9, boolean z) {
        AnonymousClass54T r3;
        AnonymousClass7XU r0;
        C04220Ms.A0B(r9, 0);
        if (!BRS()) {
            throw C18180wK.A0a("LayoutCoordinate operations are only valid when isAttached is true");
        } else if (r9.BRS()) {
            if (!(r9 instanceof AnonymousClass7XU) || (r0 = (AnonymousClass7XU) r9) == null) {
                r3 = (AnonymousClass54T) r9;
            } else {
                r3 = r0.A00.A03;
            }
            AnonymousClass54T A0M2 = A0M(r3);
            C113796s9 r4 = this.A02;
            if (r4 == null) {
                r4 = new C113796s9();
                this.A02 = r4;
            }
            r4.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            r4.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            long BCI = r9.BCI();
            r4.A02 = (float) C86104wH.A07(BCI);
            r4.A00 = (float) C86104wH.A08(BCI);
            while (r3 != A0M2) {
                r3.A0R(r4, z, false);
                if (r4.A01 >= r4.A02 || r4.A03 >= r4.A00) {
                    return AnonymousClass7F6.A04;
                }
                r3 = r3.A07;
                C04220Ms.A0A(r3);
            }
            A03(r4, A0M2, z);
            return new AnonymousClass7F6(r4.A01, r4.A03, r4.A02, r4.A00);
        } else {
            StringBuilder A0s = C18190wL.A0s("LayoutCoordinates ");
            A0s.append(r9);
            throw C18180wK.A0a(C18180wK.A0i(" is not attached!", A0s));
        }
    }

    public final long Bay(C146508mM r3, long j) {
        AnonymousClass54T r32;
        AnonymousClass7XU r0;
        C04220Ms.A0B(r3, 0);
        if (!(r3 instanceof AnonymousClass7XU) || (r0 = (AnonymousClass7XU) r3) == null) {
            r32 = (AnonymousClass54T) r3;
        } else {
            r32 = r0.A00.A03;
        }
        AnonymousClass54T A0M2 = A0M(r32);
        while (r32 != A0M2) {
            j = r32.A0K(j);
            r32 = r32.A07;
            C04220Ms.A0A(r32);
        }
        return A01(A0M2, j);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z = false;
        C04220Ms.A0B(obj, 0);
        AnonymousClass7Y3 r1 = this.A0H;
        if (r1.A0N) {
            ((AndroidComposeView) AnonymousClass6F0.A00(r1)).A0Y.A00(this, C86164wN.A0v(obj, this, 20), A0N);
        } else {
            z = true;
        }
        this.A0C = z;
        return Unit.A00;
    }

    private final long A01(AnonymousClass54T r3, long j) {
        if (r3 == this) {
            return j;
        }
        AnonymousClass54T r1 = this.A07;
        if (r1 == null || C04220Ms.A0I(r3, r1)) {
            return A0J(j);
        }
        return A0J(r1.A01(r3, j));
    }

    public static final AnonymousClass7YG A02(AnonymousClass54T r3, boolean z) {
        AnonymousClass7YG A0L2;
        AnonymousClass7IW r2 = r3.A0H.A0a;
        if (r2.A04 == r3) {
            return r2.A02;
        }
        AnonymousClass54T r0 = r3.A07;
        if (z) {
            if (r0 == null || (A0L2 = r0.A0L()) == null) {
                return null;
            }
            return A0L2.A02;
        } else if (r0 != null) {
            return r0.A0L();
        } else {
            return null;
        }
    }

    private final void A03(C113796s9 r8, AnonymousClass54T r9, boolean z) {
        if (r9 != this) {
            AnonymousClass54T r0 = this.A07;
            if (r0 != null) {
                r0.A03(r8, r9, z);
            }
            long j = this.A01;
            float f = (float) ((int) (j >> 32));
            r8.A01 -= f;
            r8.A02 -= f;
            float A082 = (float) C86104wH.A08(j);
            r8.A03 -= A082;
            r8.A00 -= A082;
            C146648mb r1 = this.A08;
            if (r1 != null) {
                r1.BeY(r8, true);
                if (this.A0B && z) {
                    long j2 = this.A02;
                    r8.A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) ((int) (j2 >> 32)), (float) C86104wH.A08(j2));
                }
            }
        }
    }

    public static final void A06(AnonymousClass54T r37) {
        AnonymousClass54T r8 = r37;
        C146648mb r15 = r8.A08;
        if (r15 != null) {
            AnonymousClass0YY r2 = r8.A0A;
            if (r2 != null) {
                C123457Wz r7 = A0J;
                r7.A03 = 1.0f;
                r7.A04 = 1.0f;
                r7.A00 = 1.0f;
                r7.A06 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r7.A07 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r7.A05 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                long j = C102736Wi.A00;
                r7.A08 = j;
                r7.A0A = j;
                r7.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r7.A01 = 8.0f;
                r7.A0B = AnonymousClass79F.A01;
                r7.A0C = C102746Wj.A00;
                r7.A0E = false;
                r7.A09 = AnonymousClass7JK.A01;
                AnonymousClass7Y3 r4 = r8.A0H;
                C147168nV r0 = r4.A0C;
                C04220Ms.A0B(r0, 0);
                r7.A0D = r0;
                r7.A09 = AnonymousClass7FV.A02(r8.A02);
                ((AndroidComposeView) AnonymousClass6F0.A00(r4)).A0Y.A00(r8, C86154wM.A13(r2, 26), A0O);
                C111066mj r02 = r8.A04;
                if (r02 == null) {
                    r02 = new C111066mj();
                    r8.A04 = r02;
                }
                float f = r7.A03;
                r02.A04 = f;
                float f2 = r7.A04;
                r02.A05 = f2;
                float f3 = r7.A06;
                r02.A06 = f3;
                float f4 = r7.A07;
                r02.A07 = f4;
                r02.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r02.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f5 = r7.A02;
                r02.A03 = f5;
                float f6 = r7.A01;
                r02.A00 = f6;
                long j2 = r7.A0B;
                r02.A08 = j2;
                float f7 = r7.A00;
                float f8 = r7.A05;
                long j3 = r7.A08;
                long j4 = r7.A0A;
                C142918fo r18 = r7.A0C;
                boolean z = r7.A0E;
                AnonymousClass69J r1 = r4.A0D;
                long j5 = j3;
                long j6 = j4;
                boolean z2 = z;
                r15.D9I((C97726Cn) null, r18, r4.A0C, r1, f, f2, f7, f3, f4, f8, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f5, f6, 0, j2, j5, j6, z2);
                r8.A0B = r7.A0E;
            } else {
                throw C18190wL.A0a("Required value was null.");
            }
        } else if (r8.A0A != null) {
            throw C18190wL.A0a("Failed requirement.");
        }
        r8.A0E = A0J.A00;
        AnonymousClass7Y3 r12 = r8.A0H;
        C147098nO r03 = r12.A0A;
        if (r03 != null) {
            r03.C4J(r12);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r11 != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.AnonymousClass54T r9, X.AnonymousClass0YY r10, boolean r11) {
        /*
            X.0YY r0 = r9.A0A
            r7 = 0
            if (r0 != r10) goto L_0x001a
            X.8nV r1 = r9.A09
            X.7Y3 r2 = r9.A0H
            X.8nV r0 = r2.A0C
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x001a
            X.69J r1 = r9.A0F
            X.69J r0 = r2.A0D
            if (r1 != r0) goto L_0x001a
            r1 = 0
            if (r11 == 0) goto L_0x001b
        L_0x001a:
            r1 = 1
        L_0x001b:
            r9.A0A = r10
            X.7Y3 r5 = r9.A0H
            X.8nV r0 = r5.A0C
            r9.A09 = r0
            X.69J r0 = r5.A0D
            r9.A0F = r0
            boolean r0 = r9.BRS()
            if (r0 == 0) goto L_0x00d8
            if (r10 == 0) goto L_0x00d8
            X.8mb r0 = r9.A08
            if (r0 != 0) goto L_0x004f
            X.8nO r6 = X.AnonymousClass6F0.A00(r5)
            X.0ZU r4 = r9.A0I
            androidx.compose.ui.platform.AndroidComposeView r6 = (androidx.compose.ui.platform.AndroidComposeView) r6
            r3 = 1
            X.C04220Ms.A0B(r4, r3)
            X.6fj r8 = r6.A0g
        L_0x0041:
            java.lang.ref.ReferenceQueue r0 = r8.A01
            java.lang.ref.Reference r1 = r0.poll()
            if (r1 == 0) goto L_0x0055
            X.84X r0 = r8.A00
            r0.A0E(r1)
            goto L_0x0041
        L_0x004f:
            if (r1 == 0) goto L_0x0084
            A06(r9)
            return
        L_0x0055:
            X.84X r1 = r8.A00
            int r0 = r1.A00
            if (r0 == 0) goto L_0x00d6
            int r0 = r0 + -1
            java.lang.Object r0 = r1.A03(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r2 = r0.get()
            if (r2 == 0) goto L_0x0055
        L_0x0069:
            X.8mb r2 = (X.C146648mb) r2
            if (r2 == 0) goto L_0x0085
            r2.CfE(r4, r9)
        L_0x0070:
            long r0 = r9.A02
            r2.Ceg(r0)
            long r0 = r9.A01
            r2.Bgc(r0)
            r9.A08 = r2
            A06(r9)
            r5.A0M = r3
            r4.invoke()
        L_0x0084:
            return
        L_0x0085:
            boolean r0 = r6.isHardwareAccelerated()
            if (r0 == 0) goto L_0x0097
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0097
            X.7YK r2 = new X.7YK     // Catch:{ all -> 0x0095 }
            r2.<init>(r6, r4, r9)     // Catch:{ all -> 0x0095 }
            goto L_0x0070
        L_0x0095:
            r6.A08 = r7
        L_0x0097:
            X.50k r0 = r6.A05
            if (r0 != 0) goto L_0x00c2
            X.6nE r2 = X.AnonymousClass50g.A0J
            boolean r0 = X.AnonymousClass50g.A0G
            if (r0 != 0) goto L_0x00ad
            android.content.Context r1 = r6.getContext()
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            r2.A00(r0)
        L_0x00ad:
            boolean r0 = X.AnonymousClass50g.A0H
            android.content.Context r1 = r6.getContext()
            if (r0 == 0) goto L_0x00cd
            X.C04220Ms.A06(r1)
            X.50k r0 = new X.50k
            r0.<init>(r1)
        L_0x00bd:
            r6.A05 = r0
            r6.addView(r0)
        L_0x00c2:
            X.50k r0 = r6.A05
            X.C04220Ms.A0A(r0)
            X.50g r2 = new X.50g
            r2.<init>(r6, r0, r4, r9)
            goto L_0x0070
        L_0x00cd:
            X.C04220Ms.A06(r1)
            X.54u r0 = new X.54u
            r0.<init>(r1)
            goto L_0x00bd
        L_0x00d6:
            r2 = 0
            goto L_0x0069
        L_0x00d8:
            X.8mb r0 = r9.A08
            if (r0 == 0) goto L_0x00f4
            r0.destroy()
            r0 = 1
            r5.A0M = r0
            X.0ZU r0 = r9.A0I
            r0.invoke()
            boolean r0 = r9.BRS()
            if (r0 == 0) goto L_0x00f4
            X.8nO r0 = r5.A0A
            if (r0 == 0) goto L_0x00f4
            r0.C4J(r5)
        L_0x00f4:
            r0 = 0
            r9.A08 = r0
            r9.A0C = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54T.A07(X.54T, X.0YY, boolean):void");
    }

    public final long A0J(long j) {
        long j2 = this.A01;
        long A0C2 = C86104wH.A0C(AnonymousClass7KC.A01(j) - ((float) C86104wH.A07(j2)), AnonymousClass7KC.A02(j) - ((float) C86104wH.A08(j2)));
        C146648mb r1 = this.A08;
        if (r1 != null) {
            return r1.BeZ(A0C2, true);
        }
        return A0C2;
    }

    public final long A0K(long j) {
        C146648mb r1 = this.A08;
        if (r1 != null) {
            j = r1.BeZ(j, false);
        }
        long j2 = this.A01;
        return C86104wH.A0C(AnonymousClass7KC.A01(j) + ((float) C86104wH.A07(j2)), AnonymousClass7KC.A02(j) + ((float) C86104wH.A08(j2)));
    }

    public final AnonymousClass7YG A0L() {
        if (this instanceof C877754l) {
            return ((AnonymousClass7YG) ((C877754l) this).A00).A03;
        }
        return ((C877654k) this).A00;
    }

    public void A0N() {
        C146648mb r0 = this.A08;
        if (r0 != null) {
            r0.invalidate();
        }
    }

    public final void A0O() {
        C146648mb r0 = this.A08;
        if (r0 != null) {
            r0.invalidate();
            return;
        }
        AnonymousClass54T r02 = this.A07;
        if (r02 != null) {
            r02.A0O();
        }
    }

    public final void A0P() {
        Snapshot A052;
        AnonymousClass7YG A022 = A02(this, true);
        if (A022 != null && (A022.A03.A00 & 128) != 0) {
            Snapshot A023 = C121637Hc.A02();
            try {
                A052 = A023.A05();
                AnonymousClass7YG A0L2 = A0L();
                AnonymousClass7YG A024 = A02(this, true);
                while (A024 != null && (A024.A00 & 128) != 0) {
                    if ((A024.A01 & 128) != 0 && (A024 instanceof C147678pj)) {
                        long j = this.A02;
                        C147538pV r1 = ((AnonymousClass53X) ((C147678pj) A024)).A00;
                        if (r1 instanceof C147458pN) {
                            ((C147458pN) r1).CFP(j);
                        }
                    }
                    if (A024 != A0L2) {
                        A024 = A024.A02;
                    }
                }
                C86144wL.A1N(A052);
                A023.A0A();
            } catch (Throwable th) {
                A023.A0A();
                throw th;
            }
        }
    }

    public final void A0Q() {
        AnonymousClass54S r5 = this.A05;
        if (r5 != null) {
            AnonymousClass7YG A0L2 = A0L();
            AnonymousClass7YG A022 = A02(this, true);
            while (A022 != null && (A022.A00 & 128) != 0) {
                if ((A022.A01 & 128) != 0 && (A022 instanceof C147678pj)) {
                    C04220Ms.A0B(r5.A02, 0);
                }
                if (A022 == A0L2) {
                    break;
                }
                A022 = A022.A02;
            }
        }
        AnonymousClass7YG A0L3 = A0L();
        AnonymousClass7YG A023 = A02(this, true);
        while (A023 != null && (A023.A00 & 128) != 0) {
            if ((A023.A01 & 128) != 0 && (A023 instanceof C147678pj)) {
                AnonymousClass53X r0 = (AnonymousClass53X) ((C147678pj) A023);
                r0.A01 = this;
                C147538pV r1 = r0.A00;
                if (r1 instanceof C147448pM) {
                    ((C147448pM) r1).CBC(this);
                }
            }
            if (A023 != A0L3) {
                A023 = A023.A02;
            } else {
                return;
            }
        }
    }

    public final void A0S(C146678mg r13) {
        C146398mB r7;
        C146678mg r6 = r13;
        if (this instanceof C877754l) {
            C04220Ms.A0B(r13, 0);
            AnonymousClass54T r0 = this.A06;
            C04220Ms.A0A(r0);
            r0.A0T(r13);
            if (((AndroidComposeView) AnonymousClass6F0.A00(this.A0H)).A0A) {
                r7 = C877754l.A02;
            } else {
                return;
            }
        } else {
            C04220Ms.A0B(r13, 0);
            AnonymousClass7Y3 r02 = this.A0H;
            C147098nO A002 = AnonymousClass6F0.A00(r02);
            AnonymousClass84X A072 = r02.A07();
            int i = A072.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = A072.A01;
                do {
                    AnonymousClass7Y3 r1 = (AnonymousClass7Y3) objArr[i2];
                    if (r1.A0N) {
                        r1.A0a.A04.A0T(r13);
                    }
                    i2++;
                } while (i2 < i);
            }
            if (((AndroidComposeView) A002).A0A) {
                r7 = C877654k.A01;
            } else {
                return;
            }
        }
        long j = this.A02;
        AnonymousClass7F6 r03 = new AnonymousClass7F6(0.5f, 0.5f, ((float) C86104wH.A07(j)) - 0.5f, ((float) C86104wH.A08(j)) - 0.5f);
        r6.AJ8(r7, 0.5f, 0.5f, r03.A02, r03.A00);
    }

    public final void A0T(C146678mg r5) {
        C146648mb r0 = this.A08;
        if (r0 != null) {
            r0.AJ1(r5);
            return;
        }
        long j = this.A01;
        float A072 = (float) C86104wH.A07(j);
        float A082 = (float) C86104wH.A08(j);
        r5.D7f(A072, A082);
        A04(r5, this);
        r5.D7f(-A072, -A082);
    }

    public final void A0V(AnonymousClass84G r16, C146108le r17, long j, boolean z, boolean z2) {
        C146648mb r1;
        boolean z3 = z2;
        AnonymousClass84G r9 = r16;
        C146108le r8 = r17;
        long j2 = j;
        boolean z4 = z;
        if (this instanceof C877654k) {
            boolean A1X = C18240wQ.A1X(r9);
            AnonymousClass7Y3 r4 = this.A0H;
            if (r8.CsR(r4)) {
                if (!AnonymousClass7FN.A03(j2) || ((r1 = this.A08) != null && this.A0B && !r1.BUu(j2))) {
                    if (z) {
                        float A0H2 = A0H(j2, this.A09.D7K(r4.A0B.Avw()));
                        if (!Float.isInfinite(A0H2) && !Float.isNaN(A0H2)) {
                            z3 = false;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int i = r9.A00;
                AnonymousClass84X A072 = r4.A07();
                int i2 = A072.A00;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    Object[] objArr = A072.A01;
                    loop0:
                    do {
                        AnonymousClass7Y3 r10 = (AnonymousClass7Y3) objArr[i3];
                        if (r10.A0N) {
                            r8.ACp(r9, r10, j2, z4, z3);
                            long A002 = AnonymousClass84G.A00(r9);
                            if (C86104wH.A00(A002) < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && C86104wH.A08(A002) != 0) {
                                AnonymousClass7YG A022 = A02(r10.A0a.A04, A1X);
                                if (A022 == null) {
                                    break;
                                }
                                AnonymousClass7YG r6 = A022.A03;
                                if (r6.A08) {
                                    if ((r6.A00 & 16) == 0) {
                                        break;
                                    }
                                    while (true) {
                                        r6 = r6.A02;
                                        if (r6 == null) {
                                            break loop0;
                                        } else if ((r6.A01 & 16) != 0 && (r6 instanceof C147728po)) {
                                            C147538pV r5 = ((AnonymousClass53X) ((C147728po) r6)).A00;
                                            C04220Ms.A0C(r5, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                                            if (((C147428pK) r5).B21() instanceof AnonymousClass54C) {
                                                r9.A00 = r9.size() - 1;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    throw C18180wK.A0a("Check failed.");
                                }
                            }
                        }
                        i3--;
                    } while (i3 >= 0);
                }
                r9.A00 = i;
                return;
            }
            return;
        }
        C04220Ms.A0B(r9, 2);
        AnonymousClass54T r0 = this.A06;
        if (r0 != null) {
            r0.A0W(r9, r8, r0.A0J(j2), z4, z3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        if (r6 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0106, code lost:
        if (X.C98276Ew.A00(X.AnonymousClass84G.A00(r7), (X.C86114wI.A09(r14 ? 1 : 0) & 4294967295L) | (r2 << 32)) > 0) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0W(X.AnonymousClass84G r25, X.C146108le r26, long r27, boolean r29, boolean r30) {
        /*
            r24 = this;
            r8 = r26
            int r2 = r8.AKQ()
            r0 = 128(0x80, float:1.794E-43)
            r0 = r0 & r2
            boolean r1 = X.C18180wK.A1V(r0)
            r9 = r24
            X.7YG r0 = r9.A0L()
            if (r1 != 0) goto L_0x00be
            X.7YG r0 = r0.A04
            if (r0 != 0) goto L_0x00be
        L_0x0019:
            r6 = 0
        L_0x001a:
            r11 = r27
            boolean r0 = X.AnonymousClass7FN.A03(r11)
            r7 = r25
            r13 = r29
            if (r0 == 0) goto L_0x0074
            X.8mb r1 = r9.A08
            if (r1 == 0) goto L_0x0034
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x0034
            boolean r0 = r1.BUu(r11)
            if (r0 == 0) goto L_0x0074
        L_0x0034:
            r14 = r30
            if (r6 == 0) goto L_0x00b4
            float r3 = X.AnonymousClass7KC.A01(r11)
            float r2 = X.AnonymousClass7KC.A02(r11)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d3
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d3
            int r0 = r9.A0B()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d3
            int r0 = r9.A0A()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d3
            X.8EN r15 = new X.8EN
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r11
            r22 = r13
            r23 = r14
            r15.<init>(r16, r17, r18, r19, r20, r22, r23)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.A01(r6, r15, r0, r14)
        L_0x0073:
            return
        L_0x0074:
            if (r29 == 0) goto L_0x0073
            X.8nV r2 = r9.A09
            X.7Y3 r0 = r9.A0H
            X.8lf r0 = r0.A0B
            long r0 = r0.Avw()
            long r0 = r2.D7K(r0)
            float r10 = r9.A0H(r11, r0)
            boolean r0 = java.lang.Float.isInfinite(r10)
            if (r0 != 0) goto L_0x0073
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 != 0) goto L_0x0073
            int r1 = r7.A00
            int r0 = X.C86104wH.A0B(r7)
            if (r1 == r0) goto L_0x00b1
            int r0 = java.lang.Float.floatToIntBits(r10)
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            r0 = 0
            long r0 = r0 | r2
            long r2 = X.AnonymousClass84G.A00(r7)
            int r0 = X.C98276Ew.A00(r2, r0)
            if (r0 <= 0) goto L_0x0073
        L_0x00b1:
            r14 = 0
            if (r6 != 0) goto L_0x0108
        L_0x00b4:
            r0 = r9
            r1 = r7
            r2 = r8
            r3 = r11
            r5 = r13
            r6 = r14
            r0.A0V(r1, r2, r3, r5, r6)
            return
        L_0x00be:
            X.7YG r6 = A02(r9, r1)
        L_0x00c2:
            if (r6 == 0) goto L_0x0019
            int r1 = r6.A00
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0019
            int r1 = r6.A01
            r1 = r1 & r2
            if (r1 != 0) goto L_0x001a
            if (r6 == r0) goto L_0x0019
            X.7YG r6 = r6.A02
            goto L_0x00c2
        L_0x00d3:
            if (r29 != 0) goto L_0x0111
            r10 = 2139095040(0x7f800000, float:Infinity)
        L_0x00d7:
            boolean r0 = java.lang.Float.isInfinite(r10)
            if (r0 != 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 != 0) goto L_0x0124
            int r1 = r7.A00
            int r0 = X.C86104wH.A0B(r7)
            if (r1 == r0) goto L_0x0108
            int r0 = java.lang.Float.floatToIntBits(r10)
            long r2 = (long) r0
            long r0 = X.C86114wI.A09(r14)
            r4 = 32
            long r2 = r2 << r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            long r2 = X.AnonymousClass84G.A00(r7)
            int r0 = X.C98276Ew.A00(r2, r0)
            if (r0 <= 0) goto L_0x0124
        L_0x0108:
            kotlin.jvm.internal.KtLambdaShape0S0420101_I2 r5 = new kotlin.jvm.internal.KtLambdaShape0S0420101_I2
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14)
            r7.A01(r6, r5, r10, r14)
            return
        L_0x0111:
            X.8nV r2 = r9.A09
            X.7Y3 r0 = r9.A0H
            X.8lf r0 = r0.A0B
            long r0 = r0.Avw()
            long r0 = r2.D7K(r0)
            float r10 = r9.A0H(r11, r0)
            goto L_0x00d7
        L_0x0124:
            A05(r6, r7, r8, r9, r10, r11, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54T.A0W(X.84G, X.8le, long, boolean, boolean):void");
    }

    public final boolean A0X() {
        if (this.A08 != null && this.A0E <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return true;
        }
        AnonymousClass54T r0 = this.A07;
        if (r0 != null) {
            return r0.A0X();
        }
        return false;
    }

    public final float Acr() {
        return this.A0H.A0C.Acr();
    }

    public final float AjK() {
        return this.A0H.A0C.AjK();
    }

    public final long BCI() {
        return this.A02;
    }

    public final boolean BRS() {
        if (this.A0D || this.A0H.A0A == null) {
            return false;
        }
        return true;
    }

    public final boolean BZg() {
        if (this.A08 == null || !BRS()) {
            return false;
        }
        return true;
    }

    public final AnonymousClass69J getLayoutDirection() {
        return this.A0H.A0D;
    }

    public AnonymousClass54T(AnonymousClass7Y3 r3) {
        this.A0H = r3;
        this.A09 = r3.A0C;
        this.A0F = r3.A0D;
    }

    public final float A0H(long j, long j2) {
        float A0B2;
        float A0A2;
        if (((float) A0B()) < AnonymousClass7JK.A02(j2) || ((float) A0A()) < AnonymousClass7JK.A00(j2)) {
            long A0I2 = A0I(j2);
            float A022 = AnonymousClass7JK.A02(A0I2);
            float A002 = AnonymousClass7JK.A00(A0I2);
            float A012 = AnonymousClass7KC.A01(j);
            if (A012 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                A0B2 = -A012;
            } else {
                A0B2 = A012 - ((float) A0B());
            }
            float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A0B2);
            float A023 = AnonymousClass7KC.A02(j);
            if (A023 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                A0A2 = -A023;
            } else {
                A0A2 = A023 - ((float) A0A());
            }
            long A0C2 = C86104wH.A0C(max, Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A0A2));
            if ((A022 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || A002 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) && AnonymousClass7KC.A01(A0C2) <= A022 && AnonymousClass7KC.A02(A0C2) <= A002) {
                return (AnonymousClass7KC.A01(A0C2) * AnonymousClass7KC.A01(A0C2)) + (AnonymousClass7KC.A02(A0C2) * AnonymousClass7KC.A02(A0C2));
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final long A0I(long j) {
        return C86104wH.A0C(Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (AnonymousClass7JK.A02(j) - ((float) A0B())) / 2.0f), Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (AnonymousClass7JK.A00(j) - ((float) A0A())) / 2.0f));
    }

    public final C146508mM B03() {
        if (BRS()) {
            return this.A0H.A0a.A04.A07;
        }
        throw C18180wK.A0a("LayoutCoordinate operations are only valid when isAttached is true");
    }

    public final long Bb0(long j) {
        if (BRS()) {
            AnonymousClass54T r0 = this;
            do {
                j = r0.A0K(j);
                r0 = r0.A07;
            } while (r0 != null);
            return j;
        }
        throw C18180wK.A0a("LayoutCoordinate operations are only valid when isAttached is true");
    }

    public final long Bb2(long j) {
        long Bb0 = Bb0(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) AnonymousClass6F0.A00(this.A0H);
        AndroidComposeView.A08(androidComposeView);
        return AnonymousClass7Hf.A00(androidComposeView.A0m, Bb0);
    }

    public final long DBA(long j) {
        if (BRS()) {
            C146508mM A012 = C115896w5.A01(this);
            AndroidComposeView androidComposeView = (AndroidComposeView) AnonymousClass6F0.A00(this.A0H);
            AndroidComposeView.A08(androidComposeView);
            long A002 = AnonymousClass7Hf.A00(androidComposeView.A0n, j);
            C04220Ms.A0B(A012, 0);
            return Bay(A012, AnonymousClass7KC.A04(A002, A012.Bb0(AnonymousClass7KC.A03)));
        }
        throw C18180wK.A0a("LayoutCoordinate operations are only valid when isAttached is true");
    }
}
