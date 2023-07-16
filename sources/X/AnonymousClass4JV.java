package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.impl.client.cache.CacheConfig;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.debug.devoptions.debughead.linechart.LineChartView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import go.Seq;
import java.util.EnumSet;

/* renamed from: X.4JV  reason: invalid class name */
public final class AnonymousClass4JV implements C83714rr {
    public final Fragment A00;
    public final C11630kW A01;
    public final UserSession A02;
    public final EnumSet A03 = EnumSet.allOf(AnonymousClass268.class);

    public static FragmentActivity A00(AnonymousClass4JV r0) {
        return r0.A00.requireActivity();
    }

    public final C82924qU AlJ(AnonymousClass268 r6) {
        int i;
        C82924qU r3;
        if (r6 == null) {
            i = -1;
        } else {
            i = AnonymousClass31I.A00[r6.ordinal()];
        }
        switch (i) {
            case 1:
                r3 = new AnonymousClass4IJ(this.A00, this.A02);
                break;
            case 2:
                r3 = new AnonymousClass4IK(this.A00, this.A02);
                break;
            case 3:
                r3 = new AnonymousClass4IN(A00(this), this.A02);
                break;
            case 4:
                Fragment fragment = this.A00;
                r3 = new AnonymousClass4JI(fragment.requireContext(), AnonymousClass06E.A00(fragment), this.A02);
                break;
            case 5:
                r3 = new AnonymousClass4JG(A00(this), this.A02);
                break;
            case 6:
                Fragment fragment2 = this.A00;
                r3 = new AnonymousClass4JS(fragment2.requireContext(), fragment2.requireActivity(), AnonymousClass06E.A00(fragment2), this.A02);
                break;
            case 7:
                r3 = new AnonymousClass4IT(A00(this), this.A02);
                break;
            case 8:
                r3 = new AnonymousClass4JQ(this.A00.requireContext(), this.A02);
                break;
            case 9:
                r3 = new C71014He(this.A00.requireContext(), this.A02);
                break;
            case 10:
                Fragment fragment3 = this.A00;
                r3 = new AnonymousClass4JH(fragment3.requireContext(), AnonymousClass06E.A00(fragment3), this.A02);
                break;
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                r3 = new AnonymousClass4JM(A00(this), this.A02, this.A01.getModuleName());
                break;
            case 13:
                r3 = new AnonymousClass4I6(A00(this), this.A02);
                break;
            case 14:
                r3 = new AnonymousClass4H3(this.A00.requireContext());
                break;
            case 15:
                r3 = new AnonymousClass4H2(this.A02);
                break;
            case 16:
                r3 = new C71234Ia(A00(this), this.A02);
                break;
            case LangUtils.HASH_SEED /*17*/:
                r3 = new AnonymousClass4IZ(A00(this), this.A02);
                break;
            case 18:
            case 19:
                r3 = new C70924Gv(this.A00.requireContext());
                break;
            case 20:
                r3 = new AnonymousClass4IF(A00(this), this.A02);
                break;
            case 21:
                r3 = new AnonymousClass4IL(this.A00, this.A02);
                break;
            case 22:
                r3 = new AnonymousClass4IW(this.A00, this.A02);
                break;
            case 23:
                r3 = new AnonymousClass4I2(this.A00, this.A02);
                break;
            case 24:
                r3 = new C70954Gy(this.A00);
                break;
            case 25:
                r3 = new AnonymousClass4H1(this.A00);
                break;
            case Rfc3492Idn.tmax /*26*/:
                r3 = new AnonymousClass4H0(this.A00);
                break;
            case 27:
                r3 = new C70964Gz(A00(this));
                break;
            case 28:
                Fragment fragment4 = this.A00;
                r3 = new C133887wd(fragment4.requireActivity(), AnonymousClass06E.A00(fragment4), this.A01, this.A02);
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                this.A00.requireContext();
                r3 = new AnonymousClass4H5(this.A02);
                break;
            case 30:
                r3 = new AnonymousClass4HP(A00(this), this.A02);
                break;
            case 31:
            case 32:
            case 33:
                r3 = new C20117BPb(A00(this), this.A01, this.A02);
                break;
            case 34:
                r3 = new AnonymousClass4IP(this.A00, this.A02);
                break;
            case 35:
                r3 = new AnonymousClass4I7(A00(this), this.A02);
                break;
            case Rfc3492Idn.base /*36*/:
                r3 = new AnonymousClass4IS(this.A00, this.A02);
                break;
            case LangUtils.HASH_OFFSET /*37*/:
                r3 = new AnonymousClass4IO(this.A00, this.A02);
                break;
            case Rfc3492Idn.skew /*38*/:
                r3 = new AnonymousClass4JJ(this.A00, this.A01, this.A02);
                break;
            case 39:
                r3 = new AnonymousClass4JK(this.A00, this.A01, this.A02);
                break;
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                r3 = new C71314Ii(this.A00, this.A02);
                break;
            case Seq.NULL_REFNUM /*41*/:
                r3 = new C71344Il(this.A00, this.A02);
                break;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                r3 = new C71204Hx(this.A00, this.A02);
                break;
            case 43:
                r3 = new AnonymousClass4IC(this.A00, this.A02);
                break;
            case 44:
                r3 = new AnonymousClass4IM(this.A00, this.A02);
                break;
            case 45:
                r3 = new C71364In(this.A00, this.A02);
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                r3 = new AnonymousClass4HA(this.A00, this.A02);
                break;
            case 47:
                r3 = new C71254Ic(this.A00, this.A02);
                break;
            case 48:
                r3 = new C71264Id(this.A00, this.A02);
                break;
            case 49:
                r3 = new EN5(this.A00, this.A02);
                break;
            case AnimationSpecKt.IDLE_DURATION /*50*/:
                r3 = new AnonymousClass4ID(A00(this), this.A02);
                break;
            case 51:
                r3 = new AnonymousClass4IE(this.A00, this.A02);
                break;
            case 52:
                r3 = new AnonymousClass4IG(this.A00, this.A02);
                break;
            case 53:
                r3 = new C71294Ig(this.A00, this.A02);
                break;
            case 54:
                r3 = new C71354Im(this.A00, this.A02);
                break;
            case 55:
                r3 = new C71324Ij(this.A00, this.A02);
                break;
            case 56:
                r3 = new AnonymousClass4IV(this.A00, this.A02);
                break;
            case 57:
                r3 = new C71334Ik(this.A00, this.A02);
                break;
            case 58:
                r3 = new AnonymousClass4IX(this.A00, this.A02);
                break;
            case 59:
                r3 = new AnonymousClass4IH(this.A00, this.A02);
                break;
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                r3 = new AnonymousClass4HD(this.A02);
                break;
            case 61:
                Fragment fragment5 = this.A00;
                r3 = new AnonymousClass4JF(fragment5.requireContext(), fragment5, this.A02);
                break;
            case 62:
                r3 = new AnonymousClass4JE(this.A00.requireContext());
                break;
            case StringTreeSet.PAYLOAD_MASK:
                Fragment fragment6 = this.A00;
                r3 = new AnonymousClass4I1(fragment6.requireContext(), fragment6);
                break;
            case 64:
                Fragment fragment7 = this.A00;
                C04220Ms.A0C(fragment7, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                r3 = new AnonymousClass4J4((C34640IcN) fragment7, this.A02);
                break;
            case 65:
                Fragment fragment8 = this.A00;
                C04220Ms.A0C(fragment8, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                r3 = new AnonymousClass4J5((C34640IcN) fragment8, this.A02);
                break;
            case 66:
                r3 = new AnonymousClass4IB(A00(this), this.A02);
                break;
            case 67:
                r3 = new AnonymousClass4HY(A00(this), this.A02);
                break;
            case 68:
                r3 = new AnonymousClass4HZ(A00(this), this.A02);
                break;
            case 69:
                r3 = new C70974Ha(A00(this), this.A02);
                break;
            case LineChartView.MARGIN_TICKS /*70*/:
                r3 = new AnonymousClass4HX(A00(this), this.A02);
                break;
            case 71:
                r3 = new AnonymousClass4HW(A00(this), this.A02);
                break;
            case Rfc3492Idn.initial_bias /*72*/:
                r3 = new AnonymousClass4IQ(A00(this), this.A02);
                break;
            case 73:
                r3 = new C71284If(A00(this), this.A02);
                break;
            case 74:
                r3 = new C71434Iu(this.A00, this.A02);
                break;
            case 75:
                r3 = new C71424It(this.A00, this.A02);
                break;
            case 76:
                Fragment fragment9 = this.A00;
                C04220Ms.A0C(fragment9, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                r3 = new C20118BPc((C34640IcN) fragment9, this.A02);
                break;
            case 77:
                Fragment fragment10 = this.A00;
                C04220Ms.A0C(fragment10, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                r3 = new AnonymousClass4J8((C34640IcN) fragment10, this.A02);
                break;
            case 78:
                Fragment fragment11 = this.A00;
                C04220Ms.A0C(fragment11, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                r3 = new AnonymousClass4HI((C34640IcN) fragment11, this.A02);
                break;
            case 79:
                r3 = new AnonymousClass4HJ(this.A02, A00(this));
                break;
            case 80:
                r3 = new AnonymousClass4HH(this.A00, this.A02);
                break;
            case 81:
                r3 = new C71214Hy(A00(this), this.A02);
                break;
            case 82:
                r3 = new BPZ(A00(this), this.A02);
                break;
            case 83:
                r3 = new AnonymousClass4JL(A00(this), this.A01, this.A02);
                break;
            case 84:
                r3 = new AnonymousClass4HK(A00(this), this.A02);
                break;
            case 85:
                r3 = new C71044Hh(A00(this), this.A02);
                break;
            case 86:
                r3 = new C71054Hi(A00(this), this.A02);
                break;
            case 87:
                r3 = new AnonymousClass4HO(A00(this), this.A02);
                break;
            case 88:
                r3 = new AnonymousClass4H7(A00(this), this.A02);
                break;
            case 89:
                r3 = new AnonymousClass4JR(A00(this), this.A01, this.A02);
                break;
            case 90:
                r3 = new AnonymousClass4I9(A00(this), this.A02);
                break;
            case 91:
                r3 = new C71094Hm(this.A00, this.A02);
                break;
            case 92:
                r3 = new AnonymousClass4JN(this.A00, this.A01, this.A02);
                break;
            case 93:
                r3 = new C71064Hj(A00(this), this.A02);
                break;
            case 94:
                r3 = new C71384Ip(this.A00, this.A02);
                break;
            case 95:
                r3 = new C70944Gx(A00(this));
                break;
            case 96:
                r3 = new C71154Hs(this.A00, this.A02);
                break;
            case 97:
                r3 = new C71144Hr(this.A00, this.A02);
                break;
            case 98:
                r3 = new AnonymousClass4HL(A00(this), this.A02);
                break;
            case 99:
                r3 = new AnonymousClass4J3(A00(this), this.A02);
                break;
            case 100:
                r3 = new C71084Hl(A00(this), this.A02);
                break;
            case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                r3 = new AnonymousClass4IA(A00(this), this.A02);
                break;
            case HttpStatus.SC_PROCESSING /*102*/:
                r3 = new C71114Ho(A00(this), this.A02);
                break;
            case 103:
                r3 = new C71104Hn(A00(this), this.A02);
                break;
            case 104:
                r3 = new C71124Hp(A00(this), this.A02);
                break;
            case 105:
                r3 = new AnonymousClass4JD(A00(this), this.A01, this.A02);
                break;
            case 106:
                r3 = new C71374Io(A00(this), this.A02);
                break;
            case 107:
                r3 = new C71474Iy(A00(this), this.A02);
                break;
            case 108:
                r3 = new C71484Iz(A00(this), this.A02);
                break;
            case 109:
                r3 = new C71464Ix(A00(this), this.A02);
                break;
            case 110:
                r3 = new AnonymousClass4I8(A00(this), this.A02);
                break;
            case 111:
                r3 = new AnonymousClass4HT(this.A00, this.A02);
                break;
            case 112:
                r3 = new C71024Hf(this.A00.requireContext(), this.A02);
                break;
            case 113:
                r3 = new C70914Gu(this.A00);
                break;
            case 114:
                r3 = new C71274Ie(A00(this), this.A02);
                break;
            case 115:
                r3 = new C71134Hq(A00(this), this.A02);
                break;
            case 116:
                r3 = new AnonymousClass4H8(this.A00, this.A02);
                break;
            case 117:
                r3 = new C71244Ib(A00(this), this.A02);
                break;
            case 118:
                r3 = new C70984Hb(this.A00.requireContext(), this.A02);
                break;
            case 119:
                r3 = new AnonymousClass4IY(A00(this), this.A02);
                break;
            case 120:
                r3 = new AnonymousClass4J6(A00(this), this.A01, this.A02);
                break;
            case 121:
                r3 = new C71304Ih(A00(this), this.A02);
                break;
            case 122:
                r3 = new AnonymousClass4IR(A00(this), this.A02);
                break;
            case 123:
                r3 = new AnonymousClass4I4(A00(this), this.A02);
                break;
            case 124:
                r3 = new AnonymousClass4I5(A00(this), this.A02);
                break;
            case 125:
                r3 = new AnonymousClass4I3(A00(this), this.A02);
                break;
            case 126:
            case StringTreeSet.MAX_SYMBOL_COUNT:
                r3 = new BPW(A00(this), this.A02);
                break;
            case 128:
                r3 = new AnonymousClass4I0(A00(this), this.A02);
                break;
            case 129:
                r3 = new C70904Gt();
                break;
            case 130:
                r3 = new C71224Hz(this.A00, this.A02);
                break;
            case 131:
                r3 = new AnonymousClass4JP(this.A00, this.A02);
                break;
            case 132:
                r3 = new C20116BPa(A00(this), this.A02);
                break;
            case 133:
                r3 = new AnonymousClass4H4(this.A00);
                break;
            case 134:
                r3 = new AnonymousClass4J1(A00(this), this.A02);
                break;
            case 135:
                r3 = new C71164Ht(A00(this), this.A02);
                break;
            case 136:
                r3 = new C71414Is(A00(this), this.A02);
                break;
            case 137:
                r3 = new C71394Iq(A00(this), this.A02);
                break;
            case 138:
                r3 = new EN7(A00(this), this.A01, this.A02);
                break;
            case 139:
                r3 = new EN6(A00(this), this.A01, this.A02);
                break;
            case 140:
                r3 = new C71404Ir(A00(this), this.A02);
                break;
            case 141:
                r3 = new AnonymousClass4HG(A00(this), this.A02);
                break;
            case 142:
                r3 = new AnonymousClass4HC(A00(this), this.A02);
                break;
            case 143:
                r3 = new AnonymousClass4IU(this.A00, this.A02);
                break;
            case 144:
                r3 = new C71004Hd(A00(this), this.A02);
                break;
            case 145:
                r3 = new C70994Hc(A00(this), this.A02);
                break;
            case 146:
                r3 = new C71184Hv(this.A00, this.A02);
                break;
            case 147:
                r3 = new C71174Hu(this.A00, this.A02);
                break;
            case 148:
                r3 = new C71194Hw(A00(this), this.A02);
                break;
            case 149:
                r3 = new AnonymousClass4H9(A00(this), this.A02);
                break;
            case 150:
                r3 = new AnonymousClass4HB(A00(this), this.A02);
                break;
            case 151:
                r3 = new AnonymousClass4HN(this.A00, this.A02);
                break;
            case 152:
                r3 = new AnonymousClass4HQ(A00(this), this.A02);
                break;
            case 153:
                r3 = new AnonymousClass4HM(A00(this), this.A02);
                break;
            case 154:
                r3 = new AnonymousClass4HE(A00(this), this.A02);
                break;
            case 155:
            case 156:
                r3 = new AnonymousClass4J7(A00(this), this.A02, false);
                break;
            case 157:
                r3 = new AnonymousClass4HF(A00(this), this.A02);
                break;
            case 158:
                Fragment fragment12 = this.A00;
                UserSession userSession = this.A02;
                r3 = new AnonymousClass4JO(fragment12.requireContext(), fragment12, this.A01, userSession);
                break;
            case 159:
                r3 = new AnonymousClass4HU(this.A00, this.A02);
                break;
            case 160:
                r3 = new C70934Gw(this.A02);
                break;
            case 161:
                r3 = new BPV(this.A00, this.A02);
                break;
            case 162:
                r3 = new BPY(A00(this), this.A02);
                break;
            case 163:
                r3 = new BPX(A00(this), this.A02);
                break;
            case 164:
                r3 = new AnonymousClass4HV(A00(this), this.A02);
                break;
            case 165:
                Fragment fragment13 = this.A00;
                r3 = new AnonymousClass4JB(fragment13, fragment13.requireActivity(), this.A02);
                break;
            case 166:
                r3 = new AnonymousClass4J2(this.A00.requireContext(), this.A02);
                break;
            case 167:
                r3 = new AnonymousClass4H6(A00(this));
                break;
            case 168:
                r3 = new AnonymousClass4J9(this.A00, this.A01, this.A02);
                break;
            case 169:
                Fragment fragment14 = this.A00;
                r3 = new AnonymousClass4JC(fragment14.requireContext(), this.A02, fragment14.requireActivity());
                break;
            case 170:
                r3 = new C71074Hk(A00(this), this.A02);
                break;
            case 171:
                r3 = new C71034Hg(A00(this), this.A02);
                break;
            case 172:
                r3 = new C71454Iw(A00(this), this.A02);
                break;
            case 173:
                r3 = new AnonymousClass4II(this.A00, this.A02);
                break;
            case 174:
                r3 = new KPG(A00(this), this.A01, this.A02);
                break;
            case 175:
                r3 = new C71444Iv(A00(this), this.A02);
                break;
            case 176:
                r3 = new AnonymousClass4J0(A00(this), this.A02);
                break;
            case 177:
                r3 = new AnonymousClass4HS(A00(this), this.A02);
                break;
            case 178:
                r3 = new AnonymousClass4HR(A00(this), this.A02);
                break;
            case 179:
                r3 = new AnonymousClass4JA(A00(this), this.A02);
                break;
            default:
                return null;
        }
        return r3;
    }

    public final EnumSet BF6() {
        EnumSet enumSet = this.A03;
        C04220Ms.A05(enumSet);
        return enumSet;
    }

    public AnonymousClass4JV(Fragment fragment, C11630kW r3, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = r3;
        this.A02 = userSession;
    }
}
