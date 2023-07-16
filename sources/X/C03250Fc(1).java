package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Fc  reason: invalid class name and case insensitive filesystem */
public final class C03250Fc implements LightweightQuickPerformanceLogger {
    public final AtomicReference A00 = new AtomicReference(new AnonymousClass0XK((LightweightQuickPerformanceLogger) null, new ConcurrentLinkedQueue()));
    public final Lock A01;
    public final Lock A02;

    public static void A01(C03250Fc r10, Object obj, String str, TimeUnit timeUnit, int i, int i2, int i3, long j) {
        r10.A02(new AnonymousClass0XH(obj, (Object) null, str, timeUnit, i, i2, i3, j));
    }

    public final boolean isMarkerOn(int i, int i2, boolean z) {
        return z;
    }

    public final MarkerEditor withMarker(int i) {
        return new C11880kx(this, i, 0);
    }

    public static void A00(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, AnonymousClass0XH r13) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = lightweightQuickPerformanceLogger;
        switch (r13.A02) {
            case 0:
                int i = r13.A01;
                Object obj = r13.A04;
                obj.getClass();
                lightweightQuickPerformanceLogger2.markerStartWithCancelPolicy(i, ((Boolean) obj).booleanValue(), r13.A00, r13.A03, r13.A07);
                return;
            case 1:
                int i2 = r13.A01;
                int i3 = r13.A00;
                Object obj2 = r13.A04;
                obj2.getClass();
                lightweightQuickPerformanceLogger2.markerEnd(i2, i3, ((Number) obj2).shortValue(), r13.A03, r13.A07);
                return;
            case 2:
                lightweightQuickPerformanceLogger2.markerPoint(r13.A01, r13.A00, r13.A06, r13.A03, r13.A07);
                return;
            case 3:
                lightweightQuickPerformanceLogger2.markerPoint(r13.A01, r13.A00, r13.A06, (String) r13.A04, r13.A03, r13.A07);
                return;
            case 4:
                lightweightQuickPerformanceLogger.markerAnnotate(r13.A01, r13.A00, r13.A06, (String) r13.A04);
                return;
            case 5:
                int i4 = r13.A01;
                int i5 = r13.A00;
                String str = r13.A06;
                Object obj3 = r13.A04;
                obj3.getClass();
                lightweightQuickPerformanceLogger.markerAnnotate(i4, i5, str, ((Number) obj3).intValue());
                return;
            case 6:
                int i6 = r13.A01;
                int i7 = r13.A00;
                String str2 = r13.A06;
                Object obj4 = r13.A04;
                obj4.getClass();
                lightweightQuickPerformanceLogger.markerAnnotate(i6, i7, str2, ((Boolean) obj4).booleanValue());
                return;
            case 7:
                lightweightQuickPerformanceLogger.markerTag(r13.A01, r13.A00, r13.A06);
                return;
            case 8:
                int i8 = r13.A01;
                int i9 = r13.A00;
                String str3 = r13.A06;
                Object obj5 = r13.A04;
                obj5.getClass();
                lightweightQuickPerformanceLogger2.markerAnnotate(i8, i9, str3, ((Number) obj5).doubleValue());
                return;
            case 9:
                int i10 = r13.A01;
                int i11 = r13.A00;
                String str4 = r13.A06;
                Object obj6 = r13.A04;
                obj6.getClass();
                lightweightQuickPerformanceLogger.markerAnnotate(i10, i11, str4, (String[]) obj6);
                return;
            case 10:
                int i12 = r13.A01;
                int i13 = r13.A00;
                String str5 = r13.A06;
                Object obj7 = r13.A04;
                obj7.getClass();
                lightweightQuickPerformanceLogger.markerAnnotate(i12, i13, str5, (int[]) obj7);
                return;
            case 11:
                int i14 = r13.A01;
                int i15 = r13.A00;
                String str6 = r13.A06;
                Object obj8 = r13.A04;
                obj8.getClass();
                lightweightQuickPerformanceLogger2.markerAnnotate(i14, i15, str6, ((Number) obj8).longValue());
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                lightweightQuickPerformanceLogger.markerDrop(r13.A01, r13.A00);
                return;
            case 13:
                Object obj9 = r13.A04;
                obj9.getClass();
                C11880kx r2 = (C11880kx) obj9;
                MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(r2.A01, r2.A00);
                Iterator it = r2.A02.iterator();
                while (true) {
                    PointEditor pointEditor = null;
                    while (it.hasNext()) {
                        AnonymousClass0XJ r0 = (AnonymousClass0XJ) it.next();
                        switch (r0.A00) {
                            case 0:
                                Object obj10 = r0.A02;
                                obj10.getClass();
                                withMarker.withLevel(((Number) obj10).intValue());
                                break;
                            case 1:
                                withMarker.annotate(r0.A03, (String) r0.A02);
                                break;
                            case 2:
                                String str7 = r0.A03;
                                Object obj11 = r0.A02;
                                obj11.getClass();
                                withMarker.annotate(str7, ((Number) obj11).intValue());
                                break;
                            case 3:
                                String str8 = r0.A03;
                                Object obj12 = r0.A02;
                                obj12.getClass();
                                withMarker.annotate(str8, ((Number) obj12).longValue());
                                break;
                            case 4:
                                String str9 = r0.A03;
                                Object obj13 = r0.A02;
                                obj13.getClass();
                                withMarker.annotate(str9, ((Number) obj13).doubleValue());
                                break;
                            case 5:
                                String str10 = r0.A03;
                                Object obj14 = r0.A02;
                                obj14.getClass();
                                withMarker.annotate(str10, ((Boolean) obj14).booleanValue());
                                break;
                            case 6:
                                String str11 = r0.A03;
                                Object obj15 = r0.A02;
                                obj15.getClass();
                                withMarker.annotate(str11, (String[]) obj15);
                                break;
                            case 7:
                                String str12 = r0.A03;
                                Object obj16 = r0.A02;
                                obj16.getClass();
                                withMarker.annotate(str12, (int[]) obj16);
                                break;
                            case 8:
                                String str13 = r0.A03;
                                Object obj17 = r0.A02;
                                obj17.getClass();
                                withMarker.annotate(str13, (long[]) obj17);
                                break;
                            case 9:
                                String str14 = r0.A03;
                                Object obj18 = r0.A02;
                                obj18.getClass();
                                withMarker.annotate(str14, (double[]) obj18);
                                break;
                            case 10:
                                String str15 = r0.A03;
                                Object obj19 = r0.A02;
                                obj19.getClass();
                                withMarker.annotate(str15, (boolean[]) obj19);
                                break;
                            case 11:
                                withMarker.point(r0.A03, (String) r0.A02, r0.A01);
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                                withMarker.pointWithMetadata(r0.A03, (String) r0.A02, r0.A01);
                                break;
                            case 13:
                                pointEditor = withMarker.pointEditor(r0.A03);
                                break;
                            case 14:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    pointEditor.pointEditingCompleted();
                                }
                            case 15:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    Object obj20 = r0.A02;
                                    obj20.getClass();
                                    pointEditor.pointShouldIncludeMetadata(((Boolean) obj20).booleanValue());
                                    break;
                                }
                            case 16:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    pointEditor.pointCustomTimestamp(r0.A01);
                                    break;
                                }
                            case LangUtils.HASH_SEED /*17*/:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    pointEditor.addPointData(r0.A03, (String) r0.A02);
                                    break;
                                }
                            case 18:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str16 = r0.A03;
                                    Object obj21 = r0.A02;
                                    obj21.getClass();
                                    pointEditor.addPointData(str16, ((Number) obj21).intValue());
                                    break;
                                }
                            case 19:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str17 = r0.A03;
                                    Object obj22 = r0.A02;
                                    obj22.getClass();
                                    pointEditor.addPointData(str17, ((Number) obj22).longValue());
                                    break;
                                }
                            case 20:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str18 = r0.A03;
                                    Object obj23 = r0.A02;
                                    obj23.getClass();
                                    pointEditor.addPointData(str18, ((Number) obj23).floatValue());
                                    break;
                                }
                            case 21:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str19 = r0.A03;
                                    Object obj24 = r0.A02;
                                    obj24.getClass();
                                    pointEditor.addPointData(str19, ((Number) obj24).doubleValue());
                                    break;
                                }
                            case 22:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str20 = r0.A03;
                                    Object obj25 = r0.A02;
                                    obj25.getClass();
                                    pointEditor.addPointData(str20, ((Boolean) obj25).booleanValue());
                                    break;
                                }
                            case 23:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str21 = r0.A03;
                                    Object obj26 = r0.A02;
                                    obj26.getClass();
                                    pointEditor.addPointData(str21, (int[]) obj26);
                                    break;
                                }
                            case 24:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str22 = r0.A03;
                                    Object obj27 = r0.A02;
                                    obj27.getClass();
                                    pointEditor.addPointData(str22, (String[]) obj27);
                                    break;
                                }
                            case 25:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str23 = r0.A03;
                                    Object obj28 = r0.A02;
                                    obj28.getClass();
                                    pointEditor.addPointData(str23, (long[]) obj28);
                                    break;
                                }
                            case Rfc3492Idn.tmax /*26*/:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str24 = r0.A03;
                                    Object obj29 = r0.A02;
                                    obj29.getClass();
                                    pointEditor.addPointData(str24, (float[]) obj29);
                                    break;
                                }
                            case 27:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str25 = r0.A03;
                                    Object obj30 = r0.A02;
                                    obj30.getClass();
                                    pointEditor.addPointData(str25, (double[]) obj30);
                                    break;
                                }
                            case 28:
                                if (pointEditor == null) {
                                    break;
                                } else {
                                    String str26 = r0.A03;
                                    Object obj31 = r0.A02;
                                    obj31.getClass();
                                    pointEditor.addPointData(str26, (boolean[]) obj31);
                                    break;
                                }
                            default:
                                Object obj32 = r0.A02;
                                obj32.getClass();
                                withMarker.setSurviveUserSwitch(((Boolean) obj32).booleanValue());
                                break;
                        }
                    }
                    return;
                }
            case 14:
                Object obj33 = r13.A04;
                obj33.getClass();
                C11870kw r4 = (C11870kw) obj33;
                EventBuilder markEventBuilder = lightweightQuickPerformanceLogger.markEventBuilder(r4.A01, r4.A00, r4.A02);
                Iterator it2 = r4.A03.iterator();
                while (it2.hasNext()) {
                    AnonymousClass0XI r42 = (AnonymousClass0XI) it2.next();
                    switch (r42.A00) {
                        case 0:
                            Object obj34 = r42.A01;
                            obj34.getClass();
                            markEventBuilder.setLevel(((Number) obj34).intValue());
                            break;
                        case 1:
                            Object obj35 = r42.A01;
                            obj35.getClass();
                            markEventBuilder.setActionId(((Number) obj35).shortValue());
                            break;
                        case 2:
                            markEventBuilder.annotate(r42.A02, (String) r42.A01);
                            break;
                        case 3:
                            String str27 = r42.A02;
                            Object obj36 = r42.A01;
                            obj36.getClass();
                            markEventBuilder.annotate(str27, ((Number) obj36).intValue());
                            break;
                        case 4:
                            String str28 = r42.A02;
                            Object obj37 = r42.A01;
                            obj37.getClass();
                            markEventBuilder.annotate(str28, ((Number) obj37).longValue());
                            break;
                        case 5:
                            String str29 = r42.A02;
                            Object obj38 = r42.A01;
                            obj38.getClass();
                            markEventBuilder.annotate(str29, ((Number) obj38).doubleValue());
                            break;
                        case 6:
                            String str30 = r42.A02;
                            Object obj39 = r42.A01;
                            obj39.getClass();
                            markEventBuilder.annotate(str30, ((Boolean) obj39).booleanValue());
                            break;
                        case 7:
                            String str31 = r42.A02;
                            Object obj40 = r42.A01;
                            obj40.getClass();
                            markEventBuilder.annotate(str31, (String[]) obj40);
                            break;
                        case 8:
                            String str32 = r42.A02;
                            Object obj41 = r42.A01;
                            obj41.getClass();
                            markEventBuilder.annotate(str32, (int[]) obj41);
                            break;
                        case 9:
                            String str33 = r42.A02;
                            Object obj42 = r42.A01;
                            obj42.getClass();
                            markEventBuilder.annotate(str33, (long[]) obj42);
                            break;
                        case 10:
                            String str34 = r42.A02;
                            Object obj43 = r42.A01;
                            obj43.getClass();
                            markEventBuilder.annotate(str34, (double[]) obj43);
                            break;
                        default:
                            String str35 = r42.A02;
                            Object obj44 = r42.A01;
                            obj44.getClass();
                            markEventBuilder.annotate(str35, (boolean[]) obj44);
                            break;
                    }
                }
                markEventBuilder.report();
                return;
            case 15:
                int i16 = r13.A01;
                int i17 = r13.A00;
                String str36 = r13.A06;
                Object obj45 = r13.A04;
                obj45.getClass();
                lightweightQuickPerformanceLogger.markerAnnotate(i16, i17, str36, (long[]) obj45);
                return;
            case 16:
                int i18 = r13.A01;
                int i19 = r13.A00;
                String str37 = r13.A06;
                Object obj46 = r13.A04;
                obj46.getClass();
                lightweightQuickPerformanceLogger.markerAnnotate(i18, i19, str37, (boolean[]) obj46);
                return;
            case LangUtils.HASH_SEED /*17*/:
                int i20 = r13.A01;
                int i21 = r13.A00;
                String str38 = r13.A06;
                Object obj47 = r13.A04;
                obj47.getClass();
                lightweightQuickPerformanceLogger.markerAnnotate(i20, i21, str38, (double[]) obj47);
                return;
            case 18:
                int i22 = r13.A01;
                int i23 = r13.A00;
                long j = r13.A03;
                TimeUnit timeUnit = r13.A07;
                Object obj48 = r13.A04;
                obj48.getClass();
                lightweightQuickPerformanceLogger2.markerStartForUserFlow(i22, i23, j, timeUnit, ((Boolean) obj48).booleanValue());
                return;
            case 19:
                int i24 = r13.A00;
                Object obj49 = r13.A05;
                obj49.getClass();
                lightweightQuickPerformanceLogger.markerEndForUserFlow(r13.A01, (String) r13.A04, i24, ((Number) obj49).shortValue());
                return;
            case 20:
                int i25 = r13.A01;
                int i26 = r13.A00;
                Object obj50 = r13.A04;
                obj50.getClass();
                lightweightQuickPerformanceLogger.markerEndAtPointForUserFlow(i25, i26, ((Number) obj50).shortValue(), r13.A06);
                return;
            case 21:
                lightweightQuickPerformanceLogger.markerDropForUserFlow(r13.A01, r13.A00);
                return;
            case 22:
                long j2 = r13.A03;
                TimeUnit timeUnit2 = r13.A07;
                Object obj51 = r13.A05;
                obj51.getClass();
                lightweightQuickPerformanceLogger2.markerPoint(r13.A01, r13.A00, r13.A06, (String) r13.A04, j2, timeUnit2, ((Number) obj51).intValue());
                return;
            case 23:
                lightweightQuickPerformanceLogger.markerLinkPivot(r13.A01, r13.A00, r13.A06);
                return;
            case 24:
                int i27 = r13.A01;
                int i28 = r13.A00;
                Object obj52 = r13.A04;
                obj52.getClass();
                Object obj53 = r13.A05;
                obj53.getClass();
                lightweightQuickPerformanceLogger.markerAnnotateCrucialForUserFlow(i27, i28, (String) obj52, (String) obj53);
                return;
            case 25:
                int i29 = r13.A01;
                int i30 = r13.A00;
                Object obj54 = r13.A04;
                obj54.getClass();
                boolean booleanValue = ((Boolean) obj54).booleanValue();
                Object obj55 = r13.A05;
                obj55.getClass();
                lightweightQuickPerformanceLogger2.markerStartForUserFlow(i29, i30, booleanValue, ((Number) obj55).longValue());
                return;
            case Rfc3492Idn.tmax /*26*/:
                int i31 = r13.A01;
                int i32 = r13.A00;
                String str39 = r13.A06;
                Object obj56 = r13.A04;
                obj56.getClass();
                boolean booleanValue2 = ((Boolean) obj56).booleanValue();
                Object obj57 = r13.A05;
                obj57.getClass();
                lightweightQuickPerformanceLogger2.markerStartForUserFlow(i31, i32, str39, booleanValue2, ((Number) obj57).longValue());
                return;
            case 27:
                Object obj58 = r13.A05;
                obj58.getClass();
                lightweightQuickPerformanceLogger2.markerStartForUserFlowE2E(r13.A01, r13.A00, r13.A03, r13.A07, (String) r13.A04, ((Boolean) obj58).booleanValue());
                return;
            default:
                int i33 = r13.A01;
                int i34 = r13.A00;
                long j3 = r13.A03;
                TimeUnit timeUnit3 = r13.A07;
                Object obj59 = r13.A04;
                obj59.getClass();
                lightweightQuickPerformanceLogger2.markerStart(i33, i34, j3, timeUnit3, ((Number) obj59).intValue());
                return;
        }
    }

    public final void A02(AnonymousClass0XH r4) {
        Lock lock = this.A02;
        lock.lock();
        try {
            AnonymousClass0XK r1 = (AnonymousClass0XK) this.A00.get();
            r1.getClass();
            ConcurrentLinkedQueue concurrentLinkedQueue = r1.A01;
            if (concurrentLinkedQueue != null) {
                concurrentLinkedQueue.add(r4);
                return;
            }
            lock.unlock();
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = r1.A00;
            if (lightweightQuickPerformanceLogger != null) {
                A00(lightweightQuickPerformanceLogger, r4);
            }
        } finally {
            lock.unlock();
        }
    }

    public final long currentMonotonicTimestamp() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
    }

    public final EventBuilder markEventBuilder(int i, int i2, String str) {
        return new C11870kw(this, str, i, i2);
    }

    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        String str2 = str;
        A02(new AnonymousClass0XH(str2, Integer.valueOf(i3), "", TimeUnit.MILLISECONDS, 24, i, i2, 0));
    }

    public final void markerDrop(int i) {
        A01(this, "", "", TimeUnit.MILLISECONDS, 12, i, 0, 0);
    }

    public final void markerDropForUserFlow(int i, int i2) {
        A01(this, "", "", TimeUnit.MILLISECONDS, 21, i, i2, 0);
    }

    public final void markerLinkPivot(int i, int i2, String str) {
        A01(this, "", str, TimeUnit.MILLISECONDS, 23, i, i2, 0);
    }

    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        A01(this, Boolean.TRUE, "", timeUnit, 0, i, i2, j);
    }

    public final void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        A02(new AnonymousClass0XH(Boolean.valueOf(z), Long.valueOf(j), "", TimeUnit.MILLISECONDS, 25, i, i2, 0));
    }

    public final void markerTag(int i, int i2, String str) {
        A01(this, "", str, TimeUnit.MILLISECONDS, 7, i, i2, 0);
    }

    public C03250Fc() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A02 = reentrantReadWriteLock.readLock();
        this.A01 = reentrantReadWriteLock.writeLock();
    }

    public final void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        A01(this, Short.valueOf(s), "", timeUnit, 1, i, 0, j);
    }

    public final void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        String str2 = str;
        A02(new AnonymousClass0XH(Short.valueOf(s), (Object) null, str2, TimeUnit.MILLISECONDS, 20, i, i2, currentMonotonicTimestamp));
    }

    public final void markerEndForUserFlow(int i, String str, int i2, short s) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        String str2 = str;
        A02(new AnonymousClass0XH(str2, Short.valueOf(s), "", TimeUnit.MILLISECONDS, 19, i, i2, currentMonotonicTimestamp));
    }

    public final void markerStartForUserFlowE2E(int i, int i2, long j, TimeUnit timeUnit, String str, boolean z) {
        String str2 = str;
        A02(new AnonymousClass0XH(str2, Boolean.valueOf(z), "", timeUnit, 27, i, i2, j));
    }

    public final void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        A01(this, Boolean.valueOf(z), "", timeUnit, 0, i, i2, j);
    }

    public final boolean isMarkerOn(int i, boolean z) {
        return z;
    }

    public final void markerAnnotate(int i, int i2, String str, double d) {
        String str2 = str;
        A01(this, Double.valueOf(d), str2, TimeUnit.MILLISECONDS, 8, i, i2, 0);
    }

    public final void markerAnnotate(int i, int i2, String str, int i3) {
        String str2 = str;
        A01(this, Integer.valueOf(i3), str2, TimeUnit.MILLISECONDS, 5, i, i2, 0);
    }

    public final void markerAnnotate(int i, int i2, String str, long j) {
        String str2 = str;
        A01(this, Long.valueOf(j), str2, TimeUnit.MILLISECONDS, 11, i, i2, 0);
    }

    public final void markerAnnotate(int i, int i2, String str, String str2) {
        String str3 = str2;
        A01(this, str3, str, TimeUnit.MILLISECONDS, 4, i, i2, 0);
    }

    public final void markerAnnotate(int i, int i2, String str, boolean z) {
        String str2 = str;
        A01(this, Boolean.valueOf(z), str2, TimeUnit.MILLISECONDS, 6, i, i2, 0);
    }

    public final void markerAnnotate(int i, int i2, String str, double[] dArr) {
        double[] dArr2 = dArr;
        A01(this, dArr2, str, TimeUnit.MILLISECONDS, 17, i, i2, 0);
    }

    public final void markerAnnotate(int i, int i2, String str, int[] iArr) {
        int[] iArr2 = iArr;
        A01(this, iArr2, str, TimeUnit.MILLISECONDS, 10, i, i2, 0);
    }

    public final void markerAnnotate(int i, int i2, String str, long[] jArr) {
        long[] jArr2 = jArr;
        A01(this, jArr2, str, TimeUnit.MILLISECONDS, 15, i, i2, 0);
    }

    public final void markerAnnotate(int i, int i2, String str, String[] strArr) {
        String[] strArr2 = strArr;
        A01(this, strArr2, str, TimeUnit.MILLISECONDS, 9, i, i2, 0);
    }

    public final void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        boolean[] zArr2 = zArr;
        A01(this, zArr2, str, TimeUnit.MILLISECONDS, 16, i, i2, 0);
    }

    public final void markerAnnotate(int i, String str, double d) {
        String str2 = str;
        A01(this, Double.valueOf(d), str2, TimeUnit.MILLISECONDS, 8, i, 0, 0);
    }

    public final void markerAnnotate(int i, String str, int i2) {
        String str2 = str;
        A01(this, Integer.valueOf(i2), str2, TimeUnit.MILLISECONDS, 5, i, 0, 0);
    }

    public final void markerAnnotate(int i, String str, long j) {
        String str2 = str;
        A01(this, Long.valueOf(j), str2, TimeUnit.MILLISECONDS, 11, i, 0, 0);
    }

    public final void markerAnnotate(int i, String str, String str2) {
        String str3 = str2;
        A01(this, str3, str, TimeUnit.MILLISECONDS, 4, i, 0, 0);
    }

    public final void markerAnnotate(int i, String str, boolean z) {
        String str2 = str;
        A01(this, Boolean.valueOf(z), str2, TimeUnit.MILLISECONDS, 6, i, 0, 0);
    }

    public final void markerAnnotate(int i, String str, double[] dArr) {
        double[] dArr2 = dArr;
        A01(this, dArr2, str, TimeUnit.MILLISECONDS, 17, i, 0, 0);
    }

    public final void markerAnnotate(int i, String str, int[] iArr) {
        int[] iArr2 = iArr;
        A01(this, iArr2, str, TimeUnit.MILLISECONDS, 10, i, 0, 0);
    }

    public final void markerAnnotate(int i, String str, long[] jArr) {
        long[] jArr2 = jArr;
        A01(this, jArr2, str, TimeUnit.MILLISECONDS, 15, i, 0, 0);
    }

    public final void markerAnnotate(int i, String str, String[] strArr) {
        String[] strArr2 = strArr;
        A01(this, strArr2, str, TimeUnit.MILLISECONDS, 9, i, 0, 0);
    }

    public final void markerAnnotate(int i, String str, boolean[] zArr) {
        boolean[] zArr2 = zArr;
        A01(this, zArr2, str, TimeUnit.MILLISECONDS, 16, i, 0, 0);
    }

    public final void markerPoint(int i, int i2, String str) {
        String str2 = str;
        A01(this, "", str2, TimeUnit.MILLISECONDS, 2, i, i2, currentMonotonicTimestamp());
    }

    public final void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        A01(this, "", str, timeUnit, 2, i, i2, j);
    }

    public final void markerPoint(int i, int i2, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        A01(this, str4, str3, TimeUnit.MILLISECONDS, 3, i, i2, currentMonotonicTimestamp());
    }

    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str2;
        A01(this, str3, str, timeUnit, 3, i, i2, j);
    }

    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        String str3 = str2;
        A02(new AnonymousClass0XH(str3, Integer.valueOf(i3), str, timeUnit, 22, i, i2, j));
    }

    public final void markerPoint(int i, String str) {
        String str2 = str;
        A01(this, "", str2, TimeUnit.MILLISECONDS, 2, i, 0, currentMonotonicTimestamp());
    }

    public final void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        A01(this, "", str, timeUnit, 2, i, 0, j);
    }

    public final void markerPoint(int i, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        A01(this, str4, str3, TimeUnit.MILLISECONDS, 3, i, 0, currentMonotonicTimestamp());
    }

    public final void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str2;
        A01(this, str3, str, timeUnit, 3, i, 0, j);
    }

    public final EventBuilder markEventBuilder(int i, String str) {
        return new C11870kw(this, str, i, 0);
    }

    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        A02(new AnonymousClass0XH(str, str2, "", TimeUnit.MILLISECONDS, 24, i, i2, 0));
    }

    public final void markerDrop(int i, int i2) {
        A01(this, "", "", TimeUnit.MILLISECONDS, 12, i, i2, 0);
    }

    public final void markerEnd(int i, int i2, short s) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        A01(this, Short.valueOf(s), "", TimeUnit.MILLISECONDS, 1, i, i2, currentMonotonicTimestamp);
    }

    public final void markerEndForUserFlow(int i, int i2, short s) {
        markerEndForUserFlow(i, (String) null, i2, s);
    }

    public final void markerStart(int i, String str, String str2) {
        markerStart(i);
        markerAnnotate(i, str, str2);
    }

    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        String str2 = str;
        A02(new AnonymousClass0XH(Boolean.valueOf(z), Long.valueOf(j), str2, TimeUnit.MILLISECONDS, 26, i, i2, 0));
    }

    public final void markerTag(int i, String str) {
        A01(this, "", str, TimeUnit.MILLISECONDS, 7, i, 0, 0);
    }

    public final MarkerEditor withMarker(int i, int i2) {
        return new C11880kx(this, i, i2);
    }

    public final void markerEnd(int i, short s) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        A01(this, Short.valueOf(s), "", TimeUnit.MILLISECONDS, 1, i, 0, currentMonotonicTimestamp);
    }

    public final void markerStart(int i, int i2) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        A01(this, Boolean.TRUE, "", TimeUnit.MILLISECONDS, 0, i, i2, currentMonotonicTimestamp);
    }

    public final void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        A01(this, Boolean.valueOf(z), "", timeUnit, 18, i, i2, j);
    }

    public final void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        A01(this, Short.valueOf(s), "", timeUnit, 1, i, i2, j);
    }

    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        A01(this, Integer.valueOf(i3), "", timeUnit, 28, i, i2, j);
    }

    public final void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, i2, j, timeUnit);
        markerAnnotate(i, i2, str, str2);
    }

    public final void markerStart(int i) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        A01(this, Boolean.TRUE, "", TimeUnit.MILLISECONDS, 0, i, 0, currentMonotonicTimestamp);
    }

    public final void markerStart(int i, int i2, String str, String str2) {
        markerStart(i, i2);
        markerAnnotate(i, i2, str, str2);
    }
}
