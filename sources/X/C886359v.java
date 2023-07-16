package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.facebookpay.widget.disclaimer.DisclaimerLayout;
import com.facebookpay.widget.listcell.EntityListCell;
import com.facebookpay.widget.listcell.ListCell;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;
import com.facebookpay.widget.pricetable.PriceTable;
import com.fbpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import com.instagram.barcelona.R;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.59v  reason: invalid class name and case insensitive filesystem */
public abstract class C886359v extends JWT {
    public View.OnClickListener A00 = C64813ru.A00;
    public boolean A01;
    public final AnonymousClass69U A02;
    public final LoggingContext A03;

    public C886359v(AnonymousClass69U r2, LoggingContext loggingContext, boolean z) {
        C04220Ms.A0B(r2, 1);
        this.A02 = r2;
        this.A03 = loggingContext;
        this.A01 = z;
    }

    public static void A04(ListCell listCell) {
        listCell.setPrimaryText(listCell.getContext().getString(2131826420));
        listCell.setPrimaryTextStyle(AnonymousClass69Q.A0T);
        listCell.setOnClickListener((View.OnClickListener) null);
    }

    public static String A01(Context context, CurrencyAmount currencyAmount, String str, Locale locale, int i) {
        if (i == 0 || currencyAmount == null || AnonymousClass8bQ.A0n(currencyAmount.A01)) {
            return str;
        }
        String format = String.format(locale, "%1s • %2s", Arrays.copyOf(new Object[]{str, AnonymousClass7H2.A00(context, currencyAmount)}, 2));
        C04220Ms.A06(format);
        return format;
    }

    public static String A02(C886359v r0, ListCell listCell) {
        listCell.A0O = r0.A03;
        ComponentLoggingData componentLoggingData = listCell.A0J;
        if (componentLoggingData != null) {
            return componentLoggingData.A00;
        }
        return "checkout_screen";
    }

    public final M5O A08(ViewGroup viewGroup) {
        AnonymousClass69B r0;
        AnonymousClass69B r02;
        if (this instanceof C91585gT) {
            C91585gT r2 = (C91585gT) this;
            FragmentContainerView fragmentContainerView = new FragmentContainerView(C18190wL.A0A(viewGroup));
            fragmentContainerView.setId(r2.A00);
            C18200wM.A1C(fragmentContainerView);
            return new AnonymousClass5BC(fragmentContainerView, r2);
        } else if (this instanceof C91355g6) {
            C91355g6 r3 = (C91355g6) this;
            ListCell A032 = AnonymousClass7JJ.A03(C18190wL.A0A(viewGroup), viewGroup, r3.A02, C91705gf.A06());
            if (r3.A01) {
                A032.setBackgroundStyle(AnonymousClass699.ACCORDION_HEADER_CELL);
            }
            return new AnonymousClass5BB(r3, A032);
        } else if (this instanceof C91565gR) {
            C91565gR r4 = (C91565gR) this;
            boolean A1Y = C18200wM.A1Y(viewGroup);
            ListCell A033 = AnonymousClass7JJ.A03(C18190wL.A0A(viewGroup), viewGroup, r4.A02, AnonymousClass7Kz.A05());
            boolean z = r4.A01;
            if (z) {
                r02 = AnonymousClass69B.A0M;
            } else {
                r02 = AnonymousClass69B.A06;
            }
            A033.setTextStyle(r02);
            if (r4.A01) {
                ListCell.A01(A033, 1, A1Y, z);
            }
            if (z) {
                A033.setBackgroundStyle(AnonymousClass699.ACCORDION_CELL);
                A033.A04();
            }
            return new AnonymousClass5BA(r4, A033);
        } else if (this instanceof C91555gQ) {
            C91555gQ r5 = (C91555gQ) this;
            int A1Y2 = C18200wM.A1Y(viewGroup);
            AnonymousClass7JJ A05 = AnonymousClass7Kz.A05();
            Context A0A = C18190wL.A0A(viewGroup);
            ListCell A034 = AnonymousClass7JJ.A03(A0A, viewGroup, AnonymousClass69U.A0e, A05);
            AnonymousClass51H r32 = new AnonymousClass51H(A0A);
            r32.setText(C86104wH.A11(AnonymousClass0wJ.A0k(r32.getContext(), 2131826445), Locale.getDefault(), new Object[A1Y2], A1Y2));
            boolean z2 = r5.A01;
            if (z2) {
                r32.setTextStyle(AnonymousClass69Q.A0z);
            }
            A034.setLeftAddOnText(r32);
            if (z2) {
                A034.setBackgroundStyle(AnonymousClass699.ACCORDION_PUX_CELL);
            }
            if (!r5.A00) {
                r5.A00 = true;
                A034.A07(new ComponentLoggingData((ImmutableMap) null, "checkout_screen", "shipping_address"), r5.A03);
            }
            return new AnonymousClass5B9(r5, A034);
        } else if (this instanceof C91345g5) {
            ListCell A035 = AnonymousClass7JJ.A03(C18190wL.A0A(viewGroup), viewGroup, AnonymousClass69U.A0Z, AnonymousClass7Kz.A05());
            A035.setTextStyle(AnonymousClass69B.A0I);
            A035.setBackgroundStyle(AnonymousClass699.ACCORDION_PUX_CELL);
            return new C91745gj((C91345g5) this, A035, new C872451a(C18190wL.A0A(A035)));
        } else if (this instanceof C91495gK) {
            C91495gK r52 = (C91495gK) this;
            AnonymousClass7JJ A06 = C91705gf.A06();
            Context A0A2 = C18190wL.A0A(viewGroup);
            View A052 = A06.A05(A0A2, viewGroup, r52.A02);
            C04220Ms.A0C(A052, "null cannot be cast to non-null type com.facebookpay.widget.listcell.EntityListCell");
            EntityListCell entityListCell = (EntityListCell) A052;
            AnonymousClass51J r22 = new AnonymousClass51J(A0A2);
            AnonymousClass7Kz.A0G();
            TypedArray obtainStyledAttributes = A0A2.obtainStyledAttributes(2131886515, C29934Fwk.A0c);
            C04220Ms.A06(obtainStyledAttributes);
            r22.setImageViewStyle(obtainStyledAttributes.getResourceId(4, R.style.FBPayUIEntityListCellLeftAddOnIcon));
            r22.setImageViewBackground(A0A2.getDrawable(R.drawable.fbpay_widget_item_thumbnail_border));
            obtainStyledAttributes.recycle();
            entityListCell.setLeftAddOnIcon(r22);
            entityListCell.setRightAddOnText(new AnonymousClass51I(A0A2));
            if (!r52.A00) {
                r52.A00 = true;
                entityListCell.A07(new ComponentLoggingData((ImmutableMap) null, "checkout_screen", "entity"), r52.A03);
            }
            View view = entityListCell.A01;
            if (view == null) {
                C04220Ms.A0E("containerView");
                throw null;
            }
            if (view instanceof ConstraintLayout) {
                M6d m6d = new M6d();
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                m6d.A0I(constraintLayout);
                m6d.A0B(R.id.right_add_on_container, 4);
                m6d.A0G(constraintLayout);
            }
            return new C91735gi(r52, entityListCell);
        } else if (this instanceof C91545gP) {
            C91545gP r53 = (C91545gP) this;
            int A1Y3 = C18200wM.A1Y(viewGroup);
            AnonymousClass7JJ A053 = AnonymousClass7Kz.A05();
            Context A0A3 = C18190wL.A0A(viewGroup);
            ListCell A036 = AnonymousClass7JJ.A03(A0A3, viewGroup, AnonymousClass69U.A0V, A053);
            AnonymousClass51H r42 = new AnonymousClass51H(A0A3);
            Locale locale = Locale.getDefault();
            Context context = r42.getContext();
            int i = 2131826423;
            if (r53.A01) {
                i = 2131826415;
            }
            r42.setText(C86104wH.A11(AnonymousClass0wJ.A0k(context, i), locale, new Object[A1Y3], A1Y3));
            boolean z3 = r53.A01;
            if (z3) {
                r42.setTextStyle(AnonymousClass69Q.A0z);
            }
            A036.setLeftAddOnText(r42);
            if (z3) {
                A036.setTextStyle(AnonymousClass69B.A0H);
                A036.setBackgroundStyle(AnonymousClass699.ACCORDION_PUX_CELL);
            } else {
                A036.setTextStyle(AnonymousClass69B.A0A);
            }
            if (!r53.A00) {
                r53.A00 = true;
                A036.A07(new ComponentLoggingData((ImmutableMap) null, "checkout_screen", "contact_info"), r53.A03);
            }
            return new AnonymousClass5B8(r53, A036);
        } else if (this instanceof C91485gJ) {
            C91485gJ r33 = (C91485gJ) this;
            AnonymousClass7JJ A062 = C91705gf.A06();
            Context A0A4 = C18190wL.A0A(viewGroup);
            ListCell A037 = AnonymousClass7JJ.A03(A0A4, viewGroup, AnonymousClass69U.A0c, A062);
            A037.setTextStyle(AnonymousClass69B.A06);
            if (!r33.A01) {
                A037.setLeftAddOnText(new AnonymousClass51H(A0A4));
            }
            A037.setOnClickListener(r33.A00);
            C116836xd.A01(A037, AnonymousClass006.A01, (String) null);
            return new AnonymousClass5B7(r33, A037);
        } else if (this instanceof C91685gd) {
            C91685gd r34 = (C91685gd) this;
            View A054 = C91705gf.A06().A05(r34.A00, viewGroup, AnonymousClass69U.A0M);
            C04220Ms.A0C(A054, "null cannot be cast to non-null type com.facebookpay.widget.paybutton.FBPayAnimationButton");
            FBPayAnimationButton fBPayAnimationButton = (FBPayAnimationButton) A054;
            fBPayAnimationButton.A08 = r34.A01;
            return new AnonymousClass5B6(r34, fBPayAnimationButton);
        } else if (this instanceof C91615gW) {
            View A055 = C91705gf.A06().A05(C18190wL.A0A(viewGroup), viewGroup, AnonymousClass69U.A0f);
            C04220Ms.A0C(A055, "null cannot be cast to non-null type com.facebookpay.widget.disclaimer.DisclaimerLayout");
            DisclaimerLayout disclaimerLayout = (DisclaimerLayout) A055;
            disclaimerLayout.setDisclaimerType(C30111zq.DISCLAIMER_PUX);
            disclaimerLayout.setAccessibilityTraversalBefore(R.id.fbpay_ui_button_id);
            return new AnonymousClass5B5((C91615gW) this, disclaimerLayout);
        } else if (this instanceof C91475gI) {
            C91475gI r54 = (C91475gI) this;
            int A1Y4 = C18200wM.A1Y(viewGroup);
            ListCell A038 = AnonymousClass7JJ.A03(C18190wL.A0A(viewGroup), viewGroup, AnonymousClass69U.A0d, AnonymousClass7Kz.A05());
            A038.setTextStyle(AnonymousClass69B.A0A);
            AnonymousClass51H r35 = new AnonymousClass51H(C18190wL.A0A(A038));
            r35.setText(C86104wH.A11(AnonymousClass0wJ.A0k(r35.getContext(), 2131826452), Locale.getDefault(), new Object[A1Y4], A1Y4));
            if (r54.A01) {
                r35.setTextStyle(AnonymousClass69Q.A0z);
            }
            A038.setLeftAddOnText(r35);
            if (!r54.A00) {
                r54.A00 = true;
                A038.A07(new ComponentLoggingData((ImmutableMap) null, "checkout_screen", "merchant_header"), r54.A03);
            }
            return new AnonymousClass5B4(r54, A038);
        } else if (this instanceof C91645gZ) {
            C91645gZ r43 = (C91645gZ) this;
            boolean A1Y5 = C18200wM.A1Y(viewGroup);
            View A056 = AnonymousClass7Kz.A05().A05(C18190wL.A0A(viewGroup), viewGroup, r43.A02);
            C04220Ms.A0C(A056, "null cannot be cast to non-null type com.facebookpay.widget.pricetable.PriceTable");
            PriceTable priceTable = (PriceTable) A056;
            if (r43.A01) {
                priceTable.A01 = A1Y5;
                priceTable.A00 = true;
                AnonymousClass7Fe.A02(priceTable, 4);
            }
            return new AnonymousClass5B3(r43, priceTable);
        } else if (this instanceof C91535gO) {
            C91535gO r55 = (C91535gO) this;
            int A1Y6 = C18200wM.A1Y(viewGroup);
            ListCell A039 = AnonymousClass7JJ.A03(C18190wL.A0A(viewGroup), viewGroup, r55.A02, AnonymousClass7Kz.A05());
            A039.setTextStyle(AnonymousClass69B.A07);
            AnonymousClass51H r36 = new AnonymousClass51H(C18190wL.A0A(A039));
            r36.setText(C86104wH.A11(AnonymousClass0wJ.A0k(r36.getContext(), 2131826414), Locale.getDefault(), new Object[A1Y6], A1Y6));
            if (r55.A01) {
                r36.setTextStyle(AnonymousClass69Q.A0z);
                A039.setBackgroundStyle(AnonymousClass699.ACCORDION_PUX_CELL);
            }
            A039.setLeftAddOnText(r36);
            if (!r55.A00) {
                r55.A00 = true;
                A039.A07(new ComponentLoggingData((ImmutableMap) null, "checkout_screen", "payment_method"), r55.A03);
            }
            return new C91725gh(r55, A039);
        } else if (this instanceof C91465gH) {
            C91465gH r56 = (C91465gH) this;
            ListCell A0310 = AnonymousClass7JJ.A03(C18190wL.A0A(viewGroup), viewGroup, AnonymousClass69U.A0X, C91705gf.A06());
            if (r56.A01) {
                A0310.setTextStyle(AnonymousClass69B.A0H);
                A0310.setBackgroundStyle(AnonymousClass699.ACCORDION_PUX_CELL);
            } else {
                A0310.setTextStyle(AnonymousClass69B.A0A);
            }
            if (!r56.A00) {
                r56.A00 = true;
                A0310.A07(new ComponentLoggingData((ImmutableMap) null, "checkout_screen", "shipping_option"), r56.A03);
            }
            A0310.setOnClickListener(r56.A00);
            C116836xd.A01(A0310, AnonymousClass006.A01, (String) null);
            return new AnonymousClass5B2(r56, A0310);
        } else if (this instanceof C91335g4) {
            View A057 = C91705gf.A06().A05(C18190wL.A0A(viewGroup), viewGroup, AnonymousClass69U.A0U);
            C04220Ms.A0C(A057, C18170wI.A00(0));
            return new AnonymousClass5B1((LinearLayout) A057, (C91335g4) this);
        } else if (this instanceof C91455gG) {
            Context A0A5 = C18190wL.A0A(viewGroup);
            AnonymousClass51G r23 = new AnonymousClass51G(A0A5);
            r23.setIcon(AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE);
            AnonymousClass7JJ A058 = AnonymousClass7Kz.A05();
            C04220Ms.A06(A0A5);
            ListCell A0311 = AnonymousClass7JJ.A03(A0A5, viewGroup, AnonymousClass69U.A0j, A058);
            A0311.setTextStyle(AnonymousClass69B.A0B);
            return new AnonymousClass5BT((C91455gG) this, A0311, r23);
        } else if (this instanceof C91525gN) {
            C91525gN r6 = (C91525gN) this;
            Context A0A6 = C18190wL.A0A(viewGroup);
            AnonymousClass51D r37 = new AnonymousClass51D(A0A6);
            AnonymousClass51G r24 = new AnonymousClass51G(A0A6);
            r24.setIcon(AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE);
            ListCell A0312 = AnonymousClass7JJ.A03(A0A6, viewGroup, AnonymousClass69U.A0e, AnonymousClass7Kz.A05());
            A0312.setTextStyle(AnonymousClass69B.A0F);
            A0312.setRightAddOnView(r37);
            if (r6.A01) {
                ListCell.A01(A0312, 3, false, false);
            }
            return new C88975Bk(r6, A0312, r24, r37);
        } else if (this instanceof C91445gF) {
            AnonymousClass7JJ A063 = C91705gf.A06();
            Context A0A7 = C18190wL.A0A(viewGroup);
            ListCell A0313 = AnonymousClass7JJ.A03(A0A7, viewGroup, AnonymousClass69U.A0m, A063);
            A0313.setTextStyle(AnonymousClass69B.A0B);
            A0313.setRightAddOnView(new AnonymousClass51C(A0A7));
            return new AnonymousClass5B0((C91445gF) this, A0313);
        } else if (this instanceof C91435gE) {
            Context A0A8 = C18190wL.A0A(viewGroup);
            AnonymousClass51D r38 = new AnonymousClass51D(A0A8);
            AnonymousClass51G r25 = new AnonymousClass51G(A0A8);
            r25.setIcon(AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE);
            ListCell A0314 = AnonymousClass7JJ.A03(A0A8, viewGroup, AnonymousClass69U.A0l, AnonymousClass7Kz.A05());
            A0314.setTextStyle(AnonymousClass69B.A0B);
            A0314.setRightAddOnView(r38);
            return new C88965Bj((C91435gE) this, A0314, r25, r38);
        } else if (this instanceof C91425gD) {
            Context A0A9 = C18190wL.A0A(viewGroup);
            AnonymousClass51D r12 = new AnonymousClass51D(A0A9);
            AnonymousClass51G r11 = new AnonymousClass51G(A0A9);
            r11.setIcon(AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE);
            View A059 = AnonymousClass7Kz.A05().A05(A0A9, viewGroup, AnonymousClass69U.A0a);
            C04220Ms.A0C(A059, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
            ListCell listCell = (ListCell) A059;
            ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(A0A9);
            AnonymousClass7Kz.A0G();
            A03(A0A9, shimmerFrameLayout, R.drawable.fbpay_widget_multi_item_badge);
            listCell.setTextStyle(AnonymousClass69B.A0F);
            listCell.setRightAddOnView(r12);
            return new C89045Br(shimmerFrameLayout, (C91425gD) this, listCell, r11, r12);
        } else if (this instanceof C91415gC) {
            AnonymousClass7JJ A064 = C91705gf.A06();
            Context A0A10 = C18190wL.A0A(viewGroup);
            ListCell A0315 = AnonymousClass7JJ.A03(A0A10, viewGroup, AnonymousClass69U.A0k, A064);
            A0315.setTextStyle(AnonymousClass69B.A0B);
            A0315.setRightAddOnView(new AnonymousClass51C(A0A10));
            return new C88865Az((C91415gC) this, A0315);
        } else if (this instanceof C91405gB) {
            AnonymousClass7Kz.A0G();
            AnonymousClass7Fe.A01(viewGroup, R.style.FbPayFulfillmentOptionsListStyle);
            Context A0A11 = C18190wL.A0A(viewGroup);
            AnonymousClass51D r39 = new AnonymousClass51D(A0A11);
            AnonymousClass51G r26 = new AnonymousClass51G(A0A11);
            r26.setIcon(AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE);
            ListCell A0316 = AnonymousClass7JJ.A03(A0A11, viewGroup, AnonymousClass69U.A0X, AnonymousClass7Kz.A05());
            A0316.setTextStyle(AnonymousClass69B.A0N);
            A0316.setRightAddOnView(r39);
            return new C88955Bi((C91405gB) this, A0316, r26, r39);
        } else if (this instanceof C91395gA) {
            Context A0A12 = C18190wL.A0A(viewGroup);
            AnonymousClass51D r310 = new AnonymousClass51D(A0A12);
            AnonymousClass51G r27 = new AnonymousClass51G(A0A12);
            r27.setIcon(AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE);
            ListCell A0317 = AnonymousClass7JJ.A03(A0A12, viewGroup, AnonymousClass69U.A0h, AnonymousClass7Kz.A05());
            A0317.setTextStyle(AnonymousClass69B.A0B);
            A0317.setRightAddOnView(r310);
            return new C88945Bh((C91395gA) this, A0317, r27, r310);
        } else if (this instanceof C91595gU) {
            C91595gU r311 = (C91595gU) this;
            View A0510 = AnonymousClass7Kz.A05().A05(r311.A00, viewGroup, r311.A02);
            C04220Ms.A0C(A0510, C18170wI.A00(0));
            return new C88935Bg((LinearLayout) A0510, r311);
        } else if (this instanceof C91385g9) {
            C91385g9 r44 = (C91385g9) this;
            AnonymousClass7JJ A065 = C91705gf.A06();
            Context A0A13 = C18190wL.A0A(viewGroup);
            ListCell A0318 = AnonymousClass7JJ.A03(A0A13, viewGroup, AnonymousClass69U.A0Y, A065);
            boolean z4 = r44.A01;
            if (z4) {
                r0 = AnonymousClass69B.A0M;
            } else {
                r0 = AnonymousClass69B.A06;
            }
            A0318.setTextStyle(r0);
            if (!z4) {
                A0318.setLeftAddOnText(new AnonymousClass51H(A0A13));
            }
            A0318.setOnClickListener(r44.A00);
            C116836xd.A01(A0318, AnonymousClass006.A01, (String) null);
            return new C88855Ay(r44, A0318);
        } else if (this instanceof C91575gS) {
            C91575gS r312 = (C91575gS) this;
            View A0511 = AnonymousClass7Kz.A05().A05(r312.A02, viewGroup, AnonymousClass69U.A0D);
            C04220Ms.A0C(A0511, AnonymousClass000.A00(1));
            return new AnonymousClass5BS((ShimmerFrameLayout) A0511, r312);
        } else if (this instanceof C91375g8) {
            C91375g8 r313 = (C91375g8) this;
            return new AnonymousClass5BR(C91705gf.A06().A05(C18190wL.A0A(viewGroup), viewGroup, r313.A02), r313);
        } else if (this instanceof C91325g3) {
            C91325g3 r314 = (C91325g3) this;
            return new AnonymousClass5BQ(C91705gf.A06().A05(C18190wL.A0A(viewGroup), viewGroup, r314.A02), r314);
        } else if (this instanceof C91515gM) {
            C91515gM r315 = (C91515gM) this;
            return new C89055Bs(C91705gf.A06().A05(C18190wL.A0A(viewGroup), viewGroup, r315.A02), r315);
        } else if (this instanceof C91635gY) {
            C91635gY r316 = (C91635gY) this;
            View A0512 = AnonymousClass7Kz.A05().A05(r316.A00, viewGroup, AnonymousClass69U.A08);
            C04220Ms.A0C(A0512, AnonymousClass000.A00(1));
            return new AnonymousClass5BP((ShimmerFrameLayout) A0512, r316);
        } else if (this instanceof C91605gV) {
            C91605gV r45 = (C91605gV) this;
            View A0513 = AnonymousClass7Kz.A05().A05(r45.A00, viewGroup, AnonymousClass69U.A07);
            C04220Ms.A0C(A0513, AnonymousClass000.A00(1));
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) A0513;
            C04220Ms.A0B(shimmerFrameLayout2, 0);
            AnonymousClass7Kz.A0G();
            A03(shimmerFrameLayout2.getContext(), shimmerFrameLayout2, R.drawable.fbpay_shimmer_background);
            return new AnonymousClass5BO(shimmerFrameLayout2, r45);
        } else if (this instanceof C91705gf) {
            return ((C91705gf) this).A0A(viewGroup);
        } else {
            if (this instanceof C91365g7) {
                Context A0A14 = C18190wL.A0A(viewGroup);
                AnonymousClass51D r317 = new AnonymousClass51D(A0A14);
                InlineActionMenu A002 = A00(A0A14, viewGroup);
                A002.A01();
                ListCell A0319 = AnonymousClass7JJ.A03(A0A14, viewGroup, AnonymousClass69U.A0j, AnonymousClass7Kz.A05());
                A0319.setTextStyle(AnonymousClass69B.A0B);
                A0319.setBackgroundStyle(AnonymousClass699.ACCORDION_CELL);
                r317.setChecked(true);
                A0319.setLeftAddOnView(r317);
                A0319.A04();
                return new AnonymousClass5BN((C91365g7) this, A002, A0319);
            } else if (this instanceof C91675gc) {
                C91675gc r62 = (C91675gc) this;
                Context A0A15 = C18190wL.A0A(viewGroup);
                AnonymousClass51D r318 = new AnonymousClass51D(A0A15);
                InlineActionMenu A003 = A00(A0A15, viewGroup);
                ListCell A0320 = AnonymousClass7JJ.A03(A0A15, viewGroup, AnonymousClass69U.A06, AnonymousClass7Kz.A05());
                A0320.setTextStyle(AnonymousClass69B.A0F);
                A0320.setBackgroundStyle(AnonymousClass699.ACCORDION_CELL);
                A0320.setLeftAddOnView(r318);
                if (r62.A05) {
                    ListCell.A01(A0320, 1, false, true);
                }
                return new C88925Bf(r62, A003, A0320, r318);
            } else if (this instanceof C91665gb) {
                Context A0A16 = C18190wL.A0A(viewGroup);
                AnonymousClass51D r319 = new AnonymousClass51D(A0A16);
                InlineActionMenu A004 = A00(A0A16, viewGroup);
                ListCell A0321 = AnonymousClass7JJ.A03(A0A16, viewGroup, AnonymousClass69U.A0l, AnonymousClass7Kz.A05());
                A0321.setTextStyle(AnonymousClass69B.A0B);
                A0321.setBackgroundStyle(AnonymousClass699.ACCORDION_CELL);
                A0321.setLeftAddOnView(r319);
                A0321.setActionMenu(A004);
                A0321.A04();
                return new C88915Be((C91665gb) this, A004, A0321, r319);
            } else if (this instanceof C91695ge) {
                Context A0A17 = C18190wL.A0A(viewGroup);
                AnonymousClass51D r320 = new AnonymousClass51D(A0A17);
                View A0514 = AnonymousClass7Kz.A05().A05(A0A17, viewGroup, AnonymousClass69U.A0E);
                C04220Ms.A0C(A0514, "null cannot be cast to non-null type com.facebookpay.widget.actionmenu.InlineActionMenu");
                ListCell A0322 = AnonymousClass7JJ.A03(A0A17, viewGroup, AnonymousClass69U.A05, AnonymousClass7Kz.A05());
                A0322.setBackgroundStyle(AnonymousClass699.ACCORDION_CELL);
                A0322.setLeftAddOnView(r320);
                return new C91755gk((C91695ge) this, (InlineActionMenu) A0514, A0322, r320);
            } else if (this instanceof C91505gL) {
                AnonymousClass7Kz.A0G();
                AnonymousClass7Fe.A01(viewGroup, R.style.FbPayFulfillmentOptionsListStyle);
                Context A0A18 = C18190wL.A0A(viewGroup);
                AnonymousClass51D r28 = new AnonymousClass51D(A0A18);
                AnonymousClass7JJ A0515 = AnonymousClass7Kz.A05();
                C04220Ms.A06(A0A18);
                ListCell A0323 = AnonymousClass7JJ.A03(A0A18, viewGroup, AnonymousClass69U.A04, A0515);
                A0323.setTextStyle(AnonymousClass69B.A0N);
                A0323.setBackgroundStyle(AnonymousClass699.ACCORDION_CELL);
                A0323.setLeftAddOnView(r28);
                return new AnonymousClass5BM((C91505gL) this, A0323, r28);
            } else if (this instanceof C91655ga) {
                Context A0A19 = C18190wL.A0A(viewGroup);
                AnonymousClass51D r321 = new AnonymousClass51D(A0A19);
                InlineActionMenu A005 = A00(A0A19, viewGroup);
                ListCell A0324 = AnonymousClass7JJ.A03(A0A19, viewGroup, AnonymousClass69U.A0h, AnonymousClass7Kz.A05());
                A0324.setTextStyle(AnonymousClass69B.A0B);
                A0324.setBackgroundStyle(AnonymousClass699.ACCORDION_CELL);
                A0324.setLeftAddOnView(r321);
                A0324.setActionMenu(A005);
                A0324.A04();
                return new C88905Bd((C91655ga) this, A005, A0324, r321);
            } else {
                C91625gX r03 = (C91625gX) this;
                View A0516 = AnonymousClass7Kz.A05().A05(r03.A00, viewGroup, r03.A02);
                C04220Ms.A0C(A0516, "null cannot be cast to non-null type android.view.ViewGroup");
                return new C88845Ax((ViewGroup) A0516);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v71, resolved type: com.instagram.igds.components.banner.IgdsBanner} */
    /* JADX WARNING: type inference failed for: r9v0, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v32 */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x045d, code lost:
        if (r3 != false) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04e9, code lost:
        if (r4 != X.AnonymousClass006.A0C) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0ccc, code lost:
        if (r7.A06 != r9) goto L_0x0cce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x0ff5, code lost:
        if (r6 != null) goto L_0x0ff7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x10d8, code lost:
        if (r0 != null) goto L_0x109a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bc, code lost:
        if (r0 != null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:980:0x15f4, code lost:
        if (X.AnonymousClass8bQ.A0n(r2) != false) goto L_0x15f6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x05f2  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x061b  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06d0  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x06dc  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x06ef  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0759  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x077b  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0784  */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x0e43  */
    /* JADX WARNING: Removed duplicated region for block: B:609:0x0e4e  */
    /* JADX WARNING: Removed duplicated region for block: B:673:0x0f73  */
    /* JADX WARNING: Removed duplicated region for block: B:743:0x10b3  */
    /* JADX WARNING: Removed duplicated region for block: B:746:0x10be  */
    /* JADX WARNING: Removed duplicated region for block: B:757:0x10e2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.M5O r24, X.AnonymousClass7Kx r25) {
        /*
            r23 = this;
            r3 = r23
            r0 = r24
            boolean r1 = r3 instanceof X.C91585gT
            if (r1 != 0) goto L_0x1884
            boolean r2 = r3 instanceof X.C91355g6
            r1 = r25
            if (r2 == 0) goto L_0x0087
            X.5BB r0 = (X.AnonymousClass5BB) r0
            r8 = 0
            X.C04220Ms.A0B(r1, r8)
            r7 = 1
            r6 = 2
            X.C04220Ms.A0B(r0, r7)
            java.lang.Object r2 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r2 = (com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem) r2
            if (r2 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            java.lang.String r0 = r2.A01
            r4 = 0
            if (r0 != 0) goto L_0x0036
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x005e
            int r1 = r0.intValue()
            android.content.Context r0 = r5.getContext()
            java.lang.String r0 = r0.getString(r1)
        L_0x0036:
            r5.setPrimaryText(r0)
            java.lang.Integer r0 = r2.A02
            int r1 = r0.intValue()
            if (r1 == r6) goto L_0x0069
            r0 = 3
            if (r1 == r0) goto L_0x0080
            if (r1 == r8) goto L_0x0065
            if (r1 != r7) goto L_0x0060
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0083
            android.content.Context r0 = r5.getContext()
            android.content.res.TypedArray r3 = X.AnonymousClass7Kz.A01(r0, r5)
            android.view.View r2 = r5.A01
            if (r2 != 0) goto L_0x16e3
            java.lang.String r0 = "containerView"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x005e:
            r0 = r4
            goto L_0x0036
        L_0x0060:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0065:
            X.69B r0 = X.AnonymousClass69B.A0A
            goto L_0x16ef
        L_0x0069:
            android.content.Context r0 = X.C18190wL.A0A(r5)
            X.51G r1 = new X.51G
            r1.<init>(r0)
            X.697 r0 = X.AnonymousClass697.SECONDARY_CHEVRON_UP_FILLED_MEDIUM
            r1.setIcon(r0)
            r5.setRightAddOnIcon(r1)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.C116836xd.A01(r5, r0, r4)
            goto L_0x0083
        L_0x0080:
            r5.setRightAddOnIcon(r4)
        L_0x0083:
            X.69B r0 = X.AnonymousClass69B.A0D
            goto L_0x16ef
        L_0x0087:
            boolean r2 = r3 instanceof X.C91565gR
            if (r2 == 0) goto L_0x00c5
            X.5BA r0 = (X.AnonymousClass5BA) r0
            X.AnonymousClass0wJ.A1N(r1, r0)
            java.lang.Object r4 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem r4 = (com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem) r4
            r6 = 0
            if (r4 == 0) goto L_0x00b0
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            java.lang.String r2 = r4.A01
            if (r2 != 0) goto L_0x00ad
            java.lang.Integer r2 = r4.A00
            if (r2 == 0) goto L_0x00c3
            int r4 = r2.intValue()
            android.content.Context r2 = r5.getContext()
            java.lang.String r2 = r2.getString(r4)
        L_0x00ad:
            r5.setPrimaryText(r2)
        L_0x00b0:
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r0 = 18
            X.C86104wH.A1D(r2, r0, r1, r3)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.C116836xd.A01(r2, r0, r6)
            return
        L_0x00c3:
            r2 = r6
            goto L_0x00ad
        L_0x00c5:
            boolean r2 = r3 instanceof X.C91555gQ
            if (r2 == 0) goto L_0x01c1
            r4 = r3
            X.5gQ r4 = (X.C91555gQ) r4
            X.5B9 r0 = (X.AnonymousClass5B9) r0
            r2 = 0
            boolean r7 = X.AnonymousClass0wJ.A1Z(r1, r0)
            com.facebookpay.widget.listcell.ListCell r6 = r0.A00
            r0 = 15
            X.C86104wH.A1C(r6, r0, r4)
            boolean r0 = X.AnonymousClass7Kx.A0P(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0103
            r6.setOnClickListener(r5)
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r6.A08(r0)
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r6.A09(r1)
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            r6.A0A(r0)
            X.C116836xd.A00(r6, r5, r1, r5, r5)
            android.view.ContextThemeWrapper r1 = r4.A01
            r0 = 2131826429(0x7f1116fd, float:1.9285742E38)
            java.lang.String r0 = r1.getString(r0)
            r6.setShimmerAccessibilityLabel(r0)
            return
        L_0x0103:
            java.lang.Object r8 = r1.A01
            r3 = r8
            com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem r3 = (com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem) r3
            if (r3 == 0) goto L_0x0155
            boolean r0 = r3.A05
            if (r0 != r7) goto L_0x0155
            r6.setRightAddOnIcon(r5)
            r6.setEnabled(r2)
        L_0x0114:
            r6.A03()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.C116836xd.A01(r6, r0, r5)
            boolean r9 = X.AnonymousClass7Kx.A0R(r1)
            java.lang.String r7 = A02(r4, r6)
            if (r9 == 0) goto L_0x0149
            java.lang.String r2 = "shipping_address"
        L_0x0128:
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r5, r7, r2)
            r6.A0J = r0
            if (r9 == 0) goto L_0x0171
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem"
            X.C04220Ms.A0C(r8, r0)
            java.lang.String r0 = r3.A03
            r6.setPrimaryText(r0)
            java.lang.String r0 = r3.A02
            r6.setSecondaryText(r0)
            java.lang.String r0 = r3.A04
            r6.setTertiaryText(r0)
            boolean r0 = r4.A01
            goto L_0x0de9
        L_0x0149:
            java.lang.Throwable r0 = r1.A02
            boolean r0 = r0 instanceof X.C1373688h
            if (r0 == 0) goto L_0x0152
            java.lang.String r2 = "shipping_address_inline_error"
            goto L_0x0128
        L_0x0152:
            java.lang.String r2 = "add_shipping_address"
            goto L_0x0128
        L_0x0155:
            android.content.Context r0 = X.C18190wL.A0A(r6)
            X.51G r2 = new X.51G
            r2.<init>(r0)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x016e
            X.697 r0 = X.AnonymousClass697.SECONDARY_CHEVRON_DOWN_FILLED_MEDIUM
        L_0x0164:
            r2.setIcon(r0)
            r6.setRightAddOnIcon(r2)
            r6.setEnabled(r7)
            goto L_0x0114
        L_0x016e:
            X.697 r0 = X.AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE
            goto L_0x0164
        L_0x0171:
            java.lang.Throwable r3 = r1.A02
            boolean r0 = r3 instanceof X.C1373688h
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.exceptions.PuxComponentException"
            if (r0 == 0) goto L_0x01ac
            r0 = 2131826451(0x7f111713, float:1.9285787E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0180:
            int r1 = r0.intValue()
            android.view.ContextThemeWrapper r0 = r4.A01
            java.lang.String r0 = r0.getString(r1)
        L_0x018a:
            r6.setPrimaryText(r0)
            r6.setSecondaryText(r5)
            r6.setTertiaryText(r5)
            boolean r0 = r3 instanceof X.AnonymousClass88V
            if (r0 == 0) goto L_0x01a2
            X.C04220Ms.A0C(r3, r2)
            X.88V r3 = (X.AnonymousClass88V) r3
            X.69Q r0 = r3.A01
        L_0x019e:
            A05(r6, r0)
            return
        L_0x01a2:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x01a9
            X.69Q r0 = X.AnonymousClass69Q.A17
            goto L_0x019e
        L_0x01a9:
            X.69Q r0 = X.AnonymousClass69Q.A0T
            goto L_0x019e
        L_0x01ac:
            boolean r0 = r3 instanceof X.AnonymousClass88V
            if (r0 == 0) goto L_0x01bf
            X.C04220Ms.A0C(r3, r2)
            r0 = r3
            X.88V r0 = (X.AnonymousClass88V) r0
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x01bf
            goto L_0x0180
        L_0x01bf:
            r0 = r5
            goto L_0x018a
        L_0x01c1:
            boolean r2 = r3 instanceof X.C91345g5
            if (r2 == 0) goto L_0x01fa
            X.5gj r0 = (X.C91745gj) r0
            r5 = 0
            boolean r9 = X.AnonymousClass0wJ.A1Z(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0P(r1)
            r4 = 0
            if (r2 == 0) goto L_0x0cc2
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r2.setOnClickListener(r4)
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r2.A08(r1)
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r2.A09(r0)
            r2.A0A(r1)
            r2.A05()
            X.C116836xd.A00(r2, r4, r1, r4, r4)
            android.content.Context r1 = r2.getContext()
            r0 = 2131826427(0x7f1116fb, float:1.9285738E38)
        L_0x01f2:
            java.lang.String r0 = r1.getString(r0)
            r2.setShimmerAccessibilityLabel(r0)
            return
        L_0x01fa:
            boolean r2 = r3 instanceof X.C91495gK
            if (r2 == 0) goto L_0x02fb
            X.5gi r0 = (X.C91735gi) r0
            r5 = 0
            boolean r8 = X.AnonymousClass0wJ.A1Z(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.EntityListCell r4 = r0.A00
            java.lang.String r7 = A02(r3, r4)
            r6 = 0
            java.lang.String r2 = "entity"
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r6, r7, r2)
            r4.A0J = r0
            java.lang.Object r6 = r1.A01
            if (r6 == 0) goto L_0x0d9c
            com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem r6 = (com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem) r6
            android.content.Context r7 = X.C18190wL.A0A(r4)
            com.facebookpay.expresscheckout.models.ItemDetails r2 = r6.A01
            java.lang.Integer r0 = r2.A01
            int r9 = r0.intValue()
            r1 = 2
            boolean r0 = r3.A01
            if (r9 == r8) goto L_0x027f
            if (r0 == 0) goto L_0x0279
            X.69B r0 = X.AnonymousClass69B.A0H
            r4.setTextStyle(r0)
            com.facebookpay.widget.listcell.ListCell.A01(r4, r1, r8, r5)
        L_0x023c:
            java.lang.String r3 = r6.A05
            if (r3 == 0) goto L_0x0256
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0 = 2131826425(0x7f1116f9, float:1.9285734E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r7, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            java.lang.String r0 = X.C86104wH.A11(r1, r2, r0, r8)
            r4.setTertiaryText(r0)
        L_0x0256:
            X.51J r1 = r4.A0K
            if (r1 == 0) goto L_0x025f
            java.lang.String r0 = r6.A03
            r1.setImageThumbnailUrl(r0)
        L_0x025f:
            java.lang.String r0 = r6.A04
            r4.setPrimaryText(r0)
            java.lang.String r0 = r6.A02
            r4.setSecondaryText(r0)
            X.51I r2 = r4.A0N
            if (r2 == 0) goto L_0x1884
            X.77N r1 = X.AnonymousClass77N.A00
            com.facebookpay.common.models.CurrencyAmount r0 = r6.A00
            java.lang.String r0 = X.C86124wJ.A0v(r0, r1)
            r2.setText(r0)
            return
        L_0x0279:
            X.69B r0 = X.AnonymousClass69B.A0E
            r4.setTextStyle(r0)
            goto L_0x023c
        L_0x027f:
            if (r0 == 0) goto L_0x02f5
            X.69B r0 = X.AnonymousClass69B.A0L
            r4.setTextStyle(r0)
            com.facebookpay.widget.listcell.ListCell.A01(r4, r1, r8, r5)
        L_0x0289:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165287(0x7f070067, float:1.7944787E38)
            float r0 = r1.getDimension(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.setSecondaryTextSizePx(r0)
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165251(0x7f070043, float:1.7944714E38)
            float r0 = r0.getDimension(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.setTertiaryTextSizePx(r0)
            r0 = 2131826550(0x7f111776, float:1.9285988E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r7, r0)
            java.lang.CharSequence r0 = X.C99116Ie.A00(r7, r0)
            r4.setTertiaryLinkableText(r0)
            java.lang.String r8 = r2.A00
            if (r8 == 0) goto L_0x0256
            float r0 = X.C86154wM.A01(r7, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.setQuaternaryTextSizePx(r0)
            r0 = 2131826549(0x7f111775, float:1.9285986E38)
            java.lang.String r3 = X.AnonymousClass0wJ.A0k(r7, r0)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.lang.String r1 = "[[developer_terms_token]]"
            r0 = 2131826595(0x7f1117a3, float:1.9286079E38)
            X.C86164wN.A1L(r1, r8, r2, r0)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
            X.6p6 r2 = X.C99186Il.A00(r7, r0, r3)
            r1 = 10
            com.facebook.redex.IDxCListenerShape508S0100000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape508S0100000_2_I2
            r0.<init>(r7, r1)
            java.lang.CharSequence r0 = r2.A00(r0, r5)
            r4.setQuaternaryLinkableText(r0)
            goto L_0x0256
        L_0x02f5:
            X.69B r0 = X.AnonymousClass69B.A0K
            r4.setTextStyle(r0)
            goto L_0x0289
        L_0x02fb:
            boolean r2 = r3 instanceof X.C91545gP
            if (r2 == 0) goto L_0x032d
            X.5B8 r0 = (X.AnonymousClass5B8) r0
            r5 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0P(r1)
            r7 = 0
            if (r2 == 0) goto L_0x0da1
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r2.A08(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            r2.A09(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r2.A0A(r0)
            r2.setOnClickListener(r7)
            X.C116836xd.A00(r2, r7, r0, r7, r7)
            android.content.Context r1 = r2.getContext()
            r0 = 2131826426(0x7f1116fa, float:1.9285736E38)
            goto L_0x01f2
        L_0x032d:
            boolean r2 = r3 instanceof X.C91485gJ
            if (r2 == 0) goto L_0x0394
            r6 = r3
            X.5gJ r6 = (X.C91485gJ) r6
            X.5B7 r0 = (X.AnonymousClass5B7) r0
            X.AnonymousClass0wJ.A1N(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x0376
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r5.A03()
            java.lang.Object r4 = r1.A01
            if (r4 == 0) goto L_0x0e5a
            com.facebookpay.common.recyclerview.adapteritems.PuxPromoCodeItem r4 = (com.facebookpay.common.recyclerview.adapteritems.PuxPromoCodeItem) r4
            boolean r3 = r4.A01
            if (r3 == 0) goto L_0x0369
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0369
            android.view.ContextThemeWrapper r2 = r6.A00
            r1 = 2131826405(0x7f1116e5, float:1.9285693E38)
        L_0x0357:
            java.lang.String r1 = r2.getString(r1)
            X.C04220Ms.A09(r1)
            if (r3 == 0) goto L_0x0365
            java.lang.String r0 = r4.A00
            r5.setSecondaryText(r0)
        L_0x0365:
            r5.setPrimaryText(r1)
            return
        L_0x0369:
            boolean r0 = r6.A01
            android.view.ContextThemeWrapper r2 = r6.A00
            r1 = 2131826399(0x7f1116df, float:1.9285681E38)
            if (r0 == 0) goto L_0x0357
            r1 = 2131826398(0x7f1116de, float:1.928568E38)
            goto L_0x0357
        L_0x0376:
            boolean r2 = X.AnonymousClass7Kx.A0P(r1)
            if (r2 == 0) goto L_0x038b
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r2.A08(r1)
            r0 = 0
            X.C116836xd.A00(r2, r0, r1, r0, r0)
            android.view.ContextThemeWrapper r1 = r6.A00
            goto L_0x0cb3
        L_0x038b:
            boolean r1 = X.AnonymousClass7Kx.A0O(r1)
            if (r1 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            goto L_0x03e0
        L_0x0394:
            boolean r2 = r3 instanceof X.C91685gd
            if (r2 == 0) goto L_0x03a1
            r2 = r3
            X.5gd r2 = (X.C91685gd) r2
            X.5B6 r0 = (X.AnonymousClass5B6) r0
            r2.A0A(r0, r1)
            return
        L_0x03a1:
            boolean r2 = r3 instanceof X.C91615gW
            if (r2 == 0) goto L_0x03ae
            r2 = r3
            X.5gW r2 = (X.C91615gW) r2
            X.5B5 r0 = (X.AnonymousClass5B5) r0
            r2.A0A(r0, r1)
            return
        L_0x03ae:
            boolean r2 = r3 instanceof X.C91475gI
            if (r2 == 0) goto L_0x03f2
            X.5B4 r0 = (X.AnonymousClass5B4) r0
            X.AnonymousClass0wJ.A1N(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 != 0) goto L_0x03c3
            boolean r2 = X.AnonymousClass7Kx.A0P(r1)
            if (r2 == 0) goto L_0x03e4
        L_0x03c3:
            java.lang.Object r6 = r1.A01
            if (r6 == 0) goto L_0x03e4
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            java.lang.String r4 = A02(r3, r5)
            r3 = 0
            java.lang.String r2 = "merchant_header"
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r1 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r1.<init>(r3, r4, r2)
            r5.A0J = r1
            com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem r6 = (com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem) r6
            java.lang.String r1 = r6.A00
            r5.setPrimaryText(r1)
        L_0x03de:
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
        L_0x03e0:
            r0.A03()
            return
        L_0x03e4:
            boolean r1 = X.AnonymousClass7Kx.A0P(r1)
            if (r1 == 0) goto L_0x03de
            com.facebookpay.widget.listcell.ListCell r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r1.A08(r0)
            return
        L_0x03f2:
            boolean r2 = r3 instanceof X.C91645gZ
            if (r2 == 0) goto L_0x0489
            r2 = r3
            X.5gZ r2 = (X.C91645gZ) r2
            X.5B3 r0 = (X.AnonymousClass5B3) r0
            r16 = 0
            boolean r15 = X.AnonymousClass0wJ.A1Z(r1, r0)
            boolean r3 = X.AnonymousClass7Kx.A0R(r1)
            r7 = 10
            r4 = 0
            if (r3 == 0) goto L_0x0e64
            com.facebookpay.widget.pricetable.PriceTable r5 = r0.A00
            java.lang.Object r6 = r1.A01
            if (r6 == 0) goto L_0x0e5f
            com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem r6 = (com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem) r6
            java.util.ArrayList r1 = r6.A02
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0x(r1, r7)
            java.util.Iterator r9 = r1.iterator()
        L_0x041c:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0ea9
            java.lang.Object r7 = r9.next()
            com.facebookpay.expresscheckout.models.PriceInfo r7 = (com.facebookpay.expresscheckout.models.PriceInfo) r7
            X.68v r8 = r7.A01
            X.68v r1 = X.C973068v.SHIPPING
            if (r8 == r1) goto L_0x0432
            X.68v r1 = X.C973068v.FULFILLMENT
            if (r8 != r1) goto L_0x047f
        L_0x0432:
            com.facebookpay.common.models.CurrencyAmount r1 = r7.A00
            java.lang.String r3 = r1.A01
            java.lang.Float r1 = X.C81074n3.A05(r3)
            if (r1 == 0) goto L_0x047f
            float r3 = java.lang.Float.parseFloat(r3)
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x047f
            android.content.Context r3 = r5.getContext()
            r1 = 2131826614(0x7f1117b6, float:1.9286117E38)
            java.lang.String r12 = r3.getString(r1)
            r3 = 1
        L_0x0451:
            X.C04220Ms.A09(r12)
            X.68v r1 = X.C973068v.TOTAL
            boolean r14 = X.C18180wK.A1Z(r8, r1)
            if (r8 == r1) goto L_0x045f
            r15 = 0
            if (r3 == 0) goto L_0x0460
        L_0x045f:
            r15 = 1
        L_0x0460:
            X.68v r1 = X.C973068v.DISCOUNT
            if (r8 != r1) goto L_0x046a
            boolean r1 = r2.A01
            r17 = 1
            if (r1 != 0) goto L_0x046c
        L_0x046a:
            r17 = 0
        L_0x046c:
            java.lang.Integer r3 = r6.A01
            java.lang.Integer r1 = r6.A00
            java.lang.String r11 = X.C91645gZ.A06(r0, r2, r7, r3, r1)
            r13 = 16
            X.6us r10 = new X.6us
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r4.add(r10)
            goto L_0x041c
        L_0x047f:
            X.77N r3 = X.AnonymousClass77N.A00
            com.facebookpay.common.models.CurrencyAmount r1 = r7.A00
            java.lang.String r12 = X.C86124wJ.A0v(r1, r3)
            r3 = 0
            goto L_0x0451
        L_0x0489:
            boolean r2 = r3 instanceof X.C91535gO
            if (r2 == 0) goto L_0x04b7
            r4 = r3
            X.5gO r4 = (X.C91535gO) r4
            X.5gh r0 = (X.C91725gh) r0
            r8 = 0
            boolean r7 = X.AnonymousClass0wJ.A1Z(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0P(r1)
            r5 = 0
            if (r2 == 0) goto L_0x0ead
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r2.A08(r0)
            r2.setOnClickListener(r5)
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r0 = 0
            X.C116836xd.A00(r2, r0, r1, r0, r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131826428(0x7f1116fc, float:1.928574E38)
            goto L_0x01f2
        L_0x04b7:
            boolean r2 = r3 instanceof X.C91465gH
            if (r2 == 0) goto L_0x0657
            X.5B2 r0 = (X.AnonymousClass5B2) r0
            r10 = 0
            boolean r7 = X.AnonymousClass0wJ.A1Z(r1, r0)
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r0 = 2131300460(0x7f09106c, float:1.821895E38)
            r2.setId(r0)
            android.content.Context r14 = X.C18190wL.A0A(r2)
            X.51H r11 = new X.51H
            r11.<init>(r14)
            X.7HK r0 = X.AnonymousClass7Kz.A0J()
            boolean r0 = r0.A03()
            r5 = 0
            if (r0 == 0) goto L_0x04eb
            java.lang.Object r9 = r1.A01
            r8 = r9
            com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem r8 = (com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem) r8
            if (r8 == 0) goto L_0x0654
            java.lang.Integer r4 = r8.A03
        L_0x04e7:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r4 == r0) goto L_0x063d
        L_0x04eb:
            java.lang.Object r9 = r1.A01
            r8 = r9
            com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem r8 = (com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem) r8
            if (r8 == 0) goto L_0x063a
            java.lang.Integer r4 = r8.A02
        L_0x04f4:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r4 == r0) goto L_0x063d
            boolean r0 = r3.A01
            java.util.Locale r6 = X.AnonymousClass7Kz.A0O()
            android.content.Context r4 = r11.getContext()
            if (r0 == 0) goto L_0x062b
            r0 = 2131826424(0x7f1116f8, float:1.9285732E38)
            java.lang.String r4 = X.AnonymousClass0wJ.A0k(r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r0 = X.C86104wH.A11(r4, r6, r0, r10)
        L_0x0511:
            r11.setText(r0)
            boolean r6 = r3.A01
            if (r6 == 0) goto L_0x051d
            X.69Q r0 = X.AnonymousClass69Q.A0z
            r11.setTextStyle(r0)
        L_0x051d:
            r2.setLeftAddOnText(r11)
            if (r8 == 0) goto L_0x0614
            boolean r0 = r8.A05
            if (r0 != r7) goto L_0x05f6
            r2.setRightAddOnIcon(r5)
            r2.setEnabled(r10)
        L_0x052c:
            boolean r13 = X.AnonymousClass7Kx.A0R(r1)
            java.lang.String r12 = A02(r3, r2)
            java.lang.Throwable r10 = r1.A02
            boolean r11 = r10 instanceof X.AnonymousClass88V
            if (r11 == 0) goto L_0x05f2
            java.lang.String r4 = "shipping_option_inline_error"
        L_0x053c:
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r5, r12, r4)
            r2.A0J = r0
            if (r13 == 0) goto L_0x10e2
            if (r9 == 0) goto L_0x10dd
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r1 = r8.A01
            boolean r0 = r1 instanceof com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent
            if (r0 == 0) goto L_0x0582
            X.69B r0 = X.AnonymousClass69B.A0H
            r2.setTextStyle(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent"
            X.C04220Ms.A0C(r1, r0)
            com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent r1 = (com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent) r1
            X.7H2 r13 = X.AnonymousClass6XM.A00
            java.util.Locale r19 = X.AnonymousClass7Kz.A0O()
            java.util.Date r5 = r1.A05
            java.util.Date r4 = r1.A04
            com.facebookpay.common.models.CurrencyAmount r15 = r1.A00
            java.lang.String r0 = r1.A03
            r17 = r5
            r18 = r4
            r16 = r0
            java.lang.String r0 = r13.A04(r14, r15, r16, r17, r18, r19)
            r2.setPrimaryText(r0)
            java.lang.String r0 = r1.A01
        L_0x0576:
            r2.setSecondaryText(r0)
        L_0x0579:
            r2.A03()
            android.view.View$OnClickListener r0 = r3.A00
            r2.setOnClickListener(r0)
            return
        L_0x0582:
            boolean r0 = r1 instanceof com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent
            if (r0 == 0) goto L_0x05b9
            X.69B r0 = X.AnonymousClass69B.A0H
            r2.setTextStyle(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent"
            X.C04220Ms.A0C(r1, r0)
            com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent r1 = (com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent) r1
            X.7H2 r13 = X.AnonymousClass6XM.A00
            java.util.Locale r6 = X.AnonymousClass7Kz.A0O()
            boolean r5 = r1.A09
            java.lang.String r4 = r1.A06
            com.facebookpay.common.models.CurrencyAmount r0 = r1.A00
            java.lang.String r0 = A01(r14, r0, r4, r6, r5)
            r2.setPrimaryText(r0)
            java.util.Locale r17 = X.AnonymousClass7Kz.A0O()
            java.util.Date r15 = r1.A08
            java.util.Date r0 = r1.A07
            r18 = r7
            r16 = r0
            android.text.SpannableStringBuilder r0 = r13.A03(r14, r15, r16, r17, r18)
            r2.setSecondarySpannableText(r0)
            goto L_0x0579
        L_0x05b9:
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent"
            X.C04220Ms.A0C(r1, r0)
            if (r6 == 0) goto L_0x05e8
            X.69B r0 = X.AnonymousClass69B.A0H
            r2.setTextStyle(r0)
            java.util.Locale r7 = X.AnonymousClass7Kz.A0O()
            java.lang.String r6 = r1.A03()
            com.facebookpay.common.models.CurrencyAmount r0 = r1.A00()
            java.lang.String r5 = "%1s • %2s"
            r4 = 2
            java.lang.String r0 = X.AnonymousClass7H2.A00(r14, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r0}
            java.lang.String r0 = X.C86104wH.A11(r5, r7, r0, r4)
        L_0x05e0:
            r2.setPrimaryText(r0)
            java.lang.String r0 = r1.A01()
            goto L_0x0576
        L_0x05e8:
            X.69B r0 = X.AnonymousClass69B.A0A
            r2.setTextStyle(r0)
            java.lang.String r0 = r1.A03()
            goto L_0x05e0
        L_0x05f2:
            java.lang.String r4 = "shipping_option"
            goto L_0x053c
        L_0x05f6:
            boolean r0 = r8.A04
            if (r0 != r7) goto L_0x0614
            X.51G r4 = new X.51G
            r4.<init>(r14)
            if (r6 == 0) goto L_0x0611
            X.697 r0 = X.AnonymousClass697.SECONDARY_CHEVRON_DOWN_FILLED_MEDIUM_DISABLED
        L_0x0603:
            r4.setIcon(r0)
            r4.setEnabled(r10)
            r2.setRightAddOnIcon(r4)
            r2.setEnabled(r10)
            goto L_0x052c
        L_0x0611:
            X.697 r0 = X.AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE_DISABLED
            goto L_0x0603
        L_0x0614:
            X.51G r4 = new X.51G
            r4.<init>(r14)
            if (r6 == 0) goto L_0x0628
            X.697 r0 = X.AnonymousClass697.SECONDARY_CHEVRON_DOWN_FILLED_MEDIUM
        L_0x061d:
            r4.setIcon(r0)
            r2.setRightAddOnIcon(r4)
            r2.setEnabled(r7)
            goto L_0x052c
        L_0x0628:
            X.697 r0 = X.AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE
            goto L_0x061d
        L_0x062b:
            r0 = 2131826449(0x7f111711, float:1.9285783E38)
            java.lang.String r4 = X.AnonymousClass0wJ.A0k(r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r0 = X.C86104wH.A11(r4, r6, r0, r10)
            goto L_0x0511
        L_0x063a:
            r4 = r5
            goto L_0x04f4
        L_0x063d:
            java.util.Locale r6 = X.AnonymousClass7Kz.A0O()
            android.content.Context r4 = r11.getContext()
            r0 = 2131826440(0x7f111708, float:1.9285764E38)
            java.lang.String r4 = X.AnonymousClass0wJ.A0k(r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r0 = X.C86104wH.A11(r4, r6, r0, r10)
            goto L_0x0511
        L_0x0654:
            r4 = r5
            goto L_0x04e7
        L_0x0657:
            boolean r2 = r3 instanceof X.C91335g4
            if (r2 == 0) goto L_0x07a4
            X.5B1 r0 = (X.AnonymousClass5B1) r0
            r3 = 0
            X.C04220Ms.A0B(r1, r3)
            r2 = 1
            r5 = 6
            X.C04220Ms.A0B(r0, r2)
            boolean r4 = X.AnonymousClass7Kx.A0R(r1)
            if (r4 == 0) goto L_0x1884
            java.lang.Object r6 = r1.A01
            if (r6 == 0) goto L_0x1884
            com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem r6 = (com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem) r6
            X.67l r1 = r6.A00
            if (r1 == 0) goto L_0x1127
            int r1 = r1.ordinal()
            if (r1 != r5) goto L_0x1127
            android.widget.LinearLayout r4 = r0.A00
            android.content.Context r5 = X.C18190wL.A0A(r4)
            java.lang.String r7 = r6.A01
            com.instagram.service.session.UserSession r6 = X.AnonymousClass7HK.A00()
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r0 = 36317470361915152(0x81068c00100f10, double:3.030652723365798E-306)
            boolean r9 = X.C63803iN.A0E(r8, r6, r0)
            com.instagram.service.session.UserSession r6 = X.AnonymousClass7HK.A00()
            r0 = 36317470361980689(0x81068c00110f11, double:3.030652723407244E-306)
            boolean r8 = X.C63803iN.A0E(r8, r6, r0)
            X.AnonymousClass7Kz.A0E()
            java.lang.String r1 = "instagram"
            boolean r0 = r1.equals(r1)
            if (r0 == 0) goto L_0x0793
            r0 = 2131826606(0x7f1117ae, float:1.9286101E38)
        L_0x06ae:
            java.lang.String r6 = r5.getString(r0)
        L_0x06b2:
            X.C04220Ms.A09(r6)
            if (r9 != 0) goto L_0x06b9
            if (r8 == 0) goto L_0x078d
        L_0x06b9:
            java.lang.String r1 = "FULL_PUX"
            java.lang.String r0 = "PARTIAL_PUX_WITH_CREDENTIAL"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.Set r0 = X.AnonymousClass4WM.A08(r0)
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x078d
            r0 = 2131826605(0x7f1117ad, float:1.92861E38)
            if (r9 == 0) goto L_0x06d3
            r0 = 2131826610(0x7f1117b2, float:1.928611E38)
        L_0x06d3:
            java.lang.String r0 = r5.getString(r0)
            X.C04220Ms.A06(r0)
            if (r9 == 0) goto L_0x0784
            r0 = 2131826608(0x7f1117b0, float:1.9286105E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r5, r6, r0)
        L_0x06e3:
            X.C04220Ms.A09(r0)
            r0 = 2131826607(0x7f1117af, float:1.9286103E38)
            java.lang.String r7 = X.AnonymousClass0wJ.A0k(r5, r0)
            if (r9 == 0) goto L_0x077b
            r1 = 2131826609(0x7f1117b1, float:1.9286107E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r7}
        L_0x06f6:
            java.lang.String r0 = r5.getString(r1, r0)
            android.text.SpannableStringBuilder r8 = X.C18200wM.A0E(r0)
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r2)
            int r2 = X.AnonymousClass8bP.A0J(r8, r7, r3, r3)
            int r1 = X.AnonymousClass2C6.A00(r7)
            int r1 = r1 + r2
            r0 = 33
            r8.setSpan(r6, r2, r1, r0)
            X.77R r1 = X.AnonymousClass7Kz.A0M()
            X.24u r7 = X.C312324u.A03
            r0 = 0
            com.instagram.igds.components.banner.IgdsBanner r6 = new com.instagram.igds.components.banner.IgdsBanner
            r6.<init>(r5, r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.setBody(r8, r0)
            r6.setDividerVisibility(r3)
            java.lang.Integer r0 = r7.A00
            if (r0 == 0) goto L_0x0755
            int r2 = r0.intValue()
            X.0Ok r0 = X.C06810aP.A01
            com.instagram.service.session.UserSession r1 = r1.A00
            com.instagram.user.model.User r0 = r0.A01(r1)
            com.instagram.common.typedurl.ImageUrl r0 = r0.B4M()
            if (r2 != 0) goto L_0x0775
            X.82a r2 = new X.82a
            r2.<init>(r5, r0, r6)
        L_0x0742:
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            android.os.Looper r0 = X.C1189773a.A00(r1)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            X.613 r0 = new X.613
            r0.<init>(r2)
            r1.post(r0)
        L_0x0755:
            java.lang.Integer r0 = r7.A01
            if (r0 == 0) goto L_0x075f
            r0 = 2131100085(0x7f0601b5, float:1.7812541E38)
            X.C18230wP.A0z(r5, r6, r0)
        L_0x075f:
            r1 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r1)
            r0.setMarginStart(r3)
            r0.setMarginEnd(r3)
            r6.setLayoutParams(r0)
        L_0x076e:
            r4.addView(r6)
            r4.setVisibility(r3)
            return
        L_0x0775:
            X.82b r2 = new X.82b
            r2.<init>(r5, r0, r6)
            goto L_0x0742
        L_0x077b:
            r1 = 2131826604(0x7f1117ac, float:1.9286097E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            goto L_0x06f6
        L_0x0784:
            r0 = 2131826603(0x7f1117ab, float:1.9286095E38)
            java.lang.String r0 = r5.getString(r0)
            goto L_0x06e3
        L_0x078d:
            android.view.View r6 = new android.view.View
            r6.<init>(r5)
            goto L_0x076e
        L_0x0793:
            java.lang.String r0 = "facebook"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07a0
            r0 = 2131826602(0x7f1117aa, float:1.9286093E38)
            goto L_0x06ae
        L_0x07a0:
            java.lang.String r6 = "unknown"
            goto L_0x06b2
        L_0x07a4:
            boolean r2 = r3 instanceof X.C91455gG
            if (r2 == 0) goto L_0x07fd
            X.5BT r0 = (X.AnonymousClass5BT) r0
            X.AnonymousClass0wJ.A1N(r1, r0)
            java.lang.Object r9 = r1.A01
            r8 = r9
            com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem) r8
            r6 = 0
            if (r8 == 0) goto L_0x07d5
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            java.lang.String r2 = r8.A01
            r7.setPrimaryText(r2)
            java.lang.Integer r2 = r8.A00
            java.lang.Integer r5 = X.AnonymousClass006.A01
            if (r2 != r5) goto L_0x07f6
            android.content.Context r4 = r7.getContext()
            r2 = 2131826462(0x7f11171e, float:1.928581E38)
            java.lang.String r2 = r4.getString(r2)
            X.C116836xd.A01(r7, r5, r2)
            X.51G r2 = r0.A01
        L_0x07d2:
            r7.setRightAddOnIcon(r2)
        L_0x07d5:
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x07eb
            if (r9 == 0) goto L_0x1135
            java.lang.Integer r4 = r8.A00
            java.lang.Integer r2 = X.AnonymousClass006.A01
            if (r4 != r2) goto L_0x112f
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r0 = 15
        L_0x07e7:
            X.C86104wH.A1D(r2, r0, r1, r3)
            return
        L_0x07eb:
            boolean r2 = X.AnonymousClass7Kx.A0O(r1)
            if (r2 == 0) goto L_0x113a
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r0 = 16
            goto L_0x07e7
        L_0x07f6:
            java.lang.Integer r2 = X.AnonymousClass006.A00
            X.C116836xd.A01(r7, r2, r6)
            r2 = r6
            goto L_0x07d2
        L_0x07fd:
            boolean r2 = r3 instanceof X.C91525gN
            if (r2 == 0) goto L_0x0893
            X.5Bk r0 = (X.C88975Bk) r0
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            r2 = 1
            r11 = 3
            X.C04220Ms.A0B(r0, r2)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            r9 = 0
            if (r2 == 0) goto L_0x1145
            java.lang.Object r8 = r1.A01
            if (r8 == 0) goto L_0x1140
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r8
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            android.content.Context r6 = r7.getContext()
            java.lang.String r2 = r8.A03
            r7.setPrimaryText(r2)
            java.lang.String r2 = r8.A02
            r7.setSecondaryText(r2)
            java.lang.String r2 = r8.A04
            r7.setTertiaryText(r2)
            java.lang.String r5 = r8.A05
            if (r5 != 0) goto L_0x0883
            java.lang.Integer r2 = r8.A00
            if (r2 == 0) goto L_0x0880
            int r5 = r2.intValue()
            r2 = 2131820713(0x7f1100a9, float:1.9274149E38)
            java.lang.String r4 = r6.getString(r2)
            r2 = 2131826487(0x7f111737, float:1.928586E38)
            java.lang.String r10 = r6.getString(r2)
            java.lang.String r9 = r6.getString(r5)
        L_0x084c:
            r7.setErrorText(r9)
            java.lang.Integer r9 = r8.A01
            int r5 = r9.intValue()
            r6 = 1
            if (r5 == r11) goto L_0x0872
            r2 = 2
            if (r5 == r2) goto L_0x0872
            X.51G r2 = r0.A01
            r7.setRightAddOnIcon(r2)
        L_0x0860:
            r12 = 2
            com.facebook.redex.IDxCListenerShape16S0400000_2_I2 r11 = new com.facebook.redex.IDxCListenerShape16S0400000_2_I2
            r13 = r8
            r14 = r0
            r15 = r3
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r7.setOnClickListener(r11)
            X.AnonymousClass7H2.A02(r8, r7, r4, r10)
            return
        L_0x0872:
            X.51D r5 = r0.A02
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r9 == r2) goto L_0x0879
            r6 = 0
        L_0x0879:
            r5.setChecked(r6)
            r7.setRightAddOnView(r5)
            goto L_0x0860
        L_0x0880:
            r10 = r9
            r4 = r9
            goto L_0x084c
        L_0x0883:
            r2 = 2131820713(0x7f1100a9, float:1.9274149E38)
            java.lang.String r4 = r6.getString(r2)
            r2 = 2131826487(0x7f111737, float:1.928586E38)
            java.lang.String r10 = r6.getString(r2)
            r9 = r5
            goto L_0x084c
        L_0x0893:
            boolean r2 = r3 instanceof X.C91445gF
            if (r2 == 0) goto L_0x090d
            X.5B0 r0 = (X.AnonymousClass5B0) r0
            boolean r7 = X.AnonymousClass0wJ.A1Y(r1, r0)
            java.lang.Object r2 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionPromoCodeViewItem r2 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPromoCodeViewItem) r2
            if (r2 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            android.content.Context r4 = r5.getContext()
            X.69B r0 = X.AnonymousClass69B.A0N
            r5.setTextStyle(r0)
            java.lang.String r6 = r2.A00
            r5.setPrimaryText(r6)
            android.widget.FrameLayout r2 = r5.A07
            if (r2 == 0) goto L_0x08bc
            r0 = 14
            X.C86104wH.A1D(r2, r0, r1, r3)
        L_0x08bc:
            r0 = 2131826371(0x7f1116c3, float:1.9285624E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r4, r6, r0)
            r5.setContentDescription(r0)
            r0 = 2131826621(0x7f1117bd, float:1.9286132E38)
            java.lang.String r2 = r4.getString(r0)
            X.03m r1 = X.C008103m.A08
            X.7ZV r0 = new X.7ZV
            r0.<init>(r5)
            X.C006702y.A0D(r5, r1, r0, r2)
            r0 = 3
            com.facebookpay.widget.listcell.ListCell.A01(r5, r0, r7, r7)
            r0 = 2131304579(0x7f092083, float:1.8227305E38)
            android.widget.TextView r1 = X.C18180wK.A0G(r5, r0)
            r0 = 16
            r1.setGravity(r0)
            X.L6z r1 = X.C86134wK.A0J(r1)
            r0 = 2131301885(0x7f0915fd, float:1.822184E38)
            r1.A0s = r0
            r1.A0E = r0
            android.widget.FrameLayout r1 = r5.A07
            if (r1 == 0) goto L_0x1884
            r0 = 2131302665(0x7f091909, float:1.8223423E38)
            android.view.View r1 = r1.findViewById(r0)
            com.facebookpay.widget.button.FBPayButton r1 = (com.facebookpay.widget.button.FBPayButton) r1
            if (r1 == 0) goto L_0x1884
            r0 = 2131826628(0x7f1117c4, float:1.9286146E38)
            X.C18200wM.A15(r4, r1, r0)
            X.69C r0 = X.AnonymousClass69C.A0A
            r1.setButtonStyle(r0)
            return
        L_0x090d:
            boolean r2 = r3 instanceof X.C91435gE
            if (r2 == 0) goto L_0x096e
            X.5Bj r0 = (X.C88965Bj) r0
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            r2 = 1
            r9 = 3
            X.C04220Ms.A0B(r0, r2)
            java.lang.Object r8 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem) r8
            if (r8 == 0) goto L_0x093e
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            java.lang.String r2 = r8.A01
            r7.setPrimaryText(r2)
            java.lang.Integer r6 = r8.A00
            int r4 = r6.intValue()
            r5 = 1
            if (r4 == r9) goto L_0x0960
            r2 = 2
            if (r4 == r2) goto L_0x0960
            X.51G r2 = r0.A01
            r7.setRightAddOnIcon(r2)
        L_0x093a:
            r2 = 0
            X.AnonymousClass7H2.A02(r8, r7, r2, r2)
        L_0x093e:
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x0951
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r4 = 10
            com.facebook.redex.IDxCListenerShape42S0300000_2_I2 r2 = new com.facebook.redex.IDxCListenerShape42S0300000_2_I2
            r2.<init>((int) r4, (java.lang.Object) r3, (java.lang.Object) r1, (java.lang.Object) r0)
        L_0x094d:
            r5.setOnClickListener(r2)
            return
        L_0x0951:
            boolean r2 = X.AnonymousClass7Kx.A0O(r1)
            if (r2 == 0) goto L_0x115b
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r0 = 13
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r2 = X.C86164wN.A0L(r1, r3, r0)
            goto L_0x094d
        L_0x0960:
            X.51D r4 = r0.A02
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r6 == r2) goto L_0x0967
            r5 = 0
        L_0x0967:
            r4.setChecked(r5)
            r7.setRightAddOnView(r4)
            goto L_0x093a
        L_0x096e:
            boolean r2 = r3 instanceof X.C91425gD
            if (r2 == 0) goto L_0x0ac3
            X.5Br r0 = (X.C89045Br) r0
            r9 = 0
            X.C04220Ms.A0B(r1, r9)
            r16 = 1
            r10 = 3
            r2 = r16
            X.C04220Ms.A0B(r0, r2)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x1163
            com.facebookpay.widget.listcell.ListCell r8 = r0.A01
            r8.A03()
            java.lang.Object r7 = r1.A01
            if (r7 == 0) goto L_0x115e
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r7 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r7
            android.content.Context r11 = r8.getContext()
            boolean r6 = r7.A0I
            r5 = 2
            r4 = 0
            if (r6 == 0) goto L_0x0a89
            X.7HK r2 = X.AnonymousClass7Kz.A0J()
            boolean r2 = r2.A04()
            if (r2 == 0) goto L_0x0a89
            java.lang.String r13 = r7.A0F
            if (r13 == 0) goto L_0x0a89
            boolean r2 = X.AnonymousClass8bQ.A0n(r13)
            if (r2 != 0) goto L_0x0a89
            java.lang.String r12 = r7.A0G
            if (r12 == 0) goto L_0x0a89
            boolean r2 = X.AnonymousClass8bQ.A0n(r12)
            if (r2 != 0) goto L_0x0a89
            r8.A0B(r13)
            r8.setPrimaryText(r12)
            X.67L r2 = r7.A01
            java.lang.String r15 = "•••• "
            if (r2 == 0) goto L_0x0a81
            X.C04220Ms.A06(r11)
            java.lang.String r14 = X.C116946xs.A01(r11, r2)
            if (r14 == 0) goto L_0x0a81
            boolean r2 = X.AnonymousClass8bQ.A0m(r14)
            if (r2 == 0) goto L_0x0a81
            java.util.Locale r13 = X.AnonymousClass7Kz.A0O()
            r2 = 2131826383(0x7f1116cf, float:1.9285649E38)
            java.lang.String r12 = X.AnonymousClass0wJ.A0k(r11, r2)
            java.lang.String r2 = r7.A0H
            java.lang.String r2 = X.AnonymousClass00U.A0L(r15, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r14}
            java.lang.String r2 = X.C86104wH.A11(r12, r13, r2, r5)
        L_0x09ed:
            r8.setSecondaryText(r2)
            X.69Q r2 = X.AnonymousClass69Q.A0N
            r8.setSecondaryTextStyle(r2)
            java.lang.String r2 = r7.A04
            r8.setTertiaryText(r2)
        L_0x09fa:
            com.facebook.graphql.impls.CardVerificationFieldsImpl r12 = r7.A00
            if (r12 == 0) goto L_0x0a06
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r12.getStringValue(r2)
            if (r2 != 0) goto L_0x0a12
        L_0x0a06:
            java.lang.Integer r2 = r7.A02
            if (r2 == 0) goto L_0x0a7f
            int r2 = r2.intValue()
            java.lang.String r2 = r11.getString(r2)
        L_0x0a12:
            r8.setErrorText(r2)
            if (r6 == 0) goto L_0x0a29
            X.7HK r2 = X.AnonymousClass7Kz.A0J()
            boolean r2 = r2.A04()
            if (r2 == 0) goto L_0x0a29
            r6 = 14
            r2 = 2131886527(0x7f1201bf, float:1.9407635E38)
            r8.A06(r6, r2)
        L_0x0a29:
            java.lang.Integer r11 = r7.A03
            int r6 = r11.intValue()
            if (r6 == r10) goto L_0x0a70
            if (r6 == r5) goto L_0x0a70
            r2 = 4
            if (r6 == r2) goto L_0x0a6b
            X.51G r2 = r0.A02
        L_0x0a38:
            r8.setRightAddOnIcon(r2)
        L_0x0a3b:
            com.facebook.redex.IDxCListenerShape16S0400000_2_I2 r10 = new com.facebook.redex.IDxCListenerShape16S0400000_2_I2
            r12 = r7
            r13 = r0
            r14 = r3
            r15 = r1
            r11 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            r8.setOnClickListener(r10)
            java.lang.Integer r2 = r7.A03
            java.lang.Integer r1 = X.AnonymousClass006.A0Y
            if (r2 == r1) goto L_0x0a50
            r4 = 1
        L_0x0a50:
            r8.setClickable(r4)
            r1 = 0
            X.AnonymousClass7H2.A02(r7, r8, r1, r1)
            boolean r1 = r7.A06
            if (r1 != 0) goto L_0x1884
            X.51D r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            r8.setClickable(r9)
            X.69B r0 = X.AnonymousClass69B.A08
            r8.setTextStyle(r0)
            return
        L_0x0a6b:
            r2 = 0
            r8.setRightAddOnView(r2)
            goto L_0x0a38
        L_0x0a70:
            X.51D r5 = r0.A03
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            boolean r2 = X.C18180wK.A1Z(r11, r2)
            r5.setChecked(r2)
            r8.setRightAddOnView(r5)
            goto L_0x0a3b
        L_0x0a7f:
            r2 = 0
            goto L_0x0a12
        L_0x0a81:
            java.lang.String r2 = r7.A0H
            java.lang.String r2 = X.AnonymousClass00U.A0L(r15, r2)
            goto L_0x09ed
        L_0x0a89:
            java.lang.String r2 = r7.A0C
            r8.setImageUrl(r2)
            X.67L r2 = r7.A01
            if (r2 == 0) goto L_0x0ac0
            X.C04220Ms.A06(r11)
            java.lang.String r14 = X.C116946xs.A01(r11, r2)
            if (r14 == 0) goto L_0x0ac0
            boolean r2 = X.AnonymousClass8bQ.A0m(r14)
            if (r2 == 0) goto L_0x0ac0
            java.util.Locale r13 = X.AnonymousClass7Kz.A0O()
            r2 = 2131826383(0x7f1116cf, float:1.9285649E38)
            java.lang.String r12 = X.AnonymousClass0wJ.A0k(r11, r2)
            java.lang.String r2 = r7.A05
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r14}
            java.lang.String r2 = X.C86104wH.A11(r12, r13, r2, r5)
        L_0x0ab6:
            r8.setPrimaryText(r2)
            java.lang.String r2 = r7.A04
            r8.setSecondaryText(r2)
            goto L_0x09fa
        L_0x0ac0:
            java.lang.String r2 = r7.A05
            goto L_0x0ab6
        L_0x0ac3:
            boolean r2 = r3 instanceof X.C91415gC
            if (r2 == 0) goto L_0x0b3b
            X.5Az r0 = (X.C88865Az) r0
            boolean r6 = X.AnonymousClass0wJ.A1Y(r1, r0)
            java.lang.Object r5 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionOfferViewItem r5 = (com.facebookpay.common.recyclerview.adapteritems.SelectionOfferViewItem) r5
            if (r5 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            android.content.Context r4 = r7.getContext()
            java.lang.String r8 = r5.A04
            r7.setPrimaryText(r8)
            java.lang.String r0 = r5.A00
            r7.setSecondaryText(r0)
            java.lang.String r0 = r5.A02
            r7.setTertiaryText(r0)
            android.widget.FrameLayout r2 = r7.A07
            if (r2 == 0) goto L_0x0af1
            r0 = 12
            X.C86104wH.A1D(r2, r0, r1, r3)
        L_0x0af1:
            r0 = 2131826371(0x7f1116c3, float:1.9285624E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r4, r8, r0)
            r7.setContentDescription(r0)
            r0 = 2131826621(0x7f1117bd, float:1.9286132E38)
            java.lang.String r2 = r4.getString(r0)
            X.03m r1 = X.C008103m.A08
            X.7ZV r0 = new X.7ZV
            r0.<init>(r7)
            X.C006702y.A0D(r7, r1, r0, r2)
            r0 = 3
            r1 = 0
            com.facebookpay.widget.listcell.ListCell.A01(r7, r0, r6, r6)
            android.widget.FrameLayout r2 = r7.A07
            if (r2 == 0) goto L_0x0b1e
            r0 = 2131302665(0x7f091909, float:1.8223423E38)
            android.view.View r1 = r2.findViewById(r0)
            com.facebookpay.widget.button.FBPayButton r1 = (com.facebookpay.widget.button.FBPayButton) r1
        L_0x0b1e:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0b30
            if (r1 == 0) goto L_0x1884
            r0 = 2131826628(0x7f1117c4, float:1.9286146E38)
            X.C18200wM.A15(r4, r1, r0)
            X.69C r0 = X.AnonymousClass69C.A0A
        L_0x0b2c:
            r1.setButtonStyle(r0)
            return
        L_0x0b30:
            if (r1 == 0) goto L_0x1884
            r0 = 2131826623(0x7f1117bf, float:1.9286136E38)
            X.C18200wM.A15(r4, r1, r0)
            X.69C r0 = X.AnonymousClass69C.A07
            goto L_0x0b2c
        L_0x0b3b:
            boolean r2 = r3 instanceof X.C91405gB
            if (r2 == 0) goto L_0x0bb8
            X.5Bi r0 = (X.C88955Bi) r0
            r12 = 0
            X.C04220Ms.A0B(r1, r12)
            r2 = 1
            r9 = 3
            X.C04220Ms.A0B(r0, r2)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x185e
            java.lang.Object r8 = r1.A01
            if (r8 == 0) goto L_0x1185
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem) r8
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            android.content.Context r11 = X.C18190wL.A0A(r7)
            java.util.Locale r10 = X.AnonymousClass7Kz.A0O()
            java.lang.String r6 = r8.A02()
            com.facebookpay.common.models.CurrencyAmount r2 = r8.A00()
            java.lang.String r5 = "%1s - %2s"
            r4 = 2
            java.lang.String r2 = X.AnonymousClass7H2.A00(r11, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r2}
            java.lang.String r2 = X.C86104wH.A11(r5, r10, r2, r4)
            r7.setPrimaryText(r2)
            java.lang.String r2 = r8.A01()
            r7.setSecondaryText(r2)
            X.69B r2 = X.AnonymousClass69B.A0N
            r7.setTextStyle(r2)
            java.lang.Integer r6 = r8.BA9()
            int r2 = r6.intValue()
            r5 = 1
            if (r2 == r9) goto L_0x0baa
            if (r2 == r4) goto L_0x0baa
            X.51G r2 = r0.A01
            r7.setRightAddOnIcon(r2)
        L_0x0b98:
            com.facebook.redex.IDxCListenerShape16S0400000_2_I2 r11 = new com.facebook.redex.IDxCListenerShape16S0400000_2_I2
            r13 = r8
            r14 = r0
            r15 = r3
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r7.setOnClickListener(r11)
            r0 = 0
            X.AnonymousClass7H2.A02(r8, r7, r0, r0)
            return
        L_0x0baa:
            X.51D r4 = r0.A02
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r6 == r2) goto L_0x0bb1
            r5 = 0
        L_0x0bb1:
            r4.setChecked(r5)
            r7.setRightAddOnView(r4)
            goto L_0x0b98
        L_0x0bb8:
            boolean r2 = r3 instanceof X.C91395gA
            if (r2 == 0) goto L_0x0c19
            X.5Bh r0 = (X.C88945Bh) r0
            r2 = 0
            X.C04220Ms.A0B(r1, r2)
            r2 = 1
            r9 = 3
            X.C04220Ms.A0B(r0, r2)
            java.lang.Object r8 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem) r8
            if (r8 == 0) goto L_0x0be9
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            java.lang.String r2 = r8.A01
            r7.setPrimaryText(r2)
            java.lang.Integer r6 = r8.A00
            int r4 = r6.intValue()
            r5 = 1
            if (r4 == r9) goto L_0x0c0b
            r2 = 2
            if (r4 == r2) goto L_0x0c0b
            X.51G r2 = r0.A01
            r7.setRightAddOnIcon(r2)
        L_0x0be5:
            r2 = 0
            X.AnonymousClass7H2.A02(r8, r7, r2, r2)
        L_0x0be9:
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x0bfc
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r4 = 9
            com.facebook.redex.IDxCListenerShape42S0300000_2_I2 r2 = new com.facebook.redex.IDxCListenerShape42S0300000_2_I2
            r2.<init>((int) r4, (java.lang.Object) r3, (java.lang.Object) r1, (java.lang.Object) r0)
        L_0x0bf8:
            r5.setOnClickListener(r2)
            return
        L_0x0bfc:
            boolean r2 = X.AnonymousClass7Kx.A0O(r1)
            if (r2 == 0) goto L_0x118a
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r0 = 11
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r2 = X.C86164wN.A0L(r1, r3, r0)
            goto L_0x0bf8
        L_0x0c0b:
            X.51D r4 = r0.A02
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r6 == r2) goto L_0x0c12
            r5 = 0
        L_0x0c12:
            r4.setChecked(r5)
            r7.setRightAddOnView(r4)
            goto L_0x0be5
        L_0x0c19:
            boolean r2 = r3 instanceof X.C91595gU
            if (r2 == 0) goto L_0x0c26
            r2 = r3
            X.5gU r2 = (X.C91595gU) r2
            X.5Bg r0 = (X.C88935Bg) r0
            r2.A0A(r0, r1)
            return
        L_0x0c26:
            boolean r2 = r3 instanceof X.C91385g9
            if (r2 == 0) goto L_0x1197
            r5 = r3
            X.5g9 r5 = (X.C91385g9) r5
            X.5Ay r0 = (X.C88855Ay) r0
            r4 = 0
            boolean r7 = X.AnonymousClass0wJ.A1Z(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x0ca4
            com.facebookpay.widget.listcell.ListCell r3 = r0.A00
            r3.A03()
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L_0x1192
            com.facebookpay.common.recyclerview.adapteritems.PuxIncentiveItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxIncentiveItem) r0
            java.util.List r6 = r0.A00
            boolean r0 = X.C18190wL.A1a(r6)
            java.util.Locale r2 = X.AnonymousClass7Kz.A0O()
            if (r0 == 0) goto L_0x0c90
            android.view.ContextThemeWrapper r5 = r5.A00
            r0 = 2131826409(0x7f1116e9, float:1.9285702E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r5, r0)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C86104wH.A11(r1, r2, r0, r4)
            r3.setPrimaryText(r0)
            int r0 = r6.size()
            if (r0 <= r7) goto L_0x0c89
            java.util.Locale r2 = X.AnonymousClass7Kz.A0O()
            r1 = 2131826407(0x7f1116e7, float:1.9285698E38)
            int r0 = r6.size()
            java.lang.Object[] r0 = X.C18210wN.A1X(r0)
            java.lang.String r1 = r5.getString(r1, r0)
            X.C04220Ms.A06(r1)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C86104wH.A11(r1, r2, r0, r4)
        L_0x0c85:
            r3.setSecondaryText(r0)
            return
        L_0x0c89:
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0c85
        L_0x0c90:
            android.view.ContextThemeWrapper r1 = r5.A00
            r0 = 2131826408(0x7f1116e8, float:1.92857E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C86104wH.A11(r1, r2, r0, r4)
            r3.setPrimaryText(r0)
            r0 = 0
            goto L_0x0c85
        L_0x0ca4:
            boolean r2 = X.AnonymousClass7Kx.A0P(r1)
            if (r2 == 0) goto L_0x0cb8
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r2.A08(r0)
            android.view.ContextThemeWrapper r1 = r5.A00
        L_0x0cb3:
            r0 = 2131826411(0x7f1116eb, float:1.9285706E38)
            goto L_0x01f2
        L_0x0cb8:
            boolean r1 = X.AnonymousClass7Kx.A0O(r1)
            if (r1 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            goto L_0x03e0
        L_0x0cc2:
            java.lang.Object r8 = r1.A01
            r7 = r8
            com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem r7 = (com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem) r7
            if (r7 == 0) goto L_0x0cce
            boolean r2 = r7.A06
            r1 = 1
            if (r2 == r9) goto L_0x0ccf
        L_0x0cce:
            r1 = 0
        L_0x0ccf:
            com.facebookpay.widget.listcell.ListCell r6 = r0.A00
            if (r1 == 0) goto L_0x0d7d
            r6.setRightAddOnIcon(r4)
            r6.setEnabled(r5)
        L_0x0cd9:
            r6.A03()
            r1 = 14
            X.C86104wH.A1C(r6, r1, r3)
            java.lang.Integer r1 = X.AnonymousClass006.A01
            X.C116836xd.A01(r6, r1, r4)
            java.lang.String r1 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem"
            X.C04220Ms.A0C(r8, r1)
            com.facebookpay.common.models.CurrencyAmount r1 = r7.A02
            X.77N r2 = X.AnonymousClass77N.A00
            java.lang.String r1 = X.C86124wJ.A0v(r1, r2)
            r6.setPrimaryText(r1)
            boolean r1 = r7.A07
            if (r1 == 0) goto L_0x0d31
            com.facebookpay.common.models.CurrencyAmount r1 = r7.A01
            java.lang.String r1 = X.C86124wJ.A0v(r1, r2)
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r1)
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
            int r2 = r8.length()
            r1 = 33
            r8.setSpan(r3, r5, r2, r1)
            android.content.Context r3 = X.C18190wL.A0A(r6)
            X.51I r2 = new X.51I
            r2.<init>(r3)
            X.69Q r1 = X.AnonymousClass69Q.A0a
            r2.setTextStyle(r1)
            r2.setSpannableString(r8)
            r6.setPrimaryTextAddOnText(r2)
            r1 = 2131826442(0x7f11170a, float:1.9285769E38)
            java.lang.String r1 = r3.getString(r1)
            r6.setSecondaryText(r1)
        L_0x0d31:
            boolean r1 = r7.A08
            java.lang.String r8 = r7.A04
            if (r1 == 0) goto L_0x0d55
            if (r8 == 0) goto L_0x0d71
            java.util.Locale r3 = X.AnonymousClass7Kz.A0O()
            android.content.Context r2 = r6.getContext()
            r1 = 2131826406(0x7f1116e6, float:1.9285695E38)
            java.lang.String r1 = r2.getString(r1)
            java.lang.Object[] r2 = X.C86144wL.A1a(r1, r8)
            java.lang.String r1 = "%1s\n%2s"
            java.lang.String r8 = java.lang.String.format(r3, r1, r2)
        L_0x0d52:
            X.C04220Ms.A06(r8)
        L_0x0d55:
            r6.setTertiaryText(r8)
            X.51a r1 = r0.A01
            java.util.List r0 = r7.A05
            r1.setImageThumbnailUrls(r0)
            int r0 = r7.A00
            r1.setNumItems(r0)
            r6.setLeftAddOnView(r1)
            android.widget.FrameLayout r0 = r6.A03
            if (r0 != 0) goto L_0x0d93
            java.lang.String r0 = "leftAddOnContainer"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x0d71:
            android.content.Context r2 = r6.getContext()
            r1 = 2131826406(0x7f1116e6, float:1.9285695E38)
            java.lang.String r8 = r2.getString(r1)
            goto L_0x0d52
        L_0x0d7d:
            android.content.Context r1 = X.C18190wL.A0A(r6)
            X.51G r2 = new X.51G
            r2.<init>(r1)
            X.697 r1 = X.AnonymousClass697.SECONDARY_CHEVRON_DOWN_FILLED_MEDIUM
            r2.setIcon(r1)
            r6.setRightAddOnIcon(r2)
            r6.setEnabled(r9)
            goto L_0x0cd9
        L_0x0d93:
            X.L6z r0 = X.C86134wK.A0J(r0)
            r0.A0s = r5
            r0.A0E = r5
            return
        L_0x0d9c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0da1:
            java.lang.Object r9 = r1.A01
            r8 = r9
            com.facebookpay.common.recyclerview.adapteritems.PuxContactItem r8 = (com.facebookpay.common.recyclerview.adapteritems.PuxContactItem) r8
            if (r8 == 0) goto L_0x0df7
            boolean r2 = r8.A07
            if (r2 != r4) goto L_0x0df7
            com.facebookpay.widget.listcell.ListCell r6 = r0.A00
            r6.setRightAddOnIcon(r7)
            r6.setEnabled(r5)
        L_0x0db4:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.C116836xd.A01(r6, r0, r7)
            r6.A03()
            android.view.View$OnClickListener r0 = r3.A00
            r6.setOnClickListener(r0)
            boolean r5 = X.AnonymousClass7Kx.A0R(r1)
            java.lang.String r4 = A02(r3, r6)
            if (r5 == 0) goto L_0x0df4
            java.lang.String r2 = "contact_info"
        L_0x0dcd:
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r7, r4, r2)
            r6.A0J = r0
            if (r5 == 0) goto L_0x0e1a
            if (r9 == 0) goto L_0x0e15
            java.lang.String r0 = r8.A04
            r6.setPrimaryText(r0)
            java.lang.String r0 = r8.A05
            r6.setSecondaryText(r0)
            java.lang.String r0 = r8.A06
            r6.setTertiaryText(r0)
            boolean r0 = r3.A01
        L_0x0de9:
            if (r0 == 0) goto L_0x0df1
            X.69B r0 = X.AnonymousClass69B.A0H
        L_0x0ded:
            r6.setTextStyle(r0)
            return
        L_0x0df1:
            X.69B r0 = X.AnonymousClass69B.A0A
            goto L_0x0ded
        L_0x0df4:
            java.lang.String r2 = "add_contact_info"
            goto L_0x0dcd
        L_0x0df7:
            com.facebookpay.widget.listcell.ListCell r6 = r0.A00
            android.content.Context r0 = X.C18190wL.A0A(r6)
            X.51G r2 = new X.51G
            r2.<init>(r0)
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0e12
            X.697 r0 = X.AnonymousClass697.SECONDARY_CHEVRON_DOWN_FILLED_MEDIUM
        L_0x0e08:
            r2.setIcon(r0)
            r6.setRightAddOnIcon(r2)
            r6.setEnabled(r4)
            goto L_0x0db4
        L_0x0e12:
            X.697 r0 = X.AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE
            goto L_0x0e08
        L_0x0e15:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0e1a:
            java.lang.Throwable r5 = r1.A02
            boolean r4 = r5 instanceof X.AnonymousClass88V
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.exceptions.PuxComponentException"
            if (r4 == 0) goto L_0x0e58
            X.C04220Ms.A0C(r5, r2)
            r0 = r5
            X.88V r0 = (X.AnonymousClass88V) r0
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0e58
            android.content.Context r0 = r6.getContext()
            java.lang.String r0 = r0.getString(r1)
        L_0x0e38:
            r6.setPrimaryText(r0)
            r6.setSecondaryText(r7)
            r6.setTertiaryText(r7)
            if (r4 == 0) goto L_0x0e4e
            X.C04220Ms.A0C(r5, r2)
            X.88V r5 = (X.AnonymousClass88V) r5
            X.69Q r0 = r5.A01
        L_0x0e4a:
            A05(r6, r0)
            return
        L_0x0e4e:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0e55
            X.69Q r0 = X.AnonymousClass69Q.A17
            goto L_0x0e4a
        L_0x0e55:
            X.69Q r0 = X.AnonymousClass69Q.A0T
            goto L_0x0e4a
        L_0x0e58:
            r0 = r7
            goto L_0x0e38
        L_0x0e5a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0e5f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0e64:
            boolean r3 = X.AnonymousClass7Kx.A0P(r1)
            com.facebookpay.widget.pricetable.PriceTable r5 = r0.A00
            if (r3 == 0) goto L_0x0ea9
            java.lang.Object r6 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem r6 = (com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem) r6
            if (r6 == 0) goto L_0x0ea9
            java.util.ArrayList r1 = r6.A02
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0x(r1, r7)
            java.util.Iterator r8 = r1.iterator()
        L_0x0e7c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0ea9
            java.lang.Object r7 = r8.next()
            com.facebookpay.expresscheckout.models.PriceInfo r7 = (com.facebookpay.expresscheckout.models.PriceInfo) r7
            java.lang.Integer r3 = r6.A01
            java.lang.Integer r1 = r6.A00
            java.lang.String r10 = X.C91645gZ.A06(r0, r2, r7, r3, r1)
            X.68v r3 = r7.A01
            X.68v r1 = X.C973068v.TOTAL
            boolean r13 = X.C18180wK.A1Z(r3, r1)
            boolean r14 = X.C18180wK.A1Z(r3, r1)
            r12 = 32
            java.lang.String r11 = "-"
            X.6us r9 = new X.6us
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r4.add(r9)
            goto L_0x0e7c
        L_0x0ea9:
            r5.setPriceTableRowDataList(r4)
            return
        L_0x0ead:
            java.lang.Object r6 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r6 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r6
            if (r6 == 0) goto L_0x1026
            boolean r2 = r6.A03
            if (r2 != r7) goto L_0x1026
            com.facebookpay.widget.listcell.ListCell r3 = r0.A00
            r3.setRightAddOnIcon(r5)
            r3.setEnabled(r8)
        L_0x0ebf:
            r3.A03()
            android.view.View$OnClickListener r0 = r4.A00
            r3.setOnClickListener(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.C116836xd.A01(r3, r0, r5)
            boolean r10 = X.AnonymousClass7Kx.A0R(r1)
            java.lang.String r9 = A02(r4, r3)
            if (r10 == 0) goto L_0x1018
            java.lang.String r8 = "payment_method"
        L_0x0ed8:
            r2 = 0
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r2, r9, r8)
            r3.A0J = r0
            if (r10 == 0) goto L_0x1073
            X.69B r0 = X.AnonymousClass69B.A07
            r3.setTextStyle(r0)
            if (r6 == 0) goto L_0x1015
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = r6.A01
        L_0x0eeb:
            boolean r0 = r1 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x0ff5
            com.facebookpay.paymentmethod.model.CreditCard r1 = (com.facebookpay.paymentmethod.model.CreditCard) r1
            if (r1 == 0) goto L_0x0ff5
            boolean r0 = r1 instanceof com.facebookpay.paymentmethod.model.TokenizedCard
            if (r0 == 0) goto L_0x0ff1
            com.facebookpay.paymentmethod.model.TokenizedCard r1 = (com.facebookpay.paymentmethod.model.TokenizedCard) r1
            boolean r0 = r1.A04
        L_0x0efb:
            if (r0 == 0) goto L_0x0ff5
            com.instagram.service.session.UserSession r9 = X.AnonymousClass7HK.A00()
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r0 = 36317470363619099(0x81068c002a0f1b, double:3.030652724443381E-306)
            X.C63803iN.A0E(r8, r9, r0)
            X.7HK r0 = X.AnonymousClass7Kz.A0J()
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0f21
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0fe7
            r1 = 15
            r0 = 2131886528(0x7f1201c0, float:1.9407637E38)
            r3.A06(r1, r0)
        L_0x0f21:
            X.7HK r0 = X.AnonymousClass7Kz.A0J()
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0ff5
            if (r6 == 0) goto L_0x0fe4
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r6.A01
        L_0x0f2f:
            boolean r0 = r0 instanceof com.facebookpay.paymentmethod.model.TokenizedCard
            if (r0 == 0) goto L_0x0ff5
            com.facebookpay.paymentmethod.model.PaymentMethod r11 = r6.A01
            java.lang.String r10 = "null cannot be cast to non-null type com.facebookpay.paymentmethod.model.TokenizedCard"
            X.C04220Ms.A0C(r11, r10)
            r9 = r11
            com.facebookpay.paymentmethod.model.TokenizedCard r9 = (com.facebookpay.paymentmethod.model.TokenizedCard) r9
            java.lang.String r8 = r9.A03
            if (r8 == 0) goto L_0x0ff7
            boolean r0 = X.AnonymousClass8bQ.A0n(r8)
            if (r0 != 0) goto L_0x0ff7
            X.C04220Ms.A0C(r11, r10)
            java.lang.String r1 = r9.A02
            if (r1 == 0) goto L_0x0ff7
            boolean r0 = X.AnonymousClass8bQ.A0n(r1)
            if (r0 != 0) goto L_0x0ff7
            X.C04220Ms.A0C(r11, r10)
            r3.A0B(r1)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0fca
            java.lang.String r5 = " •••• "
            com.facebook.graphql.impls.CreditCardCredentialImpl r1 = r9.A02
            java.lang.String r0 = "last_four_digits"
            java.lang.String r0 = X.C86144wL.A0s(r1, r0)
            java.lang.String r0 = X.AnonymousClass00U.A0V(r8, r5, r0)
            r3.setPrimaryText(r0)
        L_0x0f6f:
            com.facebookpay.paymentmethod.model.PaymentMethod r6 = r6.A01
            if (r6 == 0) goto L_0x1884
            X.LcE r1 = r6.Aam()
            X.LcE r0 = X.C40307LcE.A06
            if (r1 == r0) goto L_0x0fbf
            boolean r0 = r6 instanceof com.facebookpay.paymentmethod.model.APMCredential
            if (r0 != 0) goto L_0x0fbf
            boolean r0 = r6 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x0f96
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0f96
            r3.setSecondaryTextLineBreaks(r7)
            r0 = r6
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
            X.8rA r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass7H2.A01(r0)
            r3.setSecondaryText(r0)
        L_0x0f96:
            r8 = 2131304579(0x7f092083, float:1.8227305E38)
            android.widget.TextView r7 = X.C18180wK.A0G(r3, r8)
            if (r7 == 0) goto L_0x0fb1
            r0 = 16
            r7.setGravity(r0)
            android.view.ViewTreeObserver r5 = r7.getViewTreeObserver()
            r1 = 3
            com.facebook.redex.IDxLListenerShape127S0200000_2_I2 r0 = new com.facebook.redex.IDxLListenerShape127S0200000_2_I2
            r0.<init>(r1, r3, r7)
            r5.addOnGlobalLayoutListener(r0)
        L_0x0fb1:
            X.51H r0 = r3.A0L
            if (r0 == 0) goto L_0x1053
            android.widget.FrameLayout r0 = r3.A03
            if (r0 != 0) goto L_0x104d
            java.lang.String r0 = "leftAddOnContainer"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x0fbf:
            java.lang.String r0 = r6.BEm()
            r3.setSecondaryText(r0)
            r3.setSecondaryTextLineBreaks(r7)
            goto L_0x0f96
        L_0x0fca:
            r3.setPrimaryText(r8)
            java.lang.String r5 = "•••• "
            com.facebook.graphql.impls.CreditCardCredentialImpl r1 = r9.A02
            java.lang.String r0 = "last_four_digits"
            java.lang.String r0 = X.C86144wL.A0s(r1, r0)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r5, r0)
            r3.setSecondaryText(r0)
            X.69Q r0 = X.AnonymousClass69Q.A0L
            r3.setSecondaryTextStyle(r0)
            goto L_0x0f6f
        L_0x0fe4:
            r0 = r5
            goto L_0x0f2f
        L_0x0fe7:
            r1 = 14
            r0 = 2131886527(0x7f1201bf, float:1.9407635E38)
            r3.A06(r1, r0)
            goto L_0x0f21
        L_0x0ff1:
            boolean r0 = r1.A04
            goto L_0x0efb
        L_0x0ff5:
            if (r6 == 0) goto L_0x1013
        L_0x0ff7:
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r6.A01
            if (r0 == 0) goto L_0x1013
            java.lang.String r0 = r0.AnP()
        L_0x0fff:
            r3.setImageUrl(r0)
            if (r6 == 0) goto L_0x100c
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r6.A01
            if (r0 == 0) goto L_0x100c
            java.lang.String r5 = r0.BH2()
        L_0x100c:
            r3.setPrimaryText(r5)
            if (r6 == 0) goto L_0x1884
            goto L_0x0f6f
        L_0x1013:
            r0 = r5
            goto L_0x0fff
        L_0x1015:
            r1 = r5
            goto L_0x0eeb
        L_0x1018:
            java.lang.Throwable r0 = r1.A02
            boolean r0 = r0 instanceof X.C1373688h
            if (r0 == 0) goto L_0x1022
            java.lang.String r8 = "payment_method_inline_error"
            goto L_0x0ed8
        L_0x1022:
            java.lang.String r8 = "add_payment_info"
            goto L_0x0ed8
        L_0x1026:
            com.facebookpay.widget.listcell.ListCell r3 = r0.A00
            if (r6 == 0) goto L_0x1037
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x1037
            r2 = r5
        L_0x102f:
            r3.setRightAddOnIcon(r2)
            r3.setEnabled(r7)
            goto L_0x0ebf
        L_0x1037:
            android.content.Context r0 = X.C18190wL.A0A(r3)
            X.51G r2 = new X.51G
            r2.<init>(r0)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x104a
            X.697 r0 = X.AnonymousClass697.SECONDARY_CHEVRON_DOWN_FILLED_MEDIUM
        L_0x1046:
            r2.setIcon(r0)
            goto L_0x102f
        L_0x104a:
            X.697 r0 = X.AnonymousClass697.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE
            goto L_0x1046
        L_0x104d:
            X.L6z r0 = X.C86134wK.A0J(r0)
            r0.A0s = r8
        L_0x1053:
            boolean r0 = r6 instanceof com.facebookpay.paymentmethod.model.APMCredential
            if (r0 == 0) goto L_0x1884
            android.content.Context r1 = r3.getContext()
            r0 = 2131826413(0x7f1116ed, float:1.928571E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setTertiaryText(r0)
            X.0ZU r0 = r4.A01
            if (r0 == 0) goto L_0x1884
            r0 = 13
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = X.C86134wK.A0P(r4, r0)
            r3.setTertiaryTextOnClickListener(r0)
            return
        L_0x1073:
            r3.setImageUrl(r5)
            java.lang.Throwable r6 = r1.A02
            boolean r0 = r6 instanceof X.C1373688h
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.exceptions.PuxComponentException"
            if (r0 == 0) goto L_0x108f
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.exceptions.EcpComponentInlineException"
            X.C04220Ms.A0C(r6, r0)
            r0 = r6
            X.88h r0 = (X.C1373688h) r0
            java.lang.Integer r0 = r0.A01
            if (r0 != 0) goto L_0x109a
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            throw r2
        L_0x108f:
            boolean r0 = r6 instanceof X.AnonymousClass88I
            if (r0 == 0) goto L_0x10c8
            r0 = 2131826444(0x7f11170c, float:1.9285773E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x109a:
            int r1 = r0.intValue()
            android.content.Context r0 = r3.getContext()
            java.lang.String r0 = r0.getString(r1)
        L_0x10a6:
            r3.setPrimaryText(r0)
            r3.setSecondaryText(r5)
            r3.setTertiaryText(r5)
            boolean r0 = r6 instanceof X.AnonymousClass88V
            if (r0 == 0) goto L_0x10be
            X.C04220Ms.A0C(r6, r2)
            X.88V r6 = (X.AnonymousClass88V) r6
            X.69Q r0 = r6.A01
        L_0x10ba:
            A05(r3, r0)
            return
        L_0x10be:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x10c5
            X.69Q r0 = X.AnonymousClass69Q.A17
            goto L_0x10ba
        L_0x10c5:
            X.69Q r0 = X.AnonymousClass69Q.A0T
            goto L_0x10ba
        L_0x10c8:
            boolean r0 = r6 instanceof X.AnonymousClass88V
            if (r0 == 0) goto L_0x10db
            X.C04220Ms.A0C(r6, r2)
            r0 = r6
            X.88V r0 = (X.AnonymousClass88V) r0
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x10db
            goto L_0x109a
        L_0x10db:
            r0 = r5
            goto L_0x10a6
        L_0x10dd:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x10e2:
            boolean r0 = X.AnonymousClass7Kx.A0P(r1)
            if (r0 == 0) goto L_0x1103
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            r2.A08(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r2.A09(r0)
            r2.setOnClickListener(r5)
            X.C116836xd.A00(r2, r5, r0, r5, r5)
            r0 = 2131826430(0x7f1116fe, float:1.9285744E38)
            java.lang.String r0 = r14.getString(r0)
            r2.setShimmerAccessibilityLabel(r0)
            return
        L_0x1103:
            r2.A03()
            if (r11 == 0) goto L_0x1884
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.exceptions.PuxComponentException"
            X.C04220Ms.A0C(r10, r0)
            X.88V r10 = (X.AnonymousClass88V) r10
            int r0 = r10.A00
            java.lang.String r0 = r14.getString(r0)
            r2.setPrimaryText(r0)
            X.69Q r0 = r10.A01
            r2.setPrimaryTextStyle(r0)
            r2.setSecondaryText(r5)
            r2.setRightAddOnIcon(r5)
            r2.setOnClickListener(r5)
            return
        L_0x1127:
            android.widget.LinearLayout r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x112f:
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            r0.setOnClickListener(r6)
            return
        L_0x1135:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x113a:
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            r0.setOnClickListener(r6)
            return
        L_0x1140:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x1145:
            boolean r2 = X.AnonymousClass7Kx.A0P(r1)
            if (r2 == 0) goto L_0x114f
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            goto L_0x1867
        L_0x114f:
            boolean r1 = X.AnonymousClass7Kx.A0O(r1)
            if (r1 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            A04(r0)
            return
        L_0x115b:
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            goto L_0x118c
        L_0x115e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x1163:
            boolean r1 = X.AnonymousClass7Kx.A0P(r1)
            if (r1 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r2 = r0.A01
            r1 = 0
            r2.setOnClickListener(r1)
            java.lang.Integer r1 = X.AnonymousClass006.A00
            X.AnonymousClass7FY.A02(r2, r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r0.A00
            r2.setRightAddOnView(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r2.A08(r0)
            r2.A09(r1)
            r2.A05()
            return
        L_0x1185:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x118a:
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
        L_0x118c:
            r0 = 0
            r2.setOnClickListener(r0)
            goto L_0x186a
        L_0x1192:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x1197:
            boolean r2 = r3 instanceof X.C91575gS
            if (r2 == 0) goto L_0x1269
            r5 = r3
            X.5gS r5 = (X.C91575gS) r5
            X.5BS r0 = (X.AnonymousClass5BS) r0
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r1, r0)
            boolean r6 = X.AnonymousClass7Kx.A0R(r1)
            r4 = 8
            if (r6 == 0) goto L_0x1258
            com.facebook.shimmer.ShimmerFrameLayout r10 = r0.A01
            r10.A03()
            java.lang.Object r8 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem r8 = (com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem) r8
            if (r8 == 0) goto L_0x1252
            com.facebook.graphql.impls.PAYLinkableTextFragmentImpl r9 = r8.A01
            if (r9 == 0) goto L_0x1252
            java.lang.String r7 = "text"
            java.lang.String r1 = r9.getStringValue(r7)
            if (r1 == 0) goto L_0x1252
            boolean r1 = X.AnonymousClass8bQ.A0n(r1)
            if (r1 != 0) goto L_0x1252
            android.widget.CheckBox r4 = r0.A00
            boolean r6 = r8.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x124d
            r4.setChecked(r6)
            com.facebook.redex.IDxCListenerShape268S0100000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape268S0100000_2_I2
            r0.<init>(r5, r2)
            r4.setOnCheckedChangeListener(r0)
            java.lang.String r7 = r9.getStringValue(r7)
            if (r7 == 0) goto L_0x1248
            java.lang.String r8 = r8.A02
            if (r8 == 0) goto L_0x121d
            java.lang.Class<com.facebook.graphql.impls.PAYLinkableTextFragmentImpl$Ranges> r1 = com.facebook.graphql.impls.PAYLinkableTextFragmentImpl.Ranges.class
            java.lang.String r0 = "ranges"
            com.google.common.collect.ImmutableList r0 = r9.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x121d
            java.lang.Object r1 = X.AnonymousClass00J.A0D(r0)
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x121d
            java.lang.String r0 = "length"
            int r6 = r1.getIntValue(r0)
            java.lang.String r0 = "offset"
            int r1 = r1.getIntValue(r0)
            X.6j7 r0 = new X.6j7
            r0.<init>(r6, r1, r8)
            java.util.List r0 = X.C18180wK.A0n(r0)
            X.6p6 r1 = new X.6p6
            r1.<init>(r7, r0)
            X.8h4 r0 = r5.A03
            java.lang.CharSequence r7 = r1.A00(r0, r2)
        L_0x121d:
            r4.setText(r7)
            X.69Q r0 = X.AnonymousClass69Q.A0M
            X.AnonymousClass7Fd.A02(r4, r0)
            X.C18180wK.A0z(r4)
            r1 = -1
            r0 = -2
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r1, r0)
            int r1 = r5.A00
            int r0 = r5.A01
            r2.setMargins(r1, r0, r1, r3)
            android.view.ContextThemeWrapper r9 = r5.A02
            java.lang.Integer r11 = X.AnonymousClass006.A00
            r12 = 0
            r14 = 24
            r13 = r12
            X.C121047Dv.A01(r9, r10, r11, r12, r13, r14)
            r10.setLayoutParams(r2)
            r4.setVisibility(r3)
            return
        L_0x1248:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x124d:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x1252:
            android.widget.CheckBox r0 = r0.A00
            r0.setVisibility(r4)
            return
        L_0x1258:
            boolean r1 = X.AnonymousClass7Kx.A0P(r1)
            if (r1 == 0) goto L_0x1884
            android.widget.CheckBox r1 = r0.A00
            r1.setVisibility(r4)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r0.A01
            r0.A07(r2)
            return
        L_0x1269:
            boolean r2 = r3 instanceof X.C91375g8
            if (r2 == 0) goto L_0x12aa
            X.5BR r0 = (X.AnonymousClass5BR) r0
            boolean r5 = X.AnonymousClass0wJ.A1Y(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x1884
            java.lang.Object r4 = r1.A01
            if (r4 == 0) goto L_0x12a5
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem r4 = (com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem) r4
            X.C04220Ms.A0B(r4, r5)
            android.widget.TextView r2 = r0.A01
            java.lang.String r1 = r4.A03
            r2.setText(r1)
            java.lang.String r2 = r4.A01
            java.util.Map r1 = X.AnonymousClass697.A03
            java.lang.Object r2 = r1.get(r2)
            X.697 r2 = (X.AnonymousClass697) r2
            if (r2 == 0) goto L_0x129d
            android.widget.ImageView r1 = r0.A00
            X.C04220Ms.A05(r1)
            X.C116966xu.A01(r1, r2)
        L_0x129d:
            android.view.View r1 = r0.itemView
            r0 = 10
            X.C86104wH.A1D(r1, r0, r4, r3)
            return
        L_0x12a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x12aa:
            boolean r2 = r3 instanceof X.C91325g3
            if (r2 == 0) goto L_0x12d0
            X.5BQ r0 = (X.AnonymousClass5BQ) r0
            boolean r3 = X.AnonymousClass0wJ.A1Y(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x1884
            java.lang.Object r2 = r1.A01
            if (r2 == 0) goto L_0x12cb
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem r2 = (com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem) r2
            X.C04220Ms.A0B(r2, r3)
            android.widget.TextView r1 = r0.A00
            java.lang.String r0 = r2.A00
            r1.setText(r0)
            return
        L_0x12cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x12d0:
            boolean r2 = r3 instanceof X.C91515gM
            if (r2 == 0) goto L_0x1330
            X.5Bs r0 = (X.C89055Bs) r0
            boolean r4 = X.AnonymousClass0wJ.A1Y(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x1884
            java.lang.Object r5 = r1.A01
            if (r5 == 0) goto L_0x132b
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem r5 = (com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem) r5
            X.C04220Ms.A0B(r5, r4)
            android.widget.TextView r2 = r0.A03
            java.lang.String r1 = r5.A03
            r2.setText(r1)
            android.widget.TextView r3 = r0.A01
            java.lang.String r1 = r5.A01
            r3.setText(r1)
            X.5gM r2 = r0.A05
            r1 = 9
            X.C86104wH.A1D(r3, r1, r5, r2)
            java.lang.String r2 = r5.A04
            if (r2 == 0) goto L_0x1323
            int r1 = r2.length()
            if (r1 == 0) goto L_0x1323
            android.widget.TextView r1 = r0.A00
            r1.setVisibility(r4)
            r1.setText(r2)
        L_0x1310:
            java.lang.String r2 = r5.A02
            if (r2 == 0) goto L_0x1884
            int r1 = r2.length()
            if (r1 == 0) goto L_0x1884
            android.widget.TextView r0 = r0.A02
            r0.setText(r2)
            r0.setVisibility(r4)
            return
        L_0x1323:
            android.widget.TextView r2 = r0.A00
            r1 = 8
            r2.setVisibility(r1)
            goto L_0x1310
        L_0x132b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x1330:
            boolean r2 = r3 instanceof X.C91635gY
            if (r2 == 0) goto L_0x133d
            r2 = r3
            X.5gY r2 = (X.C91635gY) r2
            X.5BP r0 = (X.AnonymousClass5BP) r0
            r2.A0A(r0, r1)
            return
        L_0x133d:
            boolean r2 = r3 instanceof X.C91605gV
            if (r2 == 0) goto L_0x134a
            r2 = r3
            X.5gV r2 = (X.C91605gV) r2
            X.5BO r0 = (X.AnonymousClass5BO) r0
            r2.A0A(r0, r1)
            return
        L_0x134a:
            boolean r2 = r3 instanceof X.C91705gf
            if (r2 == 0) goto L_0x1354
            X.5gg r0 = (X.C91715gg) r0
            X.C91705gf.A07(r0, r1)
            return
        L_0x1354:
            boolean r2 = r3 instanceof X.C91365g7
            if (r2 == 0) goto L_0x13a4
            X.5BN r0 = (X.AnonymousClass5BN) r0
            X.AnonymousClass0wJ.A1N(r1, r0)
            java.lang.Object r2 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem r2 = (com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem) r2
            r6 = 0
            if (r2 == 0) goto L_0x1386
            com.facebookpay.widget.listcell.ListCell r4 = r0.A01
            java.lang.String r2 = r2.A01
            r4.setPrimaryText(r2)
            com.facebookpay.widget.actionmenu.InlineActionMenu r5 = r0.A00
            r4.setActionMenu(r5)
            r4.A02()
            java.lang.Integer r2 = X.AnonymousClass006.A00
            X.C116836xd.A01(r4, r2, r6)
            android.content.Context r4 = r4.getContext()
            r2 = 2131826463(0x7f11171f, float:1.9285811E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r4, r2)
            r5.setEditAccessibility(r2)
        L_0x1386:
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x1398
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = r0.A00
            r0 = 8
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r0 = X.C86164wN.A0L(r1, r3, r0)
            r2.setEditComponentListener(r0)
            return
        L_0x1398:
            com.facebookpay.widget.listcell.ListCell r2 = r0.A01
            r2.setOnClickListener(r6)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r6)
            goto L_0x186a
        L_0x13a4:
            boolean r2 = r3 instanceof X.C91675gc
            if (r2 == 0) goto L_0x1445
            r4 = r3
            X.5gc r4 = (X.C91675gc) r4
            X.5Bf r0 = (X.C88925Bf) r0
            X.AnonymousClass0wJ.A1N(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            r5 = 0
            if (r2 == 0) goto L_0x16a7
            java.lang.Object r3 = r1.A01
            if (r3 == 0) goto L_0x16a2
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r3 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r3
            com.facebookpay.widget.listcell.ListCell r8 = r0.A01
            android.content.Context r9 = r8.getContext()
            X.C91675gc.A06(r0, r4, r1)
            java.lang.String r2 = r3.A09
            if (r2 == 0) goto L_0x13ea
            r8.setQuaternaryText(r2)
            int r2 = X.C86124wJ.A08(r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.setQuaternaryTextVerticalSpacing(r2)
            android.content.res.Resources r6 = r9.getResources()
            r2 = 2131165251(0x7f070043, float:1.7944714E38)
            float r2 = r6.getDimension(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8.setQuaternaryTextSizePx(r2)
        L_0x13ea:
            X.51D r7 = r0.A02
            java.lang.Integer r6 = r3.A01
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            boolean r2 = X.C18180wK.A1Z(r6, r2)
            r7.setChecked(r2)
            r8.setLeftAddOnView(r7)
            r8.A02()
            java.lang.String r2 = r8.getErrorText()
            if (r2 == 0) goto L_0x1443
            r2 = 2131820713(0x7f1100a9, float:1.9274149E38)
            java.lang.String r5 = r9.getString(r2)
            r2 = 2131826487(0x7f111737, float:1.928586E38)
            java.lang.String r2 = r9.getString(r2)
        L_0x1411:
            X.AnonymousClass7H2.A02(r3, r8, r5, r2)
            com.facebookpay.widget.actionmenu.InlineActionMenu r6 = r0.A00
            r2 = 2131826466(0x7f111722, float:1.9285817E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r9, r2)
            r6.setEditAccessibility(r2)
            r2 = 2131826622(0x7f1117be, float:1.9286134E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r9, r2)
            r6.setRemoveAccessibility(r2)
            boolean r2 = r3.A0H
            if (r2 == 0) goto L_0x1884
            r2 = 7
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r2 = X.C86164wN.A0L(r1, r4, r2)
            r6.setEditComponentListener(r2)
            X.7RG r8 = new X.7RG
            r10 = r3
            r11 = r0
            r12 = r4
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x143f:
            r6.setRemoveComponentListener(r8)
            return
        L_0x1443:
            r2 = r5
            goto L_0x1411
        L_0x1445:
            boolean r2 = r3 instanceof X.C91665gb
            if (r2 == 0) goto L_0x14cd
            r5 = r3
            X.5gb r5 = (X.C91665gb) r5
            X.5Be r0 = (X.C88915Be) r0
            X.AnonymousClass0wJ.A1N(r1, r0)
            java.lang.Object r7 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r7 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem) r7
            if (r7 == 0) goto L_0x1493
            com.facebookpay.widget.listcell.ListCell r6 = r0.A01
            X.51D r4 = r0.A02
            java.lang.Integer r3 = r7.A00
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            boolean r2 = X.C18180wK.A1Z(r3, r2)
            r4.setChecked(r2)
            r6.setLeftAddOnView(r4)
            boolean r2 = r7.A05
            if (r2 != 0) goto L_0x14af
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = r0.A00
            r2.A00()
        L_0x1472:
            r6.A02()
            r2 = 0
            X.AnonymousClass7H2.A02(r7, r6, r2, r2)
            com.facebookpay.widget.actionmenu.InlineActionMenu r4 = r0.A00
            android.content.Context r3 = r6.getContext()
            r2 = 2131826465(0x7f111721, float:1.9285815E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r3, r2)
            r4.setEditAccessibility(r2)
            r2 = 2131826620(0x7f1117bc, float:1.928613E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r3, r2)
            r4.setRemoveAccessibility(r2)
        L_0x1493:
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 != 0) goto L_0x14b9
            boolean r2 = X.AnonymousClass7Kx.A0O(r1)
            if (r2 != 0) goto L_0x14b9
            com.facebookpay.widget.listcell.ListCell r2 = r0.A01
            r1 = 0
            r2.setOnClickListener(r1)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r1)
            r0.setRemoveComponentListener(r1)
            goto L_0x186a
        L_0x14af:
            boolean r2 = r7.A06
            if (r2 != 0) goto L_0x1472
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = r0.A00
            r2.A01()
            goto L_0x1472
        L_0x14b9:
            X.C91665gb.A06(r0, r5, r1)
            com.facebookpay.widget.actionmenu.InlineActionMenu r6 = r0.A00
            r3 = 6
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r2 = X.C86164wN.A0L(r1, r5, r3)
            r6.setEditComponentListener(r2)
            com.facebook.redex.IDxCListenerShape42S0300000_2_I2 r8 = new com.facebook.redex.IDxCListenerShape42S0300000_2_I2
            r8.<init>((X.C88915Be) r0, (X.C91665gb) r5, (X.AnonymousClass7Kx) r1, (int) r3)
            goto L_0x143f
        L_0x14cd:
            boolean r2 = r3 instanceof X.C91695ge
            if (r2 == 0) goto L_0x1515
            r7 = r3
            X.5ge r7 = (X.C91695ge) r7
            X.5gk r0 = (X.C91755gk) r0
            boolean r6 = X.AnonymousClass0wJ.A1Y(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 == 0) goto L_0x16f8
            X.C91695ge.A07(r0, r7, r1)
            java.lang.Object r4 = r1.A01
            if (r4 == 0) goto L_0x16f3
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r4 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r4
            com.facebookpay.widget.listcell.ListCell r5 = r0.A01
            android.content.Context r9 = r5.getContext()
            X.LcE r3 = r4.A08
            X.LcE r2 = X.C40307LcE.A06
            boolean r14 = X.C18180wK.A1Z(r3, r2)
            com.facebookpay.widget.actionmenu.InlineActionMenu r3 = r0.A00
            r2 = 5
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r2 = X.C86164wN.A0L(r1, r7, r2)
            r3.setEditComponentListener(r2)
            X.7RK r8 = new X.7RK
            r10 = r4
            r11 = r0
            r12 = r7
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.setRemoveComponentListener(r8)
            boolean r1 = r4.A06
            if (r1 == 0) goto L_0x16d3
            X.69B r0 = X.AnonymousClass69B.A0F
            goto L_0x16ef
        L_0x1515:
            boolean r2 = r3 instanceof X.C91505gL
            if (r2 == 0) goto L_0x1616
            r10 = r3
            X.5gL r10 = (X.C91505gL) r10
            X.5BM r0 = (X.AnonymousClass5BM) r0
            r15 = 0
            boolean r13 = X.AnonymousClass0wJ.A1Z(r1, r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            r9 = 0
            if (r2 == 0) goto L_0x1849
            java.lang.Object r8 = r1.A01
            if (r8 == 0) goto L_0x1844
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem) r8
            boolean r2 = r8 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentPickupOptionItem
            r7 = 0
            if (r2 == 0) goto L_0x17d9
            com.facebookpay.widget.listcell.ListCell r12 = r0.A00
            X.7H2 r17 = X.AnonymousClass6XM.A00
            android.content.Context r11 = X.C18190wL.A0A(r12)
            java.util.Locale r5 = X.AnonymousClass7Kz.A0O()
            r6 = r8
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentPickupOptionItem r6 = (com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentPickupOptionItem) r6
            boolean r4 = r6.A0B
            java.lang.String r3 = r8.A02()
            com.facebookpay.common.models.CurrencyAmount r2 = r8.A00()
            java.lang.String r2 = A01(r11, r2, r3, r5, r4)
            r12.setPrimaryText(r2)
            com.facebookpay.shippingaddress.model.ShippingAddress r14 = r6.A04
            if (r14 == 0) goto L_0x1614
            java.lang.String r2 = r14.A08
            if (r2 == 0) goto L_0x1612
            boolean r3 = X.AnonymousClass8bQ.A0n(r2)
            if (r3 != 0) goto L_0x1612
            java.lang.String r5 = r14.A01
            if (r5 == 0) goto L_0x1612
            boolean r3 = X.AnonymousClass8bQ.A0n(r5)
            if (r3 != 0) goto L_0x1612
            java.lang.StringBuilder r4 = X.C18200wM.A0r()
            r4.append(r2)
            java.lang.String r3 = ", "
            r4.append(r3)
            java.lang.String r2 = r14.A09
            if (r2 == 0) goto L_0x1589
            boolean r16 = X.AnonymousClass8bQ.A0n(r2)
            if (r16 != 0) goto L_0x1589
            r4.append(r2)
            r4.append(r3)
        L_0x1589:
            r4.append(r5)
            java.lang.String r2 = r14.A07
            if (r2 == 0) goto L_0x1596
            boolean r3 = X.AnonymousClass8bQ.A0n(r2)
            if (r3 == 0) goto L_0x15e8
        L_0x1596:
            java.lang.String r3 = r14.A06
            if (r3 == 0) goto L_0x15a0
            boolean r3 = X.AnonymousClass8bQ.A0n(r3)
            if (r3 == 0) goto L_0x15e8
        L_0x15a0:
            java.lang.String r2 = r4.toString()
        L_0x15a4:
            r12.setSecondaryText(r2)
            boolean r2 = r10.A01
            if (r2 == 0) goto L_0x1731
            X.51D r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            java.util.Locale r21 = X.AnonymousClass7Kz.A0O()
            java.util.Date r1 = r6.A0A
            java.util.Date r0 = r6.A09
            r19 = r1
            r20 = r0
            r22 = r15
            r18 = r11
            android.text.SpannableStringBuilder r0 = r17.A03(r18, r19, r20, r21, r22)
            r12.setTertiarySpannableText(r0)
            X.69B r0 = X.AnonymousClass69B.A0N
            r12.setTextStyle(r0)
            X.69Q r0 = X.AnonymousClass69Q.A14
            r12.setTertiaryTextStyle(r0)
            r0 = 2
            com.facebookpay.widget.listcell.ListCell.A01(r12, r0, r13, r15)
            android.content.res.TypedArray r3 = X.AnonymousClass7Kz.A01(r11, r12)
            X.C04220Ms.A06(r3)
            android.widget.TextView r2 = r12.A0E
            if (r2 != 0) goto L_0x1725
            java.lang.String r0 = "tertiaryTextView"
            X.C04220Ms.A0E(r0)
            throw r9
        L_0x15e8:
            java.lang.String r3 = ","
            r4.append(r3)
            if (r2 == 0) goto L_0x15f6
            boolean r3 = X.AnonymousClass8bQ.A0n(r2)
            r5 = 0
            if (r3 == 0) goto L_0x15f7
        L_0x15f6:
            r5 = 1
        L_0x15f7:
            java.lang.String r3 = " "
            if (r5 != 0) goto L_0x1601
            r4.append(r3)
            r4.append(r2)
        L_0x1601:
            java.lang.String r5 = r14.A06
            if (r5 == 0) goto L_0x15a0
            boolean r2 = X.AnonymousClass8bQ.A0n(r5)
            if (r2 != 0) goto L_0x15a0
            r4.append(r3)
            r4.append(r5)
            goto L_0x15a0
        L_0x1612:
            r2 = 0
            goto L_0x15a4
        L_0x1614:
            r2 = r9
            goto L_0x15a4
        L_0x1616:
            boolean r2 = r3 instanceof X.C91655ga
            if (r2 == 0) goto L_0x187c
            r5 = r3
            X.5ga r5 = (X.C91655ga) r5
            X.5Bd r0 = (X.C88905Bd) r0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r1, r0)
            java.lang.Object r8 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem) r8
            if (r8 == 0) goto L_0x1668
            com.facebookpay.widget.listcell.ListCell r7 = r0.A01
            X.51D r6 = r0.A02
            java.lang.Integer r3 = r8.A00
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            boolean r2 = X.C18180wK.A1Z(r3, r2)
            r6.setChecked(r2)
            r7.setLeftAddOnView(r6)
            boolean r2 = r8.A05
            if (r2 != 0) goto L_0x1684
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = r0.A00
            r2.A00()
        L_0x1644:
            com.facebookpay.widget.actionmenu.InlineActionMenu r6 = r0.A00
            r7.setActionMenu(r6)
            r7.A02()
            r2 = 0
            X.AnonymousClass7H2.A02(r8, r7, r2, r2)
            android.content.Context r3 = r7.getContext()
            r2 = 2131826461(0x7f11171d, float:1.9285807E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r3, r2)
            r6.setEditAccessibility(r2)
            r2 = 2131826619(0x7f1117bb, float:1.9286128E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r3, r2)
            r6.setRemoveAccessibility(r2)
        L_0x1668:
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            if (r2 != 0) goto L_0x168e
            boolean r2 = X.AnonymousClass7Kx.A0O(r1)
            if (r2 != 0) goto L_0x168e
            com.facebookpay.widget.listcell.ListCell r2 = r0.A01
            r1 = 0
            r2.setOnClickListener(r1)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r1)
            r0.setRemoveComponentListener(r1)
            goto L_0x186a
        L_0x1684:
            boolean r2 = r8.A06
            if (r2 != 0) goto L_0x1644
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = r0.A00
            r2.A01()
            goto L_0x1644
        L_0x168e:
            X.C91655ga.A06(r0, r5, r1)
            com.facebookpay.widget.actionmenu.InlineActionMenu r6 = r0.A00
            r2 = 4
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r2 = X.C86164wN.A0L(r1, r5, r2)
            r6.setEditComponentListener(r2)
            com.facebook.redex.IDxCListenerShape42S0300000_2_I2 r8 = new com.facebook.redex.IDxCListenerShape42S0300000_2_I2
            r8.<init>((X.C88905Bd) r0, (X.C91655ga) r5, (X.AnonymousClass7Kx) r1, (int) r4)
            goto L_0x143f
        L_0x16a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x16a7:
            boolean r2 = X.AnonymousClass7Kx.A0P(r1)
            if (r2 == 0) goto L_0x16bc
            com.facebookpay.widget.listcell.ListCell r2 = r0.A01
            r2.setOnClickListener(r5)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r5)
            r0.setRemoveComponentListener(r5)
            goto L_0x186a
        L_0x16bc:
            boolean r1 = X.AnonymousClass7Kx.A0O(r1)
            if (r1 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r1 = r0.A01
            r1.A03()
            A04(r1)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r5)
            r0.setRemoveComponentListener(r5)
            return
        L_0x16d3:
            X.51D r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
            r3.setVisibility(r0)
            r5.setClickable(r6)
            X.69B r0 = X.AnonymousClass69B.A08
            goto L_0x16ef
        L_0x16e3:
            r1 = 6
            r0 = 2131886517(0x7f1201b5, float:1.9407615E38)
            X.AnonymousClass7Fe.A00(r3, r2, r1, r0)
            r3.recycle()
            X.69B r0 = X.AnonymousClass69B.A0N
        L_0x16ef:
            r5.setTextStyle(r0)
            return
        L_0x16f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x16f8:
            boolean r3 = X.AnonymousClass7Kx.A0P(r1)
            r2 = 0
            if (r3 == 0) goto L_0x170e
            X.C91695ge.A06(r0)
            com.facebookpay.widget.actionmenu.InlineActionMenu r1 = r0.A00
            r1.setEditComponentListener(r2)
            r1.setRemoveComponentListener(r2)
            com.facebookpay.widget.listcell.ListCell r2 = r0.A01
            goto L_0x186a
        L_0x170e:
            boolean r1 = X.AnonymousClass7Kx.A0O(r1)
            if (r1 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r1 = r0.A01
            r1.A03()
            r1.setOnClickListener(r2)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r2)
            r0.setRemoveComponentListener(r2)
            return
        L_0x1725:
            r1 = 28
            r0 = 2131886530(0x7f1201c2, float:1.9407641E38)
            X.AnonymousClass7Fe.A00(r3, r2, r1, r0)
            r3.recycle()
            return
        L_0x1731:
            r12.A02()
            com.facebookpay.common.models.Distance r15 = r6.A02
            if (r15 == 0) goto L_0x1785
            X.51I r4 = new X.51I
            r4.<init>(r11)
            android.content.Context r14 = X.C18190wL.A0A(r4)
            java.util.Locale r5 = X.AnonymousClass7Kz.A0O()
            java.lang.Integer r2 = r15.A01
            int r3 = r2.intValue()
            r2 = 2131826404(0x7f1116e4, float:1.9285691E38)
            if (r3 != r13) goto L_0x1753
            r2 = 2131826403(0x7f1116e3, float:1.928569E38)
        L_0x1753:
            java.lang.String r14 = r14.getString(r2)
            X.C04220Ms.A09(r14)
            double r2 = r15.A00
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object[] r3 = X.C86144wL.A1a(r2, r14)
            java.lang.String r2 = "%1s %2s"
            java.lang.String r2 = X.C86154wM.A0o(r5, r2, r3)
            r4.setText(r2)
            r12.setRightAddOnText(r4)
            android.widget.FrameLayout r2 = r12.A06
            if (r2 != 0) goto L_0x177a
            java.lang.String r0 = "rightAddOnContainer"
            X.C04220Ms.A0E(r0)
            throw r9
        L_0x177a:
            X.L6z r3 = X.C86134wK.A0J(r2)
            r2 = 2131304579(0x7f092083, float:1.8227305E38)
            r3.A0s = r2
            r3.A0E = r2
        L_0x1785:
            java.lang.Boolean r2 = r6.A05
            boolean r2 = X.C18190wL.A1Z(r2, r13)
            if (r2 == 0) goto L_0x17c0
            r2 = 2131826439(0x7f111707, float:1.9285762E38)
            java.lang.String r2 = r11.getString(r2)
            r12.setTertiaryText(r2)
            X.69B r2 = X.AnonymousClass69B.A0N
            r12.setTextStyle(r2)
            X.69Q r2 = X.AnonymousClass69Q.A18
            r12.setTertiaryTextStyle(r2)
            X.51I r3 = r12.A0N
            if (r3 == 0) goto L_0x17aa
            X.69Q r2 = X.AnonymousClass69Q.A0z
            r3.setTextStyle(r2)
        L_0x17aa:
            X.51D r4 = r0.A01
            java.lang.Integer r3 = r8.BA9()
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r3 != r2) goto L_0x17b5
            r7 = 1
        L_0x17b5:
            r4.setChecked(r7)
            r12.setLeftAddOnView(r4)
            r2 = 3
            X.C86144wL.A1C(r12, r10, r1, r0, r2)
            return
        L_0x17c0:
            X.69B r0 = X.AnonymousClass69B.A0J
            r12.setTextStyle(r0)
            r0 = 2131826441(0x7f111709, float:1.9285766E38)
            java.lang.String r0 = r11.getString(r0)
            r12.setTertiaryText(r0)
            X.51I r1 = r12.A0N
            if (r1 == 0) goto L_0x1884
            X.69Q r0 = X.AnonymousClass69Q.A10
            r1.setTextStyle(r0)
            return
        L_0x17d9:
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r5.A02()
            boolean r2 = r8 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentShippingOptionItem
            X.7H2 r11 = X.AnonymousClass6XM.A00
            android.content.Context r12 = X.C18190wL.A0A(r5)
            java.util.Locale r6 = X.AnonymousClass7Kz.A0O()
            if (r2 == 0) goto L_0x182c
            r2 = r8
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentShippingOptionItem r2 = (com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentShippingOptionItem) r2
            java.util.Date r3 = r2.A07
            java.util.Date r2 = r2.A06
            com.facebookpay.common.models.CurrencyAmount r13 = r8.A00()
            java.lang.String r14 = r8.A02()
            r15 = r3
            r16 = r2
            r17 = r6
            java.lang.String r2 = r11.A04(r12, r13, r14, r15, r16, r17)
        L_0x1804:
            r5.setPrimaryText(r2)
            java.lang.String r2 = r8.A01()
            r5.setSecondaryText(r2)
            X.69B r2 = X.AnonymousClass69B.A0N
            r5.setTextStyle(r2)
            X.51D r4 = r0.A01
            java.lang.Integer r3 = r8.BA9()
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r3 != r2) goto L_0x181e
            r7 = 1
        L_0x181e:
            r4.setChecked(r7)
            r5.setLeftAddOnView(r4)
            r2 = 4
            X.C86144wL.A1C(r5, r10, r1, r0, r2)
            X.AnonymousClass7H2.A02(r8, r5, r9, r9)
            return
        L_0x182c:
            java.lang.String r11 = r8.A02()
            com.facebookpay.common.models.CurrencyAmount r2 = r8.A00()
            java.lang.String r4 = "%1s - %2s"
            r3 = 2
            java.lang.String r2 = X.AnonymousClass7H2.A00(r12, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r11, r2}
            java.lang.String r2 = X.C86104wH.A11(r4, r6, r2, r3)
            goto L_0x1804
        L_0x1844:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x1849:
            boolean r2 = X.AnonymousClass7Kx.A0P(r1)
            if (r2 == 0) goto L_0x1852
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            goto L_0x1867
        L_0x1852:
            boolean r1 = X.AnonymousClass7Kx.A0O(r1)
            if (r1 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            A04(r0)
            return
        L_0x185e:
            boolean r2 = X.AnonymousClass7Kx.A0P(r1)
            r9 = 0
            if (r2 == 0) goto L_0x1870
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
        L_0x1867:
            r2.setOnClickListener(r9)
        L_0x186a:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.AnonymousClass7FY.A02(r2, r0)
            return
        L_0x1870:
            boolean r1 = X.AnonymousClass7Kx.A0O(r1)
            if (r1 == 0) goto L_0x1884
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            A04(r0)
            return
        L_0x187c:
            r2 = r3
            X.5gX r2 = (X.C91625gX) r2
            X.5Ax r0 = (X.C88845Ax) r0
            r2.A0A(r0, r1)
        L_0x1884:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C886359v.A09(X.M5O, X.7Kx):void");
    }

    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        Object obj3;
        AnonymousClass7Kx r4 = (AnonymousClass7Kx) obj;
        AnonymousClass7Kx r5 = (AnonymousClass7Kx) obj2;
        AnonymousClass0wJ.A1N(r4, r5);
        if (r4.A00 != r5.A00 || (obj3 = r4.A01) == null || !obj3.equals(r5.A01)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        AnonymousClass7Kx r3 = (AnonymousClass7Kx) obj;
        AnonymousClass7Kx r4 = (AnonymousClass7Kx) obj2;
        AnonymousClass0wJ.A1N(r3, r4);
        if (r3.A00 != r4.A00 || !C04220Ms.A0I(r3.A01, r4.A01)) {
            return false;
        }
        return true;
    }

    public static InlineActionMenu A00(Context context, ViewGroup viewGroup) {
        AnonymousClass7JJ A05 = AnonymousClass7Kz.A05();
        C04220Ms.A06(context);
        View A052 = A05.A05(context, viewGroup, AnonymousClass69U.A0E);
        C04220Ms.A0C(A052, "null cannot be cast to non-null type com.facebookpay.widget.actionmenu.InlineActionMenu");
        return (InlineActionMenu) A052;
    }

    public static void A03(Context context, ShimmerFrameLayout shimmerFrameLayout, int i) {
        Drawable drawable = context.getDrawable(i);
        int A032 = AnonymousClass7Kz.A0G().A03(context, 15);
        C04220Ms.A0B(drawable, 1);
        drawable.setTint(A032);
        shimmerFrameLayout.setBackground(drawable);
        D57.A00(shimmerFrameLayout, (Integer) null);
    }

    public static void A05(ListCell listCell, AnonymousClass69Q r2) {
        listCell.setPrimaryTextStyle(r2);
        AnonymousClass51H r22 = listCell.A0L;
        if (r22 != null) {
            r22.setContentDescription(listCell.getContext().getString(2131826487));
        }
    }
}
