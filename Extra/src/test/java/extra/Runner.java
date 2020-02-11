package extra;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Anotação do JUnit
@RunWith(Cucumber.class)
//Chama as funções do Cucumber 
@CucumberOptions(
		dryRun 		= false, //execução seca, significa que ira gerar o log
		monochrome  = true, //log completo
		features 	= { "src/test/resources/"	}, //coleta todos javas
		glue 		= { "extra/" }, //começa do pacote
		plugin 		= {	"pretty",
						"html:target/relatoriosimples",
						"json:target/relatoriosimples.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/relatoriodetalhado/dashboard.html"}		

		)
public class Runner {

}
