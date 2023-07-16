package X;

import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.64Y  reason: invalid class name */
public final class AnonymousClass64Y extends AnonymousClass5NL implements C11 {
    public final StoryPollColorType AYG() {
        return (StoryPollColorType) A09(AnonymousClass8QC.A00, 94842723);
    }

    public final PollType B28() {
        return (PollType) A09(AnonymousClass8QD.A00, -143609926);
    }

    public final List B4q() {
        return getOptionalTreeListByHashCode(-1446979730, C27991tU.class);
    }

    public final List BFZ() {
        return getOptionalTreeListByHashCode(-1543665910, C27991tU.class);
    }

    public final Boolean Aie() {
        return getOptionalBooleanValueByHashCode(-673660814);
    }

    public final String B26() {
        return A0A(-397914725);
    }

    public final String B5K() {
        return getStringValueByHashCode(-1165870106);
    }

    public final Boolean BLR() {
        return getOptionalBooleanValueByHashCode(1093411206);
    }

    public final Integer BLX() {
        return getOptionalIntValueByHashCode(1124422903);
    }

    public final Boolean BWG() {
        return getOptionalBooleanValueByHashCode(-1587105938);
    }

    public final Boolean BYO() {
        return getOptionalBooleanValueByHashCode(-1463231774);
    }

    public final C154479Cb D6j() {
        ArrayList arrayList;
        StoryPollColorType AYG = AYG();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-673660814);
        String A03 = AnonymousClass5NL.A03(this);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1587105938);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(-1463231774);
        String A0A = A0A(-397914725);
        PollType B28 = B28();
        List<AnonymousClass8iO> B4q = B4q();
        ArrayList arrayList2 = null;
        if (B4q != null) {
            arrayList = AnonymousClass0wJ.A0x(B4q, 10);
            for (AnonymousClass8iO D2o : B4q) {
                arrayList.add(D2o.D2o());
            }
        } else {
            arrayList = null;
        }
        String stringValueByHashCode = getStringValueByHashCode(-1165870106);
        List<AnonymousClass8iO> BFZ = BFZ();
        if (BFZ != null) {
            arrayList2 = AnonymousClass0wJ.A0x(BFZ, 10);
            for (AnonymousClass8iO D2o2 : BFZ) {
                arrayList2.add(D2o2.D2o());
            }
        }
        return new C154479Cb(B28, AYG, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, getOptionalBooleanValueByHashCode(1093411206), getOptionalIntValueByHashCode(1124422903), A03, A0A, stringValueByHashCode, arrayList, arrayList2);
    }

    public final String getId() {
        return AnonymousClass5NL.A03(this);
    }
}
