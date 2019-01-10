package es.dipucr.sigem.api.rule.procedures.secretaria;

import ieci.tdw.ispac.api.errors.ISPACRuleException;
import ieci.tdw.ispac.api.rule.IRuleContext;

public class GenerateCertificadoAsistenciaCOMIHaciendaRule extends GenerateCertificadoAsistenciaRule{
	public boolean init(IRuleContext rulectx) throws ISPACRuleException {
		nombreDocCertificado  = "Certificado de Asistencia de COMI Hacienda";
		return true;
	}
}
