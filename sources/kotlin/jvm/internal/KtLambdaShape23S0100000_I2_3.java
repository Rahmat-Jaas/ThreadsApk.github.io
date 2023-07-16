package kotlin.jvm.internal;

import X.AnonymousClass006;
import X.AnonymousClass0IY;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass3WK;
import X.AnonymousClass3Zs;
import X.AnonymousClass5Id;
import X.AnonymousClass5KI;
import X.AnonymousClass68S;
import X.AnonymousClass6H0;
import X.AnonymousClass6UW;
import X.AnonymousClass6XD;
import X.AnonymousClass781;
import X.AnonymousClass7e0;
import X.AnonymousClass7e7;
import X.AnonymousClass7e8;
import X.C02220Ah;
import X.C03700Kj;
import X.C04220Ms;
import X.C04530Oa;
import X.C07810cE;
import X.C10300i6;
import X.C103926ax;
import X.C103936ay;
import X.C103946az;
import X.C104456bo;
import X.C104576c0;
import X.C104586c1;
import X.C108746is;
import X.C111736oI;
import X.C112666pz;
import X.C1193174m;
import X.C1194975o;
import X.C1197376r;
import X.C1200878l;
import X.C120627Bu;
import X.C121547Gq;
import X.C125677do;
import X.C125717ds;
import X.C125777dy;
import X.C125827e6;
import X.C125837e9;
import X.C125857eB;
import X.C125917eH;
import X.C125927eI;
import X.C125937eJ;
import X.C125997eP;
import X.C126027eS;
import X.C127027gP;
import X.C132167tS;
import X.C132207tW;
import X.C132237tZ;
import X.C132257tb;
import X.C132267tc;
import X.C132277td;
import X.C132297tf;
import X.C132347tk;
import X.C132357tl;
import X.C132387to;
import X.C132397tp;
import X.C132407tq;
import X.C132417tr;
import X.C134007ws;
import X.C134017wt;
import X.C145188k1;
import X.C145198k2;
import X.C145798l6;
import X.C146988nC;
import X.C147128nR;
import X.C18180wK;
import X.C18190wL;
import X.C31580Grx;
import X.C37295Joc;
import X.C41012LuB;
import X.C67423zW;
import X.C86004w7;
import X.C86104wH;
import X.C86124wJ;
import X.C86154wM;
import X.C98706Gp;
import X.C98796Gy;
import X.C98806Gz;
import X.D2R;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.dcp.features.persistence.room.ig4a.IgRoomExampleDatabase;
import com.facebook.dcp.features.persistence.room.ig4a.IgRoomExampleDatabase_Impl;
import com.facebook.dcp.model.Matrix;
import com.facebook.dcp.prediction.litennmodelparams.DynamicNNModelParams;
import com.facebook.dcp.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.service.session.UserSession;
import go.Seq;
import java.util.List;

public class KtLambdaShape23S0100000_I2_3 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape23S0100000_I2_3(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C04530Oa r0;
        C1197376r r2;
        IgRoomDatabase A0X;
        List list;
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        Matrix[] matrixArr;
        float[][] fArr3;
        Matrix matrix;
        Matrix matrix2;
        Object obj;
        IgRoomDatabase igRoomDatabase;
        switch (this.A01) {
            case 0:
                C132417tr r22 = (C132417tr) this.A00;
                if (((C126027eS) r22.A03.getValue()).BAS() != AnonymousClass006.A00) {
                    return new AnonymousClass7e8(r22.A02);
                }
                return new C125837e9((C03700Kj) C18190wL.A0f(r22.A05), (C146988nC) r22.A08.getValue());
            case 1:
                C132417tr r3 = (C132417tr) this.A00;
                Integer BAS = ((C126027eS) r3.A03.getValue()).BAS();
                Integer num = AnonymousClass006.A00;
                C03700Kj r8 = (C03700Kj) C18190wL.A0f(r3.A05);
                C145798l6 r10 = (C145798l6) r3.A0B.getValue();
                if (BAS == num) {
                    return new AnonymousClass7e0(r8, (C145188k1) null, r10, C18180wK.A0X(), "IG_ADS_PREFETCH");
                }
                return new AnonymousClass7e0(r8, new C125777dy(r3.A02, new KtCSuperShape0S0200000_I2((List) AnonymousClass0ZV.A00, AnonymousClass6XD.A00, 0)), r10, C18180wK.A0Y(), "IG_ADS_PREFETCH");
            case 2:
                return new C132257tb((UserSession) this.A00);
            case 3:
            case 7:
                return new C126027eS((UserSession) this.A00);
            case 4:
                C132257tb r32 = (C132257tb) this.A00;
                IgRoomExampleDatabase_Impl igRoomExampleDatabase_Impl = (IgRoomExampleDatabase_Impl) ((IgRoomExampleDatabase) r32.A03.getValue());
                if (igRoomExampleDatabase_Impl.A00 != null) {
                    r2 = igRoomExampleDatabase_Impl.A00;
                } else {
                    synchronized (igRoomExampleDatabase_Impl) {
                        if (igRoomExampleDatabase_Impl.A00 == null) {
                            igRoomExampleDatabase_Impl.A00 = new C1197376r(igRoomExampleDatabase_Impl);
                        }
                        r2 = igRoomExampleDatabase_Impl.A00;
                    }
                }
                return new C125827e6((C03700Kj) C18190wL.A0f(r32.A01), r2, C86154wM.A0K(r32.A00));
            case 5:
                C134007ws r6 = IgRoomExampleDatabase.A00;
                UserSession userSession = (UserSession) this.A00;
                Class<IgRoomExampleDatabase> cls = IgRoomExampleDatabase.class;
                Object A002 = userSession.A00(cls);
                if (A002 != null) {
                    return A002;
                }
                synchronized (r6) {
                    igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                    if (igRoomDatabase == null) {
                        C41012LuB A003 = C120627Bu.A00(r6, userSession, cls);
                        AnonymousClass6UW.A00(A003, 1809011763, 1567390029, false);
                        A003.A01();
                        igRoomDatabase = (IgRoomDatabase) A003.A00();
                        userSession.A04(cls, igRoomDatabase);
                    }
                }
                return igRoomDatabase;
            case 6:
                return new C132387to((UserSession) this.A00);
            case 8:
                return C125677do.A00(((C104456bo) ((C132387to) this.A00).A03.getValue()).A00);
            case 9:
                return new C104456bo((C37295Joc) ((C132387to) this.A00).A06.getValue());
            case 10:
                C132387to r23 = (C132387to) this.A00;
                if (C86154wM.A0K(r23.A00).BAS() != AnonymousClass006.A00) {
                    return new AnonymousClass7e8((C1200878l) r23.A05.getValue());
                }
                return new C125837e9((C03700Kj) C18190wL.A0f(r23.A01), (C146988nC) r23.A02.getValue());
            case 11:
                r0 = AnonymousClass6H0.A00((UserSession) this.A00).A02;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new C132267tc((UserSession) this.A00);
            case 13:
                return new C126027eS(((C132277td) this.A00).A01);
            case 14:
                return new C112666pz((UserSession) this.A00);
            case 15:
                C112666pz r02 = (C112666pz) this.A00;
                UserSession userSession2 = r02.A00;
                Object value = r02.A03.getValue();
                AnonymousClass0wJ.A1N(userSession2, value);
                return userSession2.A01(AnonymousClass781.class, new KtLambdaShape22S0100000_I2_2(value, 35));
            case 16:
                C112666pz r1 = (C112666pz) this.A00;
                C04530Oa r5 = r1.A03;
                if (C86154wM.A0K(r5).BBc()) {
                    AnonymousClass5Id A012 = ((AnonymousClass781) r1.A01.getValue()).A01();
                    if (!A012.A02 || (obj = A012.A00) == null) {
                        return new DynamicNNModelParams();
                    }
                    return obj;
                }
                if (C86154wM.A0K(r5).AwF() == 30) {
                    list = C103926ax.A02;
                    iArr = C103926ax.A05;
                    fArr = C103926ax.A03;
                    fArr2 = C103926ax.A04;
                    matrixArr = C103926ax.A06;
                    fArr3 = C103926ax.A07;
                    matrix = C103926ax.A00;
                    matrix2 = C103926ax.A01;
                } else if (C86154wM.A0K(r5).AwF() == 47) {
                    list = C103936ay.A02;
                    iArr = C103936ay.A05;
                    fArr = C103936ay.A03;
                    fArr2 = C103936ay.A04;
                    matrixArr = C103936ay.A06;
                    fArr3 = C103936ay.A07;
                    matrix = C103936ay.A00;
                    matrix2 = C103936ay.A01;
                } else {
                    list = C103946az.A02;
                    iArr = C103946az.A05;
                    fArr = C103946az.A03;
                    fArr2 = C103946az.A04;
                    matrixArr = C103946az.A06;
                    fArr3 = C103946az.A07;
                    matrix = C103946az.A00;
                    matrix2 = C103946az.A01;
                }
                return new AnonymousClass5KI(matrix, matrix2, list, fArr, fArr2, iArr, matrixArr, fArr3);
            case LangUtils.HASH_SEED /*17*/:
                return new C126027eS(((C112666pz) this.A00).A00);
            case 18:
                return new C132397tp((UserSession) this.A00);
            case 19:
                UserSession userSession3 = ((C132397tp) this.A00).A00;
                C04220Ms.A0B(userSession3, 0);
                return new C121547Gq(((C132267tc) C86124wJ.A0n(userSession3, C132267tc.class, 12)).A00);
            case 20:
                C132397tp r4 = (C132397tp) this.A00;
                C04530Oa r24 = r4.A06;
                int intValue = C86154wM.A0K(r24).B2e().intValue();
                if (intValue == 0) {
                    C147128nR A0K = C86154wM.A0K(r24);
                    return new C125927eI((C121547Gq) r4.A01.getValue(), (C1193174m) r4.A07.getValue(), (C108746is) r4.A03.getValue(), A0K);
                } else if (intValue != 1) {
                    return new C125917eH((C121547Gq) r4.A01.getValue(), C86154wM.A0K(r24), (C98796Gy) r4.A05.getValue());
                } else {
                    return new C125937eJ((C121547Gq) r4.A01.getValue(), C86154wM.A0K(r24), (C112666pz) r4.A04.getValue());
                }
            case 21:
                return C98706Gp.A00(((C132397tp) this.A00).A00);
            case 22:
                return C98806Gz.A00(((C132397tp) this.A00).A00);
            case 23:
                return new C126027eS(((C132397tp) this.A00).A00);
            case 24:
                return new C1193174m((C121547Gq) ((C132397tp) this.A00).A01.getValue());
            case 25:
                UserSession userSession4 = (UserSession) this.A00;
                C04220Ms.A0B(userSession4, 0);
                return new C121547Gq(((C132267tc) C86124wJ.A0n(userSession4, C132267tc.class, 12)).A00);
            case Rfc3492Idn.tmax /*26*/:
                C10300i6 r25 = (C10300i6) this.A00;
                C04220Ms.A0B(r25, 0);
                r0 = ((C132257tb) C86124wJ.A0n(r25, C132257tb.class, 2)).A02;
                break;
            case 27:
                C10300i6 r26 = (C10300i6) this.A00;
                C04220Ms.A0B(r26, 0);
                r0 = ((C132397tp) C86124wJ.A0n(r26, C132397tp.class, 18)).A02;
                break;
            case 28:
                C132347tk r03 = (C132347tk) this.A00;
                return new C1194975o(r03.A00, (C104576c0) r03.A04.getValue());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new C126027eS(((C132347tk) this.A00).A01);
            case 30:
                r0 = AnonymousClass6H0.A00(((C132347tk) this.A00).A01).A01;
                break;
            case 31:
                return new C132237tZ((UserSession) this.A00);
            case 33:
                return new C104576c0((C1200878l) ((C132237tZ) this.A00).A02.getValue());
            case 34:
                return new C1200878l(C86154wM.A0B(((C132237tZ) this.A00).A00), "story_prefetch");
            case 35:
                return new C132357tl((UserSession) this.A00);
            case Rfc3492Idn.base /*36*/:
                return new C1200878l(C86154wM.A0B(((C132357tl) this.A00).A02), "ig_odml");
            case LangUtils.HASH_OFFSET /*37*/:
                C134017wt r27 = RoomSignalsDatabase.A00;
                UserSession userSession5 = (UserSession) this.A00;
                Object A004 = userSession5.A00(RoomSignalsDatabase.class);
                if (A004 != null) {
                    return A004;
                }
                synchronized (r27) {
                    A0X = C86104wH.A0X(r27, userSession5);
                }
                return A0X;
            case 39:
                C132357tl r33 = (C132357tl) this.A00;
                C07810cE r28 = ((C104586c1) r33.A04.getValue()).A00;
                if (r28 == null || (str = r28.BEN(36887167709348300L)) == null) {
                    str = "shared_prefs";
                }
                if (C04220Ms.A0I(str, "sqlite")) {
                    return new C67423zW(AnonymousClass0IY.A00, ((RoomSignalsDatabase) r33.A01.getValue()).A00());
                }
                return new C125997eP(AnonymousClass0IY.A00, (C1200878l) r33.A00.getValue());
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return new C104586c1((UserSession) this.A00);
            case Seq.NULL_REFNUM /*41*/:
                return new C127027gP((UserSession) this.A00);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new C132207tW((UserSession) this.A00);
            case 43:
                return new C132297tf((UserSession) this.A00);
            case 44:
                return new C132167tS((AnonymousClass0YY) this.A00);
            case 45:
                C132407tq r12 = (C132407tq) this.A00;
                C147128nR A0K2 = C86154wM.A0K(r12.A0B);
                return new AnonymousClass7e7((C03700Kj) C18190wL.A0f(r12.A01), (C111736oI) r12.A04.getValue(), AnonymousClass68S.PREDICT, A0K2);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return new C111736oI((C31580Grx) ((C132407tq) this.A00).A05.getValue());
            case 47:
                return AnonymousClass3WK.A01((UserSession) this.A00);
            case 48:
                C132407tq r29 = (C132407tq) this.A00;
                C04530Oa r13 = r29.A0B;
                long BGt = C86154wM.A0K(r13).BGt();
                C125717ds r82 = (C125717ds) r29.A00.getValue();
                C145198k2 r9 = (C145198k2) r29.A0A.getValue();
                C147128nR A0K3 = C86154wM.A0K(r13);
                return new C125857eB(r82, r9, AnonymousClass68S.PREDICT, (C121547Gq) r29.A08.getValue(), A0K3, (C86004w7) C18190wL.A0f(r29.A06), BGt);
            case 49:
                C10300i6 r210 = (C10300i6) this.A00;
                C04220Ms.A0B(r210, 0);
                return new C121547Gq(((C132297tf) C86124wJ.A0n(r210, C132297tf.class, 43)).A00);
            default:
                return AnonymousClass3Zs.A03((UserSession) this.A00).A02(D2R.A0l, C1200878l.class);
        }
        return r0.getValue();
    }
}
