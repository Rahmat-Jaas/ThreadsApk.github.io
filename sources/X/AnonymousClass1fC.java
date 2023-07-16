package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.IDxVHolderShape16S0000000_1_I2;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1fC  reason: invalid class name */
public class AnonymousClass1fC extends C34186I7g implements C27900EvB {
    public final C11630kW mAnalyticsModule;
    public final Context mContext;
    public boolean mIsElevatedSurface;
    public final List mObjects = AnonymousClass0wJ.A0v();
    public boolean mRoundDialogBottomCorners;
    public boolean mRoundDialogTopCorners;
    public C10300i6 mSession;
    public boolean mShouldCenterText;
    public C81734oH mSwitchItemViewPointDelegate = null;
    public final List toAnimateMoveInItems = AnonymousClass0wJ.A0v();

    public boolean areAllItemsEnabled() {
        return false;
    }

    public AnonymousClass1fC getAdapter() {
        return this;
    }

    public boolean isEnabled(int i) {
        return false;
    }

    public static LayoutInflater A00(AnonymousClass1fC r0) {
        return LayoutInflater.from(r0.mContext);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r6 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C57583Bq getMenuItemState(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.mRoundDialogTopCorners
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0009
            r3 = 1
            if (r6 == 0) goto L_0x000a
        L_0x0009:
            r3 = 0
        L_0x000a:
            boolean r0 = r5.mRoundDialogBottomCorners
            if (r0 == 0) goto L_0x0016
            int r0 = r5.getCount()
            int r0 = r0 - r1
            if (r6 != r0) goto L_0x0016
            r4 = 1
        L_0x0016:
            boolean r2 = r5.mShouldCenterText
            boolean r1 = r5.mIsElevatedSurface
            X.3Bq r0 = new X.3Bq
            r0.<init>(r3, r4, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1fC.getMenuItemState(int):X.3Bq");
    }

    public void addDialogMenuItems(List list) {
        this.mObjects.addAll(list);
        this.mIsElevatedSurface = true;
        notifyDataSetChanged();
    }

    public void addMenuItemWithAnimation(Object obj, Integer num) {
        if (!this.mObjects.contains(obj)) {
            this.toAnimateMoveInItems.add(num);
            this.mObjects.add(num.intValue(), obj);
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.mObjects.size();
    }

    public Object getItem(int i) {
        return this.mObjects.get(i);
    }

    public int getPosition(Object obj) {
        return this.mObjects.indexOf(obj);
    }

    public int getViewTypeCount() {
        return AnonymousClass006.A00(43).length;
    }

    public M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        IgdsBanner igdsBanner;
        M5O m5o;
        switch (AnonymousClass006.A00(43)[i].intValue()) {
            case 1:
                return C61883We.A00(this.mContext, viewGroup, false);
            case 2:
                View inflate = A00(this).inflate(R.layout.row_text, viewGroup, false);
                m5o = new AnonymousClass12Z(inflate);
                igdsBanner = inflate;
                break;
            case 3:
                return new AnonymousClass12Y(A00(this).inflate(R.layout.row_textless_header, viewGroup, false));
            case 4:
                View inflate2 = A00(this).inflate(R.layout.row_switch_item, viewGroup, false);
                C201713k r3 = new C201713k(inflate2);
                inflate2.setTag(r3);
                IgSwitch igSwitch = r3.A06;
                AnonymousClass0wJ.A1N(inflate2, igSwitch);
                AnonymousClass0wJ.A16(inflate2, 465, igSwitch);
                return r3;
            case 5:
                return new C199912r(new C18970yM(this.mContext));
            case 6:
                View inflate3 = A00(this).inflate(R.layout.row_button_item, viewGroup, false);
                m5o = new AnonymousClass12R(inflate3);
                igdsBanner = inflate3;
                break;
            case 7:
                RadioGroup radioGroup = new RadioGroup(this.mContext);
                C18200wM.A1C(radioGroup);
                return new AnonymousClass12X(radioGroup);
            case 8:
                return new AnonymousClass13X(A00(this).inflate(R.layout.row_user_item, viewGroup, false));
            case 9:
                View inflate4 = A00(this).inflate(R.layout.row_edit_text_item, viewGroup, false);
                m5o = new C200012s(inflate4);
                igdsBanner = inflate4;
                break;
            case 10:
                View inflate5 = A00(this).inflate(R.layout.row_action_item, viewGroup, false);
                m5o = new C199612o(inflate5);
                igdsBanner = inflate5;
                break;
            case 11:
                return new AnonymousClass11s(A00(this).inflate(R.layout.pref_load_failure_banner, viewGroup, false));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new IDxVHolderShape16S0000000_1_I2(A00(this).inflate(R.layout.row_spinner_item, viewGroup, false), 4);
            case 13:
                View inflate6 = A00(this).inflate(R.layout.row_badge_item, viewGroup, false);
                m5o = new AnonymousClass13U(inflate6);
                igdsBanner = inflate6;
                break;
            case 14:
                View inflate7 = A00(this).inflate(R.layout.row_menu_link_item, viewGroup, false);
                m5o = new AnonymousClass13J(inflate7);
                igdsBanner = inflate7;
                break;
            case 15:
                View inflate8 = A00(this).inflate(R.layout.row_metadata_item, viewGroup, false);
                m5o = new AnonymousClass13L(inflate8);
                igdsBanner = inflate8;
                break;
            case 16:
                return new AnonymousClass13C(A00(this).inflate(R.layout.row_menu_item_with_action_text, viewGroup, false));
            case LangUtils.HASH_SEED /*17*/:
                View inflate9 = A00(this).inflate(R.layout.row_arrow_item, viewGroup, false);
                m5o = new C200713a(inflate9);
                igdsBanner = inflate9;
                break;
            case 18:
                return new AnonymousClass13F(new C18980yN(this.mContext));
            case 19:
                return new AnonymousClass13E(new C18990yO(this.mContext));
            case 20:
                return new AnonymousClass11t(A00(this).inflate(R.layout.row_selection_item, viewGroup, false));
            case 21:
                Context context = this.mContext;
                C09250f7 A00 = C09250f7.A05.A00(context);
                View inflate10 = LayoutInflater.from(context).inflate(R.layout.branding_settings_layout, viewGroup, false);
                TextView A0L = AnonymousClass0wJ.A0L(inflate10, R.id.branding_text_v2_from);
                TextView A0L2 = AnonymousClass0wJ.A0L(inflate10, R.id.branding_text_v2_facebook);
                A0L.setTypeface(A00.A03(C09340fG.A0G));
                A0L2.setTypeface(A00.A03(C09340fG.A0H));
                return new C197711r(inflate10);
            case 22:
                return new AnonymousClass13G(A00(this).inflate(R.layout.row_image_with_description_item, viewGroup, false));
            case 23:
                return new AnonymousClass13N(A00(this).inflate(R.layout.typeahead_header, viewGroup, false));
            case 24:
                View inflate11 = A00(this).inflate(R.layout.row_custom_text, viewGroup, false);
                m5o = new AnonymousClass12T(inflate11);
                igdsBanner = inflate11;
                break;
            case 25:
                return new AnonymousClass12U(A00(this).inflate(R.layout.row_menu_fxcal_item, viewGroup, false));
            case Rfc3492Idn.tmax /*26*/:
                return new AnonymousClass13I(A00(this).inflate(R.layout.row_menu_item, viewGroup, false));
            case 27:
                Context context2 = this.mContext;
                View inflate12 = LayoutInflater.from(context2).inflate(R.layout.row_large_button_item, viewGroup, false);
                AnonymousClass13H r32 = new AnonymousClass13H(inflate12);
                Drawable indeterminateDrawable = r32.A00.getIndeterminateDrawable();
                indeterminateDrawable.getClass();
                indeterminateDrawable.setColorFilter(context2.getColor(R.color.design_dark_default_color_on_background), PorterDuff.Mode.SRC_IN);
                inflate12.setTag(r32);
                return (M5O) C18210wN.A0X(inflate12);
            case 28:
                return new AnonymousClass13B(A00(this).inflate(R.layout.row_info_item, viewGroup, false));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new AnonymousClass12P(A00(this).inflate(R.layout.row_center_image, viewGroup, false));
            case 30:
                View inflate13 = A00(this).inflate(R.layout.row_button_with_description_item, viewGroup, false);
                m5o = new C199812q(inflate13);
                igdsBanner = inflate13;
                break;
            case 31:
                View inflate14 = A00(this).inflate(R.layout.row_button_primary_wrapped_with_description_item, viewGroup, false);
                m5o = new C199712p(inflate14);
                igdsBanner = inflate14;
                break;
            case 32:
                return new AnonymousClass12W(A00(this).inflate(R.layout.row_menu_privacy_center_item, viewGroup, false));
            case 33:
                Context context3 = this.mContext;
                C18200wM.A1S(context3, viewGroup);
                return new AnonymousClass13A(C18180wK.A0D(LayoutInflater.from(context3), viewGroup, R.layout.row_compound_item, false));
            case 34:
                return new C201213f(A00(this).inflate(R.layout.company_layer_menu_center_item, viewGroup, false));
            case 35:
                return new AnonymousClass13V(A00(this).inflate(R.layout.company_layer_accounts_center_item, viewGroup, false));
            case Rfc3492Idn.base /*36*/:
                return new AnonymousClass12S(new IgdsListCell(this.mContext));
            case LangUtils.HASH_OFFSET /*37*/:
                Context context4 = this.mContext;
                C18200wM.A1S(context4, viewGroup);
                return new AnonymousClass13W(C18200wM.A0F(LayoutInflater.from(context4), viewGroup, R.layout.people_cell_with_switch_item, false));
            case Rfc3492Idn.skew /*38*/:
                Context context5 = this.mContext;
                C18200wM.A1S(context5, viewGroup);
                return new AnonymousClass139(C18200wM.A0F(LayoutInflater.from(context5), viewGroup, R.layout.ac_transition_top_banner, false));
            case 39:
                Context context6 = this.mContext;
                C18200wM.A1S(context6, viewGroup);
                return new C199512n(C18200wM.A0F(LayoutInflater.from(context6), viewGroup, R.layout.ac_transition_second_level_top_banner, false));
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                Context context7 = this.mContext;
                C04220Ms.A0B(context7, 0);
                IgdsBanner igdsBanner2 = new IgdsBanner(context7, (AttributeSet) null, 0);
                m5o = new AnonymousClass12Q(igdsBanner2);
                igdsBanner = igdsBanner2;
                break;
            case Seq.NULL_REFNUM /*41*/:
                Context context8 = this.mContext;
                C04220Ms.A0B(context8, 0);
                IgdsListCell A0T = C18240wQ.A0T(context8);
                m5o = new AnonymousClass12V(A0T);
                igdsBanner = A0T;
                break;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                View A0F = C18200wM.A0F(A00(this), viewGroup, R.layout.avatar_privacy_settings_visibility_component, false);
                m5o = new AnonymousClass13D(A0F);
                igdsBanner = A0F;
                break;
            default:
                M5O A002 = AnonymousClass3PD.A00(this.mContext, viewGroup);
                if (this.mIsElevatedSurface) {
                    A002.itemView.setPadding(0, 0, 0, 0);
                }
                return A002;
        }
        igdsBanner.setTag(m5o);
        return m5o;
    }

    public void setBottomSheetMenuItems(Collection collection) {
        this.mObjects.clear();
        this.mIsElevatedSurface = true;
        this.mObjects.addAll(collection);
        notifyDataSetChanged();
    }

    public void setItems(Collection collection) {
        this.mObjects.clear();
        this.mObjects.addAll(collection);
        notifyDataSetChanged();
    }

    public AnonymousClass1fC(Context context, C10300i6 r3, C11630kW r4) {
        this.mContext = context;
        this.mSession = r3;
        this.mAnalyticsModule = r4;
    }

    public int getItemCount() {
        int A03 = C14030oh.A03(-1516114635);
        int size = this.mObjects.size();
        C14030oh.A0A(2037096917, A03);
        return size;
    }

    public long getItemId(int i) {
        C14030oh.A0A(-566630962, C14030oh.A03(-243531129));
        return 0;
    }

    public int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = C14030oh.A03(2092575728);
        Object item = getItem(i);
        if (item instanceof C57593Br) {
            i2 = 23;
            i3 = -896939132;
        } else if (item instanceof C63613hu) {
            i2 = 1;
            i3 = 2031822190;
        } else if (item instanceof C63273h9) {
            i2 = 3;
            i3 = -1513500850;
        } else if (item instanceof C63293hC) {
            i2 = 2;
            i3 = -1573845429;
        } else if (item instanceof AnonymousClass4MC) {
            i2 = 4;
            i3 = -1973670092;
        } else if (item instanceof C57683Cb) {
            i2 = 18;
            i3 = 128433863;
        } else if (item instanceof C57673Ca) {
            i2 = 19;
            i3 = 745660168;
        } else if (item instanceof C57573Bp) {
            i2 = 5;
            i3 = 418383153;
        } else if (item instanceof AnonymousClass4MB) {
            i2 = 36;
            i3 = -1432428051;
        } else if (item instanceof C63063bP) {
            i2 = 6;
            i3 = 1650109679;
        } else if (item instanceof C61353Sw) {
            i2 = 7;
            i3 = -1009125654;
        } else if (item instanceof C64533mV) {
            i2 = 9;
            i3 = -1333038471;
        } else if (item instanceof C50252sh) {
            i2 = 11;
            i3 = 758757642;
        } else if (item instanceof AnonymousClass39A) {
            i2 = 12;
            i3 = -1866774734;
        } else if (item instanceof C62133Xg) {
            i2 = 14;
            i3 = -1053224303;
        } else if (item instanceof C62593aM) {
            i2 = 17;
            i3 = 1285558016;
        } else if (item instanceof C62153Xk) {
            i2 = 15;
            i3 = -989353776;
        } else if (item instanceof AnonymousClass4M9) {
            i2 = 16;
            i3 = -340726943;
        } else if (item instanceof C57403Ax) {
            i2 = 20;
            i3 = -1795585334;
        } else if (item instanceof C50262si) {
            i2 = 21;
            i3 = -1887607331;
        } else if (item instanceof AnonymousClass3TL) {
            i2 = 24;
            i3 = 634648387;
        } else if (item instanceof AnonymousClass36Q) {
            i2 = 34;
            i3 = -1700558460;
        } else if (item instanceof AnonymousClass399) {
            i2 = 35;
            i3 = 359423657;
        } else if (item instanceof AnonymousClass3T9) {
            i2 = 27;
            i3 = 980629670;
        } else if (item instanceof AnonymousClass3S0) {
            i2 = 29;
            i3 = -497300893;
        } else if (item instanceof AnonymousClass3T8) {
            i2 = 30;
            i3 = 510523954;
        } else if (item instanceof AnonymousClass36P) {
            i2 = 31;
            i3 = 1353840630;
        } else if (item instanceof AnonymousClass36R) {
            i2 = 33;
            i3 = -1656519386;
        } else if (item instanceof AnonymousClass3CZ) {
            i2 = 38;
            i3 = -1663194445;
        } else if (item instanceof C61233Sk) {
            i2 = 39;
            i3 = 1509472678;
        } else if (KtCSuperShape0S0202000_I2.A00(4, item)) {
            i2 = 40;
            i3 = -587944257;
        } else if (item instanceof C57693Cc) {
            i2 = 41;
            i3 = -435188272;
        } else {
            boolean z = item instanceof AnonymousClass3G2;
            i2 = 0;
            i3 = 2119716451;
            if (z) {
                i2 = 42;
                i3 = 603221475;
            }
        }
        C14030oh.A0A(i3, A03);
        return i2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        M5O onCreateViewHolder = onCreateViewHolder(viewGroup, getItemViewType(i));
        onBindViewHolder(onCreateViewHolder, i);
        return onCreateViewHolder.itemView;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04b3, code lost:
        if (r5.A01 != false) goto L_0x060d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0592, code lost:
        r1.setOnClickListener(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x05d5, code lost:
        r1.setOnClickListener(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
        if ((getItem(r12) instanceof X.C81714oF) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        getItem(r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(X.M5O r11, int r12) {
        /*
            r10 = this;
            int r1 = r10.getItemViewType(r12)
            r0 = 43
            java.lang.Integer[] r0 = X.AnonymousClass006.A00(r0)
            r0 = r0[r1]
            int r0 = r0.intValue()
            r2 = 0
            switch(r0) {
                case 1: goto L_0x00a6;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00b3;
                case 4: goto L_0x00d3;
                case 5: goto L_0x0111;
                case 6: goto L_0x0148;
                case 7: goto L_0x0155;
                case 8: goto L_0x0671;
                case 9: goto L_0x0167;
                case 10: goto L_0x0680;
                case 11: goto L_0x01a9;
                case 12: goto L_0x01be;
                case 13: goto L_0x01fd;
                case 14: goto L_0x0212;
                case 15: goto L_0x0230;
                case 16: goto L_0x02f5;
                case 17: goto L_0x0223;
                case 18: goto L_0x0375;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03fb;
                case 21: goto L_0x0023;
                case 22: goto L_0x068a;
                case 23: goto L_0x002f;
                case 24: goto L_0x0416;
                case 25: goto L_0x0423;
                case 26: goto L_0x0694;
                case 27: goto L_0x04b7;
                case 28: goto L_0x069e;
                case 29: goto L_0x0508;
                case 30: goto L_0x0519;
                case 31: goto L_0x0544;
                case 32: goto L_0x0563;
                case 33: goto L_0x0573;
                case 34: goto L_0x0433;
                case 35: goto L_0x0482;
                case 36: goto L_0x00e6;
                case 37: goto L_0x06a8;
                case 38: goto L_0x0597;
                case 39: goto L_0x05ba;
                case 40: goto L_0x05da;
                case 41: goto L_0x0617;
                case 42: goto L_0x0624;
                default: goto L_0x0014;
            }
        L_0x0014:
            X.13K r11 = (X.AnonymousClass13K) r11
            java.lang.Object r1 = r10.getItem(r12)
            X.4MA r1 = (X.AnonymousClass4MA) r1
            X.3Bq r0 = r10.getMenuItemState(r12)
            X.AnonymousClass3PD.A01(r1, r0, r11)
        L_0x0023:
            java.lang.Object r0 = r10.getItem(r12)
            boolean r0 = r0 instanceof X.C81714oF
            if (r0 == 0) goto L_0x002e
            r10.getItem(r12)
        L_0x002e:
            return
        L_0x002f:
            X.13N r11 = (X.AnonymousClass13N) r11
            java.lang.Object r3 = r10.getItem(r12)
            X.3Br r3 = (X.C57593Br) r3
            X.4s8 r0 = r3.A01
            if (r0 == 0) goto L_0x003d
            r11.A01 = r0
        L_0x003d:
            X.4qo r0 = r3.A02
            if (r0 == 0) goto L_0x0043
            r11.A02 = r0
        L_0x0043:
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r3.A00
            if (r4 == 0) goto L_0x0087
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r11.A00
            r0 = 0
            r1.A06 = r0
            android.text.Editable r0 = r4.getText()
            r1.setText(r0)
            android.text.Editable r0 = r4.getText()
            int r0 = r0.length()
            r1.setSelection(r0)
            java.lang.CharSequence r0 = r4.getHint()
            r1.setHint(r0)
            X.HsY r0 = r4.A08
            if (r0 == 0) goto L_0x006b
            r1.A08 = r0
        L_0x006b:
            boolean r0 = r4.A0C
            r1.setAllowTextSelection(r0)
            boolean r0 = r4.A0E
            r1.A0E = r0
            android.view.View$OnFocusChangeListener r0 = r4.getOnFocusChangeListener()
            r1.setOnFocusChangeListener(r0)
            boolean r0 = r4.A0D
            r1.setClearButtonEnabled(r0)
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0087
            r1.requestFocus()
        L_0x0087:
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r11.A00
            X.4MO r0 = new X.4MO
            r0.<init>(r11, r3)
            r1.A06 = r0
            com.facebook.redex.IDxCListenerShape690S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape690S0100000_1_I2
            r0.<init>(r11, r2)
            r1.A05 = r0
            X.AnonymousClass3PE.A00(r1)
            X.AnonymousClass3PE.A01(r1)
            X.4s8 r0 = r11.A01
            if (r0 == 0) goto L_0x0023
            r0.registerTextViewLogging(r1)
            goto L_0x0023
        L_0x00a6:
            X.13j r11 = (X.C201613j) r11
            java.lang.Object r0 = r10.getItem(r12)
            X.3hu r0 = (X.C63613hu) r0
            X.C61883We.A02(r0, r11, r2)
            goto L_0x0023
        L_0x00b3:
            X.12Y r11 = (X.AnonymousClass12Y) r11
            java.lang.Object r0 = r10.getItem(r12)
            X.3h9 r0 = (X.C63273h9) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0023
            android.view.View r0 = r11.A00
            X.C09860go.A0X(r0, r2)
            goto L_0x0023
        L_0x00c6:
            X.12Z r11 = (X.AnonymousClass12Z) r11
            java.lang.Object r0 = r10.getItem(r12)
            X.3hC r0 = (X.C63293hC) r0
            X.C50352sr.A00(r11, r0)
            goto L_0x0023
        L_0x00d3:
            X.13k r11 = (X.C201713k) r11
            java.lang.Object r2 = r10.getItem(r12)
            X.4MC r2 = (X.AnonymousClass4MC) r2
            X.3Bq r1 = r10.getMenuItemState(r12)
            X.4oH r0 = r10.mSwitchItemViewPointDelegate
            X.C50342sq.A00(r1, r11, r0, r2)
            goto L_0x0023
        L_0x00e6:
            X.12S r11 = (X.AnonymousClass12S) r11
            java.lang.Object r2 = r10.getItem(r12)
            X.4MB r2 = (X.AnonymousClass4MB) r2
            com.instagram.igds.components.textcell.IgdsListCell r1 = r11.A00
            X.24V r0 = X.AnonymousClass24V.TYPE_CHECKBOX
            r1.setTextCellType(r0)
            java.lang.CharSequence r0 = r2.A01
            if (r0 == 0) goto L_0x00fc
            r1.A0H(r0)
        L_0x00fc:
            boolean r0 = r2.A02
            r1.setChecked(r0)
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r2.A00
            r1.A0C(r0)
            r0 = 323(0x143, float:4.53E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r11, r0)
            r1.A0B(r0)
            goto L_0x0023
        L_0x0111:
            X.12r r11 = (X.C199912r) r11
            java.lang.Object r4 = r10.getItem(r12)
            X.3Bp r4 = (X.C57573Bp) r4
            android.widget.TextView r3 = r11.A00
            int r1 = r3.getPaddingLeft()
            int r0 = r3.getPaddingRight()
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            X.AnonymousClass7Ko.A0C(r0)
            int r0 = r3.getPaddingLeft()
            r3.setCompoundDrawablePadding(r0)
            int r0 = r4.A01
            r3.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r2, r2, r2)
            int r0 = r4.A02
            r3.setText(r0)
            X.0yM r1 = r11.A01
            boolean r0 = r4.A00
            r1.setChecked(r0)
            android.view.View r1 = r11.itemView
            android.view.View$OnClickListener r0 = r4.A03
            goto L_0x0592
        L_0x0148:
            X.12R r11 = (X.AnonymousClass12R) r11
            java.lang.Object r0 = r10.getItem(r12)
            X.3bP r0 = (X.C63063bP) r0
            X.C50282sk.A00(r0, r11)
            goto L_0x0023
        L_0x0155:
            r2 = r11
            X.12X r2 = (X.AnonymousClass12X) r2
            android.content.Context r1 = X.C18240wQ.A0B(r11)
            java.lang.Object r0 = r10.getItem(r12)
            X.3Sw r0 = (X.C61353Sw) r0
            X.C50332sp.A00(r1, r0, r2)
            goto L_0x0023
        L_0x0167:
            X.12s r11 = (X.C200012s) r11
            java.lang.Object r2 = r10.getItem(r12)
            X.3mV r2 = (X.C64533mV) r2
            X.3mV r1 = r11.A01
            if (r1 == 0) goto L_0x0178
            android.widget.EditText r0 = r11.A00
            r0.removeTextChangedListener(r1)
        L_0x0178:
            r11.A01 = r2
            android.widget.EditText r1 = r11.A00
            java.lang.String r0 = r2.A03
            r1.setHint(r0)
            android.widget.TextView$OnEditorActionListener r0 = r2.A01
            r1.setOnEditorActionListener(r0)
            r1.addTextChangedListener(r2)
            java.lang.String r0 = r2.A00
            r1.setText(r0)
            java.lang.Integer r0 = r2.A02
            int r0 = r0.intValue()
            r1.setInputType(r0)
            r0 = 0
            r1.setOnTouchListener(r0)
            X.3mV r0 = r11.A01
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0023
            r1.requestFocus()
            X.C09860go.A0L(r1)
            goto L_0x0023
        L_0x01a9:
            X.12O r11 = (X.AnonymousClass12O) r11
            java.lang.Object r0 = r10.getItem(r12)
            X.36O r0 = (X.AnonymousClass36O) r0
            java.lang.String r3 = r0.A00
            com.instagram.igds.components.banner.IgdsBanner r1 = r11.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.setBody(r3, r0)
            goto L_0x0023
        L_0x01be:
            java.lang.Object r3 = r10.getItem(r12)
            X.39A r3 = (X.AnonymousClass39A) r3
            android.view.View r1 = r11.itemView
            android.view.View$OnClickListener r0 = r3.A01
            r1.setOnClickListener(r0)
            int r0 = r3.A00
            if (r0 != 0) goto L_0x01ee
            r1 = 0
        L_0x01d0:
            android.view.View r0 = r11.itemView
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r3.setMargins(r2, r1, r2, r1)
            android.view.View r1 = r11.itemView
            r0 = 2131306102(0x7f092676, float:1.8230394E38)
            android.view.View r0 = r1.findViewById(r0)
            X.C18210wN.A0z(r0)
            android.view.View r0 = r11.itemView
            r0.setLayoutParams(r3)
            goto L_0x0023
        L_0x01ee:
            android.content.Context r0 = X.C18240wQ.A0B(r11)
            android.content.res.Resources r1 = r0.getResources()
            int r0 = r3.A00
            int r1 = r1.getDimensionPixelSize(r0)
            goto L_0x01d0
        L_0x01fd:
            X.13U r11 = (X.AnonymousClass13U) r11
            r10.getItem(r12)
            if (r11 == 0) goto L_0x0023
            android.view.View r1 = r11.A03
            r0 = 8
            r1.setVisibility(r0)
            java.lang.String r0 = "getOnClickListener"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0212:
            X.13J r11 = (X.AnonymousClass13J) r11
            java.lang.Object r1 = r10.getItem(r12)
            X.3Xg r1 = (X.C62133Xg) r1
            X.3Bq r0 = r10.getMenuItemState(r12)
            X.C50312sn.A00(r1, r0, r11)
            goto L_0x0023
        L_0x0223:
            X.13a r11 = (X.C200713a) r11
            java.lang.Object r0 = r10.getItem(r12)
            X.3aM r0 = (X.C62593aM) r0
            X.C50272sj.A00(r0, r11)
            goto L_0x0023
        L_0x0230:
            X.13L r11 = (X.AnonymousClass13L) r11
            java.lang.Object r4 = r10.getItem(r12)
            X.3Xk r4 = (X.C62153Xk) r4
            X.3Bq r6 = r10.getMenuItemState(r12)
            android.view.View r1 = r11.itemView
            android.view.View$OnClickListener r0 = r4.A03
            if (r0 == 0) goto L_0x02f0
            r1.setOnClickListener(r0)
            X.C18210wN.A0y(r1)
        L_0x0248:
            java.lang.CharSequence r0 = r4.A05
            android.widget.TextView r3 = r11.A02
            if (r0 == 0) goto L_0x02e9
            r3.setText(r0)
        L_0x0251:
            java.lang.CharSequence r0 = r4.A04
            r5 = 8
            android.widget.TextView r8 = r11.A01
            if (r0 == 0) goto L_0x02e2
            r8.setVisibility(r2)
            java.lang.CharSequence r0 = r4.A04
            r8.setText(r0)
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x026a
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r3.setTypeface(r0)
        L_0x026a:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0283
            android.content.Context r9 = r1.getContext()
            r0 = 2131232424(0x7f0806a8, float:1.8080957E38)
            android.graphics.drawable.Drawable r7 = X.AnonymousClass0hB.A00(r9, r0)
            r0 = 2130969936(0x7f040550, float:1.7548568E38)
            X.C63403hQ.A02(r9, r7, r0)
            r0 = 0
            r8.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r0, r7, r0)
        L_0x0283:
            java.lang.StringBuilder r7 = X.C18200wM.A0r()
            java.lang.CharSequence r0 = r3.getText()
            r7.append(r0)
            java.lang.String r0 = " "
            r7.append(r0)
            java.lang.CharSequence r0 = r8.getText()
            java.lang.String r0 = X.C18200wM.A0m(r0, r7)
            r1.setContentDescription(r0)
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x02db
            r1.setEnabled(r2)
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x02a8:
            r1.setAlpha(r0)
            android.content.Context r2 = r1.getContext()
            int r0 = X.C50322so.A00(r2, r6)
            r1.setBackgroundResource(r0)
            int r0 = X.C18240wQ.A01(r2, r5)
            r3.setCompoundDrawablePadding(r0)
            android.graphics.drawable.Drawable r1 = r4.A02
            if (r1 == 0) goto L_0x02c7
            r0 = 2130969932(0x7f04054c, float:1.754856E38)
            X.C63403hQ.A02(r2, r1, r0)
        L_0x02c7:
            r0 = 0
            r3.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r0, r0, r0)
            android.view.View r0 = r11.A00
            r0.setVisibility(r5)
            float r1 = r4.A00
            float r0 = r3.getLineSpacingMultiplier()
            r3.setLineSpacing(r1, r0)
            goto L_0x0023
        L_0x02db:
            r0 = 1
            r1.setEnabled(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02a8
        L_0x02e2:
            r8.setVisibility(r5)
            X.C18250wR.A0t(r8)
            goto L_0x0283
        L_0x02e9:
            int r0 = r4.A01
            r3.setText(r0)
            goto L_0x0251
        L_0x02f0:
            r1.setClickable(r2)
            goto L_0x0248
        L_0x02f5:
            X.13C r11 = (X.AnonymousClass13C) r11
            java.lang.Object r8 = r10.getItem(r12)
            X.4M9 r8 = (X.AnonymousClass4M9) r8
            X.3Bq r5 = r10.getMenuItemState(r12)
            android.view.View r6 = r11.itemView
            android.view.View$OnClickListener r0 = r8.A03
            r9 = 0
            if (r0 == 0) goto L_0x036f
            r6.setOnClickListener(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A01
        L_0x030d:
            X.AnonymousClass7FY.A02(r6, r0)
            android.widget.TextView r4 = r11.A02
            java.lang.CharSequence r0 = r8.A06
            r4.setText(r0)
            android.widget.TextView r7 = r11.A01
            java.lang.CharSequence r0 = r8.A04
            r7.setText(r0)
            int r1 = r4.getPaddingStart()
            int r0 = r4.getPaddingEnd()
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            X.AnonymousClass7Ko.A0C(r0)
            android.content.Context r3 = r6.getContext()
            r2 = 8
            int r0 = X.C18240wQ.A01(r3, r2)
            r4.setCompoundDrawablePadding(r0)
            android.graphics.drawable.Drawable r1 = r8.A01
            r0 = 0
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r0, r0, r0)
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x0346
            r9 = 8
        L_0x0346:
            r7.setVisibility(r9)
            int r1 = r8.A00
            r0 = -1
            if (r1 == r0) goto L_0x0351
            r7.setTextColor(r1)
        L_0x0351:
            android.view.View$OnClickListener r0 = r8.A02
            r7.setOnClickListener(r0)
            int r0 = X.C50322so.A00(r3, r5)
            r6.setBackgroundResource(r0)
            android.view.View r0 = r11.A00
            r0.setVisibility(r2)
            boolean r1 = r5.A03
            r0 = 19
            if (r1 == 0) goto L_0x036a
            r0 = 17
        L_0x036a:
            r4.setGravity(r0)
            goto L_0x0023
        L_0x036f:
            r6.setClickable(r2)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            goto L_0x030d
        L_0x0375:
            X.13F r11 = (X.AnonymousClass13F) r11
            java.lang.Object r4 = r10.getItem(r12)
            X.3Cb r4 = (X.C57683Cb) r4
            android.widget.TextView r3 = r11.A01
            int r1 = r3.getPaddingLeft()
            int r0 = r3.getPaddingRight()
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            X.AnonymousClass7Ko.A0C(r0)
            int r0 = r3.getPaddingLeft()
            r3.setCompoundDrawablePadding(r0)
            int r0 = r4.A01
            r3.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r2, r2, r2)
            int r0 = r4.A02
            r3.setText(r0)
            java.lang.String r1 = r4.A04
            if (r1 == 0) goto L_0x03a8
            android.widget.TextView r0 = r11.A00
            r0.setText(r1)
        L_0x03a8:
            X.0yN r1 = r11.A02
            boolean r0 = r4.A00
            r1.setChecked(r0)
            android.view.View r1 = r11.itemView
            android.view.View$OnClickListener r0 = r4.A03
            goto L_0x0592
        L_0x03b5:
            X.13E r11 = (X.AnonymousClass13E) r11
            java.lang.Object r4 = r10.getItem(r12)
            X.3Ca r4 = (X.C57673Ca) r4
            android.widget.TextView r3 = r11.A01
            if (r3 == 0) goto L_0x03e1
            int r1 = r3.getPaddingLeft()
            int r0 = r3.getPaddingRight()
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            X.AnonymousClass7Ko.A0C(r0)
            int r0 = r3.getPaddingLeft()
            r3.setCompoundDrawablePadding(r0)
            int r0 = r4.A01
            r3.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r2, r2, r2)
            int r0 = r4.A02
            r3.setText(r0)
        L_0x03e1:
            java.lang.String r1 = r4.A04
            if (r1 == 0) goto L_0x03ec
            android.widget.TextView r0 = r11.A00
            if (r0 == 0) goto L_0x03ec
            r0.setText(r1)
        L_0x03ec:
            X.0yO r1 = r11.A02
            if (r1 == 0) goto L_0x03f5
            boolean r0 = r4.A00
            r1.setChecked(r0)
        L_0x03f5:
            android.view.View r1 = r11.itemView
            android.view.View$OnClickListener r0 = r4.A03
            goto L_0x0592
        L_0x03fb:
            java.lang.Object r2 = r10.getItem(r12)
            X.3Ax r2 = (X.C57403Ax) r2
            android.view.View r1 = r11.itemView
            android.view.View$OnClickListener r0 = r2.A01
            r1.setOnClickListener(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            boolean r0 = r2.A00
            r1.setChecked(r0)
            goto L_0x0023
        L_0x0416:
            X.12T r11 = (X.AnonymousClass12T) r11
            java.lang.Object r0 = r10.getItem(r12)
            X.3TL r0 = (X.AnonymousClass3TL) r0
            X.C50292sl.A00(r0, r11)
            goto L_0x0023
        L_0x0423:
            X.12U r11 = (X.AnonymousClass12U) r11
            r10.getItem(r12)
            com.instagram.common.ui.base.IgFrameLayout r0 = r11.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "getListener"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0433:
            X.13f r11 = (X.C201213f) r11
            java.lang.Object r4 = r10.getItem(r12)
            X.36Q r4 = (X.AnonymousClass36Q) r4
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r11.A05
            if (r3 == 0) goto L_0x044d
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131231353(0x7f080279, float:1.8078785E38)
            android.graphics.drawable.Drawable r0 = X.C30845GYu.A00(r1, r0)
            r3.setImageDrawable(r0)
        L_0x044d:
            android.view.View$OnClickListener r0 = r4.A00
            if (r0 == 0) goto L_0x0470
            com.instagram.common.ui.base.IgFrameLayout r3 = r11.A00
            if (r3 == 0) goto L_0x0470
            com.instagram.common.ui.base.IgTextView r0 = r11.A01
            if (r0 == 0) goto L_0x0470
            com.instagram.common.ui.text.TitleTextView r1 = r11.A03
            if (r1 == 0) goto L_0x0470
            r3.setVisibility(r2)
            r0.setVisibility(r2)
            r1.setVisibility(r2)
            android.view.View$OnClickListener r0 = r4.A00
            if (r0 == 0) goto L_0x046d
            r3.setOnClickListener(r0)
        L_0x046d:
            X.C18210wN.A0y(r1)
        L_0x0470:
            com.instagram.common.ui.text.TitleTextView r2 = r11.A04
            if (r2 == 0) goto L_0x0023
            com.instagram.common.ui.base.IgTextView r1 = r11.A02
            if (r1 == 0) goto L_0x0023
            r0 = 8
            r2.setVisibility(r0)
            r1.setVisibility(r0)
            goto L_0x0023
        L_0x0482:
            X.13V r11 = (X.AnonymousClass13V) r11
            java.lang.Object r5 = r10.getItem(r12)
            X.399 r5 = (X.AnonymousClass399) r5
            android.view.View$OnClickListener r0 = r5.A00
            if (r0 == 0) goto L_0x0023
            androidx.cardview.widget.CardView r4 = r11.A00
            if (r4 == 0) goto L_0x0023
            com.instagram.common.ui.base.IgTextView r3 = r11.A03
            if (r3 == 0) goto L_0x0023
            com.instagram.common.ui.base.IgTextView r1 = r11.A02
            if (r1 == 0) goto L_0x0023
            r6 = 0
            r4.setVisibility(r2)
            android.view.View$OnClickListener r0 = r5.A00
            if (r0 == 0) goto L_0x04aa
            r4.setOnClickListener(r0)
            android.view.View$OnClickListener r0 = r5.A00
            r1.setOnClickListener(r0)
        L_0x04aa:
            X.C18210wN.A0y(r3)
            com.instagram.common.ui.base.IgLinearLayout r1 = r11.A01
            if (r1 == 0) goto L_0x0023
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0023
            goto L_0x060d
        L_0x04b7:
            android.view.View r7 = r11.itemView
            java.lang.Object r6 = r10.getItem(r12)
            X.3T9 r6 = (X.AnonymousClass3T9) r6
            java.lang.Object r0 = r10.getItem(r12)
            X.3T9 r0 = (X.AnonymousClass3T9) r0
            boolean r5 = r0.A00
            java.lang.Object r1 = X.C18210wN.A0X(r7)
            X.13H r1 = (X.AnonymousClass13H) r1
            r4 = 8
            android.widget.TextView r3 = r1.A01
            java.lang.String r0 = r6.A03
            r3.setText(r0)
            android.widget.ProgressBar r0 = r1.A00
            r0.setVisibility(r4)
            android.widget.TextView r2 = r1.A02
            java.lang.String r0 = r6.A04
            r2.setText(r0)
            int r0 = r6.A01
            r2.setTextColor(r0)
            if (r5 == 0) goto L_0x04f9
            r0 = 2131233578(0x7f080b2a, float:1.8083297E38)
            r3.setBackgroundResource(r0)
            android.view.View$OnClickListener r0 = r6.A02
            r3.setOnClickListener(r0)
        L_0x04f4:
            r2.setVisibility(r4)
            goto L_0x0023
        L_0x04f9:
            android.content.Context r1 = r7.getContext()
            r0 = 2130969251(0x7f0402a3, float:1.7547179E38)
            int r0 = X.C121907Is.A02(r1, r0)
            r3.setBackgroundResource(r0)
            goto L_0x04f4
        L_0x0508:
            X.12P r11 = (X.AnonymousClass12P) r11
            java.lang.Object r0 = r10.getItem(r12)
            X.3S0 r0 = (X.AnonymousClass3S0) r0
            int r1 = r0.A00
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r11.A00
            r0.setImageResource(r1)
            goto L_0x0023
        L_0x0519:
            X.12q r11 = (X.C199812q) r11
            java.lang.Object r4 = r10.getItem(r12)
            X.3T8 r4 = (X.AnonymousClass3T8) r4
            int r3 = r4.A00
            r2 = -1
            android.widget.Button r1 = r11.A00
            if (r3 == r2) goto L_0x0537
            r1.setText(r3)
        L_0x052b:
            android.view.View$OnClickListener r0 = r4.A02
            r1.setOnClickListener(r0)
            android.widget.TextView r1 = r11.A01
            if (r3 == r2) goto L_0x053d
            int r0 = r4.A01
            goto L_0x055e
        L_0x0537:
            java.lang.String r0 = r4.A03
            r1.setText(r0)
            goto L_0x052b
        L_0x053d:
            java.lang.String r0 = r4.A04
            r1.setText(r0)
            goto L_0x0023
        L_0x0544:
            X.12p r11 = (X.C199712p) r11
            java.lang.Object r2 = r10.getItem(r12)
            X.36P r2 = (X.AnonymousClass36P) r2
            android.widget.Button r1 = r11.A00
            r0 = 2131834854(0x7f1137e6, float:1.930283E38)
            r1.setText(r0)
            android.view.View$OnClickListener r0 = r2.A00
            r1.setOnClickListener(r0)
            android.widget.TextView r1 = r11.A01
            r0 = 2131834855(0x7f1137e7, float:1.9302832E38)
        L_0x055e:
            r1.setText(r0)
            goto L_0x0023
        L_0x0563:
            X.12W r11 = (X.AnonymousClass12W) r11
            r10.getItem(r12)
            android.widget.TextView r0 = r11.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "getListener"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0573:
            X.13A r11 = (X.AnonymousClass13A) r11
            java.lang.Object r2 = r10.getItem(r12)
            X.36R r2 = (X.AnonymousClass36R) r2
            X.C18200wM.A1S(r11, r2)
            android.widget.ImageView r1 = r11.A00
            r0 = 2131232582(0x7f080746, float:1.8081277E38)
            r1.setImageResource(r0)
            android.widget.TextView r1 = r11.A02
            r0 = 2131821227(0x7f1102ab, float:1.9275191E38)
            r1.setText(r0)
            android.widget.TextView r1 = r11.A01
            android.view.View$OnClickListener r0 = r2.A00
        L_0x0592:
            r1.setOnClickListener(r0)
            goto L_0x0023
        L_0x0597:
            X.139 r11 = (X.AnonymousClass139) r11
            java.lang.Object r2 = r10.getItem(r12)
            X.3CZ r2 = (X.AnonymousClass3CZ) r2
            X.C18200wM.A1S(r11, r2)
            com.instagram.common.ui.base.IgTextView r1 = r11.A02
            java.lang.String r0 = r2.A03
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r11.A00
            java.lang.String r0 = r2.A01
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r11.A01
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            android.view.View$OnClickListener r0 = r2.A00
            goto L_0x05d5
        L_0x05ba:
            X.12n r11 = (X.C199512n) r11
            java.lang.Object r2 = r10.getItem(r12)
            X.3Sk r2 = (X.C61233Sk) r2
            X.C18200wM.A1S(r11, r2)
            com.instagram.common.ui.base.IgTextView r1 = r11.A00
            java.lang.String r0 = r2.A01
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r11.A01
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            android.view.View$OnClickListener r0 = r2.A00
        L_0x05d5:
            r1.setOnClickListener(r0)
            goto L_0x0023
        L_0x05da:
            X.12Q r11 = (X.AnonymousClass12Q) r11
            java.lang.Object r2 = r10.getItem(r12)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2) r2
            X.C18200wM.A1S(r11, r2)
            com.instagram.igds.components.banner.IgdsBanner r1 = r11.A00
            int r0 = r2.A00
            r1.setBody(r0)
            java.lang.Object r0 = r2.A02
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0612
            int r0 = r0.intValue()
            r1.setAction((int) r0)
        L_0x05f9:
            int r0 = r2.A01
            r1.setIcon((int) r0)
            java.lang.Object r0 = r2.A03
            X.4rf r0 = (X.C83594rf) r0
            r1.A00 = r0
            android.view.View r0 = r1.A02
            r6 = 8
            r0.setVisibility(r6)
            android.view.View r1 = r1.A01
        L_0x060d:
            r1.setVisibility(r6)
            goto L_0x0023
        L_0x0612:
            r0 = 0
            r1.setAction((java.lang.CharSequence) r0)
            goto L_0x05f9
        L_0x0617:
            X.12V r11 = (X.AnonymousClass12V) r11
            java.lang.Object r0 = r10.getItem(r12)
            X.3Cc r0 = (X.C57693Cc) r0
            X.C50302sm.A00(r0, r11)
            goto L_0x0023
        L_0x0624:
            X.13D r11 = (X.AnonymousClass13D) r11
            java.lang.Object r4 = r10.getItem(r12)
            X.3G2 r4 = (X.AnonymousClass3G2) r4
            boolean r3 = X.AnonymousClass0wJ.A1Z(r11, r4)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r11.A02
            com.instagram.common.ui.base.IgTextView r5 = r11.A00
            X.AnonymousClass0wJ.A1M(r0, r2, r5)
            r4.A00 = r0
            java.lang.String r0 = r4.A05
            r4.A00(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r4.A00
            if (r1 == 0) goto L_0x0647
            r0 = 137(0x89, float:1.92E-43)
            X.AnonymousClass0wJ.A17(r1, r0, r4)
        L_0x0647:
            android.content.Context r2 = r4.A02
            r0 = 2131821748(0x7f1104b4, float:1.9276248E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r2, r0)
            r0 = 2131821750(0x7f1104b6, float:1.9276252E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r2, r0)
            android.text.SpannableStringBuilder r1 = X.C18190wL.A0D(r1, r2)
            r0 = 14
            X.AnonymousClass3Zw.A02(r1, r4, r2, r0)
            X.C04220Ms.A06(r1)
            r5.setText(r1)
            r5.setLinksClickable(r3)
            r5.setClickable(r3)
            X.C18180wK.A0z(r5)
            goto L_0x0023
        L_0x0671:
            r10.getItem(r12)
            X.0kW r0 = r10.mAnalyticsModule
            r0.getClass()
            java.lang.String r0 = "getOnClickListener"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0680:
            r10.getItem(r12)
            java.lang.String r0 = "isEnabled"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x068a:
            r10.getItem(r12)
            java.lang.String r0 = "getOnClickListener"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0694:
            r10.getItem(r12)
            java.lang.String r0 = "getOnClickListener"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x069e:
            r10.getItem(r12)
            java.lang.String r0 = "mIconResId"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x06a8:
            r10.getItem(r12)
            r1 = 0
            X.0kW r0 = r10.mAnalyticsModule
            r0.getClass()
            X.C18200wM.A1S(r11, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1fC.onBindViewHolder(X.M5O, int):void");
    }

    public void updateListView() {
        super.updateListView();
    }

    public void setRoundDialogBottomCorners(boolean z) {
        this.mRoundDialogBottomCorners = z;
    }

    public void setRoundDialogTopCorners(boolean z) {
        this.mRoundDialogTopCorners = z;
    }

    public void setShouldCenterText(boolean z) {
        this.mShouldCenterText = z;
    }

    public void setSwitchItemViewPointDelegate(C81734oH r1) {
        this.mSwitchItemViewPointDelegate = r1;
    }
}
