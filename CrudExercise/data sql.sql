create database renting_vehicle_db;

use renting_vehicle_db;

describe vehicle;

insert into vehicle(make, model, year, color, mileage)
	values ('Toyota', 'Tacoma', '2019', 'red', '8000'),
			('Toyota', 'Tundra', '2017', 'blue', '115000'),
            ('Chevy', 'Malibu', '2020', 'black', '20000'),
            ('Jeep', 'Wrangler', '2019', 'white', '8500'),
            ('Toyota', 'Tacoma', '2018', 'silver', '150000'),
            ('Toyota', 'Tacoma', '2017', 'chrome', '145000'),
            ('Ford', 'Ranger', '2016', 'green', '8000'),
            ('Ford', 'F-150', '2017', 'gold', '80000'),
            ('Ford', 'Explorer', '2018', 'black', '8000'),
            ('Ford', 'Fusion', '2018', 'mate black', '80000'),
            ('Nissan', 'Altima', '2015', 'chrome', '80000'),
            ('Nissan', 'Sentra', '2015', 'white', '80000'),
            ('Nissan', 'Rouge', '2018', 'green', '8000'),
            ('Nissan', 'GTR', '2020', 'silver', '10000');
            
select * from vehicle;