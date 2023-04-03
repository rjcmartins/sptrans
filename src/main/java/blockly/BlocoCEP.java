package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
import java.util.concurrent.Callable;



@CronappSwagger
@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoCEP {

public static final int TIMEOUT = 300;

/**
 *
 * asdasdasscaasdasdasdsdcadasd
 *
 * @author Rafael Juan Cardoso Martins
 * @since 03/04/2023, 17:01:07
 *
 */
public static Var ConsultaCEP() throws Exception {
 return new Callable<Var>() {

   private Var CEP = Var.VAR_NULL;
   private Var Retorno = Var.VAR_NULL;

   public Var call() throws Exception {
    // Comentárioasdasdasdasdas asda sd asd
    CEP =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.CEP"));
    Retorno =
    cronapi.json.Operations.toJson(
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("GET"),
    Var.valueOf("application/x-www-form-urlencoded"),
    Var.valueOf(
    Var.valueOf("https://viacep.com.br/ws/").getObjectAsString() +
    CEP.getObjectAsString() +
    Var.valueOf("/json/").getObjectAsString()), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL,
    Var.valueOf(""),
    Var.valueOf("BODY")));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf(
    Var.valueOf("Cidade = ").getObjectAsString() +
    cronapi.json.Operations.getJsonOrMapField(Retorno,
    Var.valueOf("localidade")).getObjectAsString()));
    return Var.VAR_NULL;
   }
 }.call();
}

}

