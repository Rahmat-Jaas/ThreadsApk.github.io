package com.instagram.debug.devoptions.sandboxselector;

import com.facebook.pando.TreeJNI;

public final class DevServerInfoDescriptionImpl extends TreeJNI implements DevServerInfoDescription {
    public String[] getScalarFields() {
        return new String[]{DevServerEntity.COLUMN_DESCRIPTION};
    }

    public String getDescription() {
        return getStringValue(DevServerEntity.COLUMN_DESCRIPTION);
    }
}
