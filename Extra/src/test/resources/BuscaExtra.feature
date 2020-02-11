Feature: Compra no site Submarino 
	
	@compra @estorno
	Scenario: Busca por Produto
		Given que acesso o site do Submarino
		When preencho o termo "smartphone" e clico na lupa
		Then exibe a lista de produtos  
 
 	@estorno
	Scenario: Busca por Produto Nao Encontrado
		Given que acesso o site do Submarino
		When preencho o termo "QWEQWEQWEQWEQWEQWE" e clico na lupa
		Then exibe a mensagem de produto nao encontrado	