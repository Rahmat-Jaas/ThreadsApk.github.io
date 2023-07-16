package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18240wQ;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchComponentCollectionModel {
    public final ArrayList childrenComponentList;
    public final int componentCollectionType;
    public final String componentDescription;
    public final String componentId;
    public final String componentSubtitle;
    public final String componentTitle;
    public final boolean hasNextPage;
    public final boolean hasPerformedFirstFetch;
    public final boolean isUpdating;
    public final String logInfo;
    public final ArrayList mediaList;
    public final boolean needsFetchingNextPage;
    public final String parentComponentId;
    public final String renderingStyles;

    public static native CowatchComponentCollectionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchComponentCollectionModel)) {
                return false;
            }
            CowatchComponentCollectionModel cowatchComponentCollectionModel = (CowatchComponentCollectionModel) obj;
            if (!this.componentId.equals(cowatchComponentCollectionModel.componentId) || !this.parentComponentId.equals(cowatchComponentCollectionModel.parentComponentId)) {
                return false;
            }
            String str = this.componentTitle;
            String str2 = cowatchComponentCollectionModel.componentTitle;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.componentSubtitle;
            String str4 = cowatchComponentCollectionModel.componentSubtitle;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.componentDescription;
            String str6 = cowatchComponentCollectionModel.componentDescription;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (!this.mediaList.equals(cowatchComponentCollectionModel.mediaList) || !this.childrenComponentList.equals(cowatchComponentCollectionModel.childrenComponentList) || this.componentCollectionType != cowatchComponentCollectionModel.componentCollectionType || this.hasPerformedFirstFetch != cowatchComponentCollectionModel.hasPerformedFirstFetch || this.hasNextPage != cowatchComponentCollectionModel.hasNextPage || this.isUpdating != cowatchComponentCollectionModel.isUpdating) {
                return false;
            }
            String str7 = this.logInfo;
            String str8 = cowatchComponentCollectionModel.logInfo;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            if (this.needsFetchingNextPage != cowatchComponentCollectionModel.needsFetchingNextPage) {
                return false;
            }
            String str9 = this.renderingStyles;
            String str10 = cowatchComponentCollectionModel.renderingStyles;
            if (str9 != null) {
                return str9.equals(str10);
            }
            if (str10 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        int A00 = C18210wN.A00(this.componentId.hashCode());
        return ((((((((((((AnonymousClass0wJ.A05(this.childrenComponentList, AnonymousClass0wJ.A05(this.mediaList, (((((AnonymousClass0wJ.A07(this.parentComponentId, A00) + AnonymousClass0wJ.A06(this.componentTitle)) * 31) + AnonymousClass0wJ.A06(this.componentSubtitle)) * 31) + AnonymousClass0wJ.A06(this.componentDescription)) * 31)) + this.componentCollectionType) * 31) + (this.hasPerformedFirstFetch ? 1 : 0)) * 31) + (this.hasNextPage ? 1 : 0)) * 31) + (this.isUpdating ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.logInfo)) * 31) + (this.needsFetchingNextPage ? 1 : 0)) * 31) + C18200wM.A09(this.renderingStyles);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchComponentCollectionModel{componentId=");
        A0s.append(this.componentId);
        A0s.append(",parentComponentId=");
        A0s.append(this.parentComponentId);
        A0s.append(",componentTitle=");
        A0s.append(this.componentTitle);
        A0s.append(",componentSubtitle=");
        A0s.append(this.componentSubtitle);
        A0s.append(",componentDescription=");
        A0s.append(this.componentDescription);
        A0s.append(",mediaList=");
        A0s.append(this.mediaList);
        A0s.append(",childrenComponentList=");
        A0s.append(this.childrenComponentList);
        A0s.append(",componentCollectionType=");
        A0s.append(this.componentCollectionType);
        A0s.append(",hasPerformedFirstFetch=");
        A0s.append(this.hasPerformedFirstFetch);
        A0s.append(",hasNextPage=");
        A0s.append(this.hasNextPage);
        A0s.append(",isUpdating=");
        A0s.append(this.isUpdating);
        A0s.append(",logInfo=");
        A0s.append(this.logInfo);
        A0s.append(",needsFetchingNextPage=");
        A0s.append(this.needsFetchingNextPage);
        A0s.append(",renderingStyles=");
        A0s.append(this.renderingStyles);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchComponentCollectionModel(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, int i, boolean z, boolean z2, boolean z3, String str6, boolean z4, String str7) {
        C18240wQ.A1L(str, str2, arrayList);
        arrayList2.getClass();
        this.componentId = str;
        this.parentComponentId = str2;
        this.componentTitle = str3;
        this.componentSubtitle = str4;
        this.componentDescription = str5;
        this.mediaList = arrayList;
        this.childrenComponentList = arrayList2;
        this.componentCollectionType = i;
        this.hasPerformedFirstFetch = z;
        this.hasNextPage = z2;
        this.isUpdating = z3;
        this.logInfo = str6;
        this.needsFetchingNextPage = z4;
        this.renderingStyles = str7;
    }
}
