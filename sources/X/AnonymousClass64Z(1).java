package X;

import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.64Z  reason: invalid class name */
public final class AnonymousClass64Z extends AnonymousClass5NL implements C12 {
    public final C146478mJ AoW() {
        return (C146478mJ) getTreeValueByHashCode(-1876344045, AnonymousClass64C.class);
    }

    public final C21776C0b BGh() {
        return (C21776C0b) getTreeValueByHashCode(-1703162617, C163639ic.class);
    }

    public final List BL7() {
        return getOptionalTreeListByHashCode(713258463, AnonymousClass64F.class);
    }

    public final Boolean AlS() {
        return getOptionalBooleanValueByHashCode(53851633);
    }

    public final Integer Auq() {
        return getOptionalIntValueByHashCode(1939875509);
    }

    public final Integer Az2() {
        return getOptionalIntValueByHashCode(-636516523);
    }

    public final Integer AzB() {
        return getOptionalIntValueByHashCode(1933097432);
    }

    public final String BKj() {
        return getStringValueByHashCode(1370685266);
    }

    public final String BKm() {
        return getStringValueByHashCode(-134887560);
    }

    public final String BKx() {
        return getStringValueByHashCode(-1617978007);
    }

    public final Integer BSk() {
        return getOptionalIntValueByHashCode(-181834353);
    }

    public final QuestionMediaResponseModel D6r() {
        ImageInfo imageInfo;
        SpritesheetInfo spritesheetInfo;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(53851633);
        String A03 = AnonymousClass5NL.A03(this);
        C146478mJ AoW = AoW();
        ArrayList arrayList = null;
        if (AoW != null) {
            imageInfo = AoW.D4s();
        } else {
            imageInfo = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-181834353);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(1939875509);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-636516523);
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(1933097432);
        C21776C0b BGh = BGh();
        if (BGh != null) {
            spritesheetInfo = BGh.D4v();
        } else {
            spritesheetInfo = null;
        }
        String stringValueByHashCode = getStringValueByHashCode(1370685266);
        String stringValueByHashCode2 = getStringValueByHashCode(-134887560);
        String stringValueByHashCode3 = getStringValueByHashCode(-1617978007);
        List<C0K> BL7 = BL7();
        if (BL7 != null) {
            arrayList = AnonymousClass0wJ.A0w(BL7);
            for (C0K D4w : BL7) {
                arrayList.add(D4w.D4w());
            }
        }
        return new QuestionMediaResponseModel(imageInfo, spritesheetInfo, optionalBooleanValueByHashCode, optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, A03, stringValueByHashCode, stringValueByHashCode2, stringValueByHashCode3, arrayList);
    }

    public final String getId() {
        return AnonymousClass5NL.A03(this);
    }
}
