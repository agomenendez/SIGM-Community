package ieci.tdw.ispac.api.rule.procedures.urbanismo;

import ieci.tdw.ispac.api.errors.ISPACRuleException;
import ieci.tdw.ispac.api.rule.IRuleContext;

public class InitPropuestaFinCalificacionRule extends InitPropuestaSegregacionRule {

    public boolean init(IRuleContext rulectx) throws ISPACRuleException {
        strEntidad = "URB_CALIFICACION";
        strExtracto = "Resolución de calificación urbanística";
        return true;
    }
}
