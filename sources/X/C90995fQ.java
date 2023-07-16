package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.common.bloks.component.textinput.BloksEditText;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.model.shopping.Product;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.5fQ  reason: invalid class name and case insensitive filesystem */
public abstract class C90995fQ extends M5L implements L1i {
    public C127397h3 A00;
    public final long A01;

    public static FrameLayout A01(Context context) {
        C04220Ms.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }

    public static Integer A02(AnonymousClass3HX r3, C127397h3 r4, int i) {
        C127397h3 A0K = r4.A0K(i);
        if (A0K != null) {
            return Integer.valueOf(C101086Pv.A00(r3, A0K, 0));
        }
        return null;
    }

    public final L1i A09() {
        return this;
    }

    public final /* synthetic */ C41788Mcl BsR() {
        return C35570Ixq.A00(this);
    }

    public C90995fQ(AnonymousClass3HX r4, C127397h3 r5) {
        super(AnonymousClass006.A01);
        this.A01 = (long) r5.A02;
        this.A00 = r5;
        A0K(new Lr9(new C127817hl(r4, this), this), new Lr9(new C127827hm(r4, this), this));
    }

    public static void A03(Context context, ViewGroup viewGroup) {
        viewGroup.addView(new LLH(context), new FrameLayout.LayoutParams(-1, -1));
    }

    public final long A08() {
        return this.A01;
    }

    public View A0O(Context context) {
        Context context2 = context;
        if (this instanceof C95235zg) {
            C04220Ms.A0B(context2, 0);
            return C18180wK.A0D(LayoutInflater.from(context2), (ViewGroup) null, R.layout.survey_media_content_view, false);
        } else if (this instanceof AnonymousClass5zS) {
            return BloksEditText.A00(context2);
        } else {
            if (!(this instanceof AnonymousClass5zR)) {
                if (this instanceof C95225zf) {
                    C95225zf r0 = (C95225zf) this;
                    C04220Ms.A0B(context2, 0);
                    AnonymousClass3HX r4 = r0.A00;
                    C19821BBv bBv = (C19821BBv) AnonymousClass7K7.A04(r4, r0.A01);
                    View inflate = LayoutInflater.from(context2).inflate(R.layout.lightbox_cta_layout, (ViewGroup) null);
                    if (bBv != null) {
                        Product product = bBv.A03;
                        C04220Ms.A0B(r4, 0);
                        UserSession A002 = C18670AjO.A00(r4, "PDPMediaGridStickyCtaRenderUnit");
                        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
                        boolean A0E = C63803iN.A0E(r3, A002, 36315400186628643L);
                        boolean A0E2 = C63803iN.A0E(r3, A002, 2342158409400453669L);
                        if (A0E && !A0E2 && product.A0A() && product.A0B()) {
                            inflate.setVisibility(0);
                            return AnonymousClass70B.A00(inflate);
                        }
                    }
                    inflate.setVisibility(8);
                    return AnonymousClass70B.A00(inflate);
                } else if (this instanceof C95215ze) {
                    C04220Ms.A0B(context2, 0);
                    View A0F = C18200wM.A0F(LayoutInflater.from(context2), (ViewGroup) null, R.layout.mini_components_product_tile_name, false);
                    A0F.setTag(new AnonymousClass5BK(A0F));
                    return A0F;
                } else if (this instanceof AnonymousClass5zQ) {
                    C04220Ms.A0B(context2, 0);
                    return new C871850m(context2);
                } else if (this instanceof AnonymousClass5zP) {
                    C04220Ms.A0B(context2, 1);
                    return new C871850m(context2);
                } else if (this instanceof AnonymousClass5zO) {
                    return new SpinnerImageView(context2);
                } else {
                    if (this instanceof AnonymousClass5zV) {
                        C04220Ms.A0B(context2, 0);
                        return new I4O(context2, (C130667qT) ((AnonymousClass5zV) this).A00.A02);
                    } else if (this instanceof AnonymousClass5zN) {
                        return new RangeSeekBar(context2);
                    } else {
                        if (this instanceof AnonymousClass5zU) {
                            return AnonymousClass0wJ.A0H(LayoutInflater.from(context2), (ViewGroup) null, R.layout.checker_tile);
                        }
                        if (this instanceof C95185zb) {
                            return AnonymousClass0wJ.A0H(LayoutInflater.from(context2), (ViewGroup) null, R.layout.product_tile_grid_item);
                        }
                        if (this instanceof AnonymousClass5zZ) {
                            return AnonymousClass0wJ.A0H(LayoutInflater.from(context2), (ViewGroup) null, R.layout.save_card_button);
                        }
                        if (this instanceof AnonymousClass5zM) {
                            C04220Ms.A0B(context2, 0);
                            return new IgStaticMapView(context2);
                        } else if (this instanceof AnonymousClass5zL) {
                            C04220Ms.A0B(context2, 0);
                            return new SeekBar(context2);
                        } else if (this instanceof AnonymousClass5zK) {
                            RefreshableNestedScrollingParent refreshableNestedScrollingParent = new RefreshableNestedScrollingParent(context2);
                            A03(context2, refreshableNestedScrollingParent);
                            return refreshableNestedScrollingParent;
                        } else {
                            if (!(this instanceof AnonymousClass5zJ)) {
                                if ((this instanceof AnonymousClass5zI) || (this instanceof AnonymousClass5zH)) {
                                    return new ImageView(context2);
                                }
                                if (this instanceof AnonymousClass5zY) {
                                    C04220Ms.A0B(context2, 0);
                                    FollowButton followButton = new FollowButton(context2, (AttributeSet) null, R.attr.updatableButtonStyle);
                                    followButton.setBaseStyle(D26.MEDIUM);
                                    return followButton;
                                } else if (this instanceof AnonymousClass5zG) {
                                    return new AnonymousClass50S(context2);
                                } else {
                                    if (this instanceof AnonymousClass5zF) {
                                        return new AnonymousClass50V(context2, (AttributeSet) null, 0);
                                    }
                                    if (!(this instanceof AnonymousClass5zE)) {
                                        if (this instanceof C95195zc) {
                                            C95195zc r02 = (C95195zc) this;
                                            UserSession userSession = r02.A07;
                                            C11630kW r9 = r02.A01;
                                            AnonymousClass9VF r11 = r02.A04;
                                            AnonymousClass57E r13 = r02.A06;
                                            C18040AXi aXi = r02.A05;
                                            return C18757Akt.A00(context2, (ViewGroup) null, AnonymousClass06E.A00(C63913ic.A00(r02.A02)), r02.A00, r9, r02.A03, r11, aXi, r13, userSession);
                                        } else if (this instanceof AnonymousClass5zD) {
                                            return new HashtagFollowButton(context2, (AttributeSet) null, R.attr.updatableButtonStyle);
                                        } else {
                                            if (this instanceof AnonymousClass5zC) {
                                                C149578u1 r2 = new C149578u1(context2);
                                                r2.setTag(I17.A00(313));
                                                return r2;
                                            } else if (this instanceof AnonymousClass5zB) {
                                                C04220Ms.A0B(context2, 0);
                                                return new NumberPicker(context2);
                                            } else if (this instanceof AnonymousClass5zA) {
                                                C04220Ms.A0B(context2, 0);
                                                AnonymousClass51O r22 = new AnonymousClass51O(context2);
                                                A03(context2, r22);
                                                return r22;
                                            } else if (this instanceof AnonymousClass5z9) {
                                                C04220Ms.A0B(context2, 0);
                                                return new C872551d(context2);
                                            } else if ((this instanceof AnonymousClass5zX) || (this instanceof AnonymousClass5z8)) {
                                                C04220Ms.A0B(context2, 0);
                                                return new LLI(context2);
                                            } else if (!(this instanceof AnonymousClass5z7)) {
                                                if (this instanceof AnonymousClass5z6) {
                                                    return new C872951j(context2);
                                                }
                                                if (this instanceof AnonymousClass5z5) {
                                                    return new SeekBar(context2);
                                                }
                                                if (this instanceof AnonymousClass5z4) {
                                                    return A01(context2);
                                                }
                                                if (this instanceof C95175za) {
                                                    return ((C95175za) this).A00;
                                                }
                                                if (this instanceof C95205zd) {
                                                    return ((C95205zd) this).A0T(context2);
                                                }
                                                if (this instanceof AnonymousClass5zT) {
                                                    return new View(context2);
                                                }
                                                FrameLayout A012 = A01(context2);
                                                AnonymousClass52P r03 = new AnonymousClass52P(context2);
                                                ((AnonymousClass5zW) this).A01 = r03;
                                                A012.addView(r03);
                                                return A012;
                                            }
                                        }
                                    }
                                }
                            }
                            return new AnonymousClass51W(context2);
                        }
                    }
                }
            }
            return new ProgressBar(context2);
        }
    }

    public void A0Q(View view, AnonymousClass3HX r7, C127397h3 r8, Object obj, Object obj2) {
        if (this instanceof C95235zg) {
            C95235zg r4 = (C95235zg) this;
            C04220Ms.A0B(view, 0);
            AnonymousClass0wJ.A1O(r7, r8);
            C12560m7 r2 = (C12560m7) r7.A00(R.id.bloks_ig_fragment_manager);
            Fragment A0O = r2.A0O("SP_SingleMediaFeedFragment");
            if (A0O != null) {
                AnonymousClass01J r0 = new AnonymousClass01J(r2);
                r0.A04(A0O);
                r0.A00();
                r4.A01 = null;
                r8.A04.put(31, 0);
            }
        } else if (this instanceof AnonymousClass5zS) {
            C121977Jb.A04(r7, r8, (BloksEditText) view);
        } else if (this instanceof AnonymousClass5zK) {
            ((LLH) ((ViewGroup) view).getChildAt(0)).setRenderTree((AnonymousClass7Di) null);
        } else if (this instanceof AnonymousClass5zX) {
            AnonymousClass5zX r02 = (AnonymousClass5zX) this;
            C04530Oa r1 = ((C1196076c) AnonymousClass7K7.A03(r02.A00, r02.A01)).A04;
            ((C112806qE) C18190wL.A0f(r1)).A00();
            ((C112806qE) C18190wL.A0f(r1)).A01 = false;
        } else if (this instanceof AnonymousClass5z5) {
            C111286n5 r12 = (C111286n5) AnonymousClass7K7.A04(r7, r8);
            if (r12 != null) {
                r12.A0C = null;
                r12.A0D = null;
                r12.A06 = 0;
                r12.A02 = 0;
                r12.A00 = 0;
                r12.A01 = 0;
                r12.A04 = 0;
                r12.A03 = 0;
                r12.A05 = 0;
                r12.A08 = null;
                r12.A07 = null;
                r12.A09 = null;
                r12.A0A = null;
                r12.A0B = null;
                return;
            }
            throw C18250wR.A0V("SliderController is null even though a controller is defined");
        } else if (this instanceof AnonymousClass5zT) {
            AnonymousClass5zT r03 = (AnonymousClass5zT) this;
            C104276bW r13 = (C104276bW) AnonymousClass7K7.A04(r7, r8);
            if (r13 != null) {
                r03.A00.removeCallbacksAndMessages((Object) null);
                PopupWindow popupWindow = r13.A00;
                View contentView = popupWindow.getContentView();
                AnonymousClass0SJ.A00(contentView);
                ((LLH) contentView).setRenderTree((AnonymousClass7Di) null);
                popupWindow.dismiss();
                return;
            }
            throw C18250wR.A0V("Popup container defines a controller but none was found");
        } else if (this instanceof AnonymousClass5zW) {
            ViewGroup viewGroup = (ViewGroup) view;
            C04220Ms.A0B(viewGroup, 0);
            if (viewGroup.getChildCount() > 0) {
                View A002 = AnonymousClass033.A00(viewGroup, 0);
                C04220Ms.A0C(A002, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
                ((SeekBar) A002).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
            }
            viewGroup.removeAllViews();
        }
    }

    public void A0R(View view, AnonymousClass3HX r7, C127397h3 r8, Object obj, Object obj2) {
        C38039KHq kHq;
        Class cls;
        C82394pY r0;
        String str;
        String str2;
        I4O i4o;
        if (this instanceof C95235zg) {
            return;
        }
        if (this instanceof AnonymousClass5zS) {
            C121977Jb.A05(r7, r8, (BloksEditText) view);
        } else if (this instanceof AnonymousClass5zR) {
        } else {
            if (this instanceof C95225zf) {
                AnonymousClass0wJ.A1O(r7, r8);
                C19821BBv bBv = (C19821BBv) AnonymousClass7K7.A04(r7, r8);
                if (bBv != null) {
                    if (C63913ic.A00(r7).mView != null) {
                        AnonymousClass066 viewLifecycleOwner = C63913ic.A00(r7).getViewLifecycleOwner();
                        if (!bBv.A08) {
                            bBv.A07.A02.A0B(viewLifecycleOwner);
                        }
                    }
                    C63913ic.A0P(r7, bBv);
                }
            } else if (this instanceof C95215ze) {
            } else {
                if ((this instanceof AnonymousClass5zQ) || (this instanceof AnonymousClass5zP)) {
                    C871850m r6 = (C871850m) view;
                    C04220Ms.A0B(r6, 0);
                    r6.setRenderType(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                    r6.setOnClickListener((View.OnClickListener) null);
                } else if (!(this instanceof AnonymousClass5zO)) {
                    if (this instanceof AnonymousClass5zV) {
                        I4O i4o2 = (I4O) view;
                        C04220Ms.A0B(i4o2, 0);
                        C121247Ez r02 = i4o2.A01;
                        i4o = i4o2;
                        if (r02 != null) {
                            r02.A04();
                            i4o = i4o2;
                        }
                    } else if (!(this instanceof AnonymousClass5zN) && !(this instanceof AnonymousClass5zU)) {
                        if (this instanceof C95185zb) {
                            C95185zb r4 = (C95185zb) this;
                            if (r4.A01 != null || r4.A02 != null || r4.A00 != null) {
                                UserSession A0a = C86134wK.A0a(r7);
                                if (A0a == null) {
                                    str = AnonymousClass000.A00(41);
                                    str2 = "Attempt to render product tile component outside logged in user context";
                                } else {
                                    if (r4.A01 != null) {
                                        AnonymousClass3LY.A00(A0a).A02(r4.A01, C19786BAh.class);
                                    }
                                    if (r4.A02 != null) {
                                        AnonymousClass3LY.A00(A0a).A02(r4.A02, C131387rs.class);
                                    }
                                    if (r4.A00 != null) {
                                        kHq = AnonymousClass3LY.A00(A0a);
                                        cls = BBF.class;
                                        r0 = r4.A00;
                                        kHq.A02(r0, cls);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (this instanceof AnonymousClass5zZ) {
                            AnonymousClass5zZ r42 = (AnonymousClass5zZ) this;
                            UserSession A0a2 = C86134wK.A0a(r7);
                            if (A0a2 == null) {
                                str = "MiniBloksProductSaveButtonBinderUtils";
                                str2 = "Attempt to unbind product save button outside logged in user context";
                            } else {
                                if (r42.A01 != null) {
                                    AnonymousClass3LY.A00(A0a2).A02(r42.A01, C19786BAh.class);
                                }
                                if (r42.A00 != null) {
                                    kHq = AnonymousClass3LY.A00(A0a2);
                                    cls = C131387rs.class;
                                    r0 = r42.A00;
                                    kHq.A02(r0, cls);
                                    return;
                                }
                                return;
                            }
                        } else if (this instanceof AnonymousClass5zM) {
                            return;
                        } else {
                            if (this instanceof AnonymousClass5zL) {
                                SeekBar seekBar = (SeekBar) view;
                                C04220Ms.A0B(seekBar, 0);
                                AnonymousClass0wJ.A1O(r7, r8);
                                Object A03 = AnonymousClass7K7.A03(r7, r8);
                                seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
                                seekBar.setProgress(0);
                                seekBar.setMin(0);
                                seekBar.setMax(0);
                                AnonymousClass6YE.A00.removeMessages(0, A03);
                                return;
                            } else if (this instanceof AnonymousClass5zK) {
                                ((RefreshableNestedScrollingParent) view).A05 = null;
                                return;
                            } else if (this instanceof AnonymousClass5zJ) {
                                ((AnonymousClass51W) view).A03();
                                C105656dm r03 = (C105656dm) AnonymousClass7K7.A04(r7, r8);
                                if (r03 != null) {
                                    r03.A00 = null;
                                    return;
                                }
                                return;
                            } else if (this instanceof AnonymousClass5zI) {
                                C117946zV.A01((ImageView) view);
                                return;
                            } else if (this instanceof AnonymousClass5zH) {
                                ImageView imageView = (ImageView) view;
                                imageView.setImageDrawable((Drawable) null);
                                imageView.setTag((Object) null);
                                return;
                            } else if (this instanceof AnonymousClass5zY) {
                                C110716m9 r3 = ((AnonymousClass5zY) this).A00;
                                C131427rw r2 = r3.A00;
                                if (r2 != null) {
                                    AnonymousClass3LY.A00(r3.A05).A02(r2, BBZ.class);
                                }
                                r3.A00 = null;
                                return;
                            } else if (!(this instanceof AnonymousClass5zG) && !(this instanceof AnonymousClass5zF)) {
                                if (this instanceof AnonymousClass5zE) {
                                    ((AnonymousClass51W) view).A03();
                                    return;
                                } else if (this instanceof C95195zc) {
                                    return;
                                } else {
                                    if (this instanceof AnonymousClass5zD) {
                                        ((HashtagFollowButton) view).A00 = null;
                                        return;
                                    } else if (this instanceof AnonymousClass5zC) {
                                        return;
                                    } else {
                                        if (this instanceof AnonymousClass5zB) {
                                            NumberPicker numberPicker = (NumberPicker) view;
                                            C04220Ms.A0B(numberPicker, 0);
                                            numberPicker.setMinValue(0);
                                            numberPicker.setMaxValue(0);
                                            numberPicker.setDisplayedValues((String[]) null);
                                            numberPicker.setValue(0);
                                            return;
                                        } else if (this instanceof AnonymousClass5zA) {
                                            AnonymousClass51O r62 = (AnonymousClass51O) view;
                                            C04220Ms.A0B(r62, 0);
                                            r62.setMaskBounds(new PointF(), new C107226gO());
                                            return;
                                        } else if (this instanceof AnonymousClass5z9) {
                                            ((C146408mC) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                                            return;
                                        } else if (this instanceof AnonymousClass5zX) {
                                            AnonymousClass5zX r04 = (AnonymousClass5zX) this;
                                            ((C1196076c) AnonymousClass7K7.A03(r04.A00, r04.A01)).A00 = null;
                                            return;
                                        } else if (this instanceof AnonymousClass5z8) {
                                            C04220Ms.A0B(view, 0);
                                            view.setBackground((Drawable) null);
                                            return;
                                        } else if (this instanceof AnonymousClass5z7) {
                                            return;
                                        } else {
                                            if (this instanceof AnonymousClass5z6) {
                                                ((ImageView) view).clearColorFilter();
                                                return;
                                            } else if (this instanceof AnonymousClass5z5) {
                                                SeekBar seekBar2 = (SeekBar) view;
                                                C111286n5 r32 = (C111286n5) AnonymousClass7K7.A04(r7, r8);
                                                if (r32 != null) {
                                                    AnonymousClass7CE.A00.removeMessages(0, r32);
                                                    seekBar2.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
                                                    seekBar2.setProgress(0);
                                                    r32.A07 = seekBar2.getThumb();
                                                    seekBar2.setThumb(r32.A08);
                                                    GradientDrawable gradientDrawable = r32.A09;
                                                    if (!(gradientDrawable == null || r32.A0A == null || r32.A0B == null)) {
                                                        gradientDrawable.clearColorFilter();
                                                        r32.A0A.clearColorFilter();
                                                        r32.A0B.clearColorFilter();
                                                    }
                                                    AnonymousClass7CE.A01(r32, r32.A04);
                                                    seekBar2.setMin(0);
                                                    seekBar2.setMax(0);
                                                    return;
                                                }
                                                throw C18250wR.A0V("SliderController is null even though a controller is defined");
                                            } else if (!(this instanceof AnonymousClass5z4) && !(this instanceof C95175za) && (this instanceof C95205zd)) {
                                                ViewGroup viewGroup = (ViewGroup) view;
                                                C04220Ms.A0B(viewGroup, 0);
                                                i4o = viewGroup;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        C30967GcS.A02(str, str2);
                        return;
                    } else {
                        return;
                    }
                    i4o.removeAllViews();
                }
            }
        }
    }

    public boolean A0S(C127397h3 r5, C127397h3 r6, Object obj, Object obj2) {
        if (this instanceof AnonymousClass5zM) {
            AnonymousClass0wJ.A1M(r5, 0, r6);
            SparseArray sparseArray = r5.A04;
            Object obj3 = sparseArray.get(36);
            SparseArray sparseArray2 = r6.A04;
            if (obj3 == sparseArray2.get(36) && sparseArray.get(35) == sparseArray2.get(35)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final /* synthetic */ boolean ABx() {
        return false;
    }

    public /* bridge */ /* synthetic */ Object AFU(Context context) {
        if (!(this instanceof C95235zg)) {
            if (this instanceof AnonymousClass5zS) {
                return BloksEditText.A00(context);
            }
            if (!(this instanceof AnonymousClass5zR)) {
                if (!(this instanceof C95225zf) && !(this instanceof C95215ze)) {
                    if (this instanceof AnonymousClass5zQ) {
                        C04220Ms.A0B(context, 0);
                        return new C871850m(context);
                    } else if (this instanceof AnonymousClass5zP) {
                        C04220Ms.A0B(context, 1);
                        return new C871850m(context);
                    } else if (this instanceof AnonymousClass5zO) {
                        return new SpinnerImageView(context);
                    } else {
                        if (this instanceof AnonymousClass5zV) {
                            C04220Ms.A0B(context, 0);
                            return new I4O(context, (C130667qT) ((AnonymousClass5zV) this).A00.A02);
                        } else if (this instanceof AnonymousClass5zN) {
                            return new RangeSeekBar(context);
                        } else {
                            if (!(this instanceof AnonymousClass5zU) && !(this instanceof C95185zb) && !(this instanceof AnonymousClass5zZ)) {
                                if (this instanceof AnonymousClass5zM) {
                                    C04220Ms.A0B(context, 0);
                                    return new IgStaticMapView(context);
                                } else if (this instanceof AnonymousClass5zL) {
                                    C04220Ms.A0B(context, 0);
                                    return new SeekBar(context);
                                } else if (this instanceof AnonymousClass5zK) {
                                    RefreshableNestedScrollingParent refreshableNestedScrollingParent = new RefreshableNestedScrollingParent(context);
                                    A03(context, refreshableNestedScrollingParent);
                                    return refreshableNestedScrollingParent;
                                } else {
                                    if (!(this instanceof AnonymousClass5zJ)) {
                                        if ((this instanceof AnonymousClass5zI) || (this instanceof AnonymousClass5zH)) {
                                            return new ImageView(context);
                                        }
                                        if (this instanceof AnonymousClass5zY) {
                                            C04220Ms.A0B(context, 0);
                                            FollowButton followButton = new FollowButton(context, (AttributeSet) null, R.attr.updatableButtonStyle);
                                            followButton.setBaseStyle(D26.MEDIUM);
                                            return followButton;
                                        } else if (this instanceof AnonymousClass5zG) {
                                            return new AnonymousClass50S(context);
                                        } else {
                                            if (this instanceof AnonymousClass5zF) {
                                                return new AnonymousClass50V(context, (AttributeSet) null, 0);
                                            }
                                            if (!(this instanceof AnonymousClass5zE)) {
                                                if (!(this instanceof C95195zc)) {
                                                    if (this instanceof AnonymousClass5zD) {
                                                        return new HashtagFollowButton(context, (AttributeSet) null, R.attr.updatableButtonStyle);
                                                    }
                                                    if (this instanceof AnonymousClass5zC) {
                                                        C149578u1 r2 = new C149578u1(context);
                                                        r2.setTag(I17.A00(313));
                                                        return r2;
                                                    } else if (this instanceof AnonymousClass5zB) {
                                                        C04220Ms.A0B(context, 0);
                                                        return new NumberPicker(context);
                                                    } else if (this instanceof AnonymousClass5zA) {
                                                        C04220Ms.A0B(context, 0);
                                                        AnonymousClass51O r22 = new AnonymousClass51O(context);
                                                        A03(context, r22);
                                                        return r22;
                                                    } else if (this instanceof AnonymousClass5z9) {
                                                        C04220Ms.A0B(context, 0);
                                                        return new C872551d(context);
                                                    } else if ((this instanceof AnonymousClass5zX) || (this instanceof AnonymousClass5z8)) {
                                                        C04220Ms.A0B(context, 0);
                                                        return new LLI(context);
                                                    } else if (!(this instanceof AnonymousClass5z7)) {
                                                        if (this instanceof AnonymousClass5z6) {
                                                            return new C872951j(context);
                                                        }
                                                        if (this instanceof AnonymousClass5z5) {
                                                            return new SeekBar(context);
                                                        }
                                                        if (this instanceof AnonymousClass5z4) {
                                                            return A01(context);
                                                        }
                                                        if (this instanceof C95175za) {
                                                            return ((C95175za) this).A00;
                                                        }
                                                        if (this instanceof C95205zd) {
                                                            return ((C95205zd) this).A0T(context);
                                                        }
                                                        if (this instanceof AnonymousClass5zT) {
                                                            return new View(context);
                                                        }
                                                        FrameLayout A012 = A01(context);
                                                        AnonymousClass52P r0 = new AnonymousClass52P(context);
                                                        ((AnonymousClass5zW) this).A01 = r0;
                                                        A012.addView(r0);
                                                        return A012;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return new AnonymousClass51W(context);
                                }
                            }
                        }
                    }
                }
            }
            return new ProgressBar(context);
        }
        return A0O(context);
    }

    public final /* synthetic */ boolean BXl() {
        return false;
    }

    public final /* synthetic */ int CWo() {
        return 3;
    }

    public final /* synthetic */ Object AG7(Context context) {
        return AFU(context);
    }

    public final /* synthetic */ C41788Mcl AGD() {
        return BsR();
    }

    public final /* synthetic */ Object B2C() {
        return getClass();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:227:0x06c4, code lost:
        if (X.AnonymousClass2LL.A00(X.C127397h3.A0A(r1, 58), false) != false) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0bb2, code lost:
        if (X.AnonymousClass2LL.A00(X.C127397h3.A0A(r6, 40), false) == false) goto L_0x0bb4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x1160, code lost:
        if (r5 == null) goto L_0x1162;
     */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0ed0  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0ef8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0P(android.view.View r36, X.AnonymousClass3HX r37, X.C127397h3 r38, java.lang.Object r39) {
        /*
            r35 = this;
            r5 = r35
            r6 = r39
            r0 = r36
            boolean r2 = r5 instanceof X.C95235zg
            r1 = r38
            if (r2 == 0) goto L_0x0095
            r8 = r5
            X.5zg r8 = (X.C95235zg) r8
            r0 = 2
            X.C04220Ms.A0B(r1, r0)
            X.7h3 r0 = r8.A03
            java.lang.String r3 = X.C18220wO.A0o(r0)
            if (r3 == 0) goto L_0x0074
            X.0Ot r2 = X.C04690Os.A02
            X.0Oa r9 = r8.A05
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r9)
            X.0Os r0 = r2.A04(r0, r3)
            r7 = 0
            X.BKU r6 = X.BKU.A08(r0, r7)
            if (r6 == 0) goto L_0x0074
            X.3HX r2 = r8.A02
            X.C04220Ms.A0B(r2, r7)
            r0 = 2131297510(0x7f0904e6, float:1.8212967E38)
            java.lang.Object r5 = r2.A00(r0)
            X.0m7 r5 = (X.C12560m7) r5
            java.lang.String r4 = "SP_SingleMediaFeedFragment"
            androidx.fragment.app.Fragment r3 = r5.A0O(r4)
            if (r3 != 0) goto L_0x0072
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.BKN r0 = r6.A0f
            java.lang.String r0 = r0.A4Y
            X.AxR r2 = new X.AxR
            r2.<init>()
            X.C04220Ms.A0B(r0, r7)
            r2.A04 = r0
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r9)
            X.C04220Ms.A0B(r0, r7)
            java.lang.String r0 = r0.token
            r2.A07 = r0
            androidx.fragment.app.Fragment r3 = r2.A05()
            X.01J r2 = new X.01J
            r2.<init>(r5)
            r0 = 2131300800(0x7f0911c0, float:1.821964E38)
            r2.A0F(r3, r4, r0)
            r2.A00()
        L_0x0072:
            r8.A01 = r3
        L_0x0074:
            r2 = 31
            r0 = 0
            int r0 = r1.A0H(r2, r0)
            if (r0 != 0) goto L_0x0082
            r0 = 3000(0xbb8, float:4.204E-42)
            X.C95235zg.A00(r8, r0)
        L_0x0082:
            androidx.fragment.app.Fragment r0 = r8.A01
            if (r0 == 0) goto L_0x0093
            X.0m7 r2 = r0.getParentFragmentManager()
            X.8uU r1 = new X.8uU
            r1.<init>(r8)
            r0 = 1
            r2.A0u(r1, r0)
        L_0x0093:
            r0 = 0
            return r0
        L_0x0095:
            boolean r3 = r5 instanceof X.AnonymousClass5zS
            r2 = r37
            if (r3 == 0) goto L_0x00d5
            com.instagram.common.bloks.component.textinput.BloksEditText r0 = (com.instagram.common.bloks.component.textinput.BloksEditText) r0
            r7 = 0
            X.6n9 r6 = X.C121977Jb.A01(r7, r2, r1, r0, r6)
            r3 = 63
            r4 = 0
            java.lang.Object r3 = X.C127397h3.A0A(r1, r3)
            boolean r3 = X.AnonymousClass2LL.A00(r3, r4)
            if (r3 == 0) goto L_0x00d4
            float r3 = r0.getTextSize()
            float r0 = r6.A0I
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00d4
            r6.A0I = r3
            X.7HV r4 = X.AnonymousClass7K7.A01(r2)
            r0 = 6
            com.instagram.common.bloks.mutations.IDxUOperationShape121S0100000_2_I2 r3 = new com.instagram.common.bloks.mutations.IDxUOperationShape121S0100000_2_I2
            r3.<init>(r5, r0)
            X.7h3 r2 = r4.A04()
            X.7r3 r0 = new X.7r3
            r0.<init>(r2, r1)
            r4.A0A(r0, r3)
            r4.A06()
        L_0x00d4:
            return r7
        L_0x00d5:
            boolean r3 = r5 instanceof X.AnonymousClass5zR
            if (r3 != 0) goto L_0x0093
            boolean r3 = r5 instanceof X.C95225zf
            if (r3 == 0) goto L_0x00e8
            X.AnonymousClass0wJ.A1N(r0, r2)
            r3 = 2
            X.C04220Ms.A0B(r1, r3)
            X.C95225zf.A00(r0, r2, r1)
            goto L_0x0093
        L_0x00e8:
            boolean r3 = r5 instanceof X.C95215ze
            if (r3 == 0) goto L_0x00f7
            X.AnonymousClass0wJ.A1N(r0, r2)
            r3 = 2
            X.C04220Ms.A0B(r1, r3)
            X.C95215ze.A00(r0, r2, r1)
            goto L_0x0093
        L_0x00f7:
            boolean r3 = r5 instanceof X.AnonymousClass5zQ
            if (r3 == 0) goto L_0x0173
            X.50m r0 = (X.C871850m) r0
            r7 = 0
            boolean r6 = X.AnonymousClass0wJ.A1Z(r0, r2)
            r3 = 2
            X.C04220Ms.A0B(r1, r3)
            X.0i6 r10 = X.C63913ic.A0E(r2)
            boolean r3 = r10 instanceof com.instagram.service.session.UserSession
            r11 = 0
            if (r3 == 0) goto L_0x0172
            com.instagram.service.session.UserSession r10 = (com.instagram.service.session.UserSession) r10
            if (r10 == 0) goto L_0x0172
            r3 = 43
            android.util.SparseArray r5 = r1.A04
            java.lang.String r8 = X.C86114wI.A0m(r5, r3)
            java.lang.String r4 = "Required value was null."
            if (r8 == 0) goto L_0x0ad9
            r3 = 44
            java.lang.String r3 = X.C86114wI.A0m(r5, r3)
            if (r3 == 0) goto L_0x0ad4
            com.instagram.user.model.User r5 = new com.instagram.user.model.User
            r5.<init>(r8, r3)
            java.lang.String r3 = X.C127397h3.A0B(r1)
            r5.A2D(r3)
            r8 = 45
            r3 = 0
            long r8 = r1.A0I(r8, r3)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            X.MeW r9 = r5.A05
            r9.CmV(r8)
            r8 = 40
            long r3 = r1.A0I(r8, r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9.Cot(r3)
            X.Dnj r4 = X.AnonymousClass6VR.A00(r10)
            java.lang.String r16 = "default"
            r3 = 42
            java.util.List r17 = r1.A0R(r3)
            X.C04220Ms.A06(r17)
            X.6mf r10 = new X.6mf
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r18 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            com.instagram.user.model.User r3 = r4.A02(r5, r6, r7)
            X.C117996za.A01(r10, r0, r2, r1, r3)
        L_0x0172:
            return r11
        L_0x0173:
            boolean r3 = r5 instanceof X.AnonymousClass5zP
            if (r3 == 0) goto L_0x0199
            X.50m r0 = (X.C871850m) r0
            r3 = 41
            java.lang.Object r3 = X.C127397h3.A0A(r1, r3)
            X.74x r3 = (X.C1193774x) r3
            r8 = 0
            if (r3 == 0) goto L_0x0b5f
            com.instagram.user.model.User r5 = r3.A00
            if (r5 == 0) goto L_0x0b5f
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r15 = "default"
            r7 = 43
            android.util.SparseArray r6 = r1.A04
            java.lang.String r3 = X.C86114wI.A0m(r6, r7)
            if (r3 == 0) goto L_0x0aee
            goto L_0x0ade
        L_0x0199:
            boolean r3 = r5 instanceof X.AnonymousClass5zO
            if (r3 == 0) goto L_0x01b0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r3 = 35
            java.lang.String r2 = "loading"
            java.lang.String r1 = r1.A0O(r3, r2)
            X.69F r1 = X.AnonymousClass6OE.A00(r1)
            r0.setLoadingStatus(r1)
            goto L_0x0093
        L_0x01b0:
            boolean r3 = r5 instanceof X.AnonymousClass5zV
            if (r3 == 0) goto L_0x01f5
            X.I4O r0 = (X.I4O) r0
            X.AnonymousClass0wJ.A1N(r0, r2)
            r3 = 2
            X.C04220Ms.A0B(r1, r3)
            java.lang.String r5 = X.C18230wP.A0o(r1)
            if (r5 != 0) goto L_0x01c5
            java.lang.String r5 = ""
        L_0x01c5:
            r4 = 40
            java.lang.String r3 = "ig_nmor_payments"
            java.lang.String r6 = X.C127397h3.A0F(r1, r3, r4)
            r3 = 45
            java.lang.String r4 = "{}"
            java.lang.String r7 = X.C127397h3.A0F(r1, r4, r3)
            r3 = 41
            java.lang.String r8 = X.C127397h3.A0F(r1, r4, r3)
            r3 = 35
            java.lang.String r9 = X.C127397h3.A0F(r1, r4, r3)
            r3 = 38
            java.lang.String r10 = X.C127397h3.A0F(r1, r4, r3)
            r3 = 0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S7000000_I2 r4 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S7000000_I2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.4rP r1 = r2.A02
            X.7qT r1 = (X.C130667qT) r1
            r0.A03(r4, r1)
            return r3
        L_0x01f5:
            boolean r3 = r5 instanceof X.AnonymousClass5zN
            if (r3 == 0) goto L_0x0231
            r6 = r5
            X.5zN r6 = (X.AnonymousClass5zN) r6
            com.instagram.ui.widget.rangeseekbar.RangeSeekBar r0 = (com.instagram.ui.widget.rangeseekbar.RangeSeekBar) r0
            r3 = 40
            r5 = 0
            float r4 = r1.A0G(r3, r5)
            r3 = 38
            float r3 = r1.A0G(r3, r5)
            r0.A02(r4, r3)
            r3 = 42
            float r4 = r1.A0G(r3, r5)
            r3 = 35
            float r3 = r1.A0G(r3, r5)
            r0.setStartingRangeValue(r4)
            r0.setEndingRangeValue(r3)
            r3 = 41
            X.6jp r4 = r1.A0L(r3)
            if (r4 == 0) goto L_0x0093
            X.7xV r3 = new X.7xV
            r3.<init>(r6, r2, r1, r4)
            r0.A06 = r3
            goto L_0x0093
        L_0x0231:
            boolean r3 = r5 instanceof X.AnonymousClass5zU
            if (r3 == 0) goto L_0x0248
            r10 = r5
            X.5zU r10 = (X.AnonymousClass5zU) r10
            com.instagram.service.session.UserSession r23 = X.C86134wK.A0a(r2)
            r19 = 0
            if (r23 != 0) goto L_0x0b67
            java.lang.String r1 = "MiniBloksShoppingReconsiderationTileBinderUtils"
            java.lang.String r0 = "Attempt to render mini shopping reconsideration tile component outside logged in user context"
            X.C30967GcS.A02(r1, r0)
            return r19
        L_0x0248:
            boolean r3 = r5 instanceof X.C95185zb
            if (r3 == 0) goto L_0x02ae
            r3 = r5
            X.5zb r3 = (X.C95185zb) r3
            com.instagram.service.session.UserSession r5 = X.C86134wK.A0a(r2)
            r13 = 0
            if (r5 != 0) goto L_0x0262
            r0 = 41
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Attempt to render product tile component outside logged in user context"
            X.C30967GcS.A02(r1, r0)
        L_0x0261:
            return r13
        L_0x0262:
            X.AQH r4 = new X.AQH
            r4.<init>()
            r3.A03 = r4
            java.lang.Object r8 = r0.getTag()
            X.90U r8 = (X.AnonymousClass90U) r8
            r10 = 0
            if (r8 != 0) goto L_0x027a
            X.90U r8 = new X.90U
            r8.<init>(r0, r10)
            r0.setTag(r8)
        L_0x027a:
            X.7h3 r0 = X.C127397h3.A05(r1)
            if (r0 == 0) goto L_0x0261
            com.instagram.model.shopping.Product r0 = X.C19249AtE.A01(r0)
            com.instagram.model.shopping.productfeed.ProductFeedItem r9 = new com.instagram.model.shopping.productfeed.ProductFeedItem
            r9.<init>((com.instagram.model.shopping.Product) r0)
            com.instagram.model.shopping.productfeed.ProductTile r12 = r9.A05
            if (r12 == 0) goto L_0x0261
            r0 = 48
            android.util.SparseArray r11 = r1.A04
            java.lang.String r7 = X.C86114wI.A0m(r11, r0)
            r0 = 49
            java.lang.String r6 = X.C86114wI.A0m(r11, r0)
            r4 = 4
            com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo r0 = new com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo
            r0.<init>(r7, r6, r4)
            r12.A06 = r0
            X.BU9 r14 = X.C19310AuE.A00(r2, r1, r5, r10)
            X.C19310AuE.A02(r1, r9)
            r0 = 53
            goto L_0x0cd6
        L_0x02ae:
            boolean r3 = r5 instanceof X.AnonymousClass5zZ
            if (r3 == 0) goto L_0x02eb
            r4 = r5
            X.5zZ r4 = (X.AnonymousClass5zZ) r4
            com.instagram.service.session.UserSession r6 = X.C86134wK.A0a(r2)
            java.lang.String r5 = "MiniBloksProductSaveButtonBinderUtils"
            r12 = 0
            if (r6 != 0) goto L_0x02c4
            java.lang.String r0 = "Attempt to render product save button outside logged in user context"
        L_0x02c0:
            X.C30967GcS.A02(r5, r0)
            return r12
        L_0x02c4:
            X.7zd r3 = new X.7zd
            r3.<init>(r0)
            r0.post(r3)
            androidx.fragment.app.Fragment r20 = X.C63913ic.A00(r2)
            X.7vC r10 = new X.7vC
            r10.<init>(r4, r2, r1)
            r3 = 2131306516(0x7f092814, float:1.8231233E38)
            android.widget.ImageView r9 = X.C18200wM.A0J(r0, r3)
            r3 = 38
            X.7h3 r3 = r1.A0K(r3)
            if (r3 != 0) goto L_0x0d92
            r0 = 270(0x10e, float:3.78E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x02c0
        L_0x02eb:
            boolean r3 = r5 instanceof X.AnonymousClass5zM
            if (r3 == 0) goto L_0x03bd
            com.instagram.maps.ui.IgStaticMapView r0 = (com.instagram.maps.ui.IgStaticMapView) r0
            r2 = 0
            X.AnonymousClass0wJ.A1M(r0, r2, r1)
            java.lang.String r2 = "bloks_map"
            com.facebook.android.maps.StaticMapView$StaticMapOptions r7 = new com.facebook.android.maps.StaticMapView$StaticMapOptions
            r7.<init>(r2)
            r9 = 36
            X.7h3 r11 = r1.A0K(r9)
            r8 = 35
            r6 = 0
            if (r11 == 0) goto L_0x0328
            int r3 = r11.A03
            r2 = 13405(0x345d, float:1.8784E-41)
            r10 = 38
            if (r3 == r2) goto L_0x0354
            r2 = 13406(0x345e, float:1.8786E-41)
            if (r3 != r2) goto L_0x0328
            float r2 = r11.A0G(r8, r6)
            double r4 = (double) r2
            float r2 = r11.A0G(r9, r6)
            double r2 = (double) r2
            r7.A01(r4, r2)
            r2 = 1
            int r2 = r11.A0H(r10, r2)
            r7.A03(r2)
        L_0x0328:
            java.util.List r1 = r1.A0R(r8)
            X.C04220Ms.A06(r1)
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r10 = r1.iterator()
        L_0x0337:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x03b5
            X.7h3 r2 = X.C86144wL.A0V(r10)
            float r1 = r2.A0G(r8, r6)
            double r3 = (double) r1
            float r1 = r2.A0G(r9, r6)
            double r1 = (double) r1
            com.facebook.android.maps.model.LatLng r5 = new com.facebook.android.maps.model.LatLng
            r5.<init>(r3, r1)
            r11.add(r5)
            goto L_0x0337
        L_0x0354:
            r2 = 40
            float r5 = r11.A0G(r2, r6)
            float r4 = r11.A0G(r9, r6)
            float r3 = r11.A0G(r8, r6)
            float r2 = r11.A0G(r10, r6)
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>(r5, r4, r3, r2)
            float r2 = r11.top
            double r4 = (double) r2
            float r2 = r11.left
            double r2 = (double) r2
            com.facebook.android.maps.model.LatLng r10 = new com.facebook.android.maps.model.LatLng
            r10.<init>(r4, r2)
            float r2 = r11.bottom
            double r4 = (double) r2
            float r2 = r11.right
            double r2 = (double) r2
            com.facebook.android.maps.model.LatLng r11 = new com.facebook.android.maps.model.LatLng
            r11.<init>(r4, r2)
            r5 = 1
            com.facebook.android.maps.model.LatLng[] r2 = new com.facebook.android.maps.model.LatLng[]{r10, r11}
            java.util.List r3 = java.util.Arrays.asList(r2)
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0394
            r2 = 0
        L_0x0391:
            r7.A0A = r2
            goto L_0x0328
        L_0x0394:
            java.lang.StringBuilder r4 = X.C18200wM.A0r()
            java.util.Iterator r3 = r3.iterator()
        L_0x039c:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x03ac
            java.lang.Object r2 = r3.next()
            com.facebook.android.maps.model.LatLng r2 = (com.facebook.android.maps.model.LatLng) r2
            X.C86134wK.A1H(r2, r4)
            goto L_0x039c
        L_0x03ac:
            java.lang.String r2 = r4.toString()
            java.lang.String r2 = r2.substring(r5)
            goto L_0x0391
        L_0x03b5:
            r7.A05(r11)
            r0.setMapOptions(r7)
            goto L_0x0093
        L_0x03bd:
            boolean r3 = r5 instanceof X.AnonymousClass5zL
            if (r3 == 0) goto L_0x03fd
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            X.AnonymousClass0wJ.A1O(r2, r1)
            java.lang.Object r4 = X.AnonymousClass7K7.A03(r2, r1)
            X.6dn r4 = (X.C105666dn) r4
            r3 = 36
            int r3 = r1.A0H(r3, r5)
            r0.setMax(r3)
            r3 = 38
            int r3 = r1.A0H(r3, r5)
            r0.setMin(r3)
            r3 = 35
            int r3 = r1.A0H(r3, r5)
            r0.setProgress(r3)
            r3 = 40
            X.6jp r3 = r1.A0L(r3)
            if (r3 == 0) goto L_0x0093
            X.7S9 r3 = new X.7S9
            r3.<init>(r4, r2, r1)
            r0.setOnSeekBarChangeListener(r3)
            goto L_0x0093
        L_0x03fd:
            boolean r3 = r5 instanceof X.AnonymousClass5zK
            if (r3 == 0) goto L_0x0433
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r0 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r0
            X.7Di r6 = (X.AnonymousClass7Di) r6
            java.lang.Object r5 = X.AnonymousClass7K7.A04(r2, r1)
            X.7qb r5 = (X.C130687qb) r5
            if (r5 == 0) goto L_0x0e6d
            r5.A00 = r0
            boolean r4 = r5.A01
            r3 = 38
            java.lang.Object r3 = X.C127397h3.A0A(r1, r3)
            boolean r4 = X.AnonymousClass2LL.A00(r3, r4)
            r5.A01 = r4
            X.7xW r3 = new X.7xW
            r3.<init>(r5, r2, r1)
            r0.A05 = r3
            r0.setRefreshing(r4)
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            X.LLH r0 = (X.LLH) r0
            r0.setRenderTree(r6)
            goto L_0x0093
        L_0x0433:
            boolean r3 = r5 instanceof X.AnonymousClass5zJ
            if (r3 == 0) goto L_0x0473
            r9 = r5
            X.5zJ r9 = (X.AnonymousClass5zJ) r9
            X.51W r0 = (X.AnonymousClass51W) r0
            X.6le r6 = (X.C110416le) r6
            if (r6 == 0) goto L_0x0453
            int r8 = r6.A01
            int r7 = r6.A00
            X.6hZ r5 = r6.A02
            java.util.List r4 = r6.A03
            java.util.List r3 = r6.A04
            r10 = r0
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r8
            r15 = r7
            r10.A06(r11, r12, r13, r14, r15)
        L_0x0453:
            X.6jp r3 = X.C127397h3.A08(r1)
            if (r3 == 0) goto L_0x0467
            X.7pV r5 = new X.7pV
            r5.<init>(r9, r2, r1, r3)
            r4 = 0
            X.7Re r3 = new X.7Re
            r3.<init>(r5, r0, r4)
            r0.setOnTouchListener(r3)
        L_0x0467:
            java.lang.Object r1 = X.AnonymousClass7K7.A04(r2, r1)
            X.6dm r1 = (X.C105656dm) r1
            if (r1 == 0) goto L_0x0e74
            r1.A00 = r0
            goto L_0x0093
        L_0x0473:
            boolean r3 = r5 instanceof X.AnonymousClass5zI
            if (r3 == 0) goto L_0x049c
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r7 = X.C18230wP.A0o(r1)
            com.instagram.service.session.UserSession r10 = X.C86134wK.A0a(r2)
            r9 = 0
            r4 = 0
            if (r7 == 0) goto L_0x0e86
            if (r10 == 0) goto L_0x0e86
            boolean r3 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r3 != 0) goto L_0x0e7b
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r5 = 36315584870222477(0x8104d500000a8d, double:3.029460330827085E-306)
            boolean r3 = X.C63803iN.A0E(r3, r10, r5)
            if (r3 == 0) goto L_0x0e86
            goto L_0x0e7b
        L_0x049c:
            boolean r3 = r5 instanceof X.AnonymousClass5zH
            if (r3 == 0) goto L_0x04ae
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.Object r6 = X.AnonymousClass7K7.A04(r2, r1)
            X.6dk r6 = (X.C105636dk) r6
            if (r6 == 0) goto L_0x0f63
            r3 = 35
            goto L_0x0f2e
        L_0x04ae:
            boolean r3 = r5 instanceof X.AnonymousClass5zY
            if (r3 == 0) goto L_0x0528
            r8 = r5
            X.5zY r8 = (X.AnonymousClass5zY) r8
            com.instagram.user.follow.FollowButton r0 = (com.instagram.user.follow.FollowButton) r0
            X.AnonymousClass0wJ.A1N(r0, r2)
            r3 = 2
            X.C04220Ms.A0B(r1, r3)
            X.AnonymousClass7GR.A01(r1, r0)
            X.6m9 r6 = r8.A00
            com.instagram.user.model.User r4 = r6.A01
            java.lang.String r7 = r6.A02
            if (r4 == 0) goto L_0x0502
            com.instagram.service.session.UserSession r3 = r8.A01
            X.AnonymousClass7GR.A00(r2, r1, r3, r0, r4)
        L_0x04ce:
            com.instagram.user.model.User r5 = r6.A01
            if (r5 == 0) goto L_0x051f
            X.7rw r3 = r6.A00
            if (r3 == 0) goto L_0x04e1
            com.instagram.service.session.UserSession r1 = r6.A05
            X.KHq r2 = X.AnonymousClass3LY.A00(r1)
            java.lang.Class<X.BBZ> r1 = X.BBZ.class
            r2.A02(r3, r1)
        L_0x04e1:
            r1 = 0
            r6.A00 = r1
            X.7h3 r4 = r6.A04
            X.3HX r3 = r6.A03
            com.instagram.service.session.UserSession r1 = r6.A05
            X.7rw r2 = new X.7rw
            r7 = r2
            r8 = r3
            r9 = r4
            r10 = r1
            r11 = r0
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            X.KHq r1 = X.AnonymousClass3LY.A00(r1)
            java.lang.Class<X.BBZ> r0 = X.BBZ.class
            r1.A01(r2, r0)
            r6.A00 = r2
            goto L_0x0093
        L_0x0502:
            if (r7 == 0) goto L_0x0517
            X.3Y8 r5 = X.AnonymousClass3Y8.A02
            com.instagram.service.session.UserSession r4 = r8.A01
            X.7xZ r3 = new X.7xZ
            r8 = r3
            r9 = r6
            r10 = r2
            r11 = r1
            r12 = r4
            r13 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            r5.A00(r4, r3, r7)
            goto L_0x04ce
        L_0x0517:
            java.lang.String r2 = "follow_missing_user"
            java.lang.String r1 = "Bloks Follow Button missing user data"
            X.C10450iM.A03(r2, r1)
            goto L_0x04ce
        L_0x051f:
            java.lang.String r1 = "follow_missing_user"
            java.lang.String r0 = "Bloks Follow Button missing user data"
            X.C10450iM.A03(r1, r0)
            goto L_0x0093
        L_0x0528:
            boolean r3 = r5 instanceof X.AnonymousClass5zG
            if (r3 == 0) goto L_0x0538
            X.50S r0 = (X.AnonymousClass50S) r0
            android.animation.ValueAnimator r0 = r0.A01
        L_0x0530:
            r0.cancel()
            r0.start()
            goto L_0x0093
        L_0x0538:
            boolean r3 = r5 instanceof X.AnonymousClass5zF
            if (r3 == 0) goto L_0x0541
            X.50V r0 = (X.AnonymousClass50V) r0
            android.animation.ValueAnimator r0 = r0.A03
            goto L_0x0530
        L_0x0541:
            boolean r3 = r5 instanceof X.AnonymousClass5zE
            if (r3 == 0) goto L_0x057f
            r9 = r5
            X.5zE r9 = (X.AnonymousClass5zE) r9
            X.51W r0 = (X.AnonymousClass51W) r0
            X.6mn r6 = (X.C111106mn) r6
            if (r6 == 0) goto L_0x0569
            int r8 = r6.A03
            int r7 = r6.A02
            X.6hZ r5 = r6.A04
            java.util.List r4 = r6.A06
            java.util.List r3 = r6.A07
            r10 = r0
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r8
            r15 = r7
            r10.A06(r11, r12, r13, r14, r15)
            boolean r3 = r6.A08
            r0.A04 = r3
            com.instagram.model.mediasize.SpritesheetInfo r3 = r6.A05
            r0.A03 = r3
        L_0x0569:
            X.6jp r4 = X.C127397h3.A08(r1)
            if (r4 == 0) goto L_0x0093
            X.7pU r3 = new X.7pU
            r3.<init>(r9, r2, r1, r4)
            r2 = 1
            X.7Re r1 = new X.7Re
            r1.<init>(r3, r0, r2)
            r0.setOnTouchListener(r1)
            goto L_0x0093
        L_0x057f:
            boolean r3 = r5 instanceof X.C95195zc
            if (r3 == 0) goto L_0x05af
            r3 = r5
            X.5zc r3 = (X.C95195zc) r3
            java.lang.Object r1 = X.AnonymousClass7K7.A04(r2, r1)
            X.6dj r1 = (X.C105626dj) r1
            if (r1 == 0) goto L_0x0f6a
            android.content.Context r2 = r2.A00
            com.instagram.service.session.UserSession r10 = r3.A07
            X.0kW r5 = r3.A01
            java.lang.Object r9 = r0.getTag()
            X.BLJ r9 = (X.BLJ) r9
            X.9Au r6 = r1.A00
            X.9VF r8 = r3.A04
            X.KNR r0 = r3.A03
            X.BMi r7 = r0.A01(r6)
            X.Aeb r4 = r3.A00
            android.os.Handler r3 = X.AnonymousClass0wJ.A0F()
            X.C18757Akt.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0093
        L_0x05af:
            boolean r3 = r5 instanceof X.AnonymousClass5zD
            if (r3 == 0) goto L_0x05c7
            r8 = r5
            X.5zD r8 = (X.AnonymousClass5zD) r8
            com.instagram.hashtag.ui.HashtagFollowButton r0 = (com.instagram.hashtag.ui.HashtagFollowButton) r0
            com.instagram.service.session.UserSession r7 = X.C86134wK.A0a(r2)
            java.lang.String r4 = "HashtagFollowButtonBinderUtils"
            r6 = 0
            if (r7 != 0) goto L_0x0f71
            java.lang.String r0 = "Attempt to render hashtag follow button component outside a logged in user context."
            X.C30967GcS.A02(r4, r0)
            return r6
        L_0x05c7:
            boolean r3 = r5 instanceof X.AnonymousClass5zC
            if (r3 == 0) goto L_0x05dc
            X.8u1 r0 = (X.C149578u1) r0
            java.lang.String r3 = "BKShowreelVideoPlayerBinderUtils"
            com.instagram.service.session.UserSession r2 = X.C86134wK.A0a(r2)
            r5 = 0
            if (r2 != 0) goto L_0x0f99
            java.lang.String r0 = "Attempt to render Bloks showreel video player component outside a logged in user context."
            X.C30967GcS.A02(r3, r0)
            return r5
        L_0x05dc:
            boolean r3 = r5 instanceof X.AnonymousClass5zB
            if (r3 == 0) goto L_0x063b
            android.widget.NumberPicker r0 = (android.widget.NumberPicker) r0
            r4 = 0
            X.C04220Ms.A0B(r0, r4)
            X.AnonymousClass0wJ.A1O(r2, r1)
            r3 = 42
            X.6jp r6 = r1.A0L(r3)
            r5 = 0
            if (r6 == 0) goto L_0x0639
            X.7S7 r3 = new X.7S7
            r3.<init>(r2, r1, r6)
        L_0x05f7:
            r0.setOnValueChangedListener(r3)
            r2 = 36
            int r2 = r1.A0H(r2, r4)
            r0.setMinValue(r2)
            r2 = 35
            int r2 = r1.A0H(r2, r4)
            r0.setMaxValue(r2)
            r2 = 41
            java.util.List r3 = r1.A0R(r2)
            X.C04220Ms.A06(r3)
            boolean r2 = X.C18190wL.A1a(r3)
            if (r2 == 0) goto L_0x062f
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r2)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.setMinValue(r4)
            int r2 = r3.length
            int r2 = r2 + -1
            r0.setMaxValue(r2)
            r0.setDisplayedValues(r3)
        L_0x062f:
            r2 = 38
            int r1 = r1.A0H(r2, r4)
            r0.setValue(r1)
            return r5
        L_0x0639:
            r3 = r5
            goto L_0x05f7
        L_0x063b:
            boolean r3 = r5 instanceof X.AnonymousClass5zA
            if (r3 == 0) goto L_0x069b
            X.51O r0 = (X.AnonymousClass51O) r0
            r9 = 0
            X.AnonymousClass0wJ.A1M(r0, r9, r1)
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>()
            r10 = 36
            X.7h3 r3 = r1.A0K(r10)
            r7 = 35
            r5 = 0
            if (r3 == 0) goto L_0x0661
            float r2 = r3.A0G(r7, r5)
            r8.x = r2
            float r2 = r3.A0G(r10, r5)
            r8.y = r2
        L_0x0661:
            X.6gO r4 = new X.6gO
            r4.<init>()
            r2 = 38
            X.7h3 r3 = r1.A0K(r2)
            if (r3 == 0) goto L_0x067a
            float r2 = r3.A0G(r10, r5)
            r4.A01 = r2
            float r2 = r3.A0G(r7, r5)
            r4.A00 = r2
        L_0x067a:
            java.lang.String r2 = "null cannot be cast to non-null type com.facebook.rendercore.RenderTree"
            X.C04220Ms.A0C(r6, r2)
            X.7Di r6 = (X.AnonymousClass7Di) r6
            android.view.View r3 = r0.getChildAt(r9)
            java.lang.String r2 = "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView"
            X.C04220Ms.A0C(r3, r2)
            X.LLH r3 = (X.LLH) r3
            r3.setRenderTree(r6)
            r0.setMaskBounds(r8, r4)
            java.lang.String r1 = X.C127397h3.A0D(r1)
            r0.setMaskShape(r1)
            goto L_0x0093
        L_0x069b:
            boolean r3 = r5 instanceof X.AnonymousClass5z9
            if (r3 == 0) goto L_0x076c
            r8 = r5
            X.5z9 r8 = (X.AnonymousClass5z9) r8
            r6 = 0
            r3 = 35
            java.lang.Object r3 = X.C127397h3.A0A(r1, r3)
            boolean r7 = X.AnonymousClass2LL.A00(r3, r6)
            r3 = 51
            java.lang.Object r3 = X.C127397h3.A0A(r1, r3)
            boolean r3 = X.AnonymousClass2LL.A00(r3, r6)
            if (r3 != 0) goto L_0x06c6
            r3 = 58
            java.lang.Object r3 = X.C127397h3.A0A(r1, r3)
            boolean r3 = X.AnonymousClass2LL.A00(r3, r6)
            r15 = 0
            if (r3 == 0) goto L_0x06c7
        L_0x06c6:
            r15 = 1
        L_0x06c7:
            X.6jp r14 = X.C127397h3.A08(r1)
            r5 = r0
            X.8mC r5 = (X.C146408mC) r5
            r5.setChecked(r7)
            r3 = 38
            r4 = 1
            java.lang.Object r3 = X.C127397h3.A0A(r1, r3)
            boolean r3 = X.AnonymousClass2LL.A00(r3, r4)
            r0.setEnabled(r3)
            if (r15 != 0) goto L_0x06e3
            if (r14 == 0) goto L_0x06f2
        L_0x06e3:
            X.7S4 r3 = new X.7S4
            r9 = r3
            r10 = r0
            r11 = r8
            r12 = r2
            r13 = r1
            r16 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.setOnCheckedChangeListener(r3)
        L_0x06f2:
            android.content.Context r10 = r2.A00
            r0 = 40
            X.7h3 r0 = r1.A0K(r0)
            r14 = 0
            if (r0 != 0) goto L_0x0763
            r11 = r14
        L_0x06fe:
            r0 = 41
            java.lang.Integer r9 = A02(r2, r1, r0)
            r0 = 43
            java.lang.Integer r13 = A02(r2, r1, r0)
            r0 = 48
            java.lang.Integer r12 = A02(r2, r1, r0)
            r0 = 42
            java.lang.Integer r8 = A02(r2, r1, r0)
            r0 = 46
            java.lang.Integer r7 = A02(r2, r1, r0)
            r0 = 45
            java.lang.Integer r6 = A02(r2, r1, r0)
            r0 = 50
            java.lang.Integer r4 = A02(r2, r1, r0)
            r0 = 44
            java.lang.Integer r3 = A02(r2, r1, r0)
            r0 = 49
            java.lang.Integer r1 = A02(r2, r1, r0)
            if (r13 != 0) goto L_0x075b
            if (r8 != 0) goto L_0x075b
            if (r12 != 0) goto L_0x073b
            r12 = r11
        L_0x073b:
            if (r7 != 0) goto L_0x073e
            r7 = r9
        L_0x073e:
            android.content.res.ColorStateList r0 = X.AnonymousClass7CF.A00(r10, r11, r9, r12, r7)
            r5.setThumbTintList(r0)
        L_0x0745:
            if (r6 != 0) goto L_0x0fac
            if (r3 != 0) goto L_0x0fac
            if (r4 != 0) goto L_0x074c
            r4 = r11
        L_0x074c:
            if (r1 != 0) goto L_0x074f
            r1 = r9
        L_0x074f:
            android.content.res.ColorStateList r1 = X.AnonymousClass7CF.A01(r10, r11, r9, r4, r1)
            X.51d r5 = (X.C872551d) r5
            androidx.appcompat.widget.SwitchCompat r0 = r5.A00
            r0.setTrackTintList(r1)
            return r14
        L_0x075b:
            android.content.res.ColorStateList r0 = X.AnonymousClass7CF.A00(r10, r13, r8, r12, r7)
            r5.setThumbTintList(r0)
            goto L_0x0745
        L_0x0763:
            int r0 = X.C101086Pv.A00(r2, r0, r6)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            goto L_0x06fe
        L_0x076c:
            boolean r3 = r5 instanceof X.AnonymousClass5zX
            if (r3 == 0) goto L_0x07eb
            r2 = r5
            X.5zX r2 = (X.AnonymousClass5zX) r2
            r5 = 0
            X.AnonymousClass0wJ.A1M(r0, r5, r1)
            X.3HX r3 = r2.A00
            X.7h3 r2 = r2.A01
            java.lang.Object r2 = X.AnonymousClass7K7.A03(r3, r2)
            X.76c r2 = (X.C1196076c) r2
            r2.A00 = r0
            X.0Oa r2 = r2.A04
            java.lang.Object r4 = X.C18190wL.A0f(r2)
            X.6qE r4 = (X.C112806qE) r4
            r2 = 44
            java.lang.Object r2 = X.C127397h3.A0A(r1, r2)
            boolean r2 = X.AnonymousClass2LL.A00(r2, r5)
            if (r2 == 0) goto L_0x07df
            X.51x r6 = r4.A02
            boolean r2 = r6.isShowing()
            if (r2 == 0) goto L_0x07cf
            X.0Oa r2 = r4.A04
            java.lang.Object r2 = r2.getValue()
            X.78A r2 = (X.AnonymousClass78A) r2
            X.7Di r2 = r2.A01(r0, r1)
            if (r2 == 0) goto L_0x07cb
            android.view.View r1 = r6.getContentView()
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView"
            X.C04220Ms.A0C(r1, r0)
            X.LLH r1 = (X.LLH) r1
            r1.setRenderTree(r2)
            X.6uk r0 = r4.A00
            if (r0 == 0) goto L_0x07cb
            android.graphics.RectF r1 = r0.A02
            float r0 = r1.left
            int r2 = (int) r0
            float r0 = r1.top
            int r1 = (int) r0
            r0 = -1
            r6.update(r2, r1, r0, r0)
        L_0x07cb:
            r4.A01 = r5
            goto L_0x0093
        L_0x07cf:
            X.6uk r1 = r4.A00
            if (r1 == 0) goto L_0x07cb
            android.graphics.RectF r3 = r1.A02
            float r1 = r3.left
            int r2 = (int) r1
            float r1 = r3.top
            int r1 = (int) r1
            r6.A01(r0, r2, r1)
            goto L_0x07cb
        L_0x07df:
            X.51x r0 = r4.A02
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x07cb
            r4.A00()
            goto L_0x07cb
        L_0x07eb:
            boolean r3 = r5 instanceof X.AnonymousClass5z8
            if (r3 == 0) goto L_0x08b2
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            X.AnonymousClass0wJ.A1O(r2, r1)
            java.lang.Object r3 = X.AnonymousClass7K7.A03(r2, r1)
            X.6qE r3 = (X.C112806qE) r3
            X.6uk r4 = r3.A00
            if (r4 == 0) goto L_0x0fbf
            r3 = 42
            X.7h3 r11 = r1.A0K(r3)
            r7 = 40
            r12 = 0
            r10 = 0
            if (r11 == 0) goto L_0x08a9
            X.7h3 r8 = X.C127397h3.A05(r11)
            if (r8 == 0) goto L_0x08a6
            r3 = 13314(0x3402, float:1.8657E-41)
            X.7h3 r6 = new X.7h3
            r6.<init>(r3)
            X.794 r3 = X.AnonymousClass794.A00()
            X.6r7 r3 = r3.A07
            android.graphics.drawable.Drawable r14 = r3.A00(r2, r8, r6)
        L_0x0823:
            int r19 = X.C120507Be.A00(r2, r11)
            float r17 = X.AnonymousClass6Q2.A00(r11, r7)
            r3 = 46
            float r18 = X.AnonymousClass6Q2.A00(r11, r3)
            android.content.Context r9 = r2.A00
            r3 = 52
            r8 = 0
            X.7h3 r3 = r11.A0K(r3)
            if (r3 == 0) goto L_0x0840
            int r8 = X.C101086Pv.A00(r2, r3, r5)
        L_0x0840:
            X.C04220Ms.A06(r9)
            r3 = 58
            float r3 = r11.A0G(r3, r10)
            float r6 = X.AnonymousClass6QB.A00(r9, r3)
            r3 = 57
            float r3 = r11.A0G(r3, r10)
            float r5 = X.AnonymousClass6QB.A00(r9, r3)
            r3 = 59
            float r3 = r11.A0G(r3, r10)
            float r3 = X.AnonymousClass6QB.A00(r9, r3)
            X.6uZ r15 = new X.6uZ
            r15.<init>(r6, r5, r3, r8)
        L_0x0866:
            android.util.SparseArray r1 = r1.A04
            java.lang.String r7 = X.C86114wI.A0m(r1, r7)
            java.lang.Integer[] r6 = X.C18240wQ.A1Z()
            int r5 = r6.length
            r3 = 0
        L_0x0872:
            if (r3 >= r5) goto L_0x0fb8
            r16 = r6[r3]
            int r1 = r16.intValue()
            switch(r1) {
                case 1: goto L_0x08a0;
                case 2: goto L_0x08a3;
                default: goto L_0x087d;
            }
        L_0x087d:
            java.lang.String r1 = "default"
        L_0x087f:
            boolean r1 = X.C04220Ms.A0I(r1, r7)
            if (r1 == 0) goto L_0x089d
            X.6up r13 = new X.6up
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.6tc r3 = new X.6tc
            r3.<init>(r13, r4)
            android.content.Context r2 = r2.A00
            X.C04220Ms.A06(r2)
            X.4xS r1 = new X.4xS
            r1.<init>(r2, r3)
            r0.setBackground(r1)
            return r12
        L_0x089d:
            int r3 = r3 + 1
            goto L_0x0872
        L_0x08a0:
            java.lang.String r1 = "shark-fin"
            goto L_0x087f
        L_0x08a3:
            java.lang.String r1 = "none"
            goto L_0x087f
        L_0x08a6:
            r14 = r12
            goto L_0x0823
        L_0x08a9:
            r14 = r12
            r15 = r12
            r19 = 0
            r17 = 0
            r18 = 0
            goto L_0x0866
        L_0x08b2:
            boolean r3 = r5 instanceof X.AnonymousClass5z7
            if (r3 != 0) goto L_0x0093
            boolean r3 = r5 instanceof X.AnonymousClass5z6
            if (r3 == 0) goto L_0x08cc
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.7h3 r3 = X.C127397h3.A05(r1)
            if (r3 == 0) goto L_0x0093
            r1 = 0
            int r1 = X.C101086Pv.A00(r2, r3, r1)
            r0.setColorFilter(r1)
            goto L_0x0093
        L_0x08cc:
            boolean r3 = r5 instanceof X.AnonymousClass5z5
            if (r3 == 0) goto L_0x09e8
            r7 = r5
            X.5z5 r7 = (X.AnonymousClass5z5) r7
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            java.lang.Object r6 = X.AnonymousClass7K7.A04(r2, r1)
            X.6n5 r6 = (X.C111286n5) r6
            if (r6 == 0) goto L_0x107f
            r9 = 0
            r0.setIndeterminate(r9)
            r0.setMin(r9)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.setMax(r3)
            r4 = 40
            r3 = 0
            float r4 = r1.A0G(r4, r3)
            r3 = 1325400064(0x4f000000, float:2.14748365E9)
            float r4 = r4 * r3
            int r3 = (int) r4
            r0.setProgress(r3)
            r3 = 38
            X.6jp r14 = r1.A0L(r3)
            r3 = 42
            X.6jp r15 = r1.A0L(r3)
            r3 = 41
            X.6jp r16 = r1.A0L(r3)
            android.graphics.drawable.Drawable r3 = r6.A08
            if (r3 != 0) goto L_0x09e2
            android.graphics.drawable.Drawable r8 = r0.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            if (r8 == 0) goto L_0x1078
            r3 = 16908288(0x1020000, float:2.387723E-38)
            android.graphics.drawable.Drawable r3 = r8.findDrawableByLayerId(r3)
            android.graphics.drawable.GradientDrawable r5 = X.AnonymousClass7CE.A00(r3)
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            android.graphics.drawable.Drawable r3 = r8.findDrawableByLayerId(r3)
            android.graphics.drawable.GradientDrawable r4 = X.AnonymousClass7CE.A00(r3)
            r3 = 16908303(0x102000f, float:2.387727E-38)
            android.graphics.drawable.Drawable r3 = r8.findDrawableByLayerId(r3)
            android.graphics.drawable.GradientDrawable r3 = X.AnonymousClass7CE.A00(r3)
            if (r5 == 0) goto L_0x1071
            if (r4 == 0) goto L_0x1071
            if (r3 == 0) goto L_0x1071
            r6.A09 = r5
            r6.A0A = r4
            r6.A0B = r3
            android.content.Context r3 = r2.A00
            android.util.DisplayMetrics r12 = X.C18230wP.A0E(r3)
            android.content.res.Resources$Theme r5 = r3.getTheme()
            r3 = 18
            float r4 = (float) r3
            int r3 = r12.densityDpi
            float r3 = (float) r3
            r13 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 / r13
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            float r3 = (float) r3
            int r3 = (int) r3
            r6.A02 = r3
            r10 = 16843818(0x101042a, float:2.3696546E-38)
            r4 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r8 = 1
            int r3 = X.C86114wI.A06(r5, r10, r4)
            r6.A01 = r3
            r3 = 2
            float r11 = (float) r3
            int r3 = r12.densityDpi
            float r3 = (float) r3
            float r3 = r3 / r13
            float r11 = r11 * r3
            int r3 = java.lang.Math.round(r11)
            float r3 = (float) r3
            int r3 = (int) r3
            r6.A04 = r3
            int r3 = X.C86114wI.A06(r5, r10, r4)
            r6.A03 = r3
            r4 = 16843817(0x1010429, float:2.3696543E-38)
            r3 = -7829368(0xffffffffff888888, float:NaN)
            int r3 = X.C86114wI.A06(r5, r4, r3)
            r6.A05 = r3
            int r5 = r6.A02
            int r4 = r6.A01
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r3.setShape(r8)
            r3.setSize(r5, r5)
            r3.setColor(r4)
            r0.setThumb(r3)
            int r3 = r6.A04
            X.AnonymousClass7CE.A01(r6, r3)
            int r4 = r6.A03
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.drawable.GradientDrawable r3 = r6.A0A
            if (r3 == 0) goto L_0x09b1
            X.C86154wM.A1B(r5, r3, r4)
        L_0x09b1:
            int r4 = r6.A05
            android.graphics.drawable.GradientDrawable r3 = r6.A09
            if (r3 == 0) goto L_0x09ba
            X.C86154wM.A1B(r5, r3, r4)
        L_0x09ba:
            android.graphics.drawable.Drawable r3 = r0.getThumb()
            r6.A08 = r3
        L_0x09c0:
            r3 = 43
            X.7h3 r3 = r1.A0K(r3)
            if (r3 == 0) goto L_0x09df
            int r8 = X.C101086Pv.A00(r2, r3, r9)
        L_0x09cc:
            r3 = 48
            X.7h3 r3 = r1.A0K(r3)
            if (r3 == 0) goto L_0x09dc
            int r5 = X.C101086Pv.A00(r2, r3, r9)
        L_0x09d8:
            int r10 = r6.A04
            goto L_0x0fc6
        L_0x09dc:
            int r5 = r6.A05
            goto L_0x09d8
        L_0x09df:
            int r8 = r6.A03
            goto L_0x09cc
        L_0x09e2:
            android.graphics.drawable.Drawable r3 = r6.A07
            r0.setThumb(r3)
            goto L_0x09c0
        L_0x09e8:
            boolean r3 = r5 instanceof X.AnonymousClass5z4
            if (r3 == 0) goto L_0x0a73
            r9 = 0
            X.C04220Ms.A0B(r0, r9)
            X.AnonymousClass0wJ.A1O(r2, r1)
            java.lang.Object r8 = X.AnonymousClass7K7.A04(r2, r1)
            if (r8 == 0) goto L_0x1086
            X.6bZ r8 = (X.C104306bZ) r8
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r3 = r8.A00
            r11 = 0
            if (r3 != 0) goto L_0x0a72
            java.lang.String r10 = X.C18220wO.A0o(r1)
            r4 = 36
            java.lang.String r3 = X.C122037Js.A01()
            java.lang.String r3 = X.C127397h3.A0F(r1, r3, r4)
            java.lang.String r5 = X.C127397h3.A0B(r1)
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r7 = new com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel
            r7.<init>()
            androidx.fragment.app.Fragment r6 = X.C63913ic.A00(r2)
            com.facebookpay.msc.logging.LoggingData r4 = new com.facebookpay.msc.logging.LoggingData
            r4.<init>(r3)
            java.lang.String r3 = "logging_data"
            kotlin.Pair r4 = X.C18180wK.A0p(r3, r4)
            java.lang.String r3 = "parent_view_name"
            kotlin.Pair r3 = X.C18180wK.A0p(r3, r5)
            kotlin.Pair[] r3 = new kotlin.Pair[]{r4, r3}
            android.os.Bundle r3 = X.C98316Fa.A00(r3)
            r7.A03(r3)
            X.0pE r3 = r6.mLifecycleRegistry
            r3.A07(r7)
            android.util.SparseArray r4 = X.AnonymousClass6IJ.A00()
            r3 = 33
            X.7jd r5 = new X.7jd
            r5.<init>(r4, r9)
            java.lang.Object r3 = r4.get(r3)
            if (r3 == 0) goto L_0x0a4e
            r5 = r3
        L_0x0a4e:
            X.56r r3 = X.C880856r.A04(r10)
            r7.A04(r3)
            X.M5J r4 = r7.A06
            com.facebook.redex.IDxObserverShape15S0500000_2_I2 r3 = new com.facebook.redex.IDxObserverShape15S0500000_2_I2
            r12 = r3
            r13 = r9
            r14 = r1
            r15 = r5
            r16 = r7
            r17 = r0
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r4.A0C(r6, r3)
            X.56r r1 = r7.A08
            r0 = 9
            X.C86104wH.A1F(r6, r1, r0)
            r8.A00 = r7
        L_0x0a72:
            return r11
        L_0x0a73:
            boolean r3 = r5 instanceof X.C95175za
            if (r3 == 0) goto L_0x0a99
            X.AnonymousClass0wJ.A1O(r2, r1)
            r4 = 42
            X.7h3 r3 = r1.A0K(r4)
            java.lang.String r0 = X.C18230wP.A0o(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0a98
            if (r3 == 0) goto L_0x0a98
            r3.A0N(r4)
            r0 = 44
            android.util.SparseArray r1 = r3.A04
            r1.get(r0)
            r0 = 43
            r1.get(r0)
        L_0x0a98:
            return r2
        L_0x0a99:
            boolean r3 = r5 instanceof X.C95205zd
            if (r3 == 0) goto L_0x0ab9
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r2 = 0
            X.AnonymousClass0wJ.A1M(r0, r2, r1)
            java.lang.String r2 = X.C18220wO.A0o(r1)
            if (r2 == 0) goto L_0x1094
            java.lang.String r3 = X.C18230wP.A0o(r1)
            if (r3 == 0) goto L_0x108d
            r6 = 0
            java.lang.String r4 = "text/html"
            java.lang.String r5 = "UTF-8"
            r1 = r0
            r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)
            return r6
        L_0x0ab9:
            boolean r3 = r5 instanceof X.AnonymousClass5zT
            if (r3 == 0) goto L_0x10a2
            r0 = r5
            X.5zT r0 = (X.AnonymousClass5zT) r0
            java.lang.Object r4 = X.AnonymousClass7K7.A04(r2, r1)
            X.6bW r4 = (X.C104276bW) r4
            if (r4 == 0) goto L_0x109b
            android.os.Handler r3 = r0.A00
            X.82i r0 = new X.82i
            r0.<init>(r4, r2, r1, r6)
            r3.post(r0)
            goto L_0x0093
        L_0x0ad4:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r4)
            throw r0
        L_0x0ad9:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r4)
            throw r0
        L_0x0ade:
            float r3 = X.AnonymousClass7Kk.A01(r3)     // Catch:{ 1zB -> 0x0ae8 }
            int r3 = (int) r3     // Catch:{ 1zB -> 0x0ae8 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)     // Catch:{ 1zB -> 0x0ae8 }
            goto L_0x0aee
        L_0x0ae8:
            r4 = move-exception
            java.lang.String r3 = "UserAvatarBinderUtils"
            X.C30967GcS.A03(r3, r4)
        L_0x0aee:
            X.6jp r11 = X.C18230wP.A0V(r1)
            java.lang.String r3 = X.C127397h3.A0B(r1)
            if (r3 == 0) goto L_0x0b08
            float r3 = X.AnonymousClass7Kk.A01(r3)     // Catch:{ 1zB -> 0x0b02 }
            int r3 = (int) r3     // Catch:{ 1zB -> 0x0b02 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch:{ 1zB -> 0x0b02 }
            goto L_0x0b08
        L_0x0b02:
            r4 = move-exception
            java.lang.String r3 = "UserAvatarBinderUtils"
            X.C30967GcS.A03(r3, r4)
        L_0x0b08:
            java.lang.String r3 = X.C86114wI.A0m(r6, r7)
            if (r3 == 0) goto L_0x0b1e
            float r3 = X.AnonymousClass7Kk.A01(r3)     // Catch:{ 1zB -> 0x0b18 }
            int r3 = (int) r3     // Catch:{ 1zB -> 0x0b18 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)     // Catch:{ 1zB -> 0x0b18 }
            goto L_0x0b1e
        L_0x0b18:
            r4 = move-exception
            java.lang.String r3 = "UserAvatarBinderUtils"
            X.C30967GcS.A03(r3, r4)
        L_0x0b1e:
            java.lang.String r3 = X.C127397h3.A0E(r1)
            if (r3 == 0) goto L_0x0b33
            int r3 = X.AnonymousClass7Kk.A04(r3)     // Catch:{ 1zB -> 0x0b2d }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ 1zB -> 0x0b2d }
            goto L_0x0b33
        L_0x0b2d:
            r4 = move-exception
            java.lang.String r3 = "UserAvatarBinderUtils"
            X.C30967GcS.A03(r3, r4)
        L_0x0b33:
            r3 = 45
            java.util.List r4 = r1.A0R(r3)
            r7 = 0
            X.C04220Ms.A0B(r4, r7)
            X.6jp r10 = X.C127397h3.A08(r1)
            r3 = 40
            java.lang.Object r3 = X.C127397h3.A0A(r1, r3)
            boolean r17 = X.AnonymousClass2LL.A00(r3, r7)
            r3 = 46
            java.lang.String r3 = X.C86114wI.A0m(r6, r3)
            if (r3 == 0) goto L_0x0b54
            r15 = r3
        L_0x0b54:
            X.6mf r9 = new X.6mf
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            X.C117996za.A01(r9, r0, r2, r1, r5)
            return r8
        L_0x0b5f:
            java.lang.String r1 = "UserAvatarBinderUtils"
            java.lang.String r0 = "User is null in UserAvatar"
            X.C30967GcS.A02(r1, r0)
            return r8
        L_0x0b67:
            X.5Bv r18 = new X.5Bv
            r3 = r18
            r3.<init>(r0)
            r3 = 0
            java.lang.Long r25 = java.lang.Long.valueOf(r3)
            r0 = 46
            X.7h3 r6 = r1.A0K(r0)
            r7 = 36
            if (r6 == 0) goto L_0x0c9b
            r5 = 35
            android.util.SparseArray r0 = r6.A04
            java.lang.String r31 = X.C86114wI.A0m(r0, r5)
            long r3 = r6.A0I(r7, r3)
            java.lang.Long r25 = java.lang.Long.valueOf(r3)
        L_0x0b8e:
            X.7h3 r7 = r1.A0K(r7)
            androidx.fragment.app.Fragment r21 = X.C63913ic.A00(r2)
            r4 = 42
            java.lang.String r0 = ""
            if (r6 == 0) goto L_0x0c97
            java.lang.String r9 = r6.A0O(r4, r0)
        L_0x0ba0:
            if (r7 != 0) goto L_0x0c8d
            r29 = r19
        L_0x0ba4:
            r5 = 40
            r3 = 0
            if (r6 == 0) goto L_0x0bb4
            java.lang.Object r6 = X.C127397h3.A0A(r6, r5)
            boolean r6 = X.AnonymousClass2LL.A00(r6, r3)
            r12 = 1
            if (r6 != 0) goto L_0x0bb5
        L_0x0bb4:
            r12 = 0
        L_0x0bb5:
            r8 = 41
            java.lang.String r6 = r1.A0O(r8, r0)
            X.7vA r11 = new X.7vA
            r11.<init>(r6)
            r6 = 44
            java.lang.String r26 = r1.A0O(r6, r0)
            java.lang.String r27 = r1.A0O(r4, r0)
            r6 = 43
            android.util.SparseArray r4 = r1.A04
            java.lang.String r28 = X.C86114wI.A0m(r4, r6)
            r6 = 38
            if (r7 != 0) goto L_0x0c85
            r30 = r19
        L_0x0bd8:
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r12)
            if (r9 == 0) goto L_0x0be4
            boolean r7 = r9.equals(r0)
            if (r7 == 0) goto L_0x0be6
        L_0x0be4:
            r9 = r19
        L_0x0be6:
            X.BTy r17 = new X.BTy
            r20 = r17
            r22 = r11
            r32 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.7xI r7 = new X.7xI
            r9 = r17
            r7.<init>(r10, r2, r1, r9)
            java.lang.String r28 = r1.A0O(r8, r0)
            boolean r30 = r24.booleanValue()
            X.6pm r9 = new X.6pm
            r24 = r9
            r25 = r21
            r26 = r23
            r27 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30)
            X.0Oa r7 = r9.A01
            java.lang.Object r7 = r7.getValue()
            X.8v9 r7 = (X.AnonymousClass8v9) r7
            r7.A02(r3)
            r9.A00()
            X.7ss r7 = r10.A00
            if (r7 != 0) goto L_0x0cd0
            android.content.Context r2 = r2.A00
            r34 = r2
            r12 = 35
            java.util.List r2 = r1.A0R(r12)
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r16 = r2.iterator()
        L_0x0c31:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0c9f
            X.7h3 r11 = X.C86144wL.A0V(r16)
            r9 = 48
            X.7h3 r2 = r11.A0K(r9)
            if (r2 != 0) goto L_0x0c45
            r9 = 38
        L_0x0c45:
            X.7h3 r2 = r11.A0K(r9)
            if (r2 == 0) goto L_0x0c31
            com.instagram.model.mediasize.ImageInfo r15 = new com.instagram.model.mediasize.ImageInfo
            r20 = r15
            r21 = r19
            r22 = r19
            r23 = r19
            r24 = r19
            r25 = r19
            r26 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26)
            java.util.ArrayList r14 = X.AnonymousClass0wJ.A0v()
            java.lang.String r13 = r2.A0O(r6, r0)
            int r11 = r2.A0H(r5, r3)
            int r9 = r2.A0H(r12, r3)
            com.instagram.model.mediasize.ExtendedImageUrl r2 = new com.instagram.model.mediasize.ExtendedImageUrl
            r2.<init>(r13, r11, r9)
            r14.add(r2)
            com.instagram.model.mediasize.ImageInfo r11 = X.C122057Ju.A05(r15, r14)
            com.instagram.model.shopping.ProductImageContainer r9 = new com.instagram.model.shopping.ProductImageContainer
            r2 = r19
            r9.<init>(r11, r2)
            r7.add(r9)
            goto L_0x0c31
        L_0x0c85:
            android.util.SparseArray r7 = r7.A04
            java.lang.String r30 = X.C86114wI.A0m(r7, r6)
            goto L_0x0bd8
        L_0x0c8d:
            r5 = 35
            android.util.SparseArray r3 = r7.A04
            java.lang.String r29 = X.C86114wI.A0m(r3, r5)
            goto L_0x0ba4
        L_0x0c97:
            r9 = r19
            goto L_0x0ba0
        L_0x0c9b:
            r31 = r19
            goto L_0x0b8e
        L_0x0c9f:
            java.lang.String r24 = X.C86114wI.A0m(r4, r5)
            java.lang.String r25 = X.C86114wI.A0m(r4, r6)
            java.lang.String r28 = X.C86114wI.A0m(r4, r5)
            X.9vr r22 = X.C170969vr.GRID
            java.lang.String r1 = r1.A0O(r8, r0)
            X.7vA r0 = new X.7vA
            r0.<init>(r1)
            java.lang.String r26 = "bloks"
            r23 = r17
            r27 = r26
            r29 = r7
            r30 = r3
            r31 = r3
            r32 = r3
            r33 = r3
            r20 = r34
            r21 = r0
            X.7ss r7 = X.AnonymousClass6VI.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r10.A00 = r7
        L_0x0cd0:
            r0 = r18
            X.C1186271q.A01(r0, r7, r3)
            return r19
        L_0x0cd6:
            java.lang.String r4 = X.C86114wI.A0m(r11, r0)     // Catch:{ IOException -> 0x0d1a }
            if (r4 == 0) goto L_0x0d1a
            X.0Ot r0 = X.C04690Os.A02     // Catch:{ IOException -> 0x0d1a }
            X.0Os r0 = r0.A04(r5, r4)     // Catch:{ IOException -> 0x0d1a }
            X.BKU r4 = X.BKU.A08(r0, r10)     // Catch:{ IOException -> 0x0d1a }
            if (r4 == 0) goto L_0x0d1a
            com.instagram.model.mediasize.ImageInfo r0 = r4.A2K()
            if (r0 == 0) goto L_0x0d1a
            com.instagram.model.shopping.Product r0 = r9.A01()
            if (r0 == 0) goto L_0x0d1a
            com.instagram.model.shopping.productfeed.ProductTile r0 = r9.A05
            if (r0 == 0) goto L_0x0d1a
            com.instagram.common.typedurl.ImageUrl r17 = r4.A22()
            com.instagram.model.shopping.productfeed.ProductTile r12 = r9.A05
            r12.A00 = r4
            X.BKN r0 = r4.A0f
            java.lang.String r11 = r0.A4Y
            com.instagram.model.mediasize.ImageInfo r7 = r4.A2K()
            java.lang.String r6 = r0.A4q
            com.instagram.model.shopping.Product r0 = r9.A01()
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r0.A00
            com.instagram.model.shopping.Merchant r4 = r0.A0C
            com.instagram.model.shopping.productfeed.ProductTileMedia r0 = new com.instagram.model.shopping.productfeed.ProductTileMedia
            r0.<init>(r7, r4, r11, r6)
            r12.A05 = r0
            goto L_0x0d1c
        L_0x0d1a:
            r17 = r13
        L_0x0d1c:
            X.AQH r0 = r3.A03
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r10)
            r15 = r2
            r16 = r1
            r18 = r0
            r19 = r9
            r20 = r5
            r21 = r8
            X.C19310AuE.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.7s2 r0 = new X.7s2
            r18 = r0
            r19 = r3
            r21 = r2
            r22 = r1
            r24 = r9
            r25 = r5
            r26 = r8
            r20 = r14
            r23 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r3.A01 = r0
            r0 = 74
            X.6jp r9 = r1.A0L(r0)
            r0 = 73
            X.6jp r10 = r1.A0L(r0)
            r0 = 77
            X.6jp r11 = r1.A0L(r0)
            r0 = 76
            X.6jp r12 = r1.A0L(r0)
            X.6qP r6 = new X.6qP
            r7 = r2
            r8 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4 = 2
            com.facebook.redex.IDxEListenerShape166S0200000_2_I2 r0 = new com.facebook.redex.IDxEListenerShape166S0200000_2_I2
            r0.<init>(r4, r6, r3)
            r3.A02 = r0
            r4 = 1
            com.facebook.redex.IDxEListenerShape96S0300000_2_I2 r0 = new com.facebook.redex.IDxEListenerShape96S0300000_2_I2
            r0.<init>(r4, r3, r2, r1)
            r3.A00 = r0
            X.KHq r2 = X.AnonymousClass3LY.A00(r5)
            java.lang.Class<X.BAh> r1 = X.C19786BAh.class
            X.4pY r0 = r3.A01
            r2.A01(r0, r1)
            java.lang.Class<X.7rs> r1 = X.C131387rs.class
            X.4pY r0 = r3.A02
            r2.A01(r0, r1)
            java.lang.Class<X.BBF> r1 = X.BBF.class
            X.4pY r0 = r3.A00
            r2.A01(r0, r1)
            return r13
        L_0x0d92:
            com.instagram.model.shopping.Product r5 = X.C19249AtE.A01(r3)
            X.BEh r3 = X.AnonymousClass6VJ.A00(r6)
            boolean r3 = r3.A05(r5)
            r9.setSelected(r3)
            r3 = 54
            android.util.SparseArray r8 = r1.A04
            java.lang.String r7 = X.C86114wI.A0m(r8, r3)
            java.lang.String r3 = "large"
            boolean r7 = r3.equals(r7)
            r3 = 2131234280(0x7f080de8, float:1.8084721E38)
            if (r7 == 0) goto L_0x0db7
            r3 = 2131234279(0x7f080de7, float:1.808472E38)
        L_0x0db7:
            r9.setImageResource(r3)
            android.graphics.drawable.Drawable r3 = r9.getDrawable()
            if (r3 == 0) goto L_0x0de2
            r3 = 53
            java.lang.String r7 = X.C86114wI.A0m(r8, r3)
            java.lang.String r3 = "light"
            boolean r3 = r3.equals(r7)
            android.content.Context r7 = r2.A00
            if (r3 == 0) goto L_0x0e5c
            r3 = 2131099851(0x7f0600cb, float:1.7812067E38)
            int r3 = r7.getColor(r3)
            android.graphics.drawable.Drawable r7 = r9.getDrawable()
            android.graphics.ColorFilter r3 = X.C63393hP.A00(r3)
        L_0x0ddf:
            r7.setColorFilter(r3)
        L_0x0de2:
            X.7gu r11 = new X.7gu
            r11.<init>()
            java.lang.ref.WeakReference r3 = X.C86144wL.A0w(r9)
            r11.A02(r3)
            r3 = 55
            X.6jp r7 = r1.A0L(r3)
            r3 = 58
            X.6jp r3 = r1.A0L(r3)
            X.6q2 r8 = new X.6q2
            r8.<init>(r2, r1, r7, r3)
            r7 = 0
            r0.setVisibility(r7)
            com.facebook.redex.IDxCListenerShape0S0800000_3_I2 r3 = new com.facebook.redex.IDxCListenerShape0S0800000_3_I2
            r17 = r11
            r18 = r9
            r19 = r8
            r21 = r10
            r22 = r7
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.setOnClickListener(r3)
            com.facebook.redex.IDxEListenerShape96S0300000_2_I2 r0 = new com.facebook.redex.IDxEListenerShape96S0300000_2_I2
            r0.<init>(r7, r5, r9, r6)
            r4.A01 = r0
            r0 = 57
            X.6jp r16 = r1.A0L(r0)
            r0 = 56
            X.6jp r17 = r1.A0L(r0)
            r0 = 61
            X.6jp r18 = r1.A0L(r0)
            r0 = 59
            X.6jp r19 = r1.A0L(r0)
            X.6qP r3 = new X.6qP
            r13 = r3
            r14 = r2
            r15 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1 = 1
            com.facebook.redex.IDxEListenerShape166S0200000_2_I2 r0 = new com.facebook.redex.IDxEListenerShape166S0200000_2_I2
            r0.<init>(r1, r3, r5)
            r4.A00 = r0
            X.KHq r2 = X.AnonymousClass3LY.A00(r6)
            java.lang.Class<X.BAh> r1 = X.C19786BAh.class
            X.4pY r0 = r4.A01
            r2.A01(r0, r1)
            java.lang.Class<X.7rs> r1 = X.C131387rs.class
            X.4pY r0 = r4.A00
            r2.A01(r0, r1)
            return r12
        L_0x0e5c:
            r3 = 2130969932(0x7f04054c, float:1.754856E38)
            int r3 = X.C121907Is.A00(r7, r3)
            android.graphics.ColorFilter r3 = X.C63393hP.A00(r3)
            android.graphics.drawable.Drawable r7 = r9.getDrawable()
            goto L_0x0ddf
        L_0x0e6d:
            java.lang.String r0 = "PTR container defines a controller but none was found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0e74:
            java.lang.String r0 = "A controller was specified for this component but none was found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0e7b:
            android.content.Context r3 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0e84 }
            android.graphics.drawable.Drawable r8 = X.C30842GYq.A01(r3, r7)     // Catch:{ IllegalArgumentException -> 0x0e84 }
            if (r8 == 0) goto L_0x0e93
            goto L_0x0e92
        L_0x0e84:
            r8 = r4
            goto L_0x0e93
        L_0x0e86:
            r5 = 41
            java.lang.String r3 = ""
            java.lang.String r3 = r1.A0O(r5, r3)
            X.C117946zV.A00(r4, r0, r2, r1, r3)
            goto L_0x0ec8
        L_0x0e92:
            r9 = 1
        L_0x0e93:
            X.0ik r3 = new X.0ik
            r3.<init>(r10)
            X.0nS r5 = r3.A00()
            java.lang.String r3 = "ig_bloks_use_local_asset"
            X.0A2 r5 = X.AnonymousClass0wJ.A0M(r5, r3)
            r3 = 818(0x332, float:1.146E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r6 = X.C18180wK.A0I(r5, r3)
            boolean r3 = X.AnonymousClass0wJ.A1U(r6)
            if (r3 == 0) goto L_0x0ec3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            java.lang.String r3 = "is_local"
            r6.A0Q(r3, r5)
            r3 = 717(0x2cd, float:1.005E-42)
            java.lang.String r3 = X.C28174Ezk.A00(r3)
            r6.A0T(r3, r7)
            r6.Bb4()
        L_0x0ec3:
            if (r9 == 0) goto L_0x0e86
            r0.setImageDrawable(r8)
        L_0x0ec8:
            r5 = 40
            X.7h3 r3 = r1.A0K(r5)
            if (r3 == 0) goto L_0x0ef8
            X.7h3 r3 = r1.A0K(r5)
            r1 = 0
            int r3 = X.C101086Pv.A00(r2, r3, r1)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            int r2 = android.graphics.Color.alpha(r3)
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x0eec
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 | r1
        L_0x0eec:
            r0.setColorFilter(r3)
            r0.setImageAlpha(r2)
        L_0x0ef2:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
            return r4
        L_0x0ef8:
            r3 = 38
            android.util.SparseArray r2 = r1.A04
            java.lang.String r1 = X.C86114wI.A0m(r2, r3)
            if (r1 == 0) goto L_0x0ef2
            java.lang.String r1 = X.C86114wI.A0m(r2, r3)     // Catch:{ 1zB -> 0x0f24 }
            int r3 = X.AnonymousClass7Kk.A04(r1)     // Catch:{ 1zB -> 0x0f24 }
            r1 = 1
            X.C04220Ms.A0B(r0, r1)     // Catch:{ 1zB -> 0x0f24 }
            int r2 = android.graphics.Color.alpha(r3)     // Catch:{ 1zB -> 0x0f24 }
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x0f1d
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 | r1
        L_0x0f1d:
            r0.setColorFilter(r3)     // Catch:{ 1zB -> 0x0f24 }
            r0.setImageAlpha(r2)     // Catch:{ 1zB -> 0x0f24 }
            goto L_0x0ef2
        L_0x0f24:
            r2 = move-exception
            r0.setColorFilter(r4)
            java.lang.String r1 = "IgIconBinderUtils"
            X.C30967GcS.A03(r1, r2)
            goto L_0x0ef2
        L_0x0f2e:
            java.lang.String r2 = "cover"
            java.lang.String r2 = r1.A0O(r3, r2)     // Catch:{ 1zB -> 0x0f3c }
            android.widget.ImageView$ScaleType r2 = X.AnonymousClass7Kk.A0B(r2)     // Catch:{ 1zB -> 0x0f3c }
            r0.setScaleType(r2)     // Catch:{ 1zB -> 0x0f3c }
            goto L_0x0f41
        L_0x0f3c:
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r2)
        L_0x0f41:
            X.F1D r2 = r6.A00
            r4 = 0
            if (r2 == 0) goto L_0x0f4a
            r0.setImageDrawable(r2)
            return r4
        L_0x0f4a:
            r2 = 0
            com.facebook.redex.IDxCallbackShape139S0300000_2_I2 r3 = new com.facebook.redex.IDxCallbackShape139S0300000_2_I2
            r3.<init>(r2, r0, r5, r6)
            r0.setTag(r3)
            android.content.Context r0 = r0.getContext()
            X.GfD r2 = X.C29573FqZ.A00(r0)
            java.lang.String r0 = X.C18230wP.A0o(r1)
            r2.A04(r3, r0)
            return r4
        L_0x0f63:
            java.lang.String r0 = "Component defines a controller but none was found."
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0f6a:
            java.lang.String r0 = "No Clips In Feed Unit controller found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0f71:
            r3 = 35
            java.lang.Object r3 = X.C127397h3.A0A(r1, r3)
            X.6ds r3 = (X.C105716ds) r3
            if (r3 == 0) goto L_0x0f93
            com.instagram.model.hashtag.Hashtag r5 = r3.A00
            if (r5 == 0) goto L_0x0f93
            X.0kW r4 = X.C63913ic.A09(r2)
            X.7vp r3 = new X.7vp
            r3.<init>(r8, r2, r1, r7)
            r0.A01(r4, r3, r5)
        L_0x0f8b:
            X.7vq r3 = new X.7vq
            r3.<init>(r8, r2, r1)
            r0.A00 = r3
            return r6
        L_0x0f93:
            java.lang.String r3 = "Hashtag is required to render hashtag follow button properly"
            X.C30967GcS.A02(r4, r3)
            goto L_0x0f8b
        L_0x0f99:
            r2 = 44
            r4 = 0
            float r3 = r1.A0G(r2, r4)
            r2 = 42
            float r1 = r1.A0G(r2, r4)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r0.A01
            float r3 = r3 / r1
            r0.A00 = r3
            return r5
        L_0x0fac:
            android.content.res.ColorStateList r1 = X.AnonymousClass7CF.A01(r10, r6, r3, r4, r1)
            X.51d r5 = (X.C872551d) r5
            androidx.appcompat.widget.SwitchCompat r0 = r5.A00
            r0.setTrackTintList(r1)
            return r14
        L_0x0fb8:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0fbf:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0fc6:
            r4 = 46
            android.util.SparseArray r3 = r1.A04     // Catch:{ 1zB -> 0x0fd7 }
            java.lang.String r4 = X.C86114wI.A0m(r3, r4)     // Catch:{ 1zB -> 0x0fd7 }
            float r3 = (float) r10     // Catch:{ 1zB -> 0x0fd7 }
            if (r4 == 0) goto L_0x0fd5
            float r3 = X.AnonymousClass7Kk.A01(r4)     // Catch:{ 1zB -> 0x0fd7 }
        L_0x0fd5:
            int r10 = (int) r3     // Catch:{ 1zB -> 0x0fd7 }
            goto L_0x0fde
        L_0x0fd7:
            java.lang.String r4 = "BKBloksComponentsSliderBinderUtil"
            java.lang.String r3 = "Error while parsing slider track height"
            X.C30967GcS.A02(r4, r3)
        L_0x0fde:
            int r3 = r6.A04
            if (r10 == r3) goto L_0x0fe5
            X.AnonymousClass7CE.A01(r6, r10)
        L_0x0fe5:
            int r3 = r6.A03
            if (r8 == r3) goto L_0x0ff2
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC
            android.graphics.drawable.GradientDrawable r3 = r6.A0A
            if (r3 == 0) goto L_0x0ff2
            X.C86154wM.A1B(r4, r3, r8)
        L_0x0ff2:
            int r3 = r6.A05
            if (r5 == r3) goto L_0x0fff
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC
            android.graphics.drawable.GradientDrawable r3 = r6.A09
            if (r3 == 0) goto L_0x0fff
            X.C86154wM.A1B(r4, r3, r5)
        L_0x0fff:
            int r8 = r6.A02
            r4 = 45
            android.util.SparseArray r3 = r1.A04     // Catch:{ 1zB -> 0x1012 }
            java.lang.String r4 = X.C86114wI.A0m(r3, r4)     // Catch:{ 1zB -> 0x1012 }
            float r3 = (float) r8     // Catch:{ 1zB -> 0x1012 }
            if (r4 == 0) goto L_0x1010
            float r3 = X.AnonymousClass7Kk.A01(r4)     // Catch:{ 1zB -> 0x1012 }
        L_0x1010:
            int r8 = (int) r3     // Catch:{ 1zB -> 0x1012 }
            goto L_0x1019
        L_0x1012:
            java.lang.String r4 = "BKBloksComponentsSliderBinderUtil"
            java.lang.String r3 = "Error while parsing slider thumb diameter"
            X.C30967GcS.A02(r4, r3)
        L_0x1019:
            r3 = 44
            X.7h3 r3 = r1.A0K(r3)
            if (r3 == 0) goto L_0x105c
            int r5 = X.C101086Pv.A00(r2, r3, r9)
        L_0x1025:
            int r3 = r6.A00
            if (r8 == r3) goto L_0x1055
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r4 = 1
            r3.setShape(r4)
            r3.setSize(r8, r8)
        L_0x1035:
            r3.setColor(r5)
            r0.setThumb(r3)
            r6.A00 = r8
            r0.setSplitTrack(r9)
            r0.setPadding(r9, r9, r9, r9)
            r0.setThumbOffset(r9)
            r0.refreshDrawableState()
            r4 = 0
            if (r14 != 0) goto L_0x105f
            if (r15 != 0) goto L_0x105f
            if (r16 != 0) goto L_0x105f
            r6.A0D = r4
            r6.A0C = r4
            return r4
        L_0x1055:
            android.graphics.drawable.Drawable r3 = r0.getThumb()
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            goto L_0x1035
        L_0x105c:
            int r5 = r6.A01
            goto L_0x1025
        L_0x105f:
            r6.A0D = r1
            r6.A0C = r2
            X.7SA r3 = new X.7SA
            r10 = r3
            r11 = r7
            r12 = r6
            r13 = r2
            r14 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.setOnSeekBarChangeListener(r3)
            return r4
        L_0x1071:
            java.lang.String r0 = "Track is not using the default Drawable"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x1078:
            java.lang.String r0 = "Track drawable is null"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x107f:
            java.lang.String r0 = "SliderController is null even though a controller is defined"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x1086:
            java.lang.String r0 = "A controller was defined for this component but none was found."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x108d:
            java.lang.String r0 = "source cannot be null"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x1094:
            java.lang.String r0 = "baseUrl cannot be null"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x109b:
            java.lang.String r0 = "Popup container defines a controller but none was found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x10a2:
            r7 = r5
            X.5zW r7 = (X.AnonymousClass5zW) r7
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6 = 0
            X.C04220Ms.A0B(r0, r6)
            X.AnonymousClass0wJ.A1O(r2, r1)
            java.lang.Object r5 = X.AnonymousClass7K7.A04(r2, r1)
            X.6fu r5 = (X.C106956fu) r5
            java.lang.String r9 = X.C127397h3.A0D(r1)
            r4 = 43
            r3 = 0
            float r3 = r1.A0G(r4, r3)
            java.lang.Float r8 = java.lang.Float.valueOf(r3)
            r3 = 40
            java.util.List r3 = r1.A0R(r3)
            X.6u7 r4 = new X.6u7
            r4.<init>(r8, r9, r3)
            int r3 = r0.getChildCount()
            r10 = 0
            if (r3 <= 0) goto L_0x1162
            android.view.View r3 = X.AnonymousClass033.A00(r0, r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider"
            X.C04220Ms.A0C(r3, r0)
            X.52P r3 = (X.AnonymousClass52P) r3
            r7.A01 = r3
            java.util.List r3 = r4.A01
            if (r5 == 0) goto L_0x10fe
            X.6u7 r0 = r5.A01
            if (r0 == 0) goto L_0x10fe
            java.util.List r0 = r0.A01
        L_0x10ec:
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 != 0) goto L_0x1146
            java.lang.String r9 = "parametricSlider"
            if (r5 == 0) goto L_0x112e
            X.52P r8 = r7.A01
            if (r8 != 0) goto L_0x1100
            X.C04220Ms.A0E(r9)
            throw r10
        L_0x10fe:
            r0 = r10
            goto L_0x10ec
        L_0x1100:
            r8.setSplitTrack(r6)
            android.content.Context r3 = r8.getContext()
            r0 = 2131233476(0x7f080ac4, float:1.808309E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r8.setThumb(r0)
            android.graphics.drawable.Drawable r0 = r8.getThumb()
            r5.A00 = r0
            android.view.ViewTreeObserver r3 = r8.getViewTreeObserver()
            com.facebook.redex.IDxLListenerShape127S0200000_2_I2 r0 = new com.facebook.redex.IDxLListenerShape127S0200000_2_I2
            r0.<init>(r6, r5, r8)
            r3.addOnGlobalLayoutListener(r0)
            X.6u7 r0 = r5.A01
            if (r0 == 0) goto L_0x112e
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x112e
            r8.A00(r0)
        L_0x112e:
            java.lang.Float r0 = r4.A00
            if (r0 == 0) goto L_0x1146
            float r3 = r0.floatValue()
            r0 = 100
            float r0 = (float) r0
            float r3 = r3 * r0
            int r3 = (int) r3
            X.52P r0 = r7.A01
            if (r0 != 0) goto L_0x1143
            X.C04220Ms.A0E(r9)
            throw r10
        L_0x1143:
            r0.setProgress(r3)
        L_0x1146:
            if (r5 == 0) goto L_0x114c
            X.6u7 r0 = r5.A01
            if (r0 != 0) goto L_0x1163
        L_0x114c:
            com.facebook.redex.IDxCListenerShape266S0200000_2_I2 r3 = new com.facebook.redex.IDxCListenerShape266S0200000_2_I2
            r3.<init>(r6, r2, r1)
            r7.A00 = r3
            X.52P r0 = r7.A01
            if (r0 != 0) goto L_0x115d
            java.lang.String r0 = "parametricSlider"
            X.C04220Ms.A0E(r0)
            throw r10
        L_0x115d:
            r0.setOnSeekBarChangeListener(r3)
            if (r5 != 0) goto L_0x1163
        L_0x1162:
            return r10
        L_0x1163:
            r5.A01 = r4
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90995fQ.A0P(android.view.View, X.3HX, X.7h3, java.lang.Object):java.lang.Object");
    }
}
