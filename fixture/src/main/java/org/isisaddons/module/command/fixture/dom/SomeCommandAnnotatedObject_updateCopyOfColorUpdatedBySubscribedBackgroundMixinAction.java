package org.isisaddons.module.command.fixture.dom;

import org.apache.isis.applib.annotation.Action;
import org.apache.isis.applib.annotation.Mixin;

@Mixin
public class SomeCommandAnnotatedObject_updateCopyOfColorUpdatedBySubscribedBackgroundMixinAction {

    public static class ActionDomainEvent
            extends org.apache.isis.applib.services.eventbus.ActionDomainEvent <SomeCommandAnnotatedObject_updateCopyOfColorUpdatedBySubscribedBackgroundMixinAction> {}

    private final SomeCommandAnnotatedObject someCommandAnnotatedObject;

    public SomeCommandAnnotatedObject_updateCopyOfColorUpdatedBySubscribedBackgroundMixinAction(SomeCommandAnnotatedObject someCommandAnnotatedObject) {
        this.someCommandAnnotatedObject = someCommandAnnotatedObject;
    }

    @Action(domainEvent = SomeCommandAnnotatedObject_updateCopyOfColorUpdatedBySubscribedBackgroundMixinAction.ActionDomainEvent.class)
    public SomeCommandAnnotatedObject $$(final SomeCommandAnnotatedObject.Colour colour) {
        someCommandAnnotatedObject.setCopyOfColorUpdatedBySubscribedBackgroundMixinAction(colour);
        return someCommandAnnotatedObject;
    }

    public SomeCommandAnnotatedObject.Colour default0$$() {
        return someCommandAnnotatedObject.getColour();
    }

}
