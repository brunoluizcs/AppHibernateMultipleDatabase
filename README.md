# AppHibernateMultipleDatabase
Aplicativo J2EE que utiliza Hibernate + VRaptor para construir a sessão do banco de dados de acordo com o parâmetro recebido.

========================================================
 
Aplicação cria um SessionFactory de acordo com o parâmetro recebido, armazena a factory no escopo da sessão criando a possibilidade de trabalhar com vários banco de dados simultaneamente. 

Você vai precisar de um arquivo de configuração para cada banco de dados que deseja conectar o nome do arquivo tem que seguir o padrão 
database.cfg.xml, onde o database será recebido por parâmetro.
