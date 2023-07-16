package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.7hp  reason: invalid class name and case insensitive filesystem */
public final class C127857hp implements Mcm {
    public final AnonymousClass3HX A00;
    public final C127397h3 A01;
    public final List A02;

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C111326n9 r0;
        AnonymousClass7QF r02;
        C34846IgV igV;
        int i;
        Runnable runnable;
        AnonymousClass7QF r03;
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C127397h3 A0Q = C86154wM.A0Q(list, i2);
            AnonymousClass794.A00();
            AnonymousClass3HX r7 = this.A00;
            C127397h3 r1 = this.A01;
            int i3 = A0Q.A03;
            if (C122117Ki.A0D(i3)) {
                View view = (View) obj;
                if (i3 == 13337) {
                    if (C18220wO.A0o(A0Q) != null) {
                        AnonymousClass7QG r2 = (AnonymousClass7QG) AnonymousClass7K7.A04(r7, A0Q);
                        r2.A03 = null;
                        ((C111326n9) AnonymousClass7K7.A04(r7, r1)).A0O.A02.remove(r2);
                    }
                } else if (i3 == 13313) {
                    C108126hr r9 = (C108126hr) AnonymousClass7K7.A04(r7, A0Q);
                    if (r9 != null) {
                        C006702y.A0C(view, (C003201n) null);
                        view.setImportantForAccessibility(r9.A00.intValue());
                        view.setFocusable(r9.A01);
                        AnonymousClass6Q0.A00(r7, r1, A0Q.A0R(45));
                    }
                } else if (i3 == 14001) {
                    C111176mu r92 = (C111176mu) AnonymousClass7K7.A04(r7, A0Q);
                    if (r92 != null) {
                        C006702y.A0C(view, (C003201n) null);
                        view.setContentDescription(r92.A03);
                        view.setImportantForAccessibility(r92.A00.intValue());
                        view.setAccessibilityLiveRegion(r92.A01.intValue());
                        view.setFocusable(r92.A05);
                        view.setSelected(r92.A08);
                        view.setEnabled(r92.A04);
                        C006702y.A0G(view, r92.A06);
                        C006702y.A0H(view, r92.A07);
                        if (r92.A09) {
                            view.setOnClickListener((View.OnClickListener) null);
                        }
                        AnonymousClass6Q0.A00(r7, r1, A0Q.A0R(56));
                        view.setLabelFor(-1);
                    }
                } else if (i3 == 13688) {
                    C130697qc r10 = (C130697qc) AnonymousClass7K7.A04(r7, A0Q);
                    if (r10 == null) {
                        C30967GcS.A02("ViewTransformsExtensionBinderUtils", "Null controller while binding ViewTransformsExtension");
                    } else {
                        r10.A0D = false;
                        view.getViewTreeObserver().removeOnPreDrawListener(r10.A0C);
                        r10.A0B = null;
                        view.setAlpha(1.0f);
                        view.setRotation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        view.setRotationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        view.setRotationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        float f = C18230wP.A0E(r7.A00).density;
                        view.setCameraDistance(f * f * (-1280.0f) * AnonymousClass6YK.A00);
                        view.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        view.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        if (r10.A0E) {
                            view.resetPivot();
                        }
                    }
                } else {
                    if (i3 == 13566) {
                        i = R.id.testing_id_view_tag_key;
                    } else if (i3 == 16310) {
                        AnonymousClass6X5.A00.post(((C112796qD) AnonymousClass7K7.A03(r7, A0Q)).A02);
                    } else {
                        if (i3 != 15833) {
                            if (i3 == 13774) {
                                C106986fx r22 = (C106986fx) AnonymousClass7K7.A04(r7, A0Q);
                                if (r22 != null) {
                                    C122367Ro r12 = r22.A00;
                                    if (r12 == null) {
                                        r22.A01 = false;
                                    } else {
                                        r22.A01 = r12.A00;
                                        r12.A03.clear();
                                        ViewTreeObserver viewTreeObserver = r12.A02.getViewTreeObserver();
                                        if (viewTreeObserver != null) {
                                            viewTreeObserver.removeOnGlobalLayoutListener(r12);
                                        }
                                        r22.A00 = null;
                                    }
                                }
                            } else if (i3 == 13914) {
                                C109326jp A0L = A0Q.A0L(43);
                                if (A0L != null) {
                                    C122047Jt.A07(r7, A0Q, C86124wJ.A0d(r1), A0L);
                                }
                            } else if (i3 != 13981) {
                                if (!(i3 == 15909 || i3 == 16493)) {
                                    if (i3 == 13762) {
                                        C104266bV r04 = (C104266bV) AnonymousClass7K7.A04(r7, A0Q);
                                        if (r04 != null) {
                                            view.removeOnLayoutChangeListener(r04.A00);
                                        }
                                    } else if (i3 == 16123) {
                                        C104296bY r05 = (C104296bY) AnonymousClass7K7.A04(r7, A0Q);
                                        if (r05 != null) {
                                            r05.A00.A0B((RecyclerView) null);
                                        }
                                        AnonymousClass6DL.A02 = null;
                                    } else if (i3 == 16409) {
                                        ((C113306r8) AnonymousClass7K7.A03(r7, A0Q)).A01();
                                    } else if (i3 == 16485) {
                                        C04220Ms.A0B(view, 0);
                                        C10300i6 r06 = ((C130667qT) r7.A02).A06;
                                        C04220Ms.A06(r06);
                                        C37235Jn1 A002 = C37235Jn1.A00(r06);
                                        C04220Ms.A06(A002);
                                        A002.A03.A02.remove(view);
                                    } else if (i3 == 16375) {
                                        continue;
                                    } else if (i3 == 13768) {
                                        AnonymousClass7QC r23 = (AnonymousClass7QC) AnonymousClass7K7.A04(r7, A0Q);
                                        if (r23 != null) {
                                            C111326n9 r07 = (C111326n9) AnonymousClass7K7.A04(r7, r1);
                                            if (!(r07 == null || (r03 = r07.A0O) == null)) {
                                                r03.A02.remove(r23);
                                            }
                                            r23.A02 = null;
                                            r23.A00 = null;
                                            r23.A03 = null;
                                            r23.A01 = null;
                                        }
                                    } else {
                                        if (i3 == 13656) {
                                            C04220Ms.A0B(view, 0);
                                            runnable = (Runnable) view.getTag(R.id.render_lifecycle_extension_runnable);
                                        } else if (i3 == 16529) {
                                            C04220Ms.A0B(view, 0);
                                            runnable = ((C106996fy) AnonymousClass7K7.A03(r7, A0Q)).A00;
                                        } else if (i3 == 16515) {
                                            C04220Ms.A0B(view, 0);
                                            i = R.id.bk_extension_viewtag_int;
                                        } else if (i3 == 13712) {
                                            view.setOnTouchListener((View.OnTouchListener) null);
                                            I53 i53 = ((C105676do) AnonymousClass7K7.A03(r7, A0Q)).A00;
                                            if (i53 != null) {
                                                i53.dismiss();
                                            }
                                        } else if (i3 == 13627) {
                                            AnonymousClass47I r8 = (AnonymousClass47I) AnonymousClass7K7.A04(r7, A0Q);
                                            C63913ic.A0P(r7, r8);
                                            C61683Uw r08 = r8.A03;
                                            if (r08 != null) {
                                                r08.A01();
                                                r8.A03 = null;
                                            }
                                            L5D l5d = r8.A01;
                                            if (l5d != null) {
                                                AnonymousClass3LY.A00(C63913ic.A0E(r7)).A02(l5d, AnonymousClass46P.class);
                                                r8.A01 = null;
                                            }
                                        } else if (i3 == 13748) {
                                            continue;
                                        } else if (i3 == 13383) {
                                            C27898Ev9 cast = C27898Ev9.class.cast(((SparseArray) r7.A00(R.id.bloks_ig_object_store_deprecated)).get(R.id.main_feed_scroll_listenable));
                                            C105686dp r13 = (C105686dp) AnonymousClass7K7.A04(r7, A0Q);
                                            if (!(cast == null || r13 == null || (igV = r13.A00) == null)) {
                                                cast.D8M(igV);
                                                r13.A00 = null;
                                            }
                                        } else if (i3 == 13615) {
                                            C110426lf r24 = (C110426lf) AnonymousClass7K7.A04(r7, A0Q);
                                            if (r24 != null) {
                                                if (r24.A02 != null) {
                                                    C111326n9 r09 = (C111326n9) AnonymousClass7K7.A04(r7, r1);
                                                    if (r09 == null) {
                                                        C10450iM.A03("text_input_missing_controller", "TextInput binder should create a TextInputUIState controller");
                                                    } else {
                                                        AnonymousClass7QF r010 = r09.A0O;
                                                        if (r010 != null) {
                                                            r010.A02.remove(r24.A02);
                                                        }
                                                    }
                                                }
                                                r24.A03 = null;
                                                r24.A04 = null;
                                            } else {
                                                throw C18250wR.A0V("TextInputCurrencyFormatterExtensionBinder defines a controller but none was found");
                                            }
                                        } else if (i3 == 13638) {
                                            C117986zZ.A01(view, r7, A0Q);
                                        } else if (i3 == 13713) {
                                            C110436lg r25 = (C110436lg) AnonymousClass7K7.A04(r7, A0Q);
                                            if (r25 != null) {
                                                if (!(r25.A02 == null || (r0 = (C111326n9) AnonymousClass7K7.A04(r7, r1)) == null || (r02 = r0.A0O) == null)) {
                                                    r02.A02.remove(r25.A02);
                                                }
                                                r25.A03 = null;
                                                r25.A04 = null;
                                            } else {
                                                throw C18250wR.A0V("TextInputNumberFormatterExtensionBinder defines a controller but none was found");
                                            }
                                        } else if (i3 == 13565) {
                                            continue;
                                        } else if (i3 == 13394) {
                                            if (AnonymousClass7K7.A04(r7, A0Q) != null) {
                                                C32017H1d.A00(view, r7, A0Q, r1);
                                            } else {
                                                throw C18250wR.A0V("Extension defines a controller but none was found");
                                            }
                                        } else if (i3 == 13538) {
                                            C145488ka r011 = (C145488ka) AnonymousClass7K7.A04(r7, A0Q);
                                            if (r011 != null) {
                                                r011.D84(view, r7, A0Q, r1);
                                            } else {
                                                throw C18250wR.A0V("Extension defines a controller but none was found");
                                            }
                                        } else {
                                            throw C18190wL.A0a(String.format("No implementation bound to key: %s", C18210wN.A1X(i3)));
                                        }
                                        if (runnable != null) {
                                            view.removeCallbacks(runnable);
                                        }
                                    }
                                }
                            }
                        }
                        view.setOnTouchListener((View.OnTouchListener) null);
                    }
                    view.setTag(i, (Object) null);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v102, resolved type: X.7QC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v104, resolved type: X.7QG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v105, resolved type: X.7QC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v106, resolved type: X.7QC} */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0795, code lost:
        if (r1 != false) goto L_0x070c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AAO(android.content.Context r28, java.lang.Object r29, java.lang.Object r30, java.lang.Object r31) {
        /*
            r27 = this;
            r26 = r27
            r0 = r26
            java.util.List r0 = r0.A02
            r25 = r0
            int r16 = r25.size()
            r2 = 0
        L_0x000d:
            r0 = r16
            if (r2 >= r0) goto L_0x094a
            r0 = r25
            X.7h3 r6 = X.C86154wM.A0Q(r0, r2)
            X.AnonymousClass794.A00()
            r0 = r26
            X.3HX r5 = r0.A00
            X.7h3 r4 = r0.A01
            int r1 = r6.A03
            boolean r0 = X.C122117Ki.A0D(r1)
            if (r0 == 0) goto L_0x005e
            r3 = r29
            android.view.View r3 = (android.view.View) r3
            r0 = 13337(0x3419, float:1.8689E-41)
            if (r1 != r0) goto L_0x007a
            android.widget.EditText r3 = (android.widget.EditText) r3
            java.lang.String r7 = X.C18220wO.A0o(r6)
            if (r7 == 0) goto L_0x005e
            java.lang.Object r1 = X.AnonymousClass7K7.A04(r5, r6)
            X.7QG r1 = (X.AnonymousClass7QG) r1
            r1.A03 = r3
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x0061
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0061
        L_0x004a:
            java.lang.Object r3 = X.AnonymousClass7K7.A04(r5, r4)
            X.6n9 r3 = (X.C111326n9) r3
            X.7QF r0 = r3.A0O
        L_0x0052:
            java.util.List r0 = r0.A02
            r0.remove(r1)
            X.7QF r0 = r3.A0O
            java.util.List r0 = r0.A02
            r0.add(r1)
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0061:
            r1.A04 = r7
            X.AnonymousClass7QG.A00(r1)
            android.widget.EditText r0 = r1.A03
            if (r0 == 0) goto L_0x004a
            android.text.Editable r0 = r0.getEditableText()
            if (r0 == 0) goto L_0x004a
            android.widget.EditText r0 = r1.A03
            android.text.Editable r0 = r0.getEditableText()
            r1.afterTextChanged(r0)
            goto L_0x004a
        L_0x007a:
            r0 = 13313(0x3401, float:1.8655E-41)
            if (r1 != r0) goto L_0x00ea
            java.lang.Object r1 = X.AnonymousClass7K7.A04(r5, r6)
            X.6hr r1 = (X.C108126hr) r1
            if (r1 == 0) goto L_0x005e
            int r0 = r3.getImportantForAccessibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            boolean r0 = r3.isFocusable()
            r1.A01 = r0
            r9 = 1
            r0 = 35
            java.lang.Object r0 = X.C127397h3.A0A(r6, r0)
            boolean r0 = X.AnonymousClass2LL.A00(r0, r9)
            r8 = 0
            if (r0 != 0) goto L_0x00e8
            r0 = 2
            r3.setImportantForAccessibility(r0)
            r7 = 0
        L_0x00a9:
            java.lang.String r1 = X.C18230wP.A0o(r6)
            java.lang.String r0 = X.C127397h3.A0B(r6)
            if (r1 != 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00b6
        L_0x00b5:
            r8 = 1
        L_0x00b6:
            r7 = r7 | r8
            if (r7 == 0) goto L_0x00bf
            r3.setImportantForAccessibility(r9)
            r3.setFocusable(r9)
        L_0x00bf:
            X.55a r0 = new X.55a
            r0.<init>(r6)
            X.C006702y.A0C(r3, r0)
            r0 = 45
        L_0x00c9:
            java.util.List r3 = r6.A0R(r0)
            if (r3 == 0) goto L_0x005e
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x005e
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            X.82W r0 = new X.82W
            r0.<init>(r5, r4, r3)
            r1.post(r0)
            goto L_0x005e
        L_0x00e8:
            r7 = 1
            goto L_0x00a9
        L_0x00ea:
            r0 = 14001(0x36b1, float:1.962E-41)
            if (r1 != r0) goto L_0x0280
            java.lang.Object r14 = X.AnonymousClass7K7.A04(r5, r6)
            X.6mu r14 = (X.C111176mu) r14
            if (r14 == 0) goto L_0x005e
            java.lang.CharSequence r0 = r3.getContentDescription()
            java.lang.String r0 = (java.lang.String) r0
            r14.A03 = r0
            int r0 = r3.getImportantForAccessibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.A00 = r0
            int r0 = r3.getAccessibilityLiveRegion()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.A01 = r0
            boolean r0 = r3.isFocusable()
            r14.A05 = r0
            boolean r0 = r3.isSelected()
            r14.A08 = r0
            boolean r0 = r3.isEnabled()
            r14.A04 = r0
            boolean r0 = X.C006702y.A0I(r3)
            r14.A06 = r0
            boolean r0 = X.C006702y.A0J(r3)
            r14.A07 = r0
            X.55j r0 = new X.55j
            r0.<init>(r5, r6, r4)
            X.C006702y.A0C(r3, r0)
            java.lang.String r0 = r14.A03
            r13 = 35
            java.lang.String r12 = r6.A0O(r13, r0)
            java.util.Map r1 = X.C103586Zt.A00
            java.lang.String r0 = X.C127397h3.A0E(r6)
            java.lang.Number r0 = X.C86124wJ.A0j(r0, r1)
            java.util.Map r8 = X.C103586Zt.A01
            r7 = 44
            android.util.SparseArray r1 = r6.A04
            java.lang.String r1 = X.C86114wI.A0m(r1, r7)
            java.lang.Number r1 = X.C86124wJ.A0j(r1, r8)
            boolean r8 = r14.A05
            r7 = 40
            java.lang.Object r7 = X.C127397h3.A0A(r6, r7)
            boolean r22 = X.AnonymousClass2LL.A00(r7, r8)
            boolean r8 = r14.A08
            r7 = 49
            java.lang.Object r7 = X.C127397h3.A0A(r6, r7)
            boolean r21 = X.AnonymousClass2LL.A00(r7, r8)
            boolean r8 = r14.A04
            r7 = 38
            java.lang.Object r7 = X.C127397h3.A0A(r6, r7)
            boolean r20 = X.AnonymousClass2LL.A00(r7, r8)
            boolean r8 = r14.A06
            r7 = 41
            java.lang.Object r7 = X.C127397h3.A0A(r6, r7)
            boolean r19 = X.AnonymousClass2LL.A00(r7, r8)
            boolean r8 = r14.A07
            r7 = 48
            java.lang.Object r7 = X.C127397h3.A0A(r6, r7)
            boolean r15 = X.AnonymousClass2LL.A00(r7, r8)
            r7 = 43
            java.lang.Object r11 = X.C127397h3.A0A(r6, r7)
            r7 = 55
            java.util.List r8 = r6.A0R(r7)
            if (r8 == 0) goto L_0x0202
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L_0x0202
            java.util.Iterator r18 = r8.iterator()
        L_0x01ac:
            boolean r7 = r18.hasNext()
            if (r7 == 0) goto L_0x0202
            java.lang.Object r8 = r18.next()
            X.7h3 r8 = (X.C127397h3) r8
            android.util.SparseArray r7 = r8.A04
            java.lang.String r9 = X.C86114wI.A0m(r7, r13)
            r7 = 38
            X.6jp r17 = r8.A0L(r7)
            if (r9 == 0) goto L_0x01ac
            java.util.Map r8 = X.C879355j.A05
            boolean r7 = r8.containsKey(r9)
            if (r7 == 0) goto L_0x01ac
            java.lang.Object r7 = r8.get(r9)
            int r10 = X.AnonymousClass0wJ.A04(r7)
            java.lang.String r7 = "click"
            java.lang.Object r7 = r8.get(r7)
            X.AnonymousClass0SJ.A00(r7)
            int r9 = X.AnonymousClass0wJ.A04(r7)
            java.lang.String r7 = "long_click"
            java.lang.Object r7 = r8.get(r7)
            X.AnonymousClass0SJ.A00(r7)
            int r8 = X.AnonymousClass0wJ.A04(r7)
            r7 = 1
            if (r10 == r9) goto L_0x01ac
            if (r10 != r8) goto L_0x01ac
            if (r17 == 0) goto L_0x01ac
            r14.A09 = r7
            X.7Ra r7 = new X.7Ra
            r7.<init>(r8)
            r3.setOnLongClickListener(r7)
            goto L_0x01ac
        L_0x0202:
            java.lang.String r8 = r14.A02
            r3.setContentDescription(r12)
            r14.A02 = r12
            if (r1 == 0) goto L_0x0211
            int r7 = r1.intValue()
            if (r7 != 0) goto L_0x023c
        L_0x0211:
            boolean r7 = android.text.TextUtils.isEmpty(r12)
            if (r7 != 0) goto L_0x023c
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto L_0x023c
            boolean r7 = r12.equals(r8)
            if (r7 != 0) goto L_0x023c
            boolean r7 = r3.isAccessibilityFocused()
            if (r7 == 0) goto L_0x023c
            android.view.accessibility.AccessibilityEvent r8 = android.view.accessibility.AccessibilityEvent.obtain()
            r7 = 2048(0x800, float:2.87E-42)
            r8.setEventType(r7)
            r7 = 4
            r8.setContentChangeTypes(r7)
            r8.setContentDescription(r12)
            r3.sendAccessibilityEventUnchecked(r8)
        L_0x023c:
            if (r0 != 0) goto L_0x0240
            java.lang.Integer r0 = r14.A00
        L_0x0240:
            int r0 = r0.intValue()
            r3.setImportantForAccessibility(r0)
            if (r1 != 0) goto L_0x024b
            java.lang.Integer r1 = r14.A01
        L_0x024b:
            int r0 = r1.intValue()
            r3.setAccessibilityLiveRegion(r0)
            r0 = r22
            r3.setFocusable(r0)
            if (r11 == 0) goto L_0x026a
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            X.82X r0 = new X.82X
            r0.<init>(r3, r5, r11)
            r1.post(r0)
        L_0x026a:
            r0 = r21
            r3.setSelected(r0)
            r0 = r20
            r3.setEnabled(r0)
            r0 = r19
            X.C006702y.A0G(r3, r0)
            X.C006702y.A0H(r3, r15)
            r0 = 56
            goto L_0x00c9
        L_0x0280:
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r1 != r0) goto L_0x0295
            java.lang.Object r4 = X.AnonymousClass7K7.A04(r5, r6)
            X.7qc r4 = (X.C130697qc) r4
            if (r4 != 0) goto L_0x0898
            java.lang.String r0 = "ViewTransformsExtensionBinderUtils"
            java.lang.String r1 = "Null controller while binding ViewTransformsExtension"
        L_0x0290:
            X.C30967GcS.A02(r0, r1)
            goto L_0x005e
        L_0x0295:
            r0 = 13566(0x34fe, float:1.901E-41)
            if (r1 != r0) goto L_0x02a5
            r1 = 2131307976(0x7f092dc8, float:1.8234195E38)
            java.lang.String r0 = X.C18220wO.A0o(r6)
        L_0x02a0:
            r3.setTag(r1, r0)
            goto L_0x005e
        L_0x02a5:
            r0 = 16310(0x3fb6, float:2.2855E-41)
            if (r1 != r0) goto L_0x02f8
            java.lang.Object r9 = X.AnonymousClass7K7.A03(r5, r6)
            X.6qD r9 = (X.C112796qD) r9
            android.os.Handler r1 = X.AnonymousClass6X5.A00
            java.lang.Runnable r0 = r9.A02
            r1.removeCallbacks(r0)
            r0 = 41
            java.lang.Object r8 = X.C127397h3.A0A(r6, r0)
            r7 = 1
            r0 = 42
            java.lang.Object r0 = X.C127397h3.A0A(r6, r0)
            boolean r1 = X.AnonymousClass2LL.A00(r0, r7)
            boolean r0 = r9.A01
            r4 = 0
            if (r0 != 0) goto L_0x02ce
            if (r1 == 0) goto L_0x02f4
        L_0x02ce:
            java.lang.Object r0 = r9.A00
            boolean r0 = X.C100986Pl.A00(r8, r0)
            if (r0 != 0) goto L_0x02f4
            r9.A00()
            X.6jp r3 = X.C18230wP.A0V(r6)
            if (r3 == 0) goto L_0x02f2
            X.3VO r1 = X.AnonymousClass3VO.A00()
            r1.A02(r5, r4)
            java.lang.Object r0 = r9.A00
            r1.A02(r0, r7)
            r0 = 2
            r1.A02(r8, r0)
            X.C122047Jt.A07(r5, r6, r1, r3)
        L_0x02f2:
            r9.A00 = r8
        L_0x02f4:
            r9.A01 = r7
            goto L_0x005e
        L_0x02f8:
            r0 = 15833(0x3dd9, float:2.2187E-41)
            if (r1 != r0) goto L_0x0329
            X.6pS r8 = new X.6pS
            r8.<init>(r3)
            X.509 r7 = new X.509
            r9 = r7
            r10 = r3
            r11 = r8
            r12 = r5
            r13 = r6
            r14 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            android.content.Context r0 = r5.A00
            android.view.GestureDetector r5 = new android.view.GestureDetector
            r5.<init>(r0, r7)
            android.view.ScaleGestureDetector r4 = new android.view.ScaleGestureDetector
            r4.<init>(r0, r7)
            r0 = 0
            r4.setQuickScaleEnabled(r0)
            r4.setStylusScaleEnabled(r0)
            X.7Rh r1 = new X.7Rh
            r1.<init>(r5, r4, r8, r7)
        L_0x0324:
            r3.setOnTouchListener(r1)
            goto L_0x005e
        L_0x0329:
            r0 = 13774(0x35ce, float:1.9301E-41)
            if (r1 != r0) goto L_0x0362
            java.lang.Object r8 = X.AnonymousClass7K7.A04(r5, r6)
            X.6fx r8 = (X.C106986fx) r8
            if (r8 == 0) goto L_0x005e
            X.7Ro r0 = r8.A00
            if (r0 != 0) goto L_0x005e
            android.content.Context r7 = r5.A00
            android.app.Activity r1 = X.AnonymousClass3ZR.A00(r7)
            if (r1 == 0) goto L_0x035d
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r0)
        L_0x0348:
            boolean r0 = r8.A01
            X.7Ro r3 = new X.7Ro
            r3.<init>(r1, r0)
            X.6kN r1 = new X.6kN
            r1.<init>(r7, r5, r6, r4)
            java.util.List r0 = r3.A03
            r0.add(r1)
            r8.A00 = r3
            goto L_0x005e
        L_0x035d:
            android.view.View r1 = r3.getRootView()
            goto L_0x0348
        L_0x0362:
            r0 = 13914(0x365a, float:1.9498E-41)
            if (r1 != r0) goto L_0x03a0
            java.lang.Object r1 = X.AnonymousClass7K7.A04(r5, r6)
            X.6ba r1 = (X.C104316ba) r1
            boolean r0 = r1.A00
            r7 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0389
            r1.A00 = r3
            r0 = 41
            X.6jp r1 = r6.A0L(r0)
            if (r1 == 0) goto L_0x0389
            X.3VO r0 = X.AnonymousClass3VO.A00()
            r0.A03(r4, r7)
            r0.A03(r5, r3)
            X.C122047Jt.A07(r5, r6, r0, r1)
        L_0x0389:
            r0 = 42
            X.6jp r1 = r6.A0L(r0)
            if (r1 == 0) goto L_0x005e
            X.3VO r0 = X.AnonymousClass3VO.A00()
            r0.A03(r4, r7)
            r0.A03(r5, r3)
            X.C122047Jt.A07(r5, r6, r0, r1)
            goto L_0x005e
        L_0x03a0:
            r0 = 13981(0x369d, float:1.9592E-41)
            if (r1 != r0) goto L_0x03ab
            X.7Rg r1 = new X.7Rg
            r1.<init>(r5, r6, r4)
            goto L_0x0324
        L_0x03ab:
            r0 = 15909(0x3e25, float:2.2293E-41)
            if (r1 != r0) goto L_0x03d9
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            r8 = 1
            X.0i6 r4 = X.C63913ic.A0E(r5)
            boolean r1 = r4.isLoggedIn()
            java.lang.String r0 = "CXF_CPDP"
            if (r1 == 0) goto L_0x05ec
            r11 = 35
            r1 = -1
            int r10 = r6.A0H(r11, r1)
            if (r10 == r1) goto L_0x05e8
            com.instagram.service.session.UserSession r9 = X.C05030Qo.A02(r4)
            r7 = 40
            X.7h3 r4 = r6.A0K(r7)
            if (r4 != 0) goto L_0x059d
            java.lang.String r1 = "Attempt to onAutomatedLoggingExtension with a null tracking_data_generator"
            goto L_0x0290
        L_0x03d9:
            r0 = 16493(0x406d, float:2.3112E-41)
            if (r1 != r0) goto L_0x041e
            com.instagram.service.session.UserSession r13 = X.C86134wK.A0a(r5)
            java.lang.String r0 = "IG_IX"
            if (r13 == 0) goto L_0x05ec
            r1 = 35
            r4 = -1
            int r1 = r6.A0H(r1, r4)
            if (r1 == r4) goto L_0x05e8
            long r4 = (long) r1
            java.util.HashMap r12 = X.AnonymousClass0wJ.A0y()
            X.9zx[] r11 = X.C171779zx.values()
            int r10 = r11.length
            r9 = 0
        L_0x03f9:
            if (r9 >= r10) goto L_0x0409
            r8 = r11[r9]
            long r6 = r8.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r12.put(r1, r8)
            int r9 = r9 + 1
            goto L_0x03f9
        L_0x0409:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Object r1 = r12.get(r1)
            X.9zx r1 = (X.C171779zx) r1
            if (r1 != 0) goto L_0x0419
            java.lang.String r1 = "Attempt to reportMediaMetricForView without an extraTrackingNode."
            goto L_0x0290
        L_0x0419:
            X.Jn1 r0 = X.C37235Jn1.A00(r13)
            goto L_0x048a
        L_0x041e:
            r0 = 13762(0x35c2, float:1.9285E-41)
            if (r1 != r0) goto L_0x0431
            int r1 = r4.A03
            r0 = 13323(0x340b, float:1.867E-41)
            if (r1 == r0) goto L_0x0620
            java.lang.String r1 = "invalid_extension_used"
            java.lang.String r0 = "bk.components.AvatarImageExtension should only be used for image components"
            android.util.Log.e(r1, r0)
            goto L_0x005e
        L_0x0431:
            r0 = 16123(0x3efb, float:2.2593E-41)
            if (r1 != r0) goto L_0x0448
            X.AnonymousClass6DL.A02 = r4
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r5, r6)
            X.6bY r0 = (X.C104296bY) r0
            if (r0 == 0) goto L_0x005e
            X.LBD r0 = r0.A00
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r0.A0B(r3)
            goto L_0x005e
        L_0x0448:
            r0 = 16409(0x4019, float:2.2994E-41)
            if (r1 != r0) goto L_0x0457
            java.lang.Object r0 = X.AnonymousClass7K7.A03(r5, r6)
            X.6r8 r0 = (X.C113306r8) r0
            r0.A00()
            goto L_0x005e
        L_0x0457:
            r0 = 16485(0x4065, float:2.31E-41)
            if (r1 != r0) goto L_0x0492
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            r1 = 35
            r0 = -1
            int r8 = r6.A0H(r1, r0)
            X.9zx[] r7 = X.C171779zx.values()
            int r6 = r7.length
            r4 = 0
        L_0x046c:
            if (r4 >= r6) goto L_0x05f0
            r1 = r7[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x048f
            X.4rP r0 = r5.A02
            X.7qT r0 = (X.C130667qT) r0
            X.0i6 r0 = r0.A06
            X.C04220Ms.A06(r0)
            X.Jn1 r0 = X.C37235Jn1.A00(r0)
            X.C04220Ms.A06(r0)
        L_0x048a:
            r0.A06(r3, r1)
            goto L_0x005e
        L_0x048f:
            int r4 = r4 + 1
            goto L_0x046c
        L_0x0492:
            r0 = 16375(0x3ff7, float:2.2946E-41)
            if (r1 != r0) goto L_0x04cd
            java.lang.Class<X.6ik> r3 = X.C108666ik.class
            r1 = 2131307516(0x7f092bfc, float:1.8233262E38)
            r0 = 2131297511(0x7f0904e7, float:1.8212969E38)
            java.lang.Object r0 = r5.A00(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r4 = r3.cast(r0)
            X.6ik r4 = (X.C108666ik) r4
            X.6jp r3 = X.C18230wP.A0V(r6)
            if (r4 == 0) goto L_0x005e
            if (r3 == 0) goto L_0x005e
            r0 = 5
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r1.<init>((X.AnonymousClass3HX) r5, (X.C127397h3) r6, (X.C109326jp) r3, (int) r0)
            android.view.View r0 = r4.A00
            r0.setOnClickListener(r1)
            android.view.View r0 = r4.A02
            r0.setOnClickListener(r1)
            android.view.View r0 = r4.A01
            r0.setOnClickListener(r1)
            goto L_0x005e
        L_0x04cd:
            r0 = 13768(0x35c8, float:1.9293E-41)
            if (r1 != r0) goto L_0x051d
            boolean r0 = r3 instanceof android.widget.EditText
            if (r0 == 0) goto L_0x090f
            android.widget.EditText r3 = (android.widget.EditText) r3
            X.6jp r13 = X.C18230wP.A0V(r6)
            int r1 = r4.A03
            r0 = 13336(0x3418, float:1.8688E-41)
            if (r1 != r0) goto L_0x0505
            if (r13 == 0) goto L_0x0505
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r5, r4)
            X.6n9 r0 = (X.C111326n9) r0
            X.833 r8 = new X.833
            r9 = r3
            r10 = r5
            r11 = r4
            r12 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            android.os.Handler r1 = X.AnonymousClass6X6.A00
            android.os.Looper r0 = r1.getLooper()
            java.lang.Thread r0 = r0.getThread()
            if (r7 != r0) goto L_0x0519
            r8.run()
        L_0x0505:
            X.6jp r0 = X.C127397h3.A08(r6)
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = X.AnonymousClass7K7.A04(r5, r6)
            X.7QC r1 = (X.AnonymousClass7QC) r1
            if (r1 != 0) goto L_0x0653
            java.lang.String r0 = "BKBloksComponentsBKSTextInputFormatterBinderUtil"
            java.lang.String r1 = "Unexpected null ExpressionMask in TextInputFormatterExtension"
            goto L_0x0290
        L_0x0519:
            r1.post(r8)
            goto L_0x0505
        L_0x051d:
            r0 = 13656(0x3558, float:1.9136E-41)
            if (r1 != r0) goto L_0x0545
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            r1 = 2131297519(0x7f0904ef, float:1.8212985E38)
            android.util.SparseArray r0 = r5.A01
            java.lang.Object r0 = r0.get(r1)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            X.4T1 r7 = new X.4T1
            r8 = r3
            r9 = r5
            r10 = r4
            r11 = r6
            r12 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 2131305794(0x7f092542, float:1.8229769E38)
            r3.setTag(r0, r7)
        L_0x0540:
            r3.post(r7)
            goto L_0x005e
        L_0x0545:
            r0 = 16529(0x4091, float:2.3162E-41)
            if (r1 != r0) goto L_0x056b
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            r1 = 2131297519(0x7f0904ef, float:1.8212985E38)
            android.util.SparseArray r0 = r5.A01
            java.lang.Object r1 = r0.get(r1)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r0 = X.AnonymousClass7K7.A03(r5, r6)
            X.6fy r0 = (X.C106996fy) r0
            X.834 r7 = new X.834
            r8 = r0
            r9 = r5
            r10 = r6
            r11 = r4
            r12 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A00 = r7
            goto L_0x0540
        L_0x056b:
            r0 = 16515(0x4083, float:2.3142E-41)
            if (r1 != r0) goto L_0x0583
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            r0 = 35
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r6.A0H(r0, r1)
            if (r0 != r1) goto L_0x0594
            java.lang.String r0 = "BloksViewTagExtension"
            java.lang.String r1 = "ViewTagExtension is used, but no actual tag value is provided or FALLBACK_INT_TAG is found. This redundantly forces parent component for have a View"
            goto L_0x0290
        L_0x0583:
            r0 = 13712(0x3590, float:1.9215E-41)
            if (r1 != r0) goto L_0x0669
            java.lang.Object r0 = X.AnonymousClass7K7.A03(r5, r6)
            X.6do r0 = (X.C105676do) r0
            X.B3P r1 = new X.B3P
            r1.<init>(r0, r5, r6, r4)
            goto L_0x0324
        L_0x0594:
            r1 = 2131297469(0x7f0904bd, float:1.8212884E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x02a0
        L_0x059d:
            java.lang.String r18 = X.C127397h3.A0D(r4)
            java.lang.String r5 = X.C18230wP.A0o(r4)
            android.util.SparseArray r1 = r4.A04
            java.lang.String r12 = X.C86114wI.A0m(r1, r7)
            java.lang.String r22 = X.C127397h3.A0B(r4)
            java.lang.String r24 = X.C86114wI.A0m(r1, r11)
            if (r18 == 0) goto L_0x05d8
            if (r5 == 0) goto L_0x05d8
            if (r22 == 0) goto L_0x05d8
            if (r24 == 0) goto L_0x05d8
            java.lang.Long r7 = X.C18230wP.A0f(r10)
            X.9zx[] r6 = X.C171779zx.values()
            int r4 = r6.length
            r1 = 0
        L_0x05c5:
            if (r1 >= r4) goto L_0x05fa
            r0 = r6[r1]
            long r10 = r0.A00
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            boolean r10 = X.C04220Ms.A0I(r10, r7)
            if (r10 != 0) goto L_0x05fb
            int r1 = r1 + 1
            goto L_0x05c5
        L_0x05d8:
            java.lang.String r17 = "Attempt to onAutomatedLoggingExtension with one of those values null productId: "
            java.lang.String r19 = " , merchantId "
            java.lang.String r21 = " moduleName "
            java.lang.String r23 = " cpdpVersion "
            r20 = r5
            java.lang.String r1 = X.AnonymousClass00U.A0k(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0290
        L_0x05e8:
            java.lang.String r1 = "Attempt to reportMediaMetricForView without a nodeType."
            goto L_0x0290
        L_0x05ec:
            java.lang.String r1 = "Attempt to reportMediaMetricForView without a userSession."
            goto L_0x0290
        L_0x05f0:
            java.lang.String r0 = "Failed to tag view with node type "
            java.lang.String r1 = X.AnonymousClass00U.A0J(r0, r8)
            java.lang.String r0 = "ALLoggingExtension"
            goto L_0x0290
        L_0x05fa:
            r0 = 0
        L_0x05fb:
            X.C04220Ms.A0B(r9, r8)
            X.Jn1 r1 = X.C37235Jn1.A00(r9)
            X.C04220Ms.A06(r1)
            if (r0 == 0) goto L_0x060a
            r1.A06(r3, r0)
        L_0x060a:
            X.BKU r8 = X.C86114wI.A0W(r9, r5)
            X.KE2 r0 = new X.KE2
            r7 = r0
            r9 = r22
            r10 = r18
            r11 = r5
            r13 = r24
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.A0A(r3, r0)
            goto L_0x005e
        L_0x0620:
            r1 = 35
            r0 = 1065353216(0x3f800000, float:1.0)
            float r7 = r6.A0G(r1, r0)
            r1 = 38
            r0 = 0
            float r4 = r6.A0G(r1, r0)
            r3.setScaleX(r7)
            r3.setScaleY(r7)
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r4
            float r0 = r0 * r7
            r3.setTranslationY(r0)
            X.7RW r1 = new X.7RW
            r1.<init>(r7, r4)
            r3.addOnLayoutChangeListener(r1)
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r5, r6)
            X.6bV r0 = (X.C104266bV) r0
            if (r0 == 0) goto L_0x005e
            r0.A00 = r1
            goto L_0x005e
        L_0x0653:
            r1.A02 = r4
            r1.A00 = r3
            r1.A03 = r0
            r1.A01 = r5
            java.lang.Object r3 = X.AnonymousClass7K7.A04(r5, r4)
            X.6n9 r3 = (X.C111326n9) r3
            if (r3 == 0) goto L_0x005e
            X.7QF r0 = r3.A0O
            if (r0 == 0) goto L_0x005e
            goto L_0x0052
        L_0x0669:
            r0 = 13627(0x353b, float:1.9095E-41)
            if (r1 != r0) goto L_0x0672
            X.C33512Fz.A00(r3, r5, r6)
            goto L_0x005e
        L_0x0672:
            r0 = 13748(0x35b4, float:1.9265E-41)
            if (r1 != r0) goto L_0x0686
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r5, r6)
            X.BBt r0 = (X.C19819BBt) r0
            if (r0 == 0) goto L_0x005e
            X.C63913ic.A0P(r5, r0)
            X.C63913ic.A0O(r5, r0)
            goto L_0x005e
        L_0x0686:
            r0 = 13383(0x3447, float:1.8754E-41)
            if (r1 != r0) goto L_0x06c3
            java.lang.Class<X.Ev9> r4 = X.C27898Ev9.class
            r1 = 2131302854(0x7f0919c6, float:1.8223806E38)
            r0 = 2131297511(0x7f0904e7, float:1.8212969E38)
            java.lang.Object r0 = r5.A00(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r7 = r4.cast(r0)
            X.Ev9 r7 = (X.C27898Ev9) r7
            java.lang.Object r4 = X.AnonymousClass7K7.A04(r5, r6)
            X.6dp r4 = (X.C105686dp) r4
            if (r4 == 0) goto L_0x091c
            if (r7 == 0) goto L_0x005e
            X.IgV r0 = r4.A00
            if (r0 == 0) goto L_0x06b3
            r7.D8M(r0)
        L_0x06b3:
            android.graphics.Rect r1 = X.C86134wK.A0D()
            X.62A r0 = new X.62A
            r0.<init>(r1, r3, r5, r6)
            r4.A00 = r0
            r7.CaD(r0)
            goto L_0x005e
        L_0x06c3:
            r0 = 13615(0x352f, float:1.9079E-41)
            if (r1 != r0) goto L_0x079c
            r13 = 0
            X.C04220Ms.A0B(r3, r13)
            java.lang.Object r7 = X.AnonymousClass7K7.A03(r5, r6)
            X.6lf r7 = (X.C110426lf) r7
            android.content.Context r0 = r5.A00
            android.content.res.Configuration r0 = X.C86114wI.A0B(r0)
            java.util.Locale r1 = r0.locale
            X.C04220Ms.A05(r1)
            java.lang.String r0 = X.C18220wO.A0o(r6)
            java.util.Currency r0 = java.util.Currency.getInstance(r0)
            X.C04220Ms.A06(r0)
            java.text.NumberFormat r8 = java.text.NumberFormat.getCurrencyInstance(r1)
            r8.setCurrency(r0)
            r12 = r8
            java.text.DecimalFormat r12 = (java.text.DecimalFormat) r12
            java.text.DecimalFormatSymbols r11 = r12.getDecimalFormatSymbols()
            char r0 = r11.getGroupingSeparator()
            r10 = 32
            r9 = 8239(0x202f, float:1.1545E-41)
            if (r0 != r9) goto L_0x0799
            r11.setGroupingSeparator(r10)
            r1 = 1
        L_0x0703:
            char r0 = r11.getDecimalSeparator()
            if (r0 != r9) goto L_0x0795
            r11.setDecimalSeparator(r10)
        L_0x070c:
            r12.setDecimalFormatSymbols(r11)
        L_0x070f:
            r8.setMaximumFractionDigits(r13)
            r7.A04 = r8
            android.widget.EditText r3 = (android.widget.EditText) r3
            java.lang.CharSequence r0 = r3.getHint()
            if (r0 != 0) goto L_0x0725
            r0 = 0
            java.lang.String r0 = r8.format(r0)
            r3.setHint(r0)
        L_0x0725:
            android.text.Editable r0 = r3.getText()
            if (r0 == 0) goto L_0x0758
            java.lang.String r9 = X.AnonymousClass0wJ.A0n(r3)
            java.lang.String r0 = "\\D"
            X.7yC r1 = X.C18250wR.A0h(r0)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.A01(r9, r0)
            boolean r0 = X.AnonymousClass0hA.A08(r1)
            if (r0 != 0) goto L_0x0758
            double r0 = java.lang.Double.parseDouble(r1)
            java.lang.String r0 = r8.format(r0)
            r3.setText(r0)
            android.text.Editable r0 = r3.getText()
            int r0 = r0.length()
            r7.A01 = r0
            r7.A00 = r0
        L_0x0758:
            int r1 = r7.A01
            r0 = -1
            if (r1 != r0) goto L_0x078f
            android.text.Editable r0 = r3.getText()
            if (r0 == 0) goto L_0x076e
            android.text.Editable r0 = r3.getText()
            int r0 = r0.length()
            r3.setSelection(r0)
        L_0x076e:
            android.text.TextWatcher r0 = r7.A02
            if (r0 == 0) goto L_0x0775
            r3.removeTextChangedListener(r0)
        L_0x0775:
            X.7QD r0 = new X.7QD
            r0.<init>(r5, r6)
            r7.A02 = r0
            r7.A03 = r3
            java.lang.Object r3 = X.AnonymousClass7K7.A04(r5, r4)
            X.6n9 r3 = (X.C111326n9) r3
            if (r3 != 0) goto L_0x0843
            java.lang.String r1 = "text_input_missing_controller"
            java.lang.String r0 = "TextInput binder should create a TextInputUIState controller"
            X.C10450iM.A03(r1, r0)
            goto L_0x005e
        L_0x078f:
            int r0 = r7.A00
            r3.setSelection(r1, r0)
            goto L_0x076e
        L_0x0795:
            if (r1 == 0) goto L_0x070f
            goto L_0x070c
        L_0x0799:
            r1 = 0
            goto L_0x0703
        L_0x079c:
            r0 = 13638(0x3546, float:1.9111E-41)
            if (r1 != r0) goto L_0x07a5
            X.C117986zZ.A00(r3, r5, r6)
            goto L_0x005e
        L_0x07a5:
            r0 = 13713(0x3591, float:1.9216E-41)
            if (r1 != r0) goto L_0x085b
            java.lang.Object r7 = X.AnonymousClass7K7.A04(r5, r6)
            X.6lg r7 = (X.C110436lg) r7
            if (r7 == 0) goto L_0x0923
            android.content.Context r0 = r5.A00
            android.content.res.Configuration r0 = X.C86114wI.A0B(r0)
            java.util.Locale r0 = r0.locale
            java.text.NumberFormat r0 = X.AnonymousClass6OB.A00(r0)
            r7.A04 = r0
            android.widget.EditText r3 = (android.widget.EditText) r3
            java.lang.CharSequence r0 = r3.getHint()
            if (r0 != 0) goto L_0x07d2
            java.text.NumberFormat r8 = r7.A04
            r0 = 0
            java.lang.String r0 = r8.format(r0)
            r3.setHint(r0)
        L_0x07d2:
            android.text.Editable r0 = r3.getText()
            if (r0 == 0) goto L_0x0803
            java.lang.String r8 = X.AnonymousClass0wJ.A0n(r3)
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r1 = r8.replaceAll(r1, r0)
            boolean r0 = X.AnonymousClass0hA.A08(r1)
            if (r0 != 0) goto L_0x0803
            java.text.NumberFormat r8 = r7.A04
            double r0 = java.lang.Double.parseDouble(r1)
            java.lang.String r0 = r8.format(r0)
            r3.setText(r0)
            android.text.Editable r0 = r3.getText()
            int r0 = r0.length()
            r7.A01 = r0
            r7.A00 = r0
        L_0x0803:
            int r1 = r7.A01
            r0 = -1
            if (r1 != r0) goto L_0x083d
            android.text.Editable r0 = r3.getText()
            if (r0 == 0) goto L_0x0819
            android.text.Editable r0 = r3.getText()
            int r0 = r0.length()
            r3.setSelection(r0)
        L_0x0819:
            X.7QE r8 = new X.7QE
            r8.<init>(r5, r6)
            android.text.TextWatcher r0 = r7.A02
            if (r0 == 0) goto L_0x0825
            r3.removeTextChangedListener(r0)
        L_0x0825:
            r7.A02 = r8
            r7.A03 = r3
            java.lang.Object r1 = X.AnonymousClass7K7.A04(r5, r4)
            X.6n9 r1 = (X.C111326n9) r1
            if (r1 == 0) goto L_0x005e
            X.7QF r0 = r1.A0O
            if (r0 == 0) goto L_0x005e
            java.util.List r0 = r0.A02
            r0.remove(r8)
            X.7QF r0 = r1.A0O
            goto L_0x0854
        L_0x083d:
            int r0 = r7.A00
            r3.setSelection(r1, r0)
            goto L_0x0819
        L_0x0843:
            X.7QF r0 = r3.A0O
            if (r0 == 0) goto L_0x084e
            android.text.TextWatcher r1 = r7.A02
            java.util.List r0 = r0.A02
            r0.remove(r1)
        L_0x084e:
            X.7QF r0 = r3.A0O
            if (r0 == 0) goto L_0x005e
            android.text.TextWatcher r8 = r7.A02
        L_0x0854:
            java.util.List r0 = r0.A02
            r0.add(r8)
            goto L_0x005e
        L_0x085b:
            r0 = 13565(0x34fd, float:1.9009E-41)
            if (r1 != r0) goto L_0x08e7
            com.instagram.service.session.UserSession r7 = X.C86134wK.A0a(r5)
            if (r7 == 0) goto L_0x005e
            r8 = 0
            r0 = 42
            java.lang.Object r0 = X.C127397h3.A0A(r6, r0)
            boolean r0 = X.AnonymousClass2LL.A00(r0, r8)
            if (r0 != 0) goto L_0x005e
            r1 = 36
            java.lang.String r0 = ""
            java.lang.String r5 = r6.A0O(r1, r0)
            X.3RA r4 = X.AnonymousClass3RA.A00
            monitor-enter(r4)
            X.49q r1 = X.AnonymousClass3Zs.A03(r7)     // Catch:{ all -> 0x092a }
            X.D2R r0 = X.D2R.A0K     // Catch:{ all -> 0x092a }
            android.content.SharedPreferences r0 = r1.A01(r0)     // Catch:{ all -> 0x092a }
            monitor-exit(r4)
            boolean r0 = r0.getBoolean(r5, r8)
            if (r0 != 0) goto L_0x005e
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            X.3tx r0 = new X.3tx
            r0.<init>(r3, r6, r7)
            goto L_0x08e2
        L_0x0898:
            r4.A0B = r3
            float r0 = r4.A00
            r3.setAlpha(r0)
            float r0 = r4.A04
            r3.setRotation(r0)
            float r0 = r4.A05
            r3.setRotationX(r0)
            float r0 = r4.A06
            r3.setRotationY(r0)
            android.content.Context r1 = r5.A00
            float r5 = r4.A01
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x08b9
            r5 = 1325400064(0x4f000000, float:2.14748365E9)
        L_0x08b9:
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r1)
            float r1 = r0.density
            float r1 = r1 * r1
            float r0 = -r5
            float r1 = r1 * r0
            float r0 = X.AnonymousClass6YK.A00
            float r1 = r1 * r0
            r3.setCameraDistance(r1)
            float r0 = r4.A07
            r3.setScaleX(r0)
            float r0 = r4.A08
            r3.setScaleY(r0)
            r1 = 1
            r4.A0D = r1
            com.facebook.redex.IDxDListenerShape160S0200000_2_I2 r0 = new com.facebook.redex.IDxDListenerShape160S0200000_2_I2
            r0.<init>(r1, r3, r4)
            r4.A0C = r0
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r4.A0C
        L_0x08e2:
            r1.addOnPreDrawListener(r0)
            goto L_0x005e
        L_0x08e7:
            r0 = 13394(0x3452, float:1.8769E-41)
            if (r1 != r0) goto L_0x08f8
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r5, r6)
            X.H1d r0 = (X.C32017H1d) r0
            if (r0 == 0) goto L_0x092d
            r0.A01(r3, r5, r6, r4)
            goto L_0x005e
        L_0x08f8:
            r0 = 13538(0x34e2, float:1.8971E-41)
            if (r1 != r0) goto L_0x093b
            java.lang.Object r0 = X.AnonymousClass7K7.A04(r5, r6)
            X.8ka r0 = (X.C145488ka) r0
            if (r0 == 0) goto L_0x0934
            r12 = 0
            r7 = r0
            r8 = r3
            r9 = r5
            r10 = r6
            r11 = r4
            r7.AAZ(r8, r9, r10, r11, r12)
            goto L_0x005e
        L_0x090f:
            java.lang.String r1 = "Text Input Formatter extension attached to non-text-input component with style ID: "
            int r0 = r4.A03
            java.lang.String r0 = X.AnonymousClass00U.A0J(r1, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x091c:
            java.lang.String r0 = "NetegoNodeExtension defines a controller but none was found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0923:
            java.lang.String r0 = "TextInputNumberFormatterExtensionBinder defines a controller but none was found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x092a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x092d:
            java.lang.String r0 = "Extension defines a controller but none was found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0934:
            java.lang.String r0 = "Extension defines a controller but none was found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x093b:
            java.lang.Object[] r1 = X.C18210wN.A1X(r1)
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x094a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127857hp.AAO(android.content.Context, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C127857hp(AnonymousClass3HX r1, C127397h3 r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
